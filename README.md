# Binary Tree and AVL Tree Starter Repository

This repository is a starter project for implementing a binary search tree and an AVL tree in Java.

The project already contains:

- the required class structure
- method signatures
- Javadoc comments
- unit tests
- a minimal `Main` class for manual experiments

Your task is to complete the missing implementations in the starter classes.

## Learning Goals

After completing this exercise, you should be able to:

- implement insertion in a binary search tree
- implement lookup in a binary search tree
- understand how recursive tree traversal works
- maintain AVL node heights
- rebalance an AVL tree with single and double rotations

## Relevant Files

- `src/main/java/at/ac/hcw/bintree/Node.java`
- `src/main/java/at/ac/hcw/bintree/BinTree.java`
- `src/main/java/at/ac/hcw/bintree/AvlTree.java`
- `src/main/java/at/ac/hcw/Main.java`

The tests are located in:

- `src/test/java/at/ac/hcw/bintree/BinTreeTest.java`
- `src/test/java/at/ac/hcw/bintree/AvlTreeTest.java`

## What You Should Implement

Implement the missing logic in:

- `BinTree`
- `AvlTree`

The `Node` class is already complete and can be used as provided.

## Notes

- Do not change the test cases.
- Do not rename classes or methods.
- Keep the existing package structure.
- The project should always compile, even while your implementation is incomplete.

## Running the Project

Compile the project:

```bash
./gradlew compileJava
```

Compile the tests:

```bash
./gradlew compileTestJava
```

Run all tests:

```bash
./gradlew test
```

Run the example application:

```bash
./gradlew run
```

## Suggested Work Order

1. Complete `BinTree.insert(...)` and its helper methods.
2. Complete `BinTree.lookup(...)`.
3. Complete the AVL height logic.
4. Implement AVL rotations.
5. Complete AVL rebalancing after insertion.

## Submission Hint

If the implementation is correct, the provided tests should pass without changing the test files.
