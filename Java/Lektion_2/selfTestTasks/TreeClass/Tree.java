package Java.Lektion_2.selfTestTasks.TreeClass;

public class Tree {
    Object value;
    Tree[] children;

    public static void main(String[] argv) {
        Object object = new Object();

        Tree tree1 = new Tree();
        Tree tree2 = new Tree();
        Tree tree3 = new Tree();
        Tree tree4 = new Tree();

        tree1.value = object;
        tree1.children = new Tree[2];

        tree2.value = object;
        tree2.children = new Tree[2];
        tree2.children[0] = tree3;
        tree2.children[1] = tree4;
        tree3.children = new Tree[2];
        tree3.value =  tree3.children;
        tree4.children = new Tree[1];
        tree4.value = tree4;


    }
}
