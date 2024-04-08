# Haskell

Haskell is a purely functional programming language.

Features of haskell include
1. All variables are constants - their values cannot be changed
2. Functions have no side effects
3. Referential transparency - a function always returns the same value(s), when called with the same argument(s)
4. Lazy evaluation - defers actually computing results as long as possible

5. Statically Typed - Compiler knows the datatype of each piece of code
6. Type Inference - The datatype is determined by the value stored in a variable

## Index

1. [Start](#1-start)
2. [Function Calls](#2-function-calls)
3. [Function Definition](#3-function-definition)
4. [Lists Introduction](#4-lists-introduction)
5. [Range](#5-range)
6. [List Comprehension](#6-list-comprehension)
7. [Tuples](#7-tuples)
8. [Data Types](#8-data-types)
9. [Function Syntax](#9-function-syntax)

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

Often, we include **type signatures** along with the function statement

```haskell
doubleMe :: Integer -> Integer
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

### 5. Range

Ranges are used to make lists composed of elements that can be enumerated.

```haskell
ghci> [1..10]
[1,2,3,4,5,6,7,8,9,10]
ghci> ['a'..'z']
"abcdefghijklmnopqrstuvwxyz"
ghci> [2,4..10] -- [first,second..limit]
[2,4,6,8,10]
```

We can define an infinite list using `[first,last..]`
```haskell
ghci> sum (take 100 [2,4..]) -- Sum of first 100 even numbers
10100
```

`cycle` generates an infinite repetition of a list, meanwhile `repeat` generates an infinite repetition of an element

```haskell
ghci> take 20 (cycle "abc")
"abcabcabcabcabcabcab"
ghci> take 20 (repeat 10)
[10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10]
```

`replicate` is a similar function that works like

```haskell
ghci> replicate 3 20
[20,20,20]
```
### 6. List Comprehension

```haskell
ghci> [2 * x | x <- [1..10]]
[2,4,6,8,10,12,14,16,18,20]
```

In the above example, we say that we *draw* our elements from the list `[1..10]`, and we bind each of those elements to `x`. `2 * x` represents how we want the elements that we have drawn to be reflected in the resulting list.

We can easily add a condition / **predicate** to our comprehension.

```haskell
ghci> [2 * x | x <- [1..10], x `mod` 4 == 0]
[8,16]
```
The process of weeding out elements from a list using predicates is called *filtering*.

```haskell
ghci> boomBangs xs = [ if x < 10 then "BOOM!" else "BANG!" | x <- xs, odd x]
ghci> boomBangs [5..20]
["BOOM!","BOOM!","BOOM!","BANG!","BANG!","BANG!","BANG!","BANG!"]
ghci> [x+y | x <- [1,2,3], y <- [10,100,1000]] -- Multiple lists
[11,101,1001,12,102,1002,13,103,1003]   
ghci> let onlyCapital xs = [ c | c <- xs, c `elem` ['A'..'Z']]
ghci> onlyCapital "heLLO, worLd"
"LLOL"
```

### 7. Tuples

Tuples are used to store several heterogeneous elements as a single value.

```haskell
ghci> (1, 3)
(1,3)
ghci> (3, 'a', "hello")
(3,'a',"hello")
```

A tuple of size 2 (*pair*) and a tuple of size 3 (*triple*) are treated as two distinct types, and they cannot be mixed. Also, tuples with elements having different datatypes are also treated as different.

A tuple must atleast have 2 elements.

Functions on pairs include `fst` and `snd`

```haskell
ghci> fst (1,2)
1
ghci> snd (1,2)
2
```

`zip` takes two lists, produces a list of pairs

```haskell
ghci> zip [1,2,3,4,5] [5,5,5,5,5]
[(1,5),(2,5),(3,5),(4,5),(5,5)]
```

### 8. Data Types

To check the type of a variable, use `:t`

```haskell
ghci> :t 'a'
'a' :: Char
-- '::' is read as "has type of"

ghci> :t (True, '5')
(True, '5') :: (Bool, Char)

-- Type of a function
ghci> :t onlyCapital
onlyCapital :: [Char] -> [Char]
```

| Data Type | Description | Example |
|-----------|-------------|---------|
| `Int`     | Integral numbers, fixed precision | `123` |
| `Integer` | Integral numbers, arbitrary precision | `123456789101112131415` |
| `Float`   | Single precision floating point numbers | `123.45` |
| `Double`  | Double precision floating point numbers | `123.4567891011` |
| `Bool`    | Boolean values | `True`, `False` |
| `Char`    | Single characters | `'a'` |
| `String`  | List of characters | `"Hello"` |
| `Tuple`   | Fixed size collection of values, can be of different types | `(True, 'a')` |
| `List`    | Variable size collection of values, must be of same type | `[1, 2, 3, 4, 5]` |
<!-- | `Maybe`   | Optional values, can be `Nothing` or `Just` something | `Just "Hello"`, `Nothing` | -->
<!-- | `Either`  | Represents a value that can be one of two types | `Left "Error"`, `Right 123` | -->
<!-- | `IO`      | Represents a computation which performs I/O and returns a value of type a | `getLine`, `putStrLn "Hello"` | -->


```haskell
-- `a` is a **type variable**, which means it can be of any type
ghci> :t head
head :: [a] -> a
-- Type Variables are given names a,b,c...
ghci> :t fst
fst :: (a,b) -> a
```

Functions that use type variables are called **polymorphic functions**.

#### Type Class
Type class is an interface that defines some behaviour. If a type is an instance of a type class, then it supports and implements the behaviour the type class describes.

Equality function takes any two values that are of the same type and returns a bool.
```haskell
-- Eq type class provides an interface for testing equality
-- Almost all types are an instance of Eq
ghci> :t (==)
(==) :: Eq a => a -> a -> Bool
```
`=>` is the 'Class Constraint'

```haskell
-- Ord is a type class for types whose values can be put in some order
ghci> :t (>)
(>) :: Ord a => a -> a -> Bool

-- Values of type class 'Show' can be represented as strings
ghci> :t show
show :: Show a => a -> String
ghci> show 3
"3"

-- 'Read' takes a string and returns an object of type 'read' (opposite of show)
ghci> :t read
read :: Read a => String -> a
ghci> read "True" || False
True
ghci> read "5" :: Float
5.0

-- 'Enum' is for sequentially ordered types; that can be enumerated
ghci> :t succ
succ :: Enum a => a -> a

-- Instances of 'Bounded' have an upper and lower bound
ghci> minBound :: Int
-9223372036854775808
ghci> maxBound :: Char
'\1114111'

-- 'Num' is for numeric
ghci> :t 20
20 :: Num a => a

-- sin, cos, sqrt etc. return 'Floating' type

-- 'Integral' includes only whole numbers
```

### 9. Function Syntax


```haskell

```