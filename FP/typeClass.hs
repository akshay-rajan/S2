class Eq a where
    (==) :: a -> a -> Bool
    (/=) :: a -> a -> Bool

data TrafficLight = Red | Yellow | Green

instance Prelude.Eq TrafficLight where
    Red == Red = True
    Green == Green = True
    Yellow == Yellow = True
    _ == _ = False

    x /= y = not (x Prelude.== y)