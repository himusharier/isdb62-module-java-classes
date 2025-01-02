package ClassLectures.TwentyFirstClass.classTest.Searchable;

public class SearchableDemo {
    public static void main(String[] args) {
        Document e = new Document("This is a sample document about Java programming.");
        WebPage e1 = new WebPage("This web page discusses programming techniques.");

        String keyword = "Programming";
        System.out.println("Searching for keyword: " + keyword);

        if (e.search(keyword)) {
            System.out.println("Keyword found in: " + e.getClass().getSimpleName());
        } else {
            System.out.println("Keyword not found in: " + e.getClass().getSimpleName());
        }

        if (e1.search(keyword)) {
            System.out.println("Keyword found in: " + e1.getClass().getSimpleName());
        } else {
            System.out.println("Keyword not found in: " + e1.getClass().getSimpleName());
        }
    }
}