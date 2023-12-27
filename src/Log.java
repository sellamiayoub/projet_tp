public class Log extends OperationUnaire{
    public Log(double valeur) {
        super(valeur);
    }

    @Override
    public double calculer() {
        try {
            if (valeur > 0) {
                return Math.log(valeur);
            } else {
                throw new ArithmeticException("Logarithme d'un nombre négatif ou nul");
            }
        } catch (ArithmeticException e) {
            // Traitement de l'exception ici
            System.out.println("Erreur : " + e.getMessage());
            return 0;
        }
}}
