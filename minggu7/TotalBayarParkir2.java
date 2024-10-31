package minggu7;

import java.util.Scanner;

public class TotalBayarParkir2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi
        int jenis, durasi, total = 0, mobil = 0, motor = 0;

        // perulangan
        do {
            // note
            System.out.println("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");

            System.out.print("Masukkan jenis kendaraan anda : ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan total durasi : ");
                durasi = input.nextInt();
                if (durasi > 5) {
                    total += 12500;
                    if (jenis == 1) {
                        mobil++;
                    } else if (jenis == 2) {
                        motor++;
                    }
                } else if (jenis == 1) {
                    total += durasi * 3000;
                    mobil++;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                    motor++;
                }
            } else {
                break;
            }
        } while (jenis != 0);
        System.out.println("Total harga parkir : Rp " + total);
        System.out.println("Total kendaraan mobil : " + mobil);
        System.out.println("Total kendaraan motor : " + motor);
    }
}
