parity :: Integer -> String
parity n
    | x == 0 = "Even"
    | x == 1 = "Odd"
    where x = mod n 2
