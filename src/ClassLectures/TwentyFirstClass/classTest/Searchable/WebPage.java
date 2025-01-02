package ClassLectures.TwentyFirstClass.classTest.Searchable;

public class WebPage implements Searchable {
    private String content;

    public WebPage(String content) {
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        return content != null &&
                content.toLowerCase().contains(keyword.toLowerCase());
    }

}
