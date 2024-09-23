package L8_IteratorAndCompositePattern.CompositeFile.component;

// Leaf (File)
public class Text implements File {
    private String fileName;

    public Text(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showDetails() {
        System.out.println(STR."File: \{fileName}");
    }
}
