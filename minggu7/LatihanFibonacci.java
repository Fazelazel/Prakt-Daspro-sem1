package minggu7;

import java.util.Scanner;

public class LatihanFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int a=0,b=1,c=0,i,angka;

        // System.out.print("Masukkan batas angka : ");
        // angka = input.nextInt();

        // System.out.println("Hasil Fibonacci...");
        // for (i=1; i<=angka; i++){
        //     System.out.println(c);
        //     a = b;
        //     b = c;
        //     c = a + b;
        // }

        int a=1,b=1,c=0;
        System.out.println(a);
        System.out.println(b);
        while (c<55) {
            c = a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
