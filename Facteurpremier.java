public class Facteurpremier {

    //Détermination du plus grand facteur premier
    public static long facteurpremier(long n) {
        long fact = 2;
        long factprec = 1;
        while (n > 1) {
            if (n % fact == 0) {
                factprec = fact;
                n=n/fact;
                while (n % fact == 0) {
                    n= n/fact;
                }
            }
            fact++;
        }
        return factprec;
    }
    public static void main(String[] args) {
        long n = 600851475143L;
        long resultat = facteurpremier(n);
        System.out.println(resultat); // Affiche 6857
    }
}