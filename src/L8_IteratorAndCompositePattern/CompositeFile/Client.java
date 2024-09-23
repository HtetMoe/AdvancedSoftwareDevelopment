package L8_IteratorAndCompositePattern.CompositeFile;

import L8_IteratorAndCompositePattern.CompositeFile.component.File;
import L8_IteratorAndCompositePattern.CompositeFile.component.Image;
import L8_IteratorAndCompositePattern.CompositeFile.component.Text;
import L8_IteratorAndCompositePattern.CompositeFile.composite.Folder;

public class Client {
    public static void main(String[] args) {
        File textF1 = new Text("Text1.txt");
        File textF2 = new Text("Text2.txt");

        File imageF1 = new Image("Image1.png");
        File imageF2 = new Image("Image2.png");

        Folder f1 = new Folder("Folder1");
        f1.addComponent(textF1);
        f1.addComponent(textF2);

        Folder f2 = new Folder("Folder2");
        f2.addComponent(imageF1);
        f2.addComponent(imageF2);

        f1.showDetails();
        System.out.println("--");
        f2.showDetails();
    }
}
