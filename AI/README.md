# Artificial Intelligence

Artificial Intelligence (AI) refers to the simulation of human intelligence in machines that are programmed to think and learn like humans. It involves the development of computer systems capable of performing tasks that would typically require human intelligence, such as visual perception, speech recognition, decision-making, and problem-solving.

AI encompasses various subfields, including machine learning, natural language processing, computer vision, robotics, and expert systems. These technologies enable machines to analyze large amounts of data, recognize patterns, make predictions, and adapt to changing circumstances.

AI has applications in numerous industries, including healthcare, finance, transportation, and entertainment. It has the potential to revolutionize the way we live and work, improving efficiency, accuracy, and decision-making processes.

### Terminology

Terms | Meaning
--- | ---
Agent | Entity that perceives its environment and acts upon that environment
State | A configuration of the agent and its environment
**Initial State** | The state in which the agent begins
**Actions** | Choices that can be made in a state: ACTIONS(s) returns the set of actions that can be executed in the state 's'
**Transition Model** | A description of what state results from any applicable action in any state: RESULT(s, a) returns the state resulting from performing action 'a' in state 's'
State Space | Set of all states reachable from the initial state by any sequence of actions.
**Goal Test** | A way to determine whether a given state is a goal state
**Path Cost** | Numerical cost associated with a given path
Optimal Solution | A solution that has the the lowest path cost among all other solutions

### Defining a Problem

In order to define a problem in the context of artificial intelligence, specify the following components:

1. State Space: The set of all possible states that the problem can be in
2. Initial State: The starting state of the problem
3. Actions: The set of possible actions that can be taken in each state
4. Transition Model: The description of what each action does to a state
5. Goal State: The desired state that the problem should reach
6. Path Cost: A numeric cost assigned to each path

### Production Systems

Production Rules are a type of knowledge representation used to make decisions. Production rules consists of

1. **A Set of Rules (Production Rules)**: A collection of condition-action pairs that dictate the behavior of the system.
2. **Knowledge Databases**: A structured repository of facts and information that the system uses to make decisions.
3. **Control Strategies**: The methods used to determine the order in which rules are to be applied, and a conflict resolution strategy.
4. **Rule Applier** (Interpreter): The mechanism that applies the rules to the knowledge database based on the control strategies.


### Production System Characteristics

Production Systems are structures that organize an AI program, facilitating describing and performing the search process.

1. **Monotonic** and **Non-monotonic**: In monotonic production system, applicaton of a rule never prevents the application of another rule that could have been applied the time the first rule was selected. Otherwise the system is said to be non-monotonic.

2. **Partially Commutative**: A system is said to be partially commutative if, application of a particular set of rules transform a state `x` to a state `y`, then any allowable permutation of those rules also transform `x` to `y`.

3. **Commutative**: A production system that is monotonic and partially commutative are called Commutative.

### Node

A node is a data structure that keeps track of
- a state
- a parent (the node that generated this node)
- an action (action applied to parent to get node)
- a path cost (from initial state to node)

## Search Strategies

1. **Breadth-First Search (BFS)**:
   ```
    BFS(initial_state)
        If the initial state is the goal, return success
        Create NODE-LIST and enqueue the initial state into NODE-LIST
        
        While queue is not empty:
            Dequeue the first element 'E' from NODE-LIST.
            If NODE-LIST is empty, return failure
            For each way a rule can match the state described in E:
                Apply the rule to generate a state
                If it is the goal state, return this state
                Else, enqueue the new state to the NODE-LIST
   ```

2. **Depth-First Search (DFS)**:
   ```
    DFS(initial_state):
        If the inital state is goal, return success
        Repeat until success or failure is returned:
            Generate a successor E of the inital state
            Call DFS with E as the initial state
            If success is retured, signal success. Else, continue in this loop.
   ```

3. **Iterative Deepening Search (IDS)**:
   ```
    IDS(start_node, depth_limit):
        Set SEARCH-DEPTH to 0
        While SEARCH-DEPTH < depth_limit:
            Conduct DFS upto SEARCH-DEPTH
            If solution is found, return success
            Else, increment the SEARCH-DEPTH
        If no solution is found, return failure
   ```

