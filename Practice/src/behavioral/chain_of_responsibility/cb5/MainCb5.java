package behavioral.chain_of_responsibility.cb5;

public class MainCb5 {
    public static void main(String[] args) {
        GradeEvaluator weak = new StandardGradeEvaluator("Yeu", 0, 5, false);
        GradeEvaluator average = new StandardGradeEvaluator("Trung binh", 5, 7, false);
        GradeEvaluator good = new StandardGradeEvaluator("Kha", 7, 8, false);
        GradeEvaluator veryGood = new StandardGradeEvaluator("Gioi", 8, 9, false);
        GradeEvaluator excellent = new StandardGradeEvaluator("Xuat sac", 9, 10, true);

        weak.setNextEvaluator(average).setNextEvaluator(good).setNextEvaluator(veryGood).setNextEvaluator(excellent);
        System.out.println("HE THONG XEP LOAI HOC SINH");
        double[] testScore = {3.3, 5.0, 6.6, 7.5, 8.0, 9.4, 10.0, -1.1, -120.0};
        for (double score: testScore)
            weak.evaluate(score);
    }
}
