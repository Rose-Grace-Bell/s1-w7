public class WeightMain{
    public static void main(String[] args) {
        Weight w1 = new Weight(15, 13);
        Weight w2 = new Weight(15);

        w1.isHeavier(w2);
        Weight w3 = w1.multiply(236);
        
        w1.print();
        w2.print();
        w3.print();
    }
}