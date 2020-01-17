public class Chocolate extends Sweet {
    private int cocoaPercent;

    public Chocolate(int cocoaPercent) {
        super("Chocolate", 0.1, 1.0);
        this.cocoaPercent = cocoaPercent;
    }

    public int getCocoaPercent() {
        return cocoaPercent;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "cocoaPercent=" + cocoaPercent +
                '}';
    }
}
