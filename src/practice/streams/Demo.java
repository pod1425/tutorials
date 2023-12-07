package practice.streams;

import java.io.*;

public class Demo {

    public static void spiral(int[] numbers, int rows) {
        int cols = numbers.length / rows;
        int[][] matrix = new int[rows][cols];
        int k = cols;
        int dir = 0;
        int x = 0;
        int y = 0;
        int xL = 0;
        int xR = cols;
        int yU = 0;
        int yD = rows;
        int steps = 0;

        for (int i = 0; i < numbers.length; i++) {
            matrix[y][x] = numbers[i];
            steps++;
            if (steps == k) {
                steps = 0;

                switch (dir % 4) {
                    case 0:
                        yU++;
                        k = yD - y - 1;
                        break;
                    case 1:
                        xR--;
                        k = x - xL;
                        break;
                    case 2:
                        yD--;
                        k = y - yU;
                        break;
                    case 3:
                        xL++;
                        k = xR - x - 1;
                        break;
                }
                dir++;
            }

            switch (dir % 4) {
                case 0:
                    x++;
                    break;
                case 1:
                    y++;
                    break;
                case 2:
                    x--;
                    break;
                case 3:
                    y--;
                    break;
            }
        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        spiral(a, 4);

    }
}
