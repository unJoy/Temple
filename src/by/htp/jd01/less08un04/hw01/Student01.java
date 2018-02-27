package by.htp.jd01.less08un04.hw01;

import java.util.Random;


public class Student01 {
    private Random rd = new Random();

    public String firstName;
    public String lastName;
    public int[] mark1 = new int[20]; // History
    public int[] mark2 = new int[20]; // Maths
    public int[] mark3 = new int[20]; // English
    public int[] mark4 = new int[20]; // Physics


    {
        for(int i = 0; i < 20; i++){
            mark1[i] = rd.nextInt(10) + 1;
            mark2[i] = rd.nextInt(10) + 1;
            mark3[i] = rd.nextInt(10) + 1;
            mark4[i] = rd.nextInt(10) + 1;
        }
    }

    //public Student01

}
