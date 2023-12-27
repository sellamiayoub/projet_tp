public class Addition extends Operationbinaire{
 public Addition(double valeur, double valeur2){
     super(valeur,valeur2);
 }
    @Override
    public double calculer() {
        return valeur + valeur2 ;
    }
}
