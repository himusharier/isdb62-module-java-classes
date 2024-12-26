package ClassPracticeFiles.Class_21_12_2024;

public class TestRecord {
    public static void main(String[] args) {
        RecordClass recordClass = new RecordClass();
        recordClass.setUserName("himu");
        recordClass.setPassWord("admin");
        System.out.println(recordClass.toString());

        ActualRecord actualRecord = new ActualRecord("himu", "admin");
        actualRecord.userName();
        actualRecord.password();
        System.out.println(actualRecord);
    }


}
