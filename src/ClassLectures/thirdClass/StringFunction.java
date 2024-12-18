package ClassLectures.thirdClass;

public class StringFunction {
    public static void main(String[] args) {
        String name = "Amra Bangladesh er bashinda";
        String nameTwo = "\"\t\t\t\t\nwho are you \n\t";
        String nameThree = "\"who are you\"";
        String anotherName = "";

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("s"));
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" jog korlam"));
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(anotherName.isEmpty());
        System.out.println(name.endsWith("da"));
        System.out.println(name.indexOf("A"));

        String nahid = "human";
        String hemel = "Human";

        System.out.println(nahid.equals(hemel));
        System.out.println(nahid.equalsIgnoreCase(hemel));

        String numString = "22";
        int convertedFromString = Integer.parseInt(numString);
        System.out.println(convertedFromString);
        System.out.println(((Object) convertedFromString).getClass().getSimpleName());
        System.out.println("This value is of type Integer "
                + (Integer.valueOf(convertedFromString) instanceof Integer));

        // Substring
        // trim
        // various indexOf
        System.out.println(nameTwo.length());
        System.out.println(nameTwo.trim().length());

        System.out.println(nameThree);
        System.out.println(nameThree.substring(3));
        System.out.println(nameThree.substring(3, 7));

        String num = "189234";
        int numInt = Integer.parseInt(num);
        String num2 = "189234.98234";
        // int num2Int = Integer.parseInt(num2);
        double doubleValue = Double.parseDouble(num2);
        System.out.println(doubleValue);

        int a = 123;
        String stringValue = String.valueOf(a);
        System.out.println(stringValue);
    }
}
