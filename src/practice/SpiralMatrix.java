package practice;

import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of a matrix: ");
        int size = scan.nextInt();

        int[][] spiralMatrix = new int[size][size];

        int startingRow = 0, startingCol = 0;
        int maxRow = size - 1, maxCol = size - 1;
        int value = 1;


        while (value <= size * size) {
            for (int i = startingCol; i <= maxCol; i++) { //ilk satirin hucrelerine degerleri atiyoruz
                spiralMatrix[startingRow][i] = value++;
            }

            for (int i = startingRow + 1; i <= maxRow; i++) { //sonuncu sutunun ilk hucre haric, degerlerini atiyoruz
                spiralMatrix[i][maxCol] = value++;
            }

            for (int i = maxCol - 1; i >= startingCol; i--) { //sonuncu satirin son hucre haric, degerlerini atiyoruz
                spiralMatrix[maxRow][i] = value++;
            }

            for (int i = maxRow - 1; i > startingRow; i--) { //ilk sutunun ilk ve son hucre haric, degerlerini atiyoruz
                spiralMatrix[i][startingCol] = value++;
            }
            //spiral'in disini olusturduk

            //asagidakilari ic tarafin en dis kalibini olusturmak icin kullanacagiz.
            startingRow++;
            startingCol++;
            maxRow--;
            maxCol--;
        }

        //yazdirmak icin kullanacagiz
        for (startingRow = 0; startingRow < size; startingRow++) {
            for (startingCol = 0; startingCol < size; startingCol++) {
                System.out.printf("%-6d", spiralMatrix[startingRow][startingCol]);
            }
            System.out.println();
        }
    }
}

