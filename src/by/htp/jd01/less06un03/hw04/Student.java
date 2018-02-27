package by.htp.jd01.less06un03.hw04;

public class Student {

    private String id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String birthday;
    private String adress;
    private String phoneNumber;
    private String faculty;
    private String course;

    public Student(String id, String firstName, String lastName, String patronymic, String birthday, String adress, String phoneNumber, String faculty, String course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
    }



    public String getAdress() {
        return adress;
    }

    public String getBirthday() {
        return birthday;
    }



    public String getCourse() {
        return course;
    }

    public String getFaculty() {
        return faculty;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getId() {
        return id;
    }



    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }



    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setCourse(String course) {
        this.course = course;
    }



    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }



    public void setId(String id) {
        this.id = id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void show(){
        System.out.println("\n______________________________________________");
        System.out.println("\t\t\t\tSTUDENT DATA");
        System.out.println("______________________________________________");
        System.out.println("ID:           | " + this.id);
        System.out.println("First name:   | " + this.firstName);
        System.out.println("Last name:    | " + this.lastName);
        System.out.println("Patronymic:   | " + this.patronymic);
        System.out.println("Birthday:     | " + this.birthday);
        System.out.println("Adress:       | " + this.adress);
        System.out.println("Phone number: | " + this.phoneNumber);
        System.out.println("Faculty:      | " + this.faculty);
        System.out.println("Course:       | " + this.course);
        System.out.println("______________________________________________\n");
    }
}
