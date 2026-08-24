public class EnergyConverter {

    public double joulesToBTU(double j) {
        return j * 0.000947817;
    }

    public double btuToJoules(double btu) {
        return btu / 0.000947817;
    }

    public double joulesToCalories(double j) {
        return j * 0.239006;
    }

    public double caloriesToJoules(double cal) {
        return cal / 0.239006;
    }
}
