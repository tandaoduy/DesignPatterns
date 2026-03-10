package structural.decorator.B2;

import java.util.List;

public class LoaiBoTuDung extends TokenDecorator{
    List<String>tuDungs = List.of("thì", "mà", "là", "vì", "nên", "và","quá", "nhưng");

    public LoaiBoTuDung(ITokenize tokens) {
        super(tokens);
    }

    @Override
    public List<String> tokenize() {
        List<String> t = super.tokenize();
        t.removeAll(tuDungs);
        return t;
    }
}
