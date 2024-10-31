package minggu9;

import java.util.Scanner;

public class TugasSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Masukkan nilai N : ");
        n = input.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < n; j++) {
                //if (i == 1 || j == 1 || i == n || j == n || j == i || i == n-j+1 || j == n/2+1  || i == n/2+1) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print(n);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(n);
        }
    }
}
