import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @Before
    public void inicializar() {
        biblioteca = new Biblioteca();
        biblioteca.agregarLibro("El principito", 3);
        biblioteca.agregarLibro("Don Quijote de la Mancha", 1);
        biblioteca.agregarLibro("Java para Dummies", 3);
        biblioteca.agregarLibro("Momo", 1);
        biblioteca.agregarLibro("La chica invisible", 5);
        biblioteca.agregarLibro("One Piece", 4);
        biblioteca.agregarLibro("Naruto", 5);
        biblioteca.agregarLibro("Todo lo que necesitas saber", 4);
        biblioteca.agregarLibro("Yoga restaurativo", 4);
    }

    @Test
    public void testPrestarLibro(){
        biblioteca.prestarLibro("Juan","Don Quijote de la Mancha");
        biblioteca.prestarLibro("Juan","El principito");
        assertEquals(2,biblioteca.obtenerCopiasDisponibles("Don Quijote de la Mancha"));
        assertEquals(2,biblioteca.obtenerCopiasDisponibles("El principito"));
        assertEquals(Arrays.asList("El principito","Don Quijote de la Mancha"), biblioteca.prestamosPorUsuario.get("Juan"));
    }

    @Test
    public void test2(){
        biblioteca.prestarLibro("Nadia","Momo");
        assertEquals(1, biblioteca.obtenerCopiasDisponibles("Momo"));
        assertEquals(Arrays.asList("Momo"), biblioteca.prestamosPorUsuario.get("Nadia"));

    }

    @Test
    public void test(){
        biblioteca.prestarLibro("Nadia","Naruto");
        biblioteca.prestarLibro("Nadia","One Piece");
        assertEquals(2, biblioteca.obtenerCopiasDisponibles("Naruto"));
        assertEquals(1, biblioteca.obtenerCopiasDisponibles("One Piece"));
        assertEquals(Arrays.asList("Naruto","One Piece"), biblioteca.prestamosPorUsuario.get("Nadia"));

    }

    @Test
    public void testAgregar()throws Exception{
        biblioteca.agregarLibro("Yoga restaurativo",4);

    }

    @Test
    public void testPrestar()throws Exception{
        biblioteca.prestarLibro("Yolanda","Yoga restaurativo");

    }

    @Test
    public void testDevolver()throws Exception{
        biblioteca.prestarLibro("Yolanda","Yoga restaurativo");
        biblioteca.devolverLibro("Yolanda","Yoga restaurativo");
        assertEquals(4, biblioteca.obtenerCopiasDisponibles("Yoga restaurativo"));
    }

    @Test
    public void testDevolver2(){
        assertThrows(IllegalArgumentException.class,()->{
            biblioteca.prestarLibro("José","Nemesis");
        });

    }

    @Test
    public void test3(){
        biblioteca.prestarLibro("Roberto","Naruto");
        biblioteca.devolverLibro("Roberto","Naruto");
        assertEquals(2, biblioteca.obtenerCopiasDisponibles("Naruto"));
    }

    @Test
    public void testAgregar2()throws Exception{
        biblioteca.agregarLibro("Todo lo que necesitas saber",0);

    }

    @Test
    public void test4(){
        assertEquals(1, biblioteca.obtenerCopiasDisponibles("Momo"));
    }

    @Test
    public void test5(){
        assertEquals(5, biblioteca.obtenerCopiasDisponibles("La chica invisible"));
    }

}

