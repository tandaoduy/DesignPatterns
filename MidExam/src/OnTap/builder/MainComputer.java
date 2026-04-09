package OnTap.builder;

public class MainComputer {
    public static void main(String[] args) {
        //gặp ông qun lý
        Director director = new Director();
        System.out.println("- khách hàng 1 mua pc gạming");
        ComputerBuilder gamingbuilder = new GamingComputerBuilder();
        //giao việc cho l thuâthj viên
        director.setBuilder(gamingbuilder);
        //giao vuệc lắp rsp theo quy trình
        director.constructPC();
        Computer gamingPC = gamingbuilder.getComputer();
        gamingPC.showInfo();

    }
}
