package JavaProjects.LibraryManagementSystem.methods;

import java.util.Scanner;

public class PauseTerminal {
    public static void pauseTerminal() {
        Scanner pause = new Scanner(System.in);
        System.out.print("Press 'enter key' to continue...");
        String pauseEnter = pause.nextLine();
        //pause.close();
    }
}
