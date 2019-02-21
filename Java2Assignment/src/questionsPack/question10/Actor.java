package questionsPack.question10;

public abstract class Actor {
    String firstName;
    String lastName;
    Long phoneNumber;
    String emailId;
    Address address;

    class Address {
        String houseno;
        String city;
        String landmark;
        String district;
        String state;
        String zipCode;

        public Address(String houseno, String city, String landmark, String district, String state, String zipCode) {
            this.houseno = houseno;
            this.city = city;
            this.landmark = landmark;
            this.district = district;
            this.state = state;
            this.zipCode = zipCode;
        }
    }

    public Actor(String firstName, String lastName, Long phoneNumber, String emailId, String houseno, String city,
                 String landmark, String district, String state, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        new Address(houseno, city, landmark, district, state, zipCode);
    }

    public Actor() {
    }
}
