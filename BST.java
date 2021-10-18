package com.company;

public class BST<T extends Comparable<T>>{

    public node newNode(int data){
        node n = new node();
        n.data=data;
        n.left=null;
        n.right=null;
        return n;
    }
    public node insert(node node, int value) {
    if(node==null){
     return newNode(value);
    }

    if(value<node.data){
        node.left=insert(node.left,value);   /* recursively calling the function */
    }
    else if(value>node.data){
        node.right=insert(node.right,value);
    }
    return node;
    }

    public node searchNode(node node, int value){
        if(node==null){
            return node;
        }
        else if (value<node.data){
            node.left=searchNode(node.left,value);
        }
        else if (value>node.data){
            node.right=searchNode(node.right,value);
        }
        return node;
    }

    boolean search(node node,int value){
        node =searchNode(node,value);
        if (node != null) {
        return true;
        }
        else {
            return false;
        }
    }
}
