import java.util.Scanner;

public class Lingkaran12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //deklarasi variabel
        int r;
        double keliling, luas, phi = 3.14;

        //input
        System.out.print("Masukkan jari - jari lingkaran : ");
        r = input.nextInt();

        //operasi
        keliling = 2*phi*r;
        luas = phi*r*r;

        //output
        System.out.println("Keliling = " + keliling);
        System.out.println("Luas = " + luas);
    
        input.close();
    }
}