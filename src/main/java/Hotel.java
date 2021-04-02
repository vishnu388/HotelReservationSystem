public class Hotel {
    public final String name;
    public final Double rates;

    public Hotel(String name, Double rates) {
        this.name = name;
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rates=" + rates +
                '}';
    }
}
