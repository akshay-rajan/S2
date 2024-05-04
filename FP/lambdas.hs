applyTwice :: (a -> a) -> a -> a
applyTwice f x = f (f x)

applyToPolynomial :: Double -> Double
applyToPolynomial = applyTwice (\x -> x ^ 2 + 2 * x + 10)

main :: IO ()
main = do
    let result = applyToPolynomial 5
    print result
