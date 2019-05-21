public class User<u> {

    private String username;

    private String firstName;

    private String lastName;

    User(String username, String firstName, String lastName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void generateDisplayName (String username){
        System.out.println("First Name: " + this.firstName + "\n" + "Last Name: " + this.lastName);

    }
}
