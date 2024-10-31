package minggu10;

import java.util.Scanner;

public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = input.nextInt();

        int[] nilaiMhs = new int[jumlah];
        double totalLulus = 0, totaltdkLulus = 0;
        double rata2Lulus, rata2TdkLulus;
        int jmlLulus = 0, jmlTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totaltdkLulus += nilaiMhs[i];
                jmlTdkLulus++;
            }
        }
        rata2Lulus = totalLulus / jmlLulus;
        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        rata2TdkLulus = totaltdkLulus / jmlTdkLulus;
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TdkLulus);
    }
}
