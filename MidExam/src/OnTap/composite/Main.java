package OnTap.composite;

public class Main {
    public static void main(String[] args) {
        FileSystemComponent File1 = new File("đề thi cuối kì.pdf",150);
        FileSystemComponent File2= new File("đềthi cuối kì_mtk.docx",150);
        FileSystemComponent File3= new File("anh.png",150);
        FileSystemComponent File4= new File("sorce.cpp",150);
        Folder FolderHT = new Folder("Hoc Tap");
        FolderHT.addComponent(File1);
        FolderHT.addComponent(File2);

        Folder FolderGT = new Folder("Giải trí");
        FolderGT.addComponent(File3);
        FolderGT.addComponent(File4);

        Folder rootFolder = new Folder("ổ đĩa C");
        rootFolder.addComponent(FolderGT);
        rootFolder.addComponent(FolderHT);


        rootFolder.showDetails("");
        System.out.println("THONG KE DUNG LUONG");
        System.out.println("Tong dung luong: " + rootFolder.geSize() +" KB");


    }
}
