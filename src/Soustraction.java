public class Soustraction extends Operationbinaire{
    public Soustraction(double valeur,double valeur2){
        super(valeur,valeur2);
    }

    @Override
    public double calculer() {
        return valeur - valeur2;
    }
}
