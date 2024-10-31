package minggu7;

import java.util.Scanner;

public class LatihanDecrement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka, i;

        System.out.print("Masukkan batas angka : ");
        angka = input.nextInt();

        i = angka;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
}
