package ro.ase.cts.simpleFactory;

public class Program {

	public static void main(String[] args) {
		/*try {
		FactoryPersonal factory= new FactoryPersonal();
		
		PersonalSpital personal1;
		PersonalSpital personal2;
		personal1=factory.createPersonal(TipPersonal.Medic, "Ion", 1500);
		personal2=factory.createPersonal(TipPersonal.Asistent, "Maria", 1000);
		System.out.println(personal1);
		System.out.println(personal2);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}*/
		try {
			FactoryPersonal factory = new FactoryPersonal();
			PersonalSpital persoana1;
			PersonalSpital persoana2;
			persoana1 = factory.createPersonal(TipPersonal.Medic, "Ion", 1500);
			persoana2 = factory.createPersonal(TipPersonal.Asistent, "Maria", 2000);
			System.out.println(persoana1);
			System.out.println(persoana2);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
		}

}
