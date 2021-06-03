package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import teste.TestGrupa;
import teste.TestGrupaWithFakeStudent;
import teste.TestGrupaWithStudentStub;

@RunWith(Suite.class)
@SuiteClasses({TestGrupaWithStudentStub.class,TestGrupa.class, TestGrupaWithFakeStudent.class})
public class SuitaCompleta {

}
