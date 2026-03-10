package structural.decorator.B2;

public class MainToken {
    public static void main(String[] args) {
        ITokenize tokenize = new TachTu("Lớp có 35 sv, nhưng trời mưa. Mỗi sv không đi học.");
        System.out.println(tokenize.tokenize());
        tokenize = new LoaiBoDauCau(tokenize);
        tokenize = new LoaiBoTuDung(tokenize);
        System.out.println(tokenize.tokenize());
    }
}
