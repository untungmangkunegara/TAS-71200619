package org.example;
public class App {
    public static void main( String[] args ) {

            // Penjumlahan
            OperandNode on1 = new OperandNode(5);
            OperandNode on2 = new OperandNode(6);

            OperatorNode ov1 = new Tambah(on1,on2);
            System.out.println(ov1.hitung());
            //(5+6) = 11

            // Perkalian
            OperandNode on3 = new OperandNode(4);
            OperatorNode ov2 = new Kali(ov1,on3);
            System.out.println(ov2.hitung());
            //(11*4) = 44

            // Kuadrat
            OperandNode on4 = new OperandNode(11);
            UnaryOperator up1 = new Kuadrat(on4);
            System.out.println(up1.hitung());
            //11^2

            // Pangkat
            OperandNode on5 = new OperandNode(3);
            OperandNode on6 = new OperandNode(4);
            BinaryOperator bp1 = new Pangkat(on5,on6);
            System.out.println(bp1.hitung());
            //3^4 = 81

            // Pythagoras
            OperandNode on7 = new OperandNode(3);
            OperandNode on8 = new OperandNode(4);
            OperandNode on9 = new OperandNode(5);
            TernaryOperator tp1 =  new TriplePythagoras(on7, on8, on9);
            System.out.println(tp1.hitung());
            //5^2 == 3^2 + 4^2 (true/1)

            // Pythagoras tapi Salah
            OperandNode on10 = new OperandNode(1);
            OperandNode on11 = new OperandNode(2);
            OperandNode on12 = new OperandNode(3);
            TernaryOperator tp2 =  new TriplePythagoras(on10, on11, on12);
            System.out.println(tp2.hitung());
            //3^2 == 1^2 + 2^2 (false/-1)
        }
}
