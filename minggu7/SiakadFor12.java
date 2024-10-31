package minggu7;

import java.util.Scanner;
public class SiakadFor12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi
        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tdkLulus = 0;

        //perulangan for
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke " + i + " : ");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus += 1;
            }
            if (nilai < 60) {
                tdkLulus += 1;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa lulus : " + lulus + " orang");
        System.out.println("Jumlah mahasiswa tidak lulus : " + tdkLulus + " orang");
    }
}
