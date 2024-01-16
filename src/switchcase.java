import java.util.Scanner;

public class switchcase {
    public static void main(String[] args){
        // switch = its a statment which tested against all the options give
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the day");
        String days = scanner.nextLine();

        switch (days){
            case "sunday": System.out.println("its sunday enjoy");
                break;
            case "monday": System.out.println("its monday work hard");
                break;
            case "friday": System.out.println("its friday work and enjoy");
                break;
            default: System.out.println("no data for this day");
                break;
        }
        scanner.close();
    }
}
