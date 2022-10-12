package practice.interviewQuestions.interviewQuestions2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Q03_FibonacciListNumber {

    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        List<Integer> fibonacciList = new ArrayList<>();

        fibonacciList.add(0);
        fibonacciList.add(1);

        int index = 0;
        while (true) {
            int toplam = fibonacciList.get(index) + fibonacciList.get(index + 1);
            if (toplam <= sayi) {
                fibonacciList.add(toplam);
            } else break;
            index++;
        }
        IntStream.
                range(0, fibonacciList.size() - 1).
                forEach(t -> System.out.print(fibonacciList.get(t) + "-"));
        System.out.println(fibonacciList.get(fibonacciList.size() - 1));
    }
}

