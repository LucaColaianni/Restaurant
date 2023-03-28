import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//nome
		System.out.println("Inserisci il nome del piatto:");
		String nomePiatto = scanner.nextLine();
		
		//prezzo
		System.out.println("Inserisci il prezzo del piatto:");
		double prezzoPiatto = scanner.nextDouble();
		
		//ingredienti
		scanner.nextLine(); 
		System.out.println("Inserisci gli ingredienti del piatto separati da una virgola:");
		String[] ingredientiPiatto = scanner.nextLine().split(",");
		Dish d = new Dish(nomePiatto, prezzoPiatto, ingredientiPiatto);

		//nome drink
		System.out.println("Inserisci il nome del drink:");
		String nomeDrink = scanner.nextLine();
		
		//prezzo
		System.out.println("Inserisci il prezzo del drink:");
		double prezzoDrink = scanner.nextDouble();
		
		scanner.nextLine(); 
		Drink dr = new Drink(nomeDrink, prezzoDrink);

		Dish[] dishCollection = new Dish[] {d};
		
		Drink[] drinkCollection = new Drink[] {dr};
		
		Restaurant r = new Restaurant("trattoria", dishCollection, drinkCollection);
		
		r.stampamenu();
		
		double totale = d.getPrezzo() + dr.getPrezzo();
		System.out.println("Il totale è: " + totale);
	}
	

	/*
	 * public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in); //piatti Dish d1 = new Dish("Carbonara",10.0,new String[]
	 * {"Pasta" , "Uova ", "Guanciale"} ); Dish d2 = new Dish("Assasina",11.0,new
	 * String[] {"Spaghetti" , "Sugo ", "Peperoncino"} ); Dish d3 = new
	 * Dish("Pasta al tonno",8.0, new String[] {"Pasta", "Tonno"});
	 * 
	 * //drink Drink dr1 = new Drink("Acqua", 1.5); Drink dr2 = new
	 * Drink("Gin lemon", 5.5);
	 * 
	 * Dish[] dishCollection = new Dish[] {d1, d2,d3};
	 * 
	 * Drink[] drinkCollection = new Drink[] {dr1, dr2};
	 * 
	 * Restaurant r = new Restaurant("trattoria", dishCollection, drinkCollection);
	 * 
	 * r.stampamenu(); }
	 */

}
