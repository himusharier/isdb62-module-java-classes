package ClassLectures.eighthClass;

public class Person {


    private String name;
    private int age;
    private String febColor;
    private String address;

    public Person(){
        System.out.println("You are payjama");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFebColor() {
        return febColor;
    }

    public void setFebColor(String febColor) {
        this.febColor = febColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
