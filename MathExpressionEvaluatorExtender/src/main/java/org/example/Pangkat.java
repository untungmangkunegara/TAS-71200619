package org.example;

public class Pangkat extends BinaryOperator {
    public Pangkat(Node n, Node n2) {
        super(n, n2);
    }
    @Override
    public double hitung() {
        return Math.pow(this.getNode().hitung(), this.getNode2().hitung());
    }
}