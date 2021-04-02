public class Hotel {
    public final String name;
    public final Double rates;
    public final Double weekendRates;

    public Hotel(String name, Double rates) {
        this.name = name;
        this.rates = rates;
        weekendRates = null;
    }

    public Hotel (String name, Double rates, Double weekendRates){
        this.name = name;
        this.rates = rates;
        this.weekendRates = weekendRates;
    }

    public String getName() {
        return name;
    }

    public Double getRates() {
        return rates;
    }

    public Double getWeekendRates() {
        return weekendRates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rates=" + rates +
                ", weekendRates=" + weekendRates +
                '}';
    }
}
