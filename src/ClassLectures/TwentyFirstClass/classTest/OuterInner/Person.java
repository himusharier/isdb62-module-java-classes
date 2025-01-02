package ClassLectures.TwentyFirstClass.classTest.OuterInner;

public class Person {

    class Address {
        private String city;
        private String state;

        public Address(String city, String state) {
            this.city = city;
            this.state = state;

        }

        public void displayAddress() {
            System.out.println("City: " + city);
            System.out.println("State: " + state);
        }
    }

    public static void main(String[] args) {

        Person person = new Person();

        Address address = person.new Address("Dhaka", "Dhaka");

        address.displayAddress();
    }
}
