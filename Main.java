import java.security.SecureRandom;

public class Main {

    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();

        tree.insertNode('F');
        tree.insertNode('E');
        tree.insertNode('H');
        tree.insertNode('D');
        tree.insertNode('G');
        tree.insertNode('C');
        tree.insertNode('B');
        tree.insertNode('H');
        tree.insertNode('K');
        tree.insertNode('J');
        System.out.println("Preorder Traversal:");
        tree.preorderTraversal();

        System.out.println("\nInorder Traversal:");
        tree.inorderTraversal();

        System.out.println("\nPostorder Traversal:");
        tree.postorderTraversal();

        System.out.println("\nMencari Nilai A:");
        tree.searchBST('A');
    }
}