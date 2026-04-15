package OnTap.composite.B3;

public abstract class AbstractFile {
    String name, path;
    String prefix ="";

    public AbstractFile(String name) {
        this.name = name;
        this.path = name;
    }

    public abstract String getStringTreeFolder();
    public abstract void addItem(AbstractFile f);
    public abstract void removeItem(AbstractFile f);

    public String getPath() {
        return path;
    }
}
