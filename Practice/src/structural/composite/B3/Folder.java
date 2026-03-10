package structural.composite.B3;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile>files = new ArrayList<>();

    public Folder(String name){
        super(name);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        //. TÊn của thư mục hiện tại
        builder.append(this.prefix).append(this.name);
        for (var f: files){
            f.prefix = this.prefix +" ";
            builder.append("\n").append(f.getStringTreeFolder());
            f.prefix ="";
        }
        return builder.toString();
    }

    @Override
    public void add(AbstractFile f) {
        for(var file:files)
            if(file.name.equals(f.name))
                return;
        files.add(f);
        f.path = this.getPath() + "\\" + f.path;
        return;

    }
}
