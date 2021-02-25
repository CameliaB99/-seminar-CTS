package sem1_cts;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//syso-ca sa apara singur
		System.out.println("hello");
		Zoo zoo = new Zoo();
		Zookeper keeper = new Zookeper();
		
		zoo.setKeeper(keeper);
		keeper.setName("Marcel");
		Zebra zebra1= new Zebra("z1");
		Zebra zebra2 = new Zebra("z2");
		zoo.add(zebra1);
		zoo.add(zebra2);
		zoo.feedAll();
		Girafa girafa1 =  new Girafa("Lily");
		Girafa girafa2 =  new Girafa("Maia");
		zoo.add(girafa1);
		zoo.add(girafa2);
		zoo.feedAll();
		
	}

}
