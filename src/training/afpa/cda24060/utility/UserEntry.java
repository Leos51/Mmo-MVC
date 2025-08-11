package training.afpa.cda24060.utility;

import java.util.Scanner;

public class UserEntry {
    private static Scanner input = new Scanner(System.in);

    public static String userString(String msg){
        System.out.println(msg);
        return input.nextLine();
    }

    public static int userInt(String msg){
        System.out.println(msg);
        return input.nextInt();
    }

    public static double userDouble(String msg){
        System.out.println(msg);
        return input.nextDouble();
    }

    public static void closeScanner() {
        input.close();
    }

}
