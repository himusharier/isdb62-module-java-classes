package ClassLectures.thirtyFirstClass;

import java.lang.reflect.*;
import java.util.Arrays;

public class TestDaysEnumWithReflection {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Days.class;
        System.out.println("class: " + c.getName());

        System.out.println("values: " + Arrays.toString(Days.values()));
        System.out.println("constants: " + Arrays.toString(c.getEnumConstants()));

        Constructor<?>[] constructors = c.getDeclaredConstructors();
        int length = constructors.length;
        System.out.println("# constructors = " + length);
        System.out.println("constructors[0]: " + constructors[0]);

        // ****************************************
        System.out.println("\n****************************************");
        Constructor<?>[] constructors1 = c.getDeclaredConstructors();
        int length1 = constructors1.length;
        System.out.println("# constructors = " + length1);

        // ****************************************
        System.out.println("\n****************************************");
        System.out.println("Discovering Compiler Generated Fields\n");
        Field[] fields = c.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);
            if (Modifier.isStatic(field.getModifiers())) {
                field.setAccessible(true);
                if (field.getType().isArray()) {
                    System.out.println("  " + Arrays.toString((Object[]) field.get(null)));
                    System.out.println("    is enum constant? " + field.isEnumConstant());
                } else {
                    System.out.println("  " + field.get(null));
                    System.out.println("    is enum constant? " + field.isEnumConstant());
                }
            }
        }

        // ****************************************
        System.out.println("\n****************************************");
        System.out.println("Discovering Compiler Generated Methods");
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        // ****************************************
        System.out.println("\n****************************************");

        Class<Days> daysClass = Days.class;
        Constructor<Days> daysConstructor = daysClass.getDeclaredConstructor(String.class, int.class);
        System.out.println("constructor = " + daysConstructor);

        daysConstructor.setAccessible(true);
        // It is not possible to add constants to an enum at runtime, even using the Reflection API.
        // Running this code will give error
        Days monday = daysConstructor.newInstance("MONDAY", 2);
        System.out.println(daysClass);
    }
}
