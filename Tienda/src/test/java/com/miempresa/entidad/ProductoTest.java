import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

    private Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto("Manzana", 1.5);
    }

    @Test
    void testGetNombre() {
        assertEquals("Manzana", producto.getNombre());
    }

    @Test
    void testGetPrecio() {
        assertEquals(1.5, producto.getPrecio());
    }

    @Test
    void testSetNombreValido() {
        producto.setNombre("Pera");
        assertEquals("Pera", producto.getNombre());
    }

    @Test
    void testSetNombreANulo() {
        producto.setNombre(null);
        assertNull(producto.getNombre());
    }

    @Test
    void testSetNombreVacio() {
        producto.setNombre("");
        assertEquals("", producto.getNombre());
    }
}