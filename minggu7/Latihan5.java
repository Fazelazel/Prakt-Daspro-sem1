package minggu7;

import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bil,i,n;

        System.out.print("Masukkan batas bilangan : ");
        n = input.nextInt();

        bil = 3;
        i = 1;

        while (bil <= n) {
            System.out.println(bil);
            bil = bil + 1;
            i = i+2;
        }
    }
}
