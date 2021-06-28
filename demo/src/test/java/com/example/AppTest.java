package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    @Test
    public void TestEquilateralTriangle() {
        assertEquals(3, App.calcMyersTriangle(1, 1, 1));
    }

    @Test
    public void TestIsosceles() {
        assertEquals(2, App.calcMyersTriangle(2, 2, 1));
        assertEquals(2, App.calcMyersTriangle(2, 1, 2));
        assertEquals(2, App.calcMyersTriangle(1, 2, 2));
    }

    @Test
    public void TestScalene() {
        assertEquals(1, App.calcMyersTriangle(2, 3, 4));
        assertEquals(1, App.calcMyersTriangle(4, 5, 6));
        assertEquals(1, App.calcMyersTriangle(6, 7, 8));
    }

    @Test
    public void TestInvalid() {
        assertEquals(0, App.calcMyersTriangle(1, 2, 3));
        assertEquals(0, App.calcMyersTriangle(2, 3, 1));
        assertEquals(0, App.calcMyersTriangle(3, 1, 2));

        assertEquals(0, App.calcMyersTriangle(0, 1, 3));
        assertEquals(0, App.calcMyersTriangle(3, 0, 1));
        assertEquals(0, App.calcMyersTriangle(1, 3, 0));

        assertEquals(0, App.calcMyersTriangle(0, -1, 3));
        assertEquals(0, App.calcMyersTriangle(3, 0, -1));
        assertEquals(0, App.calcMyersTriangle(-1, 3, 0));

        assertEquals(0, App.calcMyersTriangle(0, 0, 0));
        assertEquals(0, App.calcMyersTriangle(-1, -1, -1));
    }
}
