package ClassLectures.TwentyFirstClass.classTest.Searchable;

public class Document implements Searchable {
    private String content;
    public Document(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content != null
                && content.toLowerCase().contains(keyword.toLowerCase());
    }
}
