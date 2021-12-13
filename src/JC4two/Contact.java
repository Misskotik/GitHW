package JC4two;

public class Contact {

    protected String surname;
    protected long phoneNumber;

    protected long getNumber() {
        return phoneNumber;
    }

    public String getName() {
        return surname;
    }

    public void addContact(String surname, long phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    //       public void getContact (String surname, String phoneNumber) {
//            System.out.println(this.surname + this.phoneNumber);
//        }
    public void getContact(String surname, long phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }
}






