package org.example;

public class OperandNode extends Node{
    private double nilai;
    public OperandNode(double nilai) {
        this.nilai = nilai;
    }
    @Override
    public double hitung() {
        return this.nilai;
    }
}