public class Facto {

    public Facto() {

    }

    public static int calcul_facto(int number) throws Exception  {
        int somme = 1;

        if (number<0) {
            throw (new Exception("Calcul impossible pour un nombre négative")) ;
        }

        for (int i = 1; i <= number; i++) {
            somme=somme*i ;
        }

        if (somme<0) {
            throw (new Exception("Calcul impossible la somme est négative")) ;
        }

        return somme;
    }

//    public FactoException(String message) {
//        super(message);
//
//    }

}
