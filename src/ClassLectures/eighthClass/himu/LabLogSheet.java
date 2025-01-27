package ClassLectures.eighthClass.himu;

import java.util.Date;

public class LabLogSheet {
    private int traineeId;
    private Date arrivalTime = new Date();
    private String sign;
    private int computerId;

    // constructor:
    // --> using default constructor.

    // If we didn't set any constructor manually
    public LabLogSheet() {
    }

    public LabLogSheet(int traineeId, Date arrivalTime, String sign, int computerId) {
        this.traineeId = traineeId;
        this.arrivalTime = arrivalTime;
        this.sign = sign;
        this.computerId = computerId;
    }

    // getter:
    public int getTraineeId() {
        return traineeId;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public String getSign() {
        return sign;
    }

    public int getComputerId() {
        return computerId;
    }

    // setter:
    public void setTraineeId(int traineeId) {
        this.traineeId = traineeId;
    }

    /*public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }*/

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    /*@Override
    public String toString() {
        return "LabLogSheet{" +
                "traineeId=" + traineeId +
                ", arrivalTime=" + arrivalTime +
                ", sign='" + sign + '\'' +
                ", computerId=" + computerId +
                '}';
    }*/

    public String toString() {
        return traineeId + "\t" + arrivalTime + "\t" + sign + "\t" + computerId;
    }


}
