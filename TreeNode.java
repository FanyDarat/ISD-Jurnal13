public class TreeNode<E extends Comparable<E>> {
    private TreeNode<E> leftNode;
    private E data; // nilai node
    private TreeNode<E> rightNode;

    // Konstruktor menginisialisasi data dan menjadikan ini sebagai node daun
    public TreeNode(E nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // node tidak memiliki anak
    }

    public E getData() {
        return data;
    }

    public TreeNode<E> getLeftNode() {
        return leftNode;
    }

    public TreeNode<E> getRightNode() {
        return rightNode;
    }

    // Menemukan titik penyisipan dan menyisipkan node baru; mengabaikan nilai
    // duplikat
    public void insert(E insertValue) {
        // menyisipkan ke subtree kiri
        if (insertValue.compareTo(data) < 0) {
            // menyisipkan TreeNode baru
            if (leftNode == null) {
                leftNode = new TreeNode<E>(insertValue);
            } else { // lanjutkan traversing subtree kiri secara rekursif
                leftNode.insert(insertValue);
            }
        }
        // menyisipkan ke subtree kanan
        else if (insertValue.compareTo(data) > 0) {
            // menyisipkan TreeNode baru
            if (rightNode == null) {
                rightNode = new TreeNode<E>(insertValue);
            } else { // lanjutkan traversing subtree kanan secara rekursif
                rightNode.insert(insertValue);
            }
        }
    }
}