4. **Best First Search (BFS)**:
   ```
    BFS(initial_state):
        Initialize an empty priority queue OPEN.
        Enqueue initial_state to priority queue with priority based on heuristic value.
        Until goal is found or OPEN is empty, do:
            Pick the best node in OPEN
            Generate its successors
            For each successor, do:
                Evaluate the node if it is not already been evaluated
                Enqueue the successor to OPEN
        If no solution is found, return failure.
   ```

5. **Hill Climbing**:
   ```
   HillClimbing(initial_state):
       If the initial_state is the goal state, return success
       Else, continue with the initial_state as current_state
       Loop until a solution is found or there are no new operators to apply to the current_state:
           Select an operator and produce a new state
           Evaluate the new state
                If the new state is goal, return success
                If the new_state is better than current_state, make it current_state
                Else continue the loop.
   ```

6. **Steepest Ascent Hill Climbing**:
   ```
    SteepestAscentHillClimbing(initial_state):
        Evaluate the inital_state. If it is the goal state, return success.
        Else continue with the initial_state as current_state
        Loop until a solution is found or a complete iteration produces no new changes to the state:
            For each rule that matches the current_state:
                Let SUCC be a state such that all successors of the current_state is better than SUCC
                Apply the rule and generate a new_state
                Evaluate new_state
                    If new_state is the goal, return success
                    Else, if new_state is better than SUCC, set SUCC as new_state
                If SUCC is better than current_state, set current_state to SUCC

   ```

7. **A\* Search**:

    ```c
    OPEN - Nodes generated, but "not yet examined"
    CLOSED - Nodes that are "already examined"
    
    f(n) = g(n) + h(n)
        where h(n) is the 'heuristic function':- Estimated cost from node 'n' to 'goal'
              g(n) is the cost to reach 'n' from 'start'
    ```
   ```c
    AStar(start_node, goal_node):
        Enqueue 'start' into 'OPEN' 
        Set 'f(start) = h(start)'
            // Since g(start) = 0
        
        while 'OPEN' is not empty:
            Pick the 'BEST-NODE' in 'OPEN' (node with lowest 'f' value)
            Remove 'BEST-NODE' from 'OPEN'
            
            if 'BEST-NODE' is 'goal':
                return success
            
            else:
                for each 'SUCCESSOR' of 'BEST-NODE':
                    Set 'SUCCESSOR' to point back to 'BEST-NODE'
                    g(SUCCESSOR) = g(BEST-NODE) + cost(BEST-NODE, SUCCESSOR)
                    if 'SUCCESSOR' in 'OPEN':
                        Call the 'SUCCESSOR' already in OPEN, 'OLD'
                        if 'OLD' is better than 'SUCCESSOR' (comparing f values) continue
                        else Update 'OLD's parent link to point to 'BEST-NODE'
                    else if 'SUCCESSOR' not in 'OPEN' but in 'CLOSED':
                        Call the 'SUCCESSOR' already in CLOSED, 'OLD'
                        Add it to 'OPEN', with the best path (parent link)
                    else if 'SUCCESSOR' not in 'OPEN' and not in 'CLOSED':
                        Add the 'SUCCESSOR' to OPEN
                        Compute f('SUCCESSOR') = g('SUCCESSOR') + h('SUCCESSOR')
        return failure
   ```

8. **Simulated Annealing**:
   ```
   SimulatedAnnealing(start_state, temperature, cooling_rate):
       current_state = start_state
       
       while temperature > 0:
           new_state = generate_random_neighbor(current_state)
           energy_diff = evaluation(new_state) - evaluation(current_state)
           
           if energy_diff < 0 or random(0, 1) < exp(-energy_diff / temperature):
               current_state = new_state
           
           temperature *= cooling_rate
       
       return current_state
   ```

### BFS vs DFS

