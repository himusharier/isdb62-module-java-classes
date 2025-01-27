package ClassLectures.sixteenthClass;

public class TestSwitch {
    public static void main(String[] args) {
        int ch = -10;
        switch (ch) {
            case 1:
                ch++;
                break;
            case 2:
                ch++;
                break;
            default:
                ch++;
            case 3:
                ch++;
                break;
            case 4:
                ch++;
        }

        System.out.println(ch);

        for (int i = 1; i < 4; i++) {
            if (i < 2) continue;
            System.out.println(i);
        }
    }

    public static void abc() {
        System.out.println("xyz");
        System.out.println(b);
        // Is not allowed
//        System.out.println(a);
//        bce();
    }

    int a = 1;
    static int b = 2;

    public void bce() {
        System.out.println("bce");
        abc();
    }
}
