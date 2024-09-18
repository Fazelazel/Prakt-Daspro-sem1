import java.util.Scanner;

public class Kafe12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100;

        //input
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        //operasi
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);

                //casting
                byte totalByte = (byte) totalHarga;

        nominalBayar = totalByte - (diskon * totalByte);


        //output
        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " Kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
    
    input.close();
    }
    
}
