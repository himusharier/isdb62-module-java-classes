package ClassLectures.secondClass;

public class MathClass {
    public static void main(String[] args) {
        int abs = Math.abs(-98);
        System.out.println(abs);

        double pow = Math.pow(2.2, 3);
        System.out.println(pow);

        double ceil = Math.ceil(123.1235);
        System.out.println(ceil);

        double floor = Math.floor(1234.451234);
        System.out.println(floor);

        long round = Math.round(123847.55555);
        System.out.println(round);

        double random = Math.random();
        System.out.println(random);

        int castedInd = (int) (random * 100);
        System.out.println(castedInd);

        int max = Math.max(23, 45);
        System.out.println(max);
    }
}
