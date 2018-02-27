package by.htp.jd01.less06un03.hw04;

public class Customer {

    private String id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String adress;
    private String creditCardID;
    private String bankAccountID;

    public Customer(String id, String firstName, String lastName, String patronymic, String adress, String creditCardID, String bankAccountID) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.adress = adress;
        this.creditCardID = creditCardID;
        this.bankAccountID = bankAccountID;
    }



    public String getAdress() {
        return adress;
    }

    public String getBankAccountID() {
        return bankAccountID;
    }



    public String getCreditCardID() {
        return creditCardID;
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

    public void setAdress(String adress) {
        this.adress = adress;
    }



    public void setBankAccountID(String bankAccountID) {
        this.bankAccountID = bankAccountID;
    }

    public void setCreditCardID(String creditCardID) {
        this.creditCardID = creditCardID;
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



    public void show(){
        System.out.println("\n______________________________________________");
        System.out.println("\t\t\t\tCUSTOMER DATA");
        System.out.println("______________________________________________");
        System.out.println("ID:              | " + this.id);
        System.out.println("First name:      | " + this.firstName);
        System.out.println("Last name:       | " + this.lastName);
        System.out.println("Patronymic:      | " + this.patronymic);
        System.out.println("Adress:          | " + this.adress);
        System.out.println("Credit card ID:  | " + this.creditCardID);
        System.out.println("Bank account ID: | " + this.bankAccountID);
        System.out.println("______________________________________________\n");
    }

}
