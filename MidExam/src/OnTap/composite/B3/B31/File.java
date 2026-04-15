package OnTap.composite.B3.B31;

public class File extends AbstractFile{
    public File(String name) {
        super(name);
    }

    @Override
    public String getPath() {
        return super.getPath();
    }

    @Override
    public String getStringTreeFolder() {
        return this.prefix + this.name;
    }

    @Override
    public void addItem(AbstractFile f) {

    }

    @Override
    public void removeItem(AbstractFile f) {

    }
}
