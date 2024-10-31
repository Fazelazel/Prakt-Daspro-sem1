import java.util.Scanner;

public class TokoBuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi kebutuhan
        int jumlahBuku;
        String jenisBuku;
        double diskon = 0;

        //input
        System.out.print("Masukkan jenis buku : ");
        jenisBuku = input.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlahBuku = input.nextInt();

        //kondisi menghitung jumlah diskon
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        }
        else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jumlahBuku > 3) {
                diskon = 2;
            } else if (jumlahBuku <= 3) {
                diskon += 1;
            }
        }
        else {
            if (jumlahBuku > 3) {
                diskon += 5;
            }
        }
        System.out.println("Jumlah diskon yang anda dapatkan : " + diskon + "%");
    }
}
