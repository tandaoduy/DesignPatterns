package lecture.creational.builder.mycomputer;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .buildCPU("Intel CPU i7")
                .buildRAM("64 GB ĐR6 5200Hz")
                .buildStorage("5 TB NVMe")
                .buildScreen("8K 24 inches LG")
                .builder();
        System.out.println(computer.toString());
    }
}
