package structural.composite.B3;

public class File extends AbstractFile{
    public File(String name) {
        super(name);
    }

    @Override
    public String getStringTreeFolder(){
        return this.prefix + this.name;
    }

    @Override
    public String getPath() {
        return super.getPath();
    }

    @Override
    public void add(AbstractFile f) {
    }
}
