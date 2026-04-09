package OnTap.builder;

public class OfficeComputerBuilder implements ComputerBuilder{
    private Computer computer;

    public OfficeComputerBuilder(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void buildCPU() {
        computer.setCPU("Intel core i3 12100");
    }

    @Override
    public void buildRAM() {
        computer.setRAM("8GB DDR4 1200");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("256 GB SATA SSD");
    }

    @Override
    public void buildGPU() {
        computer.setGPU(null);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
}
