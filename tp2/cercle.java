package tp2;



public class cercle {
    
	final double PI=3.14;
    double rayon;

    
    public cercle(double r) {
        rayon = r;
    }

    
    public double surface() {
        return PI * rayon * rayon;
    }

    
    public double getRayon() {
        return rayon;
    }
}
