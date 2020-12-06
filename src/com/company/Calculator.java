package com.company;

import static java.lang.StrictMath.*;
import static java.lang.StrictMath.pow;

public class Calculator {
    private Double summa;
    public Double calculate1(Double x, Double y, Double z){ return (pow(log(z)+sin(Math.PI*pow(z,2)), (1/4)))/(pow(pow(y, 2) + pow(Math.E, cos(x)) + sin(y), sin(x))); }
    public Double calculate2(Double x, Double y, Double z){ return (1 + sqrt(z*x))/pow(1 + pow(x, 3), (1/y)); }

    public Double Get()
    {
        return summa;
    }
    public void Set(Double x)
    {
        summa = x;
    }
    public void Sum1(Double result)
    {
        summa += result;
    }
    public Calculator()  // констр по умолчанию
    {
        summa = 0.0;
    }
}
