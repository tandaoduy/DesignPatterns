package behavioral.strategy.cc1;

public class MainCC1 {
    public static void main(String[] args) {
        context context = new context();
        context.setTinhToan(new Cong());
        float res = context.tinh(75, 12);
        System.out.println("Ket qua Cong cua 75 + 12 = " + res);
        context.setTinhToan(new Tru());
        float res1 = context.tinh(58, 78);
        System.out.println("Ket qua tru cua 54 - 78 = " + res1);
    }
}