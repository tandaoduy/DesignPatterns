package structural.decorator.B2;

import java.util.ArrayList;
import java.util.List;

public class LoaiBoDauCau extends TokenDecorator{
    public LoaiBoDauCau(ITokenize tokens) {
        super(tokens);
    }

    @Override
    public List<String> tokenize() {
        List<String> list = super.tokenize();//lấy kết quả của bước trước sau đó xử lí kq của bước trước
        List<String> result = new ArrayList<>();
        for (var s:list)
            result.add(s.replaceAll("[\\p{Punct}]", ""));
        return result;

    }
}
