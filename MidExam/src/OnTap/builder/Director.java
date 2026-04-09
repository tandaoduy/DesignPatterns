package OnTap.builder;

public class Director {
    //định nghĩa quy trình ắp ráp
    // vchuaws buildeer

    private ComputerBuilder builder;
    //nhận mới 1 ông kĩ thuật viên
    public void setBuilder(ComputerBuilder builder) {
        this.builder = builder;
    }
    //khai báo quy trình chuẩn để build PC
    public void constructPC(){
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
        builder.buildGPU();
    }
}
