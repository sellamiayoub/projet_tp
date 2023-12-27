public class Sqrt extends OperationUnaire {
    public Sqrt(double valeur) {
        super(valeur);
    }

    @Override
    public double calculer() {
        try {
            if (valeur >= 0) {
                return Math.log(valeur);
            } else {
                throw new ArithmeticException("la racine d'un nombre négatif ");
            }
        } catch (ArithmeticException e) {
            // Traitement de l'exception ici
            System.out.println("Erreur : " + e.getMessage());
            return 0;
        }
    }
}
