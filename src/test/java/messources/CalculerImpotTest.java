package messources;

import mesources.CalculerImpôts;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculerImpotTest {
    @Test (expected=IllegalArgumentException.class)
    public void throwsIllegalArgumentExceptionWhenNombreDePartsGreaterThanCinq (){
    CalculerImpôts classe= new CalculerImpôts ();
    classe.calculerimpôts (1500, 6);
    }

    @Test (expected=ArithmeticException.class)
    public void throwsArithmeticExceptionWhenNombreDePartsZero (){
    CalculerImpôts classe= new CalculerImpôts () ; classe.calculerimpôts (1500, 0);
    }

    @ Test
    public void shouldReturn10000ForRevenu50000AndNombreParts5 () {
    CalculerImpôts classe= new CalculerImpôts ();
    assertEquals ("50000 / 5 donne 10.000", 10000,classe.calculerimpôts (50000, 5));
    }

    @Test
    public void testCelibataireSansEnfant() {
        CalculerImpôts calc = new CalculerImpôts();
        assertEquals(1, calc.CalculerNombreParts(0, "", 0));
    }

    @Test
    public void testCelibataireDeuxEnfants() {
        CalculerImpôts calc = new CalculerImpôts();
        assertEquals(2, calc.CalculerNombreParts(0, "", 2));
    }

    @Test
    public void testMarieSixEnfantsConjointSalarie() {
        CalculerImpôts calc = new CalculerImpôts();
        assertEquals(4, calc.CalculerNombreParts(1, "S", 6));
    }

    @Test
    public void testMarieNeufEnfantsConjointNonSalarie() {
        CalculerImpôts calc = new CalculerImpôts();
        assertEquals(5, calc.CalculerNombreParts(1, "N", 9));
    }
}
