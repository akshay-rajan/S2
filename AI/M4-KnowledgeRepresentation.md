# Knowledge Represenation using Logic

## Propositional and Predicate Logic

- We can represent real-world *facts* as Propositions / Statements written as **well-formed formulas (wff)** in propositional logic.
```
SUNDAY → HOLIDAY
```
- In predicate logic, we represent facts as **statements** written as *wff*s
```
man(Marcus)
```

| Aspect                  | Propositional Logic                                     | Predicate Logic                                                       |
|-------------------------|--------------------------------------------------------|------------------------------------------------------------------------|
| Basic Unit              | Propositions (atomic statements)                       | Predicates and Variables                                               |
| Structure               | No variables, only connectives (AND, OR, NOT, etc.)    | Variables, quantifiers (forall, exists), connectives (AND, OR, NOT, etc.) |
| Expressiveness          | Limited, cannot express relationships or properties    | Expresses relationships, properties, and quantified statements          |
| Quantification          | No quantification                                       | Quantification of variables (universal and existential)                 |
| Use Case                | Suitable for simple statements and logical operations   | Used for expressing relationships, properties, and quantified statements |
| Examples                | \( P \), \( Q \), \( P ∧ Q \), \( ¬ P \)      | \( P(x) \), \( Q(x) \), \( ∀ x \, P(x) \), \( ∃ x \, Q(x) \) |

