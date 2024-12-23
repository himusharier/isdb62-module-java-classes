package ClassWork.groupWork;

public class FormFillUp {
    public static void main(String[] args) {
        Form rasel = new Form("Rasel", "rsl@xy.com","Tangail",125987);
       // System.out.println(rasel.toString());
        rasel.setEmail("rasel.xxx.com");
        //System.out.println(rasel.toString());
        rasel.displayInformation();
    }

}
