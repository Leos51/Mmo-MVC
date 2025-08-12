package training.afpa.cda24060.utility;

import java.util.Scanner;

public class UserInput {
    private static Scanner input = new Scanner(System.in);

    public static String userString(String msg){
        System.out.println(msg);
        String str = "";
        while (str.isBlank()) {
            str = input.nextLine();
        }
        return str;
    }

    public static int userInt(String msg){
        System.out.println(msg);
        int value = input.nextInt();
        input.nextLine();
        return value;
    }

    public static double userDouble(String msg){
        System.out.println(msg);
        double value = input.nextDouble();
        input.nextLine();
        return value;

    }

    public static void closeScanner() {
        input.close();
    }

}
