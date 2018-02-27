package by.htp.jd01.unit04.hw01;


public class Main01 {

    public static void main(String[] args){

        Group gr = new Group();

        gr.setGroupSize();
        gr.showStudentsInfo();
        gr.averageMarkEachStudent();
        gr.averageMarkAllGroup();
        gr.countGoodStudents();
        gr.countBadStudents();
    }
}
