package ClassLectures.himelClass.customExeption;


    public class Test {

        public static void main(String[] args) {

            int i = 20;
            int j = 0;

            try {
                j = 18/i;
                if (j==0)
                    throw new MyException("This is my custom exception");
            }catch (MyException e) {
                System.out.println("The exception is: "+ e);
            }

        }
    }


