import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CheckItTesting {

    //Predicate Coverage
    @Test
    public void testPredicateCoverageTrue() {
        assertEquals("P is true", CheckIt.checkIt(true, false, true));
        assertEquals("P isn't true", CheckIt.checkIt(false, false, false));
    }

    //Clause Coverage
    @Test
    public void testClauseCoverage() {
        assertEquals("P is true", CheckIt.checkIt(true, false, false));
        assertEquals("P isn't true", CheckIt.checkIt(false, true, true));
        assertEquals("P isn't true", CheckIt.checkIt(false, false, true));
        assertEquals("P isn't true", CheckIt.checkIt(false, true, false));
    }

    //CCAC
    @Test
    public void testCACC_A() {
        assertEquals("P is true", CheckIt.checkIt(true, false, false));
        assertEquals("P isn't true", CheckIt.checkIt(false, false, false));
    }

    @Test
    public void testCACC_BC() {
        assertEquals("P is true", CheckIt.checkIt(false, true, true));
        assertEquals("P isn't true", CheckIt.checkIt(false, false, true));
        assertEquals("P isn't true", CheckIt.checkIt(false, true, false));
    }

    //RACC
    @Test
    public void testRACC_A() {
        assertEquals("P is true", CheckIt.checkIt(true, false, false));
        assertEquals("P isn't true", CheckIt.checkIt(false, false, false));
    }

    @Test
    public void testRACC_BC() {
        assertEquals("P is true", CheckIt.checkIt(false, true, true));
        assertEquals("P isn't true", CheckIt.checkIt(false, true, false));
    }
}
