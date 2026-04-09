package OnTap.composite;

public class File implements FileSystemComponent{
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    @Override
    public int geSize() {
        return size;
    }

    @Override
    public void showDetails(String indent) {
        System.out.println(indent +"File" + name);
    }
}
