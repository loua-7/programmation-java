package tp2;
import java.util.Scanner;
public class employé {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("entrer le nom d'employé:");
		String nom= input.nextLine();
		System.out.println("entrer le prenom d'employé:");
		String prenom= input.nextLine();
		System.out.println("entrer l'age d'employé:");
		int age= input.nextInt();
		System.out.println("entrer le salaire d'employé:");
		double salaire= input.nextDouble();

	}

}
