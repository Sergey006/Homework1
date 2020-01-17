public class Lollipop  extends Sweet {
    private String color;
    public Lollipop(String color) {
        super("Lollipop", 0.15, 1.5);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "color='" + color + '\'' +
                '}';
    }
}
