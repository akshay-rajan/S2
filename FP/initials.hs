initials :: String -> String -> String
initials fname lname = [f] ++ ". " ++ [l] ++ "."
    where (f:_) = fname
          (l:_) = lname
    