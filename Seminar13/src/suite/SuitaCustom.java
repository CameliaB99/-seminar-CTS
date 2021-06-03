package suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import categorii.TesteGetPromovabilitate;
import categorii.TesteNormale;
import categorii.TesteUrgente;
import teste.GrupaTestCuFixture;
import teste.TestGrupa;
import teste.TestGrupaWithFakeStudent;
import teste.TestGrupaWithStudentStub;

@RunWith(Categories.class)
@SuiteClasses({TestGrupa.class, TestGrupaWithStudentStub.class, TestGrupaWithFakeStudent.class, GrupaTestCuFixture.class})
@IncludeCategory({TesteGetPromovabilitate.class})
@ExcludeCategory({TesteNormale.class, TesteUrgente.class})
public class SuitaCustom {
}