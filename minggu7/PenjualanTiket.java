package minggu7;

import java.util.Scanner;

public class PenjualanTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int tiket = 0, hargaTiket = 50000, totalBayar = 0, jmlTiket = 0;

        // note
        System.out.println("====== SISTEM PENJUALAN TIKET =======");
        System.out.println("=== Masukkan '0' untuk mengakhiri ===");

        // perulangan
        do {
            System.out.print("Masukkan jumlah penjualan tiket hari ini : ");
            tiket = sc.nextInt();
            if (tiket <= 0) {
                System.out.println("===== Penghitungan diakhiri. =====");
                break;
            }
            if (tiket > 4) {
                totalBayar += (tiket * hargaTiket) - ((tiket * hargaTiket) * 10 / 100f);
                jmlTiket += tiket;
            } else if (tiket > 10) {
                totalBayar += (tiket * hargaTiket) - ((tiket * hargaTiket) * 15 / 100f);
                jmlTiket += tiket;
            } else {
                totalBayar += (tiket * hargaTiket);
                jmlTiket += tiket;
            }
        } while (true);
        System.out.println("Total jumlah penjualan tiket : " + jmlTiket);
        System.out.println("Total harga penjualan tiket : Rp " + totalBayar);
    }
}
