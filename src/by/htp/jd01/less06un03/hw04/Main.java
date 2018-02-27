package by.htp.jd01.less06un03.hw04;

public class Main {

    public static void main(String[] args){

        Customer customer01 = new Customer("38727", "Anton",
                "Ryabinin", "Alexandrovich", "Borisov, Chapaev St. 64/59",
                "4255 2005 7792 5829", "95693994955444");

        customer01.show();

        Student student01 = new Student("12234", "Anton", "Ryabinin",
                "Alexandrovich", "14.03.1996", "Borisov, Chapaev St. 64/59",
                "+375(44) 716-06-44", "FCSN", "3");

        student01.show();
    }
}
