import java.util.Scanner;

public class TarifListrik {
    
    /**
         * input : jmlPenggunaanListrik, tarifListrik = 1.500
         * output : totalTagihan
         * Algoritma :
         * 1. input jumlah penggunaan listrik
         * 2. hitung total tagihan = jumlah penggunaan listrik * tarif listrik
         * 3. apakah jumlah penggunaan listrik >= 500 kWh?
         *    jika iya menampilkan "Penggunaan listrik anda sudah melebihi 500 kWh"
         *    jika tidak menampilkan "Penggunaan listrik anda belum melewati 500 kWh"
         */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //deklarasi variabel
        int jmlPenggunaanListrik, tarifListrik = 1500, totalTagihan;

        //input
        System.out.print("Masukkan jumlah penggunaan listrik anda : ");
        jmlPenggunaanListrik = input.nextInt();
        
        //operasi
        totalTagihan = jmlPenggunaanListrik * tarifListrik;
        
        //output
        System.out.println("Tagihan listrik anda = " + totalTagihan);
        
        if (jmlPenggunaanListrik >= 500) {
            System.out.println("Penggunaan listrik anda sudah melebihi 500 kWh");
        } else {
            System.out.println("Penggunaan listrik anda belum melewati 500 kWh");
        }
    
    input.close();
    }
    
}
