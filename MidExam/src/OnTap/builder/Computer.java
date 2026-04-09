package OnTap.builder;

public class Computer {
    //khai báo đối tượng
    private String cpu;
    private  String storage;
    private  String ram;
    private String gpu;

    //khai báo setter
    public void setCPU(String cpu) {
        this.cpu = cpu;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setRAM(String ram) {
        this.ram = ram;
    }

    public void setGPU(String gpu) {
        this.gpu = gpu;
    }

    public void showInfo(){
        System.out.println("Cau hinh PC:" + cpu + "," + ram +", " + storage + ", " +(gpu != null ?", " + gpu:", Khong có GPU"));
    }
}
