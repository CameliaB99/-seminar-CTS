package ro.ase.cts.flyweight;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1= new Rezervare(1,4,"10:00");
		Rezervare rezervare2= new Rezervare(2,3,"11:00");
		Rezervare rezervare3= new Rezervare(3,2,"11:20");
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		flyweightFactory.getClient("0716465").printeazaRezervare(rezervare1);
		flyweightFactory.getClient("074538472").printeazaRezervare(rezervare2);
		flyweightFactory.getClient("078643677").printeazaRezervare(rezervare3);
		

	}

}
