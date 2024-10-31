package minggu7;

import java.util.Scanner;

public class LatihanGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi
        int angka = 0;
        
        System.out.print("Masukkan batas angka : ");
        angka = input.nextInt();

        //logic perulangan
        for (int i=1; i <= angka; i++){
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
