import java.util.Scanner;

public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        int menu, harga;
        double diskon, totalBayar;
        String member, qris;

        // Tampilkan Menu
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("--------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        menu = input.nextInt();
        input.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input.nextLine();
        System.out.print("Apakah anda ingin menggunakan Qris? (y/n) ? = ");
        qris = input.nextLine();
        System.out.println("--------------------------------------");

        // Kondisi pertama, jika pembeli memiliki member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            // menghitung total bayar setelah dikson
            // totalBayar = harga - (int) (harga * diskon);
            // System.out.println("Total bayar setelah diskon = " + totalBayar);

            // Menghitung total bayar setelah diskon dan pengecekan Qris
            if (qris.equalsIgnoreCase("y")) {
                totalBayar = (harga - 1000) - (harga * diskon);
                System.out.println("Anda mendapatkan potongan karena menggunakan Qris");
                System.out.println("Total bayar menggunakan Qris = " + (int) totalBayar);
            } else if (qris.equalsIgnoreCase("n")) {
                totalBayar = (harga - (harga * diskon));
                System.out.println("Total bayar = " + (int) totalBayar);
            }
        }
        // kondisi kedua, jika pembeli tidak memiliki member
        else if (member.equalsIgnoreCase("n")) {
            if (menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            } else if (menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            } else if (menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            // menghitung total bayar dan pengecekan qris
            if (qris.equalsIgnoreCase("y")) {
                totalBayar = (harga - 1000);
                System.out.println("Anda mendapatkan diskon karena menggunakan Qris");
                System.out.println("Total bayar menggunakan Qris " + (int) totalBayar);
            } else if (qris.equalsIgnoreCase("n")) {
                totalBayar = harga;
                System.out.println("Total bayar = " + (int) totalBayar);
            }

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("--------------------------------------");
    }
}
