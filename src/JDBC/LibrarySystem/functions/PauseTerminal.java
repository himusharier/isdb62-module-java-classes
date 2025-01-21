package JDBC.LibrarySystem.functions;

import java.util.Scanner;

public class PauseTerminal {
    public static void pauseTerminal() {
        Scanner pause = new Scanner(System.in);
        System.out.print("\u001B[36mPress 'enter-key' to continue...\u001B[0m");
        String pauseEnter = pause.nextLine();
        //pause.close();
    }
}
