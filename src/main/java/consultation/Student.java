package consultation;

public class Student {

    private String firstname;

    private String secondname;

    private String address;

    private  String phonenumber;

    public Student(String firstname, String secondname, String address, String phonenumber) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.address = address;
        this.phonenumber = phonenumber;
    }


    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", address='" + address + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
