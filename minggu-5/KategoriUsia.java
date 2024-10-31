import java.util.Scanner;

public class KategoriUsia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int usia;
        String kategori = "";

        // input
        System.out.print("Masukkan jumlah umur : ");
        usia = input.nextInt();

        // if...else
        if (usia <= 0) {
            System.out.println("ANGKA YANG ANDA MASUKKAN INVALID");
        } else {

            if (usia >= 0 && usia <= 12) {
                kategori = "Anak - anak";
            } else if (usia >= 13 && usia <= 19) {
                kategori = "Remaja";
            } else if (usia >= 20 && usia <= 64) {
                kategori = "Dewasa";
            } else if (usia >= 65) {
                kategori = "Lansia";
            }
            // output
            System.out.println("Usia anda adalah " + usia + " termasuk kategori " + kategori);
        }
        input.close();
    }
}
