import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NominaTest {

    @Test

    public void testNomina() {
        String[] args = {"5", "1000"};
        try {
            Nomina.main(args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test

    public void testNomina2() {
        String[] args = {"2", "2500"};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            Nomina.main(args);
        });
    }

    @Test

    public void testNomina3() {
        String[] args = {"4", "-500"};
        assertThrows(NegativeArraySizeException.class, () -> {
            Nomina.main(args);
        });
    }

    @Before
    public void testNomina4() {
    String[] args = {"-2", "600"};
    assertThrows(NegativeArraySizeException.class, () -> {
        Nomina.main(args);
    });
    }

    @After
    public void testNomina5() {
        String[] args = {"0", "2746.3"};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            Nomina.main(args);
        });
    }
    @Test

    public void testNomina6() {
        String[] args = {"1", "1100"};
        try {
            Nomina.main(args);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test

    public void testNomina7() {
        String[] args = {"1766", "2599.6"};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            Nomina.main(args);
        });
    }

    @Test

    public void testNomina8() {
        String[] args = {"4", "-50.8"};
        assertThrows(NegativeArraySizeException.class, () -> {
            Nomina.main(args);
        });
    }

    @Before
    public void testNomina9() {
        String[] args = {"8", "6"};
        assertThrows(IndexOutOfBoundsException.class, () -> {
            Nomina.main(args);
        });
    }

    @After
    public void testNomina10() {
        String[] args = {"j", "2746.3"};
        assertThrows(IllegalArgumentException.class, () -> {
            Nomina.main(args);
        });
    }


}

