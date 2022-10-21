package practice;

import java.util.Scanner;

public class FindTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int randomNumber = (int) ((Math.random() * 100) + 1);
        int guessNumber = 0;
        int point = 100;


        do {
            if (count < 10) {
                System.out.println("you have " + (10 - count) + " attempt");
            } else if (count == 10) {
                System.out.println("Game finished... you lost");
                break;
            }
            System.out.print("Enter your guess: ");
            try {
                guessNumber = scan.nextInt();
                if (guessNumber > randomNumber) {
                    System.out.println("your guess is high\n");
                    point -= 10;
                } else if (guessNumber < randomNumber) {
                    System.out.println("your guess is low\n");
                    point -= 10;
                } else System.out.println("Congrulations... you won\nyour score = " + point + "");
                count++;
            } catch (Exception e) {
                String str = scan.next();
                System.out.println("Error!!! enter an integer number\n");
            }

        }
        while (guessNumber != randomNumber);


    }
}
