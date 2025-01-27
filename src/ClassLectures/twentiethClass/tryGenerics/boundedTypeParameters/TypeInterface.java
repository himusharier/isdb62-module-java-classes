package ClassLectures.twentiethClass.tryGenerics.boundedTypeParameters;

import java.io.Serializable;
import java.util.ArrayList;

public class TypeInterface {
    public static void main(String[] args) {
        /*
        The compiler tries to determine a common type for "d" and new ArrayList<String>().
	    The common supertype of String and ArrayList<String> is Serializable because both implement the Serializable interface.
         */
        Serializable d = pick("d", new ArrayList<String>());
        System.out.println(d);
    }

    // <T> is type parameter
    // T is return type
    static <T> T pick(T a1, T a2) {
        return a2;
    }
}
