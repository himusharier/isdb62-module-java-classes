package Class_14_12_2024;

public class MakeComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.setCpu("asd");
        computer1.setSpeaker("asdg");
        System.out.println(computer1.toString());


        Computer computer2 = new Computer("intel", "msi", "msi", "ttech", "samsung");
        System.out.println(computer2.getMouse());
        System.out.println(computer2.getMotherBoard());

        Computer computer3 = new Computer("intel", "msi", "msi", "ttech", "samsung"
                , "walton", "a4tech", "lenovo", "mocorlab");
        System.out.println(computer3.toString());

        Computer computer4 = new Computer("intel", "msi", "msi", "ttech", "samsung"
                , null, "a4tech", "lenovo", "mocorlab");
        System.out.println(computer4.toString());


    }
}
