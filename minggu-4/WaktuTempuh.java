import java.util.Scanner;

public class WaktuTempuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        int kecepatan = 2, waktu, jarak;

        //input
        System.out.print("Masukkan jarak tempuh : ");
        jarak = input.nextInt();

        //operasi
        waktu = jarak/kecepatan;

        //output
        System.out.println("Waktu yang diperlukan : " + waktu);
    
        input.close();
    }
    
}
