package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		ContClient client = new ContClient("Ion",19);
		ContClient client2= (ContClient) client.copiaza();
		//a nu se confunda cu singlenton, aici avem 2 instante diferite
		System.out.println(client);
		System.out.println(client2);
		
		Bilet bilet1= new Bilet(1,"Arsenal","Barcelona","1Aprilie","1");
		Bilet bilet2= new Bilet(1,"EchipaC","EchipaD","2Aprilie","2");
		Bilet bilet3= (Bilet) bilet1.copiaza();
		bilet3.setCodBilet(3);
		bilet3.setLoc("1F");
		
		Bilet bilet4= (Bilet)bilet1.copiaza();
		bilet4.setCodBilet(13);
		bilet4.setLoc("2F");
		
		System.out.println(bilet3.toString());
		System.out.println(bilet4.toString());
	}

}
