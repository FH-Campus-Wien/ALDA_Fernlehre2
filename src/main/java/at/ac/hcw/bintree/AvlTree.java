package at.ac.hcw.bintree;

/**
 * Starter implementation of an AVL tree.
 *
 * @param <T> the type of data stored in the tree
 */
public class AvlTree<T> {
    private Node<T> root;
    private int nodeCount;

    /**
     * Inserts a new key-value pair into the AVL tree.
     * If the key already exists, the associated data should be updated.
     *
     * @param key the key that defines the node position
     * @param data the payload that should be stored
     */
    public void insert(int key, T data) {
        // TODO: Delegate the insertion to the recursive helper and store the returned root.
    }

    /**
     * Recursively inserts a key-value pair into the subtree rooted at {@code node}
     * and restores AVL balance afterwards.
     *
     * @param node the current subtree root
     * @param key the key to insert
     * @param data the payload to insert
     * @return the updated subtree root
     */
    private Node<T> insertNode(Node<T> node, int key, T data) {
        // TODO: Insert like in a binary search tree.
        // TODO: Increase the node counter when a new node is created.
        // TODO: Update the height of the current node.
        // TODO: Rebalance the subtree before returning it.
        return node;
    }

    /**
     * Restores AVL balance for the subtree rooted at {@code node}.
     *
     * @param node the subtree root that may be unbalanced
     * @return the balanced subtree root
     */
    private Node<T> rebalance(Node<T> node) {
        // TODO: Compute the balance factor of the current node.
        // TODO: Handle left-left and left-right cases.
        // TODO: Handle right-right and right-left cases.
        return node;
    }

    /**
     * Performs a left rotation around the given node.
     *
     * @param node the subtree root before rotation
     * @return the new subtree root after rotation
     */
    private Node<T> rotateLeft(Node<T> node) {
        // TODO: Promote the right child to become the new subtree root.
        // TODO: Reattach the moved subtree in the correct place.
        // TODO: Update the heights of the affected nodes.
        return node;
    }

    /**
     * Performs a right rotation around the given node.
     *
     * @param node the subtree root before rotation
     * @return the new subtree root after rotation
     */
    private Node<T> rotateRight(Node<T> node) {
        // TODO: Promote the left child to become the new subtree root.
        // TODO: Reattach the moved subtree in the correct place.
        // TODO: Update the heights of the affected nodes.
        return node;
    }

    /**
     * Performs a left-right double rotation.
     *
     * @param node the subtree root before rotation
     * @return the new subtree root after rotation
     */
    private Node<T> rotateLeftRight(Node<T> node) {
        // TODO: Rotate the left child to the left first.
        // TODO: Then rotate the current node to the right.
        return node;
    }

    /**
     * Performs a right-left double rotation.
     *
     * @param node the subtree root before rotation
     * @return the new subtree root after rotation
     */
    private Node<T> rotateRightLeft(Node<T> node) {
        // TODO: Rotate the right child to the right first.
        // TODO: Then rotate the current node to the left.
        return node;
    }

    /**
     * Recomputes and stores the height of the given node.
     *
     * @param node the node whose height should be updated
     */
    private void updateHeight(Node<T> node) {
        // TODO: Read the heights of the left and right children.
        // TODO: Store the larger child height plus one in the current node.
    }

    /**
     * Returns the height of a node and treats {@code null} as height 0.
     *
     * @param node the node whose height should be read
     * @return the stored height, or 0 for {@code null}
     */
    private int height(Node<T> node) {
        // TODO: Return 0 for null references.
        // TODO: Otherwise return the node height.
        return 0;
    }

    /**
     * Computes the AVL balance factor of a node.
     *
     * @param node the node whose balance factor should be computed
     * @return left subtree height minus right subtree height
     */
    private int getBalance(Node<T> node) {
        // TODO: Return 0 for null references.
        // TODO: Otherwise subtract the right height from the left height.
        return 0;
    }

    /**
     * Returns the current root node of the AVL tree.
     *
     * @return the root node, or {@code null} if the tree is empty
     */
    public Node<T> getRoot() {
        return root;
    }

    /**
     * Returns the number of distinct nodes currently stored in the AVL tree.
     *
     * @return the node count
     */
    public int getNodeCount() {
        return nodeCount;
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
