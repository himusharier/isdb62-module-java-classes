package PracticeProjects.LibraryManagementSystem;

public class ViewBooks implements IOOperation{
    @Override
    public void oper(Database database, User user) {
        System.out.print("""
                >> View Books:
                -----------------
                """);
    }
}
