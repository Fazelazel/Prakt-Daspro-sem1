package minggu7;

import java.util.Scanner;
public class KafeDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi
        int kopi, teh, roti;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        //perulangan do-while
        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar) : ");
            namaPelanggan = input.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi : ");
            kopi = input.nextInt();
            System.out.print("Jumlah teh : ");
            teh = input.nextInt();
            System.out.print("Jumlah roti : ");
            roti = input.nextInt();
            int totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Total yang harus dibayar : Rp " + totalHarga);
            input.nextLine();
        } while (true);

        System.out.println("Semua transaksi selesai.");
    }
}
