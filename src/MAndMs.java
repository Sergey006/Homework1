public class MAndMs extends Sweet{
    private boolean hasNuts;
    public MAndMs(boolean hasNuts) {
        super("M&Ms", 0.05, 0.5);
        this.hasNuts = hasNuts;
    }

    public boolean isHasNuts() {
        return hasNuts;
    }

    @Override
    public String toString() {
        return super.toString() +", " +
                "hasNuts=" + hasNuts +
                '}';
    }
}
