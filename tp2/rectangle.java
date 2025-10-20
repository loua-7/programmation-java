package tp2;

public class rectangle {
    
    double longueur;
    double largeur;

    
    public rectangle(double l, double L) {
        longueur = l;
        largeur = L;
    }

    
    public double surface() {
        return longueur * largeur;
    }

    
    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }
}