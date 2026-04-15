package OnTap.singleton.bai11;

public class MainPrimeMinister {
    public static void main(String[] args) {
        PrimeMinister pm = PrimeMinister.getInstance();
        Minister bqp = new Minister("Bộ trưởng bộ Quốc Phòng");
        Minister bca = new Minister("Bộ trưởng bộ Công An");
        Minister bkhcn = new Minister("bộ Khoa học công nghệ");

        bqp.proposeDecree("Nghĩa vụ quân sự 2024");
        bqp.proposeDecree("Nghĩa vụ quân sự 2025");
        bqp.proposeDecree("Nghĩa vụ quân sự 2026");
        bqp.proposeDecree("Nghĩa vụ quân sự 2027");

        bkhcn.proposeDecree("Chuyển đổi số");
        bkhcn.proposeDecree("Trí tuệ nhân tạo");
        bkhcn.proposeDecree("Khoa học máy tính");
        bkhcn.proposeDecree("Khoa học máy tính");

        bca.proposeDecree("Đặc xá");
        bca.proposeDecree("Ma tuý");

        pm.showAllDecree();


    }
}
