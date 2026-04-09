package OnTap.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component){
        components.add(component);
    }
    public void removeComponent(FileSystemComponent component){
        components.remove(component);
    }

    @Override
    public int geSize() {
        int totalZize = 0;
        //tính tổng nhõng thằng con rồi cộng lại
        for (FileSystemComponent c: components){
            totalZize = c.geSize();
        }
        return totalZize;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent +"Folder: " + name);
        for (FileSystemComponent c: components){
            c.showDetails(indent + "    ");
        }
    }
}
