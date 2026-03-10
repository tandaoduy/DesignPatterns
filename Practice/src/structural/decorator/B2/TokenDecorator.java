package structural.decorator.B2;

import java.util.List;

public abstract class TokenDecorator implements ITokenize {
    ITokenize tokens;

    public TokenDecorator(ITokenize tokens) {
        this.tokens = tokens;
    }

    @Override
    public List<String> tokenize() {
        return tokens.tokenize();
    }
}
