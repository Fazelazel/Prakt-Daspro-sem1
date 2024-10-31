package minggu7;

import java.util.Scanner;

public class TotalBayarParkir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi
        int jenis = 0, durasi, total = 0, mobil = 0, motor = 0;

        // perulangan
        while (true) {
            System.out.print("Masukkan jenis kendaraan \n(1 Mobil, 2 Motor, 0 keluar) : ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi : ");
                durasi = sc.nextInt();
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
        }
        System.out.println("Total harga : " + total);
        System.out.println("Total mobil : " + mobil);
        System.out.println("Total motor : " + motor);
    }
}