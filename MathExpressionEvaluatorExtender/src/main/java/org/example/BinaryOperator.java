package org.example;
public abstract class BinaryOperator extends Node {
    private Node node;
    private Node node2;
    public BinaryOperator (Node n, Node n2){
        this.node = n;
        this.node2 = n2;
    }
    public Node getNode() {
        return node;
    }
    public Node getNode2() {
        return node2;
    }
    @Override
    public abstract double hitung();
}