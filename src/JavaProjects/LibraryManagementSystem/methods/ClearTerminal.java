package JavaProjects.LibraryManagementSystem.methods;

public class ClearTerminal {
    public static void clearTerminal() {
        int lineAmount = 15;
        for (int i = 0; i <= lineAmount; i++) {
            System.out.println();
        }
    }
}
