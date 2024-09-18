import java.util.Scanner;

public class KelilingTrapesium {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        double t, ab, cd, miring, keliling;

        //input
        System.out.print("Masukkan panjang AB : ");
        ab = input.nextDouble();
        System.out.print("Masukkan panjang CD : ");
        cd = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        t = input.nextDouble();

        //operasi
        miring = Math.sqrt((t*t) + (((ab - cd)/2)*((ab-cd)/2)));
        keliling = ab + cd + miring*2;

        //output
        System.out.println("Keliling trapesium tersebut adalah " + keliling + " cm");


    }
    
}
