package behavioral.strategy.cc1;

public class Chia implements ITinh{
    @Override
    public float tinh(float a, float b) {
        if (b == 0)
            System.out.println("o chia");
//            throw new IllegalArgumentException("Khong the chia cho 0");
        return a/b;
    }
}
