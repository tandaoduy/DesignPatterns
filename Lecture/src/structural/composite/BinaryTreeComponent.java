package composite;

abstract public class BinaryTreeComponent {
    int value;
    BinaryTreeComponent c;

    public BinaryTreeComponent(int value) {
        this.value = value;
    }
    public abstract void NLR();
    public abstract void addLeft(BinaryTreeComponent c);
    public abstract void addRight(BinaryTreeComponent c);
}
