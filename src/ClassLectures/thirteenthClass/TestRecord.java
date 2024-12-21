package ClassLectures.thirteenthClass;

public class TestRecord {
    public static void main(String[] args) {

        RecordClass recordClass = new RecordClass();
        recordClass.setUserName("admin");
        recordClass.setPassword("password");

        System.out.println(recordClass.toString());

        ActualRecord actualRecord = new ActualRecord("admin", "password");
        System.out.println(actualRecord);
    }
}
