package task1;

public class Conveniences {
    private final String name;
    private final int extraGuests;
    private final double cost;

    public Conveniences(String name, int extraGuests, double cost) {
        this.name = name;
        this.extraGuests = extraGuests;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getExtraGuests() {
        return extraGuests;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name + " (+" + extraGuests + " guests, cost: $" + cost + ")";
    }

    public void add(Conveniences сonveniences) {
    }
}
