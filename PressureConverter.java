public class PressureConverter {

    public double pascalToPSI(double pa) {
        return pa * 0.000145038;
    }

    public double psiToPascal(double psi) {
        return psi / 0.000145038;
    }

    public double barToPascal(double bar) {
        return bar * 100000;
    }

    public double pascalToBar(double pa) {
        return pa / 100000;
    }
}
