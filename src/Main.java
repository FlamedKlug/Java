import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int seconds = scan.nextInt();
        seconds = seconds % 86400;
        System.out.println((seconds / 3600) + ":" +
                ((((seconds % 3600) / 60) >= 10) ? ((seconds % 3600) / 60) : ("0" + ((seconds % 3600) / 60)))
                + ":" + ((((seconds % 3600) % 60) >= 10) ? ((seconds % 3600) % 60) : "0" + ((seconds % 3600) % 60)));
    }
}