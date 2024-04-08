{-
Haskell uses type-inference. It decides on the data type based on 
the value stored.
Haskell is also statically typed.

To run, enter 'ghci', and run the program by ':r'
-}

import Data.List
import System.IO

-- Int -2^63 -> 2^63
maxInt = maxBound :: Int
minInt = minBound :: Int

-- Integer - Unbounded
num = 100000 :: Integer

-- Floats, Doubles
bigFloat = 3.999999999 + 0.00000000000005

-- Bool -> True, False
-- Char *
-- Tuple -> A list (mostly 2) of different datatypes

-- Constants / Permanent values
always5 :: Int
always5 = 5
