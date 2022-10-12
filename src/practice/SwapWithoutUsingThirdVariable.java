package practice;

public class SwapWithoutUsingThirdVariable {
    public static void main(String[] args) {
        int a = 40, b = 30;

        System.out.println(a + " " + b);

//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println(a + " " + b);

        a+=b-(b=a);
        System.out.print(a+ " " + b);

    }
}
