package OnTap.composite.B3.B31;

public abstract class AbstractFile {
    String name, path;
    String prefix ="";

    public AbstractFile(String name) {
        this.name = name;
        this.path = name;
    }

    public String getPath() {
        return path;
    }

    public abstract String getStringTreeFolder();
    public  abstract void addItem(AbstractFile f);

    public abstract void removeItem(AbstractFile f);
}
