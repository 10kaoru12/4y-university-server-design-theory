package com.example;

public class App {
    public static int calcMyersTriangle(int x, int y, int z) {
        if (x >= (y + z) || y >= (x + z) || z >= (x + y)) {
            return 0;
        }
        if (x == y && y == z && z == x) {
            return 3;
        }
        if (x == y || y == z || z == x) {
            return 2;
        }
        if (x != y && y != z && z != x) {
            return 1;
        }
        return 0;
    }
}
