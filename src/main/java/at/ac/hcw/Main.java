package at.ac.hcw;

import at.ac.hcw.bintree.AvlTree;
import at.ac.hcw.bintree.BinTree;

/**
 * Entry point for trying out the implementation manually.
 */
public class Main {
    /**
     * Creates example tree instances that you can use for experiments.
     *
     * @param args command-line arguments, not used in this project
     */
    public static void main(String[] args) {
        BinTree<String> binTree = new BinTree<>();
        AvlTree<String> avlTree = new AvlTree<>();

        // TODO: Add your own test data and call the tree methods manually.
        // TODO: Compare the structure of the regular binary tree and the AVL tree.
        System.out.println("Starter project loaded.");
        System.out.println("Use binTree and avlTree to experiment with your implementation.");
    }
}
