public class Contact {

//hiigit
    //simo chaoura
    private final String name;
    private final String phoneNumber; // constructor pour intialisé les valeurs
    private final String email;
    public Contact(String name, String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }



    @Override
    public String toString() {
        return "Contact{" +
                "contact='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                "email='" + email + '\'' +
                '}';
    }

}
