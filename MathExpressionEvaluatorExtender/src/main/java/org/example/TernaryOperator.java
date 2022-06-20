package org.example;
public abstract class TernaryOperator extends Node {
    private Node node;
    private Node node2;
    private Node node3;
    public TernaryOperator (Node x, Node y, Node z){
        this.node = x;
        this.node2 = y;
        this.node3 = z;
    }
    public Node getNode() {
        return node;
    }
    public Node getNode2(){
        return node2;
    }
    public Node getNode3(){
        return node3;
    }
    @Override
    public abstract double hitung();
}