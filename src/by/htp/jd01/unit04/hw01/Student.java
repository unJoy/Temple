package by.htp.jd01.unit04.hw01;

import by.htp.jd01.unit04.Read;


public class Student {

    private Read read = new Read();

    private String firstName;
    private String lastName;

    private int markInformatics;
    private int markMaths;
    private int markEnglish;
    private int markPhysics;


    Student() {

        System.out.println("__________________________________");

        firstName = read.readName("Student first name: ");
        lastName  = read.readName("Student last name: ");

        System.out.println();

        markInformatics = read.readMark("Mark in Informatics: ");
        markMaths       = read.readMark("Mark in Maths: ");
        markEnglish     = read.readMark("Mark in English: ");
        markPhysics     = read.readMark("Mark in Physics: ");

    }


    public double averageMarkStudent(){
        return (double)(markInformatics + markEnglish + markMaths + markPhysics)/4;
    }


    public void showStudentInfo(){
        System.out.println("____________________");
        System.out.printf("%s %s\n", firstName, lastName);
        System.out.println("____________________");
        System.out.printf("Informatics:   | %d |\n", markInformatics);
        System.out.printf("Maths:         | %d |\n", markMaths);
        System.out.printf("English:       | %d |\n", markEnglish);
        System.out.printf("Physics:       | %d |\n\n", markPhysics);

    }


    public boolean ifGoodStudent(){

        return ((double)(markPhysics + markMaths + markEnglish + markInformatics)/4 >= 8.0);
    }


    public boolean ifBadStudent(){

        return (markPhysics <= 2  ||  markMaths <= 2  ||  markEnglish <= 2  ||  markInformatics <= 2);
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }
}
