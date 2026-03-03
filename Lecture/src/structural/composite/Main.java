package composite;

public class Main {
    public static void main(String[] args) {
        BinaryTreeComponent root = new InternalNode(10);
        BinaryTreeComponent node1 = new InternalNode(5);
        BinaryTreeComponent node2 = new InternalNode(8);
        BinaryTreeComponent node3 = new Leaf(4);
        BinaryTreeComponent node4 = new Leaf(3);
        BinaryTreeComponent node5 = new Leaf(9);
        BinaryTreeComponent node6 = new Leaf(7);
        root.addLeft(node1);
        root.addRight(node2);
        node1.addLeft(node3);
        node1.addRight(node4);
        node2.addLeft(node5);
        node2.addRight(node6);
        root.NLR();


    }
}
