package minggu7;

import java.util.Scanner;

public class LatihanPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i,n,kali;

        System.out.print("Masukkan batas bilangan : ");
        n = input.nextInt();

        i = 1;
        kali = i;
        
        while (i <= n) {
            kali = kali * i;
            i++;
        }
        System.out.println(kali);
    }
}
