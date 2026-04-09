package behavioral.chain_of_responsibility.cb5;

public class StandardGradeEvaluator extends GradeEvaluator{
    private String gradeName;
    private double minScore, maxScore;
    private boolean isMaxClusive;

    public StandardGradeEvaluator(String gradeName, double minScore, double maxScore, boolean isMaxClusive) {
        this.gradeName = gradeName;
        this.minScore = minScore;
        this.maxScore = maxScore;
        this.isMaxClusive = isMaxClusive;
    }

    @Override
    public void evaluate(double score) {
        boolean isMatch = isMaxClusive
                ?(score >= minScore && score <= maxScore)
                :(score >= minScore && score < maxScore);
        if (isMatch){
            System.out.println("Diem: " + score + " -> xep loai: " + gradeName);
        } else if (nextEvaluator != null) {
            nextEvaluator.evaluate(score);
        }
        else System.out.println("Diem: " + score + " -> [LOI] Diem khong hop le");

    }
}
