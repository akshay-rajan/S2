bmiTell :: Double -> Double -> String
bmiTell weight height
    | bmi <= 18.5 = "Ninja"
    | bmi <= 25 = "Normal"
    | bmi <= 30 = "Fat"
    | otherwise = "Elephant"
    where bmi = weight / height ^ 2
