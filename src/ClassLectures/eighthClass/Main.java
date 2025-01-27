package ClassLectures.eighthClass;

public class Main {
    public static void main(String[] args) {

        Person iqramul = new Person();


        iqramul.setName("Omar Faruk");
        iqramul.setAge(29);
        iqramul.setFebColor("Red");
        iqramul.setAddress("Mirpur");


        System.out.printf("Name: "+iqramul.getName()+"\nAge: "+
                iqramul.getAge()+"\nFev Color: "+iqramul.getFebColor()+
                "\nAddress: "+iqramul.getAddress());
    }
}
