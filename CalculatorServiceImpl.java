package com.andrew_kolosov;

public class CalculatorServiceImpl implements  CalculatorService {

    @Override
    public int sum(int a, int b) {

        return a + b;

    }

    @Override
    public int prod(int a, int b) {

        return a * b;

    }


    public static void main(String[] args) {

        CalculatorServiceImpl main_class = new CalculatorServiceImpl();

        System.out.println(main_class.sum(3, 10));
        System.out.println(main_class.prod(3, 10));
    }
}

