package practice.interviewQuestions.interviewQuestions2;

import java.util.Scanner;

public class Q02_ArmstrongNumber_4Digits {
    public static void main(String[] args) {
        /*
 Armstrong sayi
     (0, 1, 153, 370, 371, 407, 1634)
     153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
     370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
     1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634  */

        Scanner scan = new Scanner(System.in);
        System.out.print("Armstrong kontrolu icin bir sayi giriniz: ");
        String sayi = scan.next().replaceAll("\\D", "");
        System.out.println("Girilen sayi: " + sayi);
        String[] sayiArr = sayi.split("");

        int toplam = 0;
        for (String s : sayiArr) {
            toplam += (int) Math.pow(Integer.parseInt(s), sayiArr.length);
        }
        System.out.println("Bulunan toplam: " + toplam);

        if (Integer.parseInt(sayi) == toplam) {
            System.out.println("Girilen sayi Armstrong sayidir");
        } else System.out.println("Girilen sayi Armstrong sayi degil");


    }

}