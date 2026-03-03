package composite;

public class InternalNode extends BinaryTreeComponent{
    BinaryTreeComponent left, right;
    public InternalNode(int value){
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
