package minggu10;

import java.util.Scanner;

public class KelolaCafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan : ");
        int jmlPesanan = sc.nextInt();

        String menu[] = new String[jmlPesanan];
        int harga[] = new int[jmlPesanan];
        int i = 0;
        int totalBiaya = 0;
        
        do {
            System.out.print("Nama pesanan ke-" + (i + 1) + " : ");
            menu[i] = sc.nextLine();
            sc.nextLine();
            System.out.print("Harga pesanan ke-" + (i + 1) + " : ");
            harga[i] = sc.nextInt();
            totalBiaya += harga[i];
            i++;
        } while (i < jmlPesanan);

        for(i = 0; i < jmlPesanan; i++) {
            System.out.println("Nama pesanan ke-" + (i + 1) + " : " + menu[i]);
        }
        System.out.println("Total Biaya : " + totalBiaya);
    }
}
