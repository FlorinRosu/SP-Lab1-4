import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private List<String> paragraphs = new ArrayList<>();
    private List<String> images = new ArrayList<>();
    private List<String> tables = new ArrayList<>();

    public Book(String name) {
        this.name = name;
    }

    public void createNewParagraph(String paragraphText) {
        paragraphs.add(paragraphText);
    }

    public void createNewImage(String imageText) {
        images.add(imageText);
    }

    public void createNewTable(String tableText) {
        tables.add(tableText);
    }

    public void print() {
        System.out.println(name);
        System.out.println(paragraphs);
        System.out.println(images);
        System.out.println(tables);
    }
}
