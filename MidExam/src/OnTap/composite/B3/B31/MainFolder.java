package OnTap.composite.B3.B31;

import OnTap.composite.B3.AbstractFile;
import OnTap.composite.B3.Folder;

public class MainFolder {
    public static void main(String[] args) {
        AbstractFile root = new OnTap.composite.B3.Folder("D");

        AbstractFile taiLieu = new OnTap.composite.B3.Folder("Tailieu");
        AbstractFile lapTrinh = new OnTap.composite.B3.Folder("LapTrinh");
        AbstractFile designPattern = new OnTap.composite.B3.Folder("DesignPattern");
        AbstractFile creational = new OnTap.composite.B3.Folder("CreationalPattern.pptx");
        AbstractFile structural = new OnTap.composite.B3.Folder("StructuralPattern.pptx");
        AbstractFile lapTrinhC = new OnTap.composite.B3.Folder("lapTrinhC.pptx");
        AbstractFile lapTrinhJava = new OnTap.composite.B3.Folder("lapTrinhJava.pptx");
        AbstractFile ny = new Folder("ny.pptx");

        root.addItem(taiLieu);
        root.addItem(ny);
        taiLieu.addItem(lapTrinh);

        lapTrinh.addItem(lapTrinhC);
        lapTrinh.addItem(lapTrinhJava);
        designPattern.addItem(creational);
        designPattern.addItem(structural);

        System.out.println(root.getStringTreeFolder());
        System.out.println(lapTrinhC.getPath());
        System.out.println(lapTrinh.getPath());
    }
}
