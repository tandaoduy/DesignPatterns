package OnTap.builder;

public interface ComputerBuilder {
    //định nghĩa các bước để lắ[ ráp 1 cáo máy tính
    void buildCPU();
    void buildRAM();
    void buildStorage();
    void buildGPU();
    //phương thức trả về 1 sp hoàn thiện
    Computer getComputer();
}