| Criteria            | Breadth-First Search (BFS)                                 | Depth-First Search (DFS)                                     |
|---------------------|------------------------------------------------------------|--------------------------------------------------------------|
| Order of Expansion  | Expands nodes level by level from the start node outward.  | Expands nodes depth-wise, exploring as far as possible along each branch before backtracking.|
| Data Structure      | Uses a queue data structure to store nodes for expansion.  | Uses a stack data structure (or recursion) for node traversal.|
| Memory Usage        | Typically uses more memory due to storing all nodes at each level. | Generally uses less memory because it only stores a path from the start node to the current node. |
| Completeness        | Guarantees finding a solution if one exists in finite search spaces. | Guarantees finding a solution if one exists in finite search spaces. |
| Optimality          | Ensures the shortest path is found in terms of number of edges for unweighted graphs. | Does not guarantee the shortest path; may find a solution that is not optimal in terms of path length. |
| Implementation      | Implemented iteratively using a queue for node expansion.   | Implemented recursively (or using a stack) for node traversal. |
| Use Cases           | Well-suited for finding shortest paths, puzzle solving, and exploring neighbor nodes uniformly. | Suitable for topological sorting, maze solving, and searching large trees or graphs. |


### Hill Climbing vs Steepest Ascent Hill Climbing

| Criteria                     | Hill Climbing                                               | Steepest Ascent Hill Climbing                                |
|------------------------------|-------------------------------------------------------------|--------------------------------------------------------------|
| Search Strategy              | Local search algorithm that iteratively improves the current solution by moving to a neighboring state. | Local search algorithm that always selects the best among all neighboring states for improvement. |
| Heuristic Evaluation         | Uses a heuristic function to evaluate neighboring states and chooses one that improves the current solution. | Utilizes the same heuristic function but always selects the state that yields the highest improvement. |
| Decision Making              | Selects a neighboring state that improves the current solution, even if it does not yield the best possible improvement. | Always chooses the state that provides the steepest ascent, ensuring the best possible improvement at each step. |
| Memory Usage                 | Typically requires less memory as it only needs to store the current state and its neighbors. | Requires slightly more memory due to the need to evaluate all neighboring states for the steepest ascent. |
| Completeness                 | Not guaranteed to find the global optimum; may get stuck in local optima. | Not guaranteed to find the global optimum; may get stuck in local optima. |
| Convergence                  | Can converge quickly to a local optimum but may not be the global optimum. | Tends to converge more slowly than basic hill climbing but may reach a better local optimum. |
| Backtracking                 | Does not perform backtracking; may get stuck in local optima.   | Does not perform backtracking; may get stuck in local optima. |
| Use Cases                    | Suitable for optimization problems where finding a good solution quickly is more important than guaranteeing the best solution. | Useful when the goal is to reach a better local optimum than basic hill climbing, even if it takes more iterations. |


## Game Playing

A game is deterministic if an action of a player leads to completely predictable outcomes. (Chess, Football etc.)

### Two-Player Zero-Sum

A two-player zero-sum game is a type of game in which the total utility or payoff to the players is constant and equal to zero. 
This means that what one player gains, the other player loses, and vice versa, resulting in a situation where the total gain is always zero.

|          | Strategy 1 | Strategy 2 |
|----------|------------|------------|
| Player A |     2      |    -2      |
| Player B |    -2      |     2      |

Since it's a zero-sum game, the sum of Player A's payoff and Player B's payoff in each cell of the matrix is always zero.
In zero-sum games, players often employ a **minimax** strategy. This strategy involves each player trying to minimize the maximum possible gain of the opponent.

*A game tree* is a type of recursive search function that examines all possible moves of a strategy game, and their results, in an attempt to ascertain the optimal move.

A *Legal Move Generator* generates all legal moves from a given state. A *Plausible Move Generator* generates only a small number of promising moves.

A **Static Evaluation Function** uses the available information to approximate the desirability of a game state without exhaustively exploring all possible moves. It assigns a numerical value to a given state, representing how favourable/unfavourable it is for a player.

### Minimax Algorithm

Minimax algorithm is a backtracking algorithm used to find the optimal move for a player, assuming that the oponent also plays optimally.
The two players are called *Maximizer* and *Minimizer*, and they try to get the highest or lowest scores possible, respectively.

The alternation of maximizing and minimizing the alternate ply when evaluation are being pushed back up corresponds to the opposing strategies of the two players and gives this method the name minimax.

