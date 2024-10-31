import java.util.Scanner;

public class PemilihanHari12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //deklarasi variabel
        String dayName, dayType;

        //input
        System.out.print("Input day name : ");
        dayName = input.nextLine();

        //switch case
        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = " Invalid day name";
        }

        //output
        System.out.println(dayName + " is a " + dayType);

        input.close();
    }
}
