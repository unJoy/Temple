package by.htp.jd01.unit04.hw03;

public class Note {

    private String firstName;
    private String lastName;
    private String telephone;

    
    public Note(String firstName, String lastName, String telephone) {
		this.firstName = firstName;
		this.lastName  = lastName;
		this.telephone = telephone;
	}


	public Note searchNote(String search){
        if(this.firstName.equals(search)||this.lastName.equals(search)||this.telephone.equals(search)){
            return this;
        } else {
            return null;
        }
    }


    @Override
    public String toString(){
        return "_______________________________" +
               "\nFirst name: " + firstName +
               "\nLast name:  " + lastName +
               "\nTelephone number: " + telephone;
    }
}
