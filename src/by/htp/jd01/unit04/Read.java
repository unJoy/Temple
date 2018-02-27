package by.htp.jd01.unit04;

import java.util.Scanner;


public class Read {

    private Scanner scanner = new Scanner(System.in);


    public int readMark(String msg){

        int mark = 0;

        System.out.print(msg);

        while(scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                mark = scanner.nextInt();
                if (mark >= 1 && mark <11) {
                    return mark;
                } else {
                    System.out.println("Mark can't be >10 or <1");
                    System.out.print(msg);
                }
            } else {
                System.out.println("The value you have entered is not an integer");
                System.out.print(msg);
                scanner.next();
            }
        }

        return mark;
    }


    public String readName(String msg){

        String name = "";

        System.out.print(msg);

        while(name.equals("")) {
            name = scanner.next();
        }

        return name;
    }


    public int readSize(String msg){

        int size = 0;

        System.out.print(msg);

        while(scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size >= 1) {
                    return size;
                } else {
                    System.out.println("Size can't be <1");
                    System.out.print(msg);
                }
            } else {
                System.out.println("The value you have entered is not an integer");
                System.out.print(msg);
                scanner.next();
            }
        }

        return size;
    }

}
