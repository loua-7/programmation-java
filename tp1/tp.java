package tp1;
import java.util.Scanner;
public class tp {
	public static void main (String[]args) {
		int a;
		int b;
		int c;
		Scanner  clavier2=new Scanner(System.in);
		System.out.println("a:");
		a= clavier2.nextInt();
		System.out.println("b:");
		b= clavier2.nextInt();
		System.out.println("c:");
		c= clavier2.nextInt();
		int somme= a+b+c;
		int produit= a*b*c;
		double moy= (a+b+c)/3;
		System.out.println("la somme est:"+somme);
		System.out.println("le produit est:"+produit);
		System.out.println("la moyenne est:"+moy);
		}

}
