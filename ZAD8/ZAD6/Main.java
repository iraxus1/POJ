package pl.edu.pja;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter hour: ");
        int hour = scanner.nextInt();
        System.out.println("Enter minute: ");
        int minute = scanner.nextInt();
        System.out.println("Enter hour: \n TimeZone \n [1] Asia \n [2] Europe \n [3] America");

        Calendar calendar = Calendar.getInstance();
        LocalDate today = LocalDate.now();

        calendar.set(today.getYear(), today.getMonthValue(), today.getDayOfMonth(), hour, minute);

        switch (scanner.nextInt()) {
            case 1:
            {
                //Asia/China//
                hour = hour + 6;
                if (hour > 24){
                    hour = hour - 24;

                }
                else if (hour > 24){
                    hour = hour - 24;

                }
                System.out.println("\n" + hour + ":" + minute + "\n");
                break;
            }
            case 2:
            {
                //Europe/England//
                hour = hour - 1;
                if (hour > 24){
                    hour = hour - 24;

                }
                else if (hour > 24){
                    hour = hour - 24;

                }
                System.out.println("\n" + hour + ":" + minute + "\n");
                break;
            }
            case 3:
            {
                //"America/USA"//
                hour = hour - 6;
                if (hour > 24){
                    hour = hour - 24;

                }
                else if (hour > 24){
                    hour = hour - 24;

                }
                System.out.println("\n" + hour + ":" + minute + "\n");
                break;
            }
        }
        System.out.printf("%s-%s-%s", calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE ));
    }
}
