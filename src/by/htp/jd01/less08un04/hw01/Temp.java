package by.htp.jd01.less08un04.hw01;

import java.util.Random;

public class Temp{
    Random rd = new Random();

    public int[] mark;
    private int quantity;
    private double average;

    Temp(int quantity){
        this.quantity = quantity;
    }

    public int[] createMark(){
        mark = new int[quantity];
        for(int i = 0; i < mark.length; i++){
            mark[i] = rd.nextInt(10) + 1;
        }
        return mark;
    }

    public double averageMark(){
        int sum = 0;
        for(int i = 0; i < mark.length; i++) {
            sum += mark[i];
        }
        average = (double) sum/mark.length;
        return average;
    }

    public void show(){
        System.out.println(average);
    }
}
