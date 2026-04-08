package at.ac.hcw.bintree;

/**
 * Starter implementation of a binary search tree.
 *
 * @param <T> the type of data stored in the tree
 */
public class BinTree<T> {
    private Node<T> root;
    private int nodeCount;

    /**
     * Inserts a new key-value pair into the tree.
     * If the key already exists, the associated data should be updated.
     *
     * @param key the key that defines the node position
     * @param data the payload that should be stored
     */
    public void insert(int key, T data) {
        // TODO: Delegate the insertion to the recursive helper and store the returned root.
    }

    /**
     * Recursively inserts a key-value pair into the subtree rooted at {@code node}.
     *
     * @param node the current subtree root
     * @param key the key to insert
     * @param data the payload to insert
     * @return the updated subtree root
     */
    private Node<T> insertNode(Node<T> node, int key, T data) {
        // TODO: Create a new node when the subtree is empty.
        // TODO: Recurse into the left subtree for smaller keys.
        // TODO: Recurse into the right subtree for greater keys.
        // TODO: Update the stored value if the key already exists.
        return node;
    }

    /**
     * Returns the current root node of the tree.
     *
     * @return the root node, or {@code null} if the tree is empty
     */
    public Node<T> getRoot() {
        return root;
    }

    /**
     * Returns the number of distinct nodes currently stored in the tree.
     *
     * @return the node count
     */
    public int getNodeCount() {
        return nodeCount;
    }

    /**
     * Looks up the payload for a given key.
     *
     * @param key the key to search for
     * @return the stored payload, or {@code null} if the key does not exist
     */
    public T lookup(int key) {
        // TODO: Use the recursive helper to find the matching node.
        // TODO: Return null if the key cannot be found.
        return null;
    }

    /**
     * Recursively searches for the node that matches a given key.
     *
     * @param node the current subtree root
     * @param key the key to search for
     * @return the matching node, or {@code null} if it does not exist
     */
    private Node<T> lookupNode(Node<T> node, int key) {
        // TODO: Stop the recursion when the subtree is empty.
        // TODO: Return the current node if the key matches.
        // TODO: Recurse into the left or right subtree depending on the key order.
        return null;
    }

    /**
     * Prints the tree level by level to the console.
     */
    public void printLevelOrder() {
        // TODO: Determine the tree depth.
        // TODO: Print each level from top to bottom.
    }

    /**
     * Computes the maximum depth of the subtree rooted at {@code node}.
     *
     * @param node the current subtree root
     * @return the depth of the subtree
     */
    private int treeDepth(Node<T> node) {
        // TODO: Return 0 for an empty subtree.
        // TODO: Recursively compute the depth of both children.
        // TODO: Return the larger depth plus one for the current node.
        return 0;
    }

    /**
     * Prints all nodes that belong to the requested level.
     *
     * @param node the current subtree root
     * @param targetLevel the level that should be printed, starting at 1
     */
    private void printLevel(Node<T> node, int targetLevel) {
        // TODO: Stop when the subtree is empty.
        // TODO: Print the key when the target level is reached.
        // TODO: Otherwise recurse into both children with a decremented level.
    }
}
