package structural.composite.B3;

public abstract class AbstractFile {
    String name, path;
    String prefix = "";

    public AbstractFile(String name) {
        this.name = name;
        this.path = name;
    }

    public abstract String getStringTreeFolder();

    public String getPath() {
        return path;
    }
    public abstract void add(AbstractFile f);
}
