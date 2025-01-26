package JavaProjects.WithFile.LibraryManagementSystem.methods;

public class ClearTerminal {
    public static void clearTerminal() {
        int lineAmount = 25;
        for (int i = 0; i <= lineAmount; i++) {
            System.out.println();
        }
    }
}
