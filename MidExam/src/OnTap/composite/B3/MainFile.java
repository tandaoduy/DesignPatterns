package OnTap.composite.B3;

public class MainFile {
    public static void main(String[] args) {
        AbstractFile root = new Folder("D");

        AbstractFile taiLieu = new Folder("Tailieu");
        AbstractFile lapTrinh = new Folder("LapTrinh");
        AbstractFile designPattern = new Folder("DesignPattern");
        AbstractFile creational = new Folder("CreationalPattern.pptx");
        AbstractFile structural = new Folder("StructuralPattern.pptx");
        AbstractFile lapTrinhC = new Folder("lapTrinhC.pptx");
        AbstractFile lapTrinhJava = new Folder("lapTrinhJava.pptx");
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
