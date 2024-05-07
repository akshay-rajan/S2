data Queue = Queue [Int] deriving Show

empty :: Queue
empty = Queue []

isEmpty :: Queue -> Bool
isEmpty (Queue []) = True
isEmpty _ = False

enqueue :: Queue -> Int -> Queue
enqueue (Queue q) x = Queue (q ++ [x])

dequeue :: Queue -> (Int, Queue)
dequeue (Queue []) = error "Queue empty!"
dequeue (Queue (x:xs)) = (x, Queue xs)

peek :: Queue -> Int
peek (Queue []) = error "Queue empty!"
peek (Queue (x:_)) = x
