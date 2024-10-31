import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi variabel
        int bil1, bil2, bil3, bilMax = 0;

        // input
        System.out.print("Masukkan bilangan 1 = ");
        bil1 = input.nextInt();
        System.out.print("Masukkan bilangan 2 = ");
        bil2 = input.nextInt();
        System.out.print("Masukkan bilangan 3 = ");
        bil3 = input.nextInt();

        // kondisi pengurutan bilMax
        if (bil1 > bil2) {
            if (bil1 > bil3) {
                bilMax = bil1;
            } else {
                bilMax = bil3;
            }

        } else if (bil2 > bil1) {
            if (bil2 > bil3) {
                bilMax = bil2;
            } else {
                bilMax = bil3;
            }
        }
        System.out.println("Bilangan terbesar adalah = " + bilMax);
    }
}
