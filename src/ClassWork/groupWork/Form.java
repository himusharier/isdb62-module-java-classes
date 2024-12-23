package ClassWork.groupWork;

public class Form {
    private String name;
    private String email;
    private String address;
    private int mobile;

    public Form(String name, String email, String address, int mobile) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.mobile = mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
            //GETTER
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getMobile() {
        return mobile;
    }

//    @Override
//    public String toString() {
//        return "Form{" +
//                "name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", address='" + address + '\'' +
//                ", mobile=" + mobile +
//                '}';
//    }

    void displayInformation(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Mobile: " + mobile);
    }
}

