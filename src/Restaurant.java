
public class Restaurant {

	//attributi
	private String name;
	private Dish[] dishes;
	private Drink[] drinks;
	
	//costruttore
	public Restaurant(String name, Dish[] dishes, Drink[] drinks) {
		super();
		this.name = name;
		this.dishes = dishes;
		this.drinks = drinks;
	}

	//metodo stampamenu , cicla i piatti e stampa nome prezzo e anche i drink
	public void stampamenu() {
		System.out.println("---Menu del ristorante---");
		System.out.println("Piatti della casa: ");
		for( Dish d : dishes) {
			System.out.println(d.getNome()+ ": " + d.getPrezzo());
		}
		for(Drink dr : drinks) {
			System.out.println(dr.getNome()+ ": "+dr.getPrezzo());
		}
	
	}
	
	
	//getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dish[] getDishes() {
		return dishes;
	}

	public void setDishes(Dish[] dishes) {
		this.dishes = dishes;
	}

	public Drink[] getDrinks() {
		return drinks;
	}

	public void setDrinks(Drink[] drinks) {
		this.drinks = drinks;
	}
	
	
	

}


/*esercizio ristorante
Creare una classe Restaurant con attributi:
- name
- dishes > Array di oggetti di classe Dish
- drinks > array di oggetti di classe Drink
- metodi: stampamenu > cicli prima i piatti e stampi nome : prezzo e faccia la stessa
cosa con i drink

Creare una classe Dish con attributi:
- nome
- prezzo
- (opzionale ) ingredienti
- metodi
• getter e setter
Creare una classe Drink con attributi:
- nome
- prezzo
-metodi
" getter e setter*/