import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mladjan on 26.3.2014.
 */
public class RomanCalculatorTest {

    RomanCalculator subject;

    @Before
    public void setUp() {
        subject = new RomanCalculator();
    }

    @Test
    public void mustReturn1ForI() {
        assertEquals(1, subject.convertToArabic("I") );
    }

    @Test
    public void mustReturn2ForII() {
        assertEquals(2, subject.convertToArabic("II") );
    }

    @Test
    public void mustReturn3ForIII() {
        assertEquals(3, subject.convertToArabic("III") );
    }

    @Test
    public void mustReturn10ForX() {
        assertEquals(10, subject.convertToArabic("X") );
    }

    @Test
    public void mustReturn20ForXX() {
        assertEquals(20, subject.convertToArabic("XX") );
    }

    @Test
    public void mustReturn21ForXX() {
        assertEquals(21, subject.convertToArabic("XXI") );
    }

    @Test
    public void mustReturn4ForIV() {
        assertEquals(4, subject.convertToArabic("IV") );
    }

    @Test
    public void mustReturn24ForXXIV() {
        assertEquals(24, subject.convertToArabic("XXIV") );
    }

    @Test
    public void mustReturn94ForXCIV() {
        assertEquals(94, subject.convertToArabic("XCIV") );
    }

    @Test
    public void mustReturn949ForCMXLIX() {
        assertEquals(949, subject.convertToArabic("CMXLIX") );
    }

    @Test
    public void testAddDecimalMethodeMustReturn2() {
        assertEquals(2, subject.addDecimal(subject.convertToArabic("I"), subject.convertToArabic("I")));
    }

    @Test
    public void testAddDecimalMethodeMustReturn188() {
        assertEquals(188, subject.addDecimal(subject.convertToArabic("XCIV"), subject.convertToArabic("XCIV")));
    }

    @Test
    public void testAddRomanMethodeMustReturnII() {
        assertEquals("II", subject.addRoman("I","I"));
    }


    @Test
    public void testAddRomanMethodeMustReturnMDCCCXCVIII() {
        assertEquals("MDCCCXCVIII", subject.addRoman("CMXLIX", "CMXLIX") );
    }


}
