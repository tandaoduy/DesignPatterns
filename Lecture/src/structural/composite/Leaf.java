package composite;

public class Leaf extends BinaryTreeComponent{
    BinaryTreeComponent left, right;
    public Leaf(int value){
        super(value);
    }
    @Override
    public void NLR() {
        System.out.println(value);
        if (left!= null)
            left.NLR();
        if (right!=null)
            right.NLR();
    }

    @Override
    public void addLeft(BinaryTreeComponent c) {
        left = c;
    }

    @Override
    public void addRight(BinaryTreeComponent c) {
        right = c;
    }
}
