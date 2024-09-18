import java.util.Scanner;

public class HargaBayar12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi
        int harga, jumlah;
        double diskon = 0.1, total, jumlahDiskon, bayar;

        //input
        System.out.print("Masukkan harga barang yang telah dibeli : ");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah barang yang telah dibeli : ");
        jumlah = input.nextInt();

        //operasi
        total = harga*jumlah;
        jumlahDiskon = total*diskon;
        bayar = total - jumlahDiskon;

        //output
        System.out.println("Diskon yang anda dapatkan adalah : " + jumlahDiskon);
        System.out.println("Jumlah yang harus anda bayar : " + bayar);
        
    }
    
}
