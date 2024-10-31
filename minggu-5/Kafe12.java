import java.util.Scanner;

public class Kafe12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotaan;

        //input
        System.out.print("Masukkan menu : ");
        menu = input.nextLine();
        System.out.print("Masukkan ukuran cup : ");
        ukuranCup = input.next().charAt(0);
        System.out.print("Masukkan jumlah : ");
        jumlah = input.nextInt();
        System.out.print("Masukkan keanggotaan (true/false) : ");
        keanggotaan = input.nextBoolean();

        double hargaMenu = 0;

        //switch case
        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh":
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
        }

        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 'S':
                break;
            case 'M':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'L':
                totalHarga += 0.4 * totalHarga;
                break;
            default://handle jika user memilih size selain yang tersedia
                System.out.println("Size yang dipilih tidak tersedia..");
                return;
        }
        //operasi
        double diskon = keanggotaan ? 0 : 0.1;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        //output
        System.out.println("item pembelian " + jumlah + " " + menu + " dengan ukuran cup " + ukuranCup);
        System.out.println("Nominal bayar : " + nominalBayar);

        input.close();
    }
}
