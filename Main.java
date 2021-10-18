package com.company;

public class Main {

    public static void main(String[] args) {
	BST tree=new BST();
    node root = null;
    root= tree.insert(root,56);
    root=tree.insert(root,30);
    root=tree.insert(root,70);
        root=tree.insert(root,22);
        root=tree.insert(root,40);
        root=tree.insert(root,60);
        root=tree.insert(root,95);
        root=tree.insert(root,11);
        root=tree.insert(root,3);
        root=tree.insert(root,16);
        root=tree.insert(root,65);
        root=tree.insert(root,63);
        root=tree.insert(root,67);
        tree.search(root,3);
        System.out.println("Node is presented:"+tree.search(root,3));
    }
}
