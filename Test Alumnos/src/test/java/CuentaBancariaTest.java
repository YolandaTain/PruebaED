import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CuentaBancariaTest.DepositoTest.class,
        CuentaBancariaTest.RetiroTest.class,
        CuentaBancariaTest.InteresTest.class
})
public class CuentaBancariaTest {

    public static class DepositoTest {
        private CuentaBancaria cuenta;

        @Before
        public void setUp() {
            cuenta = new CuentaBancaria(1000, 0.01);
        }

        @Test
        public void testDeposito1(){
            cuenta.deposito(25.23);
        }

        @Test
        public void testDeposito2() throws Exception{
            assertThrows(IllegalArgumentException.class,()->{
                cuenta.deposito(-2);
            });
        }

        @Test
        public void testDeposito4() throws Exception{
            assertThrows(IllegalArgumentException.class,()->{
                cuenta.deposito(-1000);
            });
        }



    }

    public static class RetiroTest {
        private CuentaBancaria cuenta;

        @Before
        public void setUp() {
            cuenta = new CuentaBancaria(1000, 0.01);
        }

        @Test
        public void testRetiro3(){
            cuenta.retiro(60);
            assertEquals((int)(940), (int)(cuenta.getSaldo()));
        }

        @Test
        public void testRetiro1(){
            cuenta.retiro(60.23);
        }

        @Test
        public void testRetiro2()throws Exception{
            assertThrows(IllegalArgumentException.class,()->{
                cuenta.retiro(1001);
            });
        }

        @Test
        public void testRetiro4()throws Exception{
            assertThrows(IllegalArgumentException.class,()->{
                cuenta.retiro(-1001);
            });
        }



    }

    public static class InteresTest {
        private CuentaBancaria cuenta;
        private CuentaBancaria cuenta2;
        private CuentaBancaria cuenta3;



        @Before
        public void setUp() {
            cuenta = new CuentaBancaria(1000, 0.01);
            cuenta2 = new CuentaBancaria(1000, 0.05);
            cuenta3 = new CuentaBancaria(1000, 0.10);
        }

        @Test
        public void testInteres(){
            cuenta.aplicarInteres();
            assertEquals((int)(1010), (int)(cuenta.getSaldo()));
        }

        @Test
        public void testInteres2(){
            cuenta2.aplicarInteres();
            assertEquals((int)(1050), (int)(cuenta2.getSaldo()));
        }


        @Test
        public void testInteres3(){
            cuenta3.aplicarInteres();
            assertEquals((int)(1100), (int)(cuenta3.getSaldo()));
        }
    }
}