package ClassLectures.tryGenerics;

/**
 * run this file with javac WarningDemo.java -Xlint:unchecked
 */
public class WarningDemo {
    public static void main(String[] args){
        Box<Integer> bi;
        bi = createBox();
    }

    static Box createBox(){
        return new Box();
    }
}

