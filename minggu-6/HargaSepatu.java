import java.util.Scanner;

public class HargaSepatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        String merk, kategori;
        int ukuran, harga = 0;

        // input
        System.out.print("Masukkan merk sepatu : ");
        merk = input.nextLine();
        System.out.print("Masukkan kategori sepatu : ");
        kategori = input.nextLine();
        System.out.print("Masukkan ukuran sepatu : ");
        ukuran = input.nextInt();

        // pengkondisian menggunakan switch case
        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                switch (ukuran) {
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        harga = 800000;
                        break;
                }
            } else if (kategori.equalsIgnoreCase("high top")) {
                switch (ukuran) {
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        harga = 1200000;
                        break;
                }
            }
        } else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                switch (ukuran) {
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                        harga = 1000000;
                        break;
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                switch (ukuran) {
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        harga = 1800000;
                        break;
                }
            }
        } else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                switch (ukuran) {
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                        harga = 750000;
                        break;
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                switch (ukuran) {
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                        harga = 1500000;
                        break;
                }
            }
        }
        System.out.println("Harga sepatu anda : " + harga);
    }
}