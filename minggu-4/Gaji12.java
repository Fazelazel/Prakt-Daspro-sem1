import java.util.Scanner;

public class Gaji12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        int jmlMasuk, jmlTdkMasuk, totalGaji;
        int gaji = 40000, potGaji = 25000;

        //inputan
        System.out.print("Masukkan Jumlah Hari Masuk Kerja Anda : ");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan Jumlah Hari Tidak Masuk Kerja Anda : ");
        jmlTdkMasuk = input.nextInt();

        //operasi
        totalGaji = (jmlMasuk*gaji) - (jmlTdkMasuk*potGaji);

        //output
        System.out.println("Total gaji anda : " + totalGaji);
    }
}
