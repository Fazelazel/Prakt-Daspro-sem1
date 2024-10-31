import java.util.Scanner;

public class ZombievsPlant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi
        int nyawaZombie, seranganZombie, nyawaPelindung, nyawaPenyerang, seranganTanaman;
        int i = 1;

        // input status awal
        System.out.println("Zombie vs Plant");
        System.out.println("--------------------------");
        System.out.println("Status Awal Pertarungan : ");
        System.out.print("Nyawa Zombie : ");
        nyawaZombie = input.nextInt();
        System.out.print("Poin serangan zombie : ");
        seranganZombie = input.nextInt();
        System.out.print("Nyawa tanaman pelindung : ");
        nyawaPelindung = input.nextInt();
        System.out.print("Nyawa tanaman penyerang : ");
        nyawaPenyerang = input.nextInt();
        System.out.print("Poin serangan tanaman penyerang : ");
        seranganTanaman = input.nextInt();
        System.out.println("--------------------------");
        System.out.println("Pertarungan : Tanaman vs Zombie!");
        System.out.println("--------------------------");

        // perulangan alur battle plantvszombie
        while (nyawaPenyerang > 0 && nyawaZombie > 0) {
            if (nyawaPelindung > 0) {
                System.out.println("\nRonde " + i);
                i++;
                System.out.println("--------");
                System.out.println("Tanaman penyerang menyerang zombie!");
                nyawaZombie -= seranganTanaman;
                System.out.println("Nyawa zombie sekarang : " + nyawaZombie + " poin");
                System.out.println("Zombie menyerang Tanaman Pelindung!");
                nyawaPelindung -= seranganZombie;
                System.out.println("Nyawa Tanaman Pelindung sekarang : " + nyawaPelindung + " poin");
            } else if (nyawaPenyerang > 0) {
                System.out.println("\nRonde " + i);
                i++;
                System.out.println("--------");
                System.out.println("Tanaman Penyerang menyerang Zombie!");
                nyawaZombie -= seranganTanaman;
                System.out.println("Nyawa zombie sekarang : " + nyawaZombie + " poin");
                System.out.println("Zombie menyerang Tanaman Penyerang!");
                nyawaPenyerang -= seranganZombie;
                System.out.println("Nyawa Tanaman Penyerang sekarang : " + nyawaPenyerang + " poin");
            }
        }
        if (nyawaZombie > nyawaPenyerang) {
            System.out.println("Tanaman telah hancur! Zombie Menang!");
        } else {
            System.out.println("Zombie telah mati! Tanaman menang!");
        }
    }
}
