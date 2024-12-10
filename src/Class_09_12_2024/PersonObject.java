package Class_09_12_2024;

public class PersonObject {
    private String name;
    private int age;
    private String favcolor;
    private String address;

    public PersonObject(String name, int age, String favcolor, String address) {
        this.name = name;
        this.age = age;
        this.favcolor = favcolor;
        this.address = address;
    }

    /*public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavcolor(String favcolor) {
        this.favcolor = favcolor;
    }

    public void setAddress(String address) {
        this.address = address;
    }*/



    /*public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavcolor() {
        return favcolor;
    }

    public String getAddress() {
        return address;
    }*/


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", favcolor='" + favcolor + '\'' +
                ", address='" + address + '\'';
    }
}
