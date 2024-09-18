import java.util.Scanner;

public class tes {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nama, NIM, Kelas, Prodi");

        System.out.println("Masukkan Nama : ");
        String nama = myObj.nextLine();
        
        System.out.println("Masukkan NIM : ");
        String nim = myObj.nextLine();
        
        System.out.println("Masukkan kelas : ");
        String kelas = myObj.nextLine();
        
        System.out.println("Masukkan Prodi : ");
        String prodi = myObj.nextLine();


        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("Prodi : " + prodi);
    
    myObj.close();
    }
}
