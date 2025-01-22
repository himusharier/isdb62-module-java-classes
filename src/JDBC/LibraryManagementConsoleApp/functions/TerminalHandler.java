package JDBC.LibraryManagementConsoleApp.functions;

import java.util.Scanner;

public class TerminalHandler {

    // add lines to the top to clear console:
    public static void clearTerminal() {
        int lineAmount = 25;
        for (int i = 0; i <= lineAmount; i++) {
            System.out.println();
        }
    }

    // pause terminal and take enter-key to continue:
    public static void pauseTerminal() {
        Scanner pause = new Scanner(System.in);
        System.out.print("\u001B[36m[Press 'enter-key' to continue...] \u001B[0m");
        String pauseEnter = pause.nextLine();
    }

}
