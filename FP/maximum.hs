max' :: (Ord a) => [a] -> a
max' [] = error "Invalid operation!"
max' [x] = x
max' (x:xs) = max x (max' xs)