import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
       do {
           System.out.println("\t ***Calculatrice***");
           System.out.println("-) Pour l'addition entrer 1 : " );
           System.out.println("-) Pour la soustraction entrer 2 : " );
           System.out.println("-) Pour la multiplication entrer 3 : " );
           System.out.println("-) Pour la division entrer 4 : " );
           System.out.println("-) Pour le sin entrer 5 : " );
           System.out.println("-) Pour le cos entrer 6 : " );
           System.out.println("-) Pour le log entrer 7 : " );
           System.out.println("-) Pour l'expenentiele entrer 8 : " );
           System.out.println("-) Pour la racine entrer 9 : " );
           System.out.print("Operation :" );
           Scanner sc = new Scanner(System.in) ;
           int n = sc.nextInt() ;
           switch(n){
               case 1 :
                   System.out.println("Entrer la premiere valeur");
                   double a = sc.nextInt();
                   System.out.println("Entrer la deuxieme valeur");
                   double b = sc.nextInt();
                   Addition addition = new Addition(a,b);
                   System.out.println("addition : " + addition.calculer());
                   break;
               case 2 :
                   System.out.println("Entrer la premiere valeur");
                   double a1 = sc.nextInt();
                   System.out.println("Entrer la deuxieme valeur");
                   double b1 = sc.nextInt();
                   Soustraction soustraction = new Soustraction(a1, b1);
                   System.out.println("Soustraction : " + soustraction.calculer());
                   break;
               case 3 :
                   System.out.println("Entrer la premiere valeur");
                   double a2 = sc.nextInt();
                   System.out.println("Entrer la deuxieme valeur");
                   double b2 = sc.nextInt();
                   Multiplication multiplication = new Multiplication(a2, b2);
                   System.out.println("Multiplication : "+ multiplication.calculer());
                   break;
               case 4 :
                   System.out.println("Entrer la premiere valeur");
                   double a3 = sc.nextInt();
                   System.out.println("Entrer la deuxieme valeur");
                   double b3 = sc.nextInt();
                   Division division = new Division(a3, b3);
                   System.out.println("Division : " + division.calculer());
                   break;
               case 5 :
                   System.out.println("Entrer la valeur");
                   double s = sc.nextInt();
                   OperationUnaire sin = new Sin(s);
                   System.out.println("Sin : " + sin.calculer());
                   break;
               case 6 :
                   System.out.println("Entrer la valeur");
                   double c = sc.nextInt();
                   OperationUnaire cos = new Cos(Math.PI / 2);
                   System.out.println("Cos : " + cos.calculer());
                   break;
               case 7 :
                   System.out.println("Entrer la valeur");
                   double ln = sc.nextInt();
                   OperationUnaire log = new Log(ln);
                   System.out.println("Log : " + log.calculer());
                   break;
               case 8 :
                   System.out.println("Entrer la valeur");
                   double e = sc.nextInt();
                   OperationUnaire exp = new Exp(2);
                   System.out.println("Exp : " + exp.calculer());
                   break;
               case 9 :
                   System.out.println("Entrer la valeur");
                   double r = sc.nextInt();
                   OperationUnaire sqrt = new Sqrt(r);
                   System.out.println("Sqrt : " + sqrt.calculer());
                   break;
               default: break;
           }
       }while (true) ;

    }
}