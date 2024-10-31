package minggu10;

import java.util.Scanner;

public class KelolaNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        double totalNilai = 0;
        int mhsMax, mhsMin;

        int nilaiMhs[] = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " = ");
            nilaiMhs[i] = sc.nextInt();
            totalNilai += nilaiMhs[i];
        }
        mhsMin = mhsMax = nilaiMhs[0];
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > mhsMax) {
                mhsMax = nilaiMhs[i];
            }
            if (nilaiMhs[i] < mhsMin) {
                mhsMin = nilaiMhs[i];
            }
        }

        double rata2 = totalNilai / nilaiMhs.length;

        System.out.println("Nilai tertinggi = " + mhsMax);
        System.out.println("Nilai terendah = " + mhsMin);
        System.out.println("Rata-rata nilai = " + rata2);
        for (int i = 0; i <= nilaiMhs.length; i++) {
            System.out.println(nilaiMhs[i]);
        }
    }
}
