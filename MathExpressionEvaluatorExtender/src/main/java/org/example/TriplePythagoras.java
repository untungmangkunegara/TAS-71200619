package org.example;

public class TriplePythagoras extends TernaryOperator {
    public TriplePythagoras(Node n, Node n2, Node n3) {
        super(n, n2, n3);
    }
    @Override
    public double hitung() {
        if ( ( this.getNode3().hitung()*this.getNode3().hitung() )
                == ( this.getNode().hitung()*this.getNode().hitung() ) + ( this.getNode2().hitung()*this.getNode2().hitung() ) ) {
            return 1;
        } else {
            return -1;
        }
    }
}