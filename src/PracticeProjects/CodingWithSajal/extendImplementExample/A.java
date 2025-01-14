package PracticeProjects.CodingWithSajal.extendImplementExample;

public class A{
    public void run(){
        System.out.println("running from A");
    }
}

interface B{
    default void run(){
        System.out.println("running from B");
    }
}

class C extends A implements B{

}


class S{
    public static void main(String[] args){
        C c = new C();
        c.run();
    }
}