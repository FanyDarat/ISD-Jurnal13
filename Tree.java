public class Tree<E extends Comparable<E>> {
    private TreeNode<E> root;

    // Konstruktor menginisialisasi pohon kosong
    public Tree() {
        root = null;
    }

    // Menyisipkan node baru ke dalam pohon biner
    public void insertNode(E insertValue) {
        if (root == null) {
            root = new TreeNode<E>(insertValue); // membuat node root
        } else {
            root.insert(insertValue); // memanggil metode insert
        }
    }

    // Memulai traversal preorder
    public void preorderTraversal() {
        preorderHelper(root);
    }

    // Metode rekursif untuk melakukan traversal preorder
    private void preorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.getData()); // keluarkan data node
        preorderHelper(node.getLeftNode()); // traversing subtree kiri
        preorderHelper(node.getRightNode()); // traversing subtree kanan
    }

    // Memulai traversal inorder
    public void inorderTraversal() {
        inorderHelper(root);
    }

    // Metode rekursif untuk melakukan traversal inorder
    private void inorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        inorderHelper(node.getLeftNode()); // traversing subtree kiri
        System.out.printf("%s ", node.getData()); // keluarkan data node
        inorderHelper(node.getRightNode()); // traversing subtree kanan
    }

    // Memulai traversal postorder
    public void postorderTraversal() {
        postorderHelper(root);
    }

    // Metode rekursif untuk melakukan traversal postorder
    private void postorderHelper(TreeNode<E> node) {
        if (node == null) {
            return;
        }
        postorderHelper(node.getLeftNode()); // traversing subtree kiri
        postorderHelper(node.getRightNode()); // traversing subtree kanan
        System.out.printf("%s ", node.getData()); // keluarkan data node
    }

    // Mencari nilai dalam pohon biner
    public void searchBST(E key) {
        boolean result = searchBSTHelper(root, key);
        if (result) {
            System.out.println("Data ditemukan");
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    // Metode rekursif untuk mencari nilai dalam pohon biner
    private boolean searchBSTHelper(TreeNode<E> node, E key) {
        boolean result = false;
        if (node != null) {
            if (key.equals(node.getData())) {
                result = true;
            } else if (key.compareTo(node.getData()) < 0) {
                result = searchBSTHelper(node.getLeftNode(), key);
            } else {
                result = searchBSTHelper(node.getRightNode(), key);
            }
        }
        return result;
    }
}
