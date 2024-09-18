import java.util.Scanner;

public class WaktuTandon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        double jariJari, tinggi, kecepatan, waktu, volume;

        //input
        System.out.print("Masukkan jari - jari tandon : ");
        jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi tandon : ");
        tinggi = input.nextDouble();
        System.out.print("Masukkan kecepatan pengisian : ");
        kecepatan = input.nextDouble();

        //operasi
        volume = Math.PI* Math.pow(jariJari, 2)* tinggi;
        waktu = volume/kecepatan;

        //output
        System.out.println("Waktu yang dibutuhkan adalah : " + String.format("%.2f", waktu) + " detik");

        input.close();

    }
    
}
