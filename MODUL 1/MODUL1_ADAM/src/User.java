public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String Name;
    private int Phone_number;

    public void setNama(String Name) {
        this.Name = Name;
    }
    public void setPhone_number(int Phone_number) {
        this.Phone_number = Phone_number;
    }

    public String getName() {
        return Name;
    }
    public int getPhone_number() {
        return Phone_number;
    }

    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message

}
