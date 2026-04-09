package OnTap.builder;

public class GamingComputerBuilder implements ComputerBuilder {
    private Computer computer;
    // khởi tạo khung trống
    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public void buildCPU() {
        //computer thucewj hiện việc gắn cpu
        computer.setCPU("Intel core i9 14900K");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("32GB DDR5 6000MHz");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("2TB NVMe SSD");
    }

    @Override
    public void buildGPU() {
        computer.setGPU("NVDIA RTX 4090 24GB");
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
