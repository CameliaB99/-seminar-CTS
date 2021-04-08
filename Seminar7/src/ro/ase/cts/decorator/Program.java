package ro.ase.cts.decorator;

public class Program {

	public static void main(String[] args) {
		CardAbstract card =  new Card("Maricel");
		card.realizeazaPlataNormala();
		card.realizeazaPlataOnline();
		System.out.println(" ");
		DecoratorAbstract decoratorAbstract= new DecoratorContactless(card);
		decoratorAbstract.realizeazaPlataContactless();
		decoratorAbstract.realizeazaPlataNormala();
		decoratorAbstract.realizeazaPlataOnline();

	}

}
