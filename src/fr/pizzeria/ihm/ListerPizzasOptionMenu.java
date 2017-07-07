package fr.pizzeria.ihm;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaDaoMemoire;
import fr.pizzeria.model.Pizza;

public class ListerPizzasOptionMenu extends OptionMenu {

	private IPizzaDao dao;
	
	public ListerPizzasOptionMenu(String libelle) {
		super(libelle);
	}

	@Override
	public boolean execute() {
		
		dao = new PizzaDaoMemoire();
		
		for(Pizza p : dao.findAllPizzas()) {
			if(p != null) {
				// N'est plus utile depuis que l'on a implémenté le toString() sur Pizza
//				System.out.println(p.getCode() + " -> " 
//								 + p.getNom() + " (" 
//								 + p.getPrix() + " €)");
				System.out.println(p);
			}
		}
		return true;
	}
	

}
