package ClassLectures.fiftinthClass.problemSolving;

public class CalculateAvgValue {
    public static void main(String[] args) {

        int[] number = {10, 20, 30, 40, 50, 60};

        int sum = 0;
        for (int j : number) {
            sum += j;
        }

        double avg = (double) sum / number.length;

        System.out.println("The average value of the array elements is: " + avg);
    }
}
