package com.andrew_kolosov.test;

import com.andrew_kolosov.CalculatorServiceImpl;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {


    private CalculatorServiceImpl calculator;

    @Before
    public void initTest() {
        calculator = new CalculatorServiceImpl();

    }

    @org.junit.jupiter.api.Test
    void sum() throws Exception {

        assertEquals(15, calculator.sum(7, 8));
        assertEquals(4, calculator.sum(1, 3));
        assertEquals(23, calculator.sum(15, 8));
        assertEquals(32, calculator.sum(12, 20));
        assertEquals(46, calculator.sum(23, 23));
    }

    @org.junit.jupiter.api.Test
    void prod() throws Exception {

        assertEquals(48, calculator.prod(6, 8));
        assertEquals(24, calculator.prod(3, 8));
        assertEquals(28, calculator.prod(4, 7));
        assertEquals(36, calculator.prod(6, 6));
        assertEquals(54, calculator.prod(6, 9));

    }

}