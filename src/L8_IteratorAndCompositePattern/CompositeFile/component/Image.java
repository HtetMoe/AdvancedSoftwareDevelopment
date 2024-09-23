package L8_IteratorAndCompositePattern.CompositeFile.component;

public class Image implements File{
    private String fileName;

    public Image(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void showDetails() {
        System.out.println(STR."File : \{fileName}");
    }
}