```prolog
MINIMAX(Node, Depth, Player)
    % If deep enough, return the Static Evaluation of the Node
    if Depth == 0 or Node is a terminal node 
    then 
        return STATIC(Node, Depth)
    
    % If the player is the Maximizer, maximize the next ply
    if Player is Maximizer
    then
        maxEvalutaion = -inf
        for each Child of Node
        do
            evaluation = MINIMAX(Child, Depth - 1, Minimizer)
            maxEvaluation = maximum(evaluation, maxEvaluation)
        done
        return maxEvaluation
    % If the player is the Minimizer, minimize the next ply
    else
        minEvalutaion = +inf
        for each Child of Node
        do
            evaluation = MINIMAX(Child, Depth - 1, Maximizer)
            minEvaluation = minimum(evaluation, minEvaluation)
        done
        return minEvaluation
```

### Alpha - Beta Pruning    

Alpha-Beta pruning is an optimization technique for the minimax algorithm.

* Alpha is the best value that the maximizer can guarantee, at a given level, or above (initiall, -∞)
* Beta is the best value that the minimizer can guarantee, at a given level, or below (initially, ∞)

```prolog
MINIMAX(Node, Depth, Player, Alpha, Beta)
    % If deep enough, return the Static Evaluation of the Node
    if Depth == 0 or Node is a terminal node 
    then 
        return STATIC(Node, Depth)
    
    % If the player is the Maximizer, maximize the next ply
    if Player is Maximizer
    then
        maxEvalutaion = -inf
        for each Child of Node
        do
            evaluation = MINIMAX(Child, Depth - 1, Minimizer, Alpha, Beta)
            maxEvaluation = maximum(evaluation, maxEvaluation)
            Alpha = maximum(maxEvaluation, Alpha)
            % Prune the node, if a bad evaluation has been found
            if Beta <= Alpha
                break
        done
        return maxEvaluation
    % If the player is the Minimizer, minimize the next ply
    else
        minEvalutaion = +inf
        for each Child of Node
        do
            evaluation = MINIMAX(Child, Depth - 1, Maximizer, Alpha, Beta)
            minEvaluation = minimum(evaluation, minEvaluation)
            Beta = minimum(minEvaluation, Beta)
            if Beta <= Alpha
                break
        done
        return minEvaluation
```

## Logic

| Aspect                    | Propositional Logic                      | Predicate Logic                          |
|---------------------------|------------------------------------------|------------------------------------------|
| **Basic Unit**            | Propositions (statements that are true or false) | Predicates applied to variables (statements about objects) |
| **Variables**             | None                                     | Yes (used to represent objects in the domain) |
| **Quantifiers**           | None                                     | Yes (universal ∀ and existential ∃ quantifiers) |
| **Expressiveness**        | Limited to simple statements and their combinations | More expressive, can represent relationships and properties of objects |
| **Syntax**                | Simple, involves propositions and logical connectives (¬, ∧, ∨, →, ↔) | Complex, includes predicates, variables, functions, constants, logical connectives, and quantifiers |
| **Example**               | p ⇒ q  (If p then q)      | ∀ x (P(x) ⇒ Q(x)) (For all x, if P(x) then Q(x)) |
| **Interpretation**        | Truth values (true or false) assigned to propositions | Interpretation of the domain, assignment of values to variables, predicates, and functions |
| **Domain of Discourse**   | Not applicable                           | Yes, a set of objects that the variables can refer to |
| **Atomic Statements**     | Propositional variables (e.g., p, q, r)  | Predicates with terms (e.g., P(x), Q(a, b)) |
| **Complexity**            | Simpler due to the lack of variables and quantifiers | More complex due to the inclusion of variables, quantifiers, and the structure of predicates |
| **Applications**          | Boolean algebra, digital circuits, simple logical reasoning | Mathematics, computer science (e.g., databases, AI), linguistics, formal verification |
| **Logical Connectives**   | ¬ (not), ∧ (and), ∨ (or), → (implies), ↔ (if and only if) | Same as propositional logic, but applied to predicates |
| **Inference Rules**       | Modus ponens, modus tollens, disjunctive syllogism, etc. | Includes all rules from propositional logic plus rules for quantifiers (e.g., universal instantiation, existential generalization) |

