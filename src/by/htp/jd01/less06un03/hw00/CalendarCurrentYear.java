package by.htp.jd01.less06un03.hw00;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarCurrentYear {

    public static GregorianCalendar gc = new GregorianCalendar();

    public static void main(String[] args){

        gc.set(2018, Calendar.JANUARY, 1);
        int month = gc.get(Calendar.MONTH);
        int year = gc.get(Calendar.YEAR);

        gc.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("YEAR: " + gc.get(Calendar.YEAR));

        do {
            System.out.println("___________________________");

            switch(gc.get(Calendar.MONTH)){
                case 0:
                    System.out.println("JANUARY");
                    break;
                case 1:
                    System.out.println("FEBRUARY");
                    break;
                case 2:
                    System.out.println("MARCH");
                    break;
                case 3:
                    System.out.println("APRIL");
                    break;
                case 4:
                    System.out.println("MAY");
                    break;
                case 5:
                    System.out.println("JUNE");
                    break;
                case 6:
                    System.out.println("JULY");
                    break;
                case 7:
                    System.out.println("AUGUST");
                    break;
                case 8:
                    System.out.println("SEPTEMBER");
                    break;
                case 9:
                    System.out.println("OCTOBER");
                    break;
                case 10:
                    System.out.println("NOVEMBER");
                    break;
                case 11:
                    System.out.println("DECEMBER");
                    break;
            }
			

            System.out.println("Sun Mon Tue Thu Wed Fri Sat");
            int weekday = gc.get(Calendar.DAY_OF_WEEK);
            for (int i = Calendar.SUNDAY; i < weekday; i++) {
                System.out.print("    ");
            }

            do {
                int day = gc.get(Calendar.DAY_OF_MONTH);

                if (day < 10) {
                    System.out.print(" ");
                }

                System.out.print(" " + day + " ");

                if (weekday == Calendar.SATURDAY) {
                    System.out.println();
                }


                gc.add(Calendar.DAY_OF_MONTH, 1);
                weekday = gc.get(Calendar.DAY_OF_WEEK);


            } while (gc.get(Calendar.MONTH) == month); 

            if (weekday != Calendar.SUNDAY) {
                System.out.println();
            }

            month = gc.get(Calendar.MONTH);

        } while (gc.get(Calendar.YEAR) == year);
    }
}
