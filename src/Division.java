public class Division extends Operationbinaire{
    public Division(double valeur, double valeur2){
        super(valeur,valeur2);
    }
    @Override
    public double calculer() {

        try {
            if (valeur2 != 0) {
                return valeur / valeur2;
            } else {
                throw new ArithmeticException("La division par zéro est une opération indéfinie en mathématiques ");
            }
        } catch (ArithmeticException e) {
            // Traitement de l'exception ici
            System.out.println("Erreur : " + e.getMessage());
            return 0;
        }

    }
}
