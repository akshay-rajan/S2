doubleMe x = x + x

doubleUs x y = doubleMe x + doubleMe y

doubleSmallNo x = if x > 100
                  then x
                  else x * 2
