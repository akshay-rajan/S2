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





