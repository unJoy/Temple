package by.htp.jd01.unit04.hw02;

import by.htp.jd01.unit04.Read;


public class Abiturient {

    private Read read = new Read();

    private String firstName;
    private String lastName;

    private int markMaths;
    private int markEnglih;
    private int markPhysics;


    Abiturient(){

        System.out.println("__________________________________");

        firstName = read.readName("Abiturient first name: ");
        lastName  = read.readName("Abiturient last name: ");

        System.out.println();

        markMaths   = read.readMark("Mark in Maths: ");
        markEnglih  = read.readMark("Mark in English: ");
        markPhysics = read.readMark("Mark in Physics: ");
    }

    public void showAbiturient(){
        System.out.printf("%s %s\n", firstName, lastName);
    }

    public int getSumPoints(){
        return markEnglih + markMaths + markPhysics;
    }
}
