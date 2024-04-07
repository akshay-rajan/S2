# Haskell

Haskell is a purely functional programming language.

Features of haskell include
1. All variables are constants - their values cannot be changed
2. Functions have no side effects
3. Referential transparency - a function always returns the same value(s), when called with the same argument(s)
4. Lazy evaluation - defers actually computing results as long as possible

5. Statically Typed - Compiler knows the datatype of each piece of code
6. Type Inference - The datatype is determined by the value stored in a variable

### 1. Start

Open GHC's interactive mode

```haskell
$ghci
ghci> 2 + 3
5
ghci> not (True && False)
True
ghci> 5 /= 5 -- Not equal
False
```

### 2. Function Calls

Type | Call
---|---
Infix Function | \<operand> \<operator> \<operand>
Prefix Function | \<operator> \<operand> \<operand>

```haskell
ghci> 5 * 2
10
ghci> succ 8
9
ghci> min 4 5
4
```

Function application has the highest precedence in Haskell

```haskell
ghci> succ 9 * 10
100
ghci> succ (9 * 10)
91
```
Any prefix function taking 2 arguments can be converted to an infix by using \`

```haskell
ghci> div 5 2
2
ghci> 5 `div` 2
2
```

### 3. Function Definition

Create a file with the extension `hs`
    
    touch filename.hs

We can define a function using

```haskell
doubleMe x = x + x
```

Open ghci and load the file

    ghci> :l filename.hs

Call the function
```haskell
ghci> doubleMe 3
6
```
If the file is updated we can reload the current file using `:r`

```haskell
-- `If` in haskell must always return something
doubleSmallNo x = if x > 100
                  then x
                  else x * 2
```
We use a `'` to denote a strict version of a fuction by appending it to the end of the function name (since it has no special meaning).
```haskell
hello' = "Hello, World!"
```

### 4. Lists Introduction

Lists are homogeneous data structures.

```haskell
-- In ghci, we use 'let' to denote a name
ghci> let nums = [1, 2, 3]
ghci> nums
[1,2,3]
```
We can concatenate lists using `++`
```haskell
l = [1, 2, 3] ++ [4, 5]
s = "hello" + " " + "world" -- Strings are just lists of characters
```
The `cons` operator (`:`) is used to add something to the beginning of a list

```haskell
ghci> 1:[2,3]
[1,2,3]
```

We can get an element at an index using `!!` operator

```haskell
-- Index starts at 0
ghci> "hello, world" !! 5
','
```

Nested lists are also possible. The lists can be of different lengths, but can only be of the same type.

We can compare lists using `==`, `<`, `>` etc. which compare the elements in lexicographical order.

We have functions `head`, `tail`, `init`, `last` which returns the first element, everything except the first element, everything except the last element and the last element respectively.

```haskell
ghci> head [1,2,3]
1
ghci> tail [1,2,3]
[2,3]
ghci> init [1,2,3]
[1,2]
ghci> last [1,2,3]
3
```
`length` returns the length of a list
```haskell
ghci> length [1,2,3]
3
```

`null` returns True if a list is empty and False otherwise
```haskell
ghci> null []
True
```

`reverse` does what it says

```haskell
ghci> reverse [1,2,3]
[3,2,1]
```

`take` extracts a specified number of elements from the front, meanwhile `drop` drops it
```haskell
ghci> take 3 [1,2,3,4,5]
[1,2,3]
ghci> take 3 [1,2] -- If the length is smaller, it returns the entire list
[1,2]
ghci> drop 2 [1,2,3,4]
[3,4]
ghci> drop 10 [1,2,3,4] -- If the length is smaller, it returns an empty list
[]
```

`maximum` and `minimum` are also functions in lists
```haskell
ghci> maximum [1,2,3]
3
ghci> minimum [1,2,3]
1
```

We can sum up a list using `sum`, and `product` returns their product
```haskell
ghci> sum [1, 2, 3, 4]
10
ghci> product [1, 2, 3, 4]
24
```


```haskell

```