circle :: Double -> (Double, Double)
circle r =
    let area = pi * r ^ 2
        perimeter = 2 * pi * r
    in (area, perimeter)