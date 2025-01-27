package ClassLectures.eighthClass.himu;

import java.util.Date;

public class Attendence {
    public static void main(String[] args) {
        LabLogSheet omar = new LabLogSheet(); // object creation

        // inserting data:
        omar.setTraineeId(1285325);
        //omar.setArrivalTime(new Date());
        omar.setSign("omar");
        omar.setComputerId(02);
        // retrieving data:
        /*System.out.print(omar.getTraineeId());
        System.out.print(omar.getArrivalTime());
        System.out.print(omar.getSign());
        System.out.print(omar.getComputerId());*/

        LabLogSheet iqram = new LabLogSheet();
        iqram.setTraineeId(1285707);
        //iqram.setArrivalTime(new Date());
        iqram.setSign("iqram");
        iqram.setComputerId(01);

        System.out.println(omar.getTraineeId() + "    " + omar.getArrivalTime() + "     " + omar.getSign() + "     " + omar.getComputerId());
        System.out.println(iqram.getTraineeId() + "    " + iqram.getArrivalTime() + "     " + iqram.getSign() + "     " + iqram.getComputerId());


        LabLogSheet rasel = new LabLogSheet(
                1234, new Date(), "rasel", 1324
        );

        System.out.println(rasel.getSign());
        System.out.println(rasel.toString());
        System.out.println(iqram.toString());
    }
}
