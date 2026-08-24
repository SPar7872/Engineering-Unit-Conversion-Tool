public class LengthConverter {

    public double metersToFeet(double m) {
        return m * 3.28084;
    }

    public double feetToMeters(double ft) {
        return ft / 3.28084;
    }

    public double millimetersToInches(double mm) {
        return mm * 0.0393701;
    }

    public double inchesToMillimeters(double in) {
        return in / 0.0393701;
    }

    public double kilometersToMiles(double km) {
        return km * 0.621371;
    }

    public double milesToKilometers(double mi) {
        return mi / 0.621371;
    }
}
