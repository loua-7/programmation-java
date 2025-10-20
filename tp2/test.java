package tp2;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		//double largeur;
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("rayon:");
		double rayon= input.nextDouble();
		cercle c1= new cercle(rayon);
		System.out.println("surface:"+c1.surface());
		  
		
		System.out.println("largeur:");
		double largeur= input.nextDouble();
		
		System.out.println("longueur:");
		double longueur= input.nextDouble();
		rectangle t1= new rectangle(longueur,largeur);
		
		System.out.println("surface:"+t1.surface());
		
		
		

	}

}
