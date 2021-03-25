package ro.ase.cts.FactoryMethod;

public class FactoryMedic implements FactoryPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
