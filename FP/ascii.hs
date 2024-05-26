ascii :: [(Integer, Char)]
ascii = [(i,j)|(i,j) <- zip [32..] [' '..'z']]
