public class Multiplication extends Operationbinaire{
    public Multiplication(double valeur, double valeur2) {
        super(valeur, valeur2);
    }

    @Override
    public double calculer() {
        return valeur * valeur2;
    }
}
