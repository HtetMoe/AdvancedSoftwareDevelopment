package L8_IteratorAndCompositePattern.CompositeFile.composite;

import L8_IteratorAndCompositePattern.CompositeFile.component.File;

import java.util.ArrayList;
import java.util.List;

// Composite (Folder)
public class Folder implements File {
    private String folderName;
    private List<File> components = new ArrayList<>();

    public Folder(String folderName) {
        this.folderName = folderName;
    }

    //behaviors for list
    public void addComponent(File component) {
        components.add(component);
    }

    public void removeComponent(File component) {
        components.remove(component);
    }


    @Override
    public void showDetails() {
        System.out.println(STR."Folder: \{folderName}");
        for (File component : components) {
            component.showDetails(); // recursive structure
        }
    }
}
