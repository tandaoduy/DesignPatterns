package OnTap.composite.B3.B31;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile> files = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public String getPath() {
        return super.getPath();
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.prefix).append(this.name);
        for (var f: files){
            f.prefix = this.prefix + "\t";
            builder.append("\n").append(f.getStringTreeFolder());
            f.prefix="";
        }
        return builder.toString();
    }

    @Override
    public void addItem(AbstractFile f) {
        for (var file: files){
            if (file.name.equals(f.name))
                return;
        }
        files.add(f);
        f.path = this.getPath() +"\\ " + f.path;
    }

    @Override
    public void removeItem(AbstractFile f) {
        for (int i = 0; i < files.size(); i++){
            if (files.get(i).name.equals(f.name)){
                files.remove(i);
                return;
            }
        }
    }
}
