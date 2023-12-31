package RockApi.com;

public class User {

    private int id;
    private String name;

    private int age;

    private String mobileNumber;

    private String country;

    private String emailId;

    public User(){

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User(int id, String name, int age, String mobileNumber, String country, String emailId) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.country = country;
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
