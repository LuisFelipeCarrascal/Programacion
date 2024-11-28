import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeroeTest {
    private Heroe heroe;

    @BeforeEach
    public void setUp() {
        // Crear una nueva instancia del héroe antes de cada prueba
        heroe = new Heroe("Superman");
    }

    @Test
    public void testHeroeCreadoCorrectamente() {
        // Verificar que el héroe tiene el nombre correcto
        assertEquals("Superman", heroe.getNombre());
        // Verificar que al principio el mundo no ha sido salvado
        assertFalse(heroe.isMundoSalvado(), "El mundo no debería estar salvado al inicio.");
    }

    @Test
    public void testSalvarMundo() {
        // Llamar al método salvarMundo
        heroe.salvarMundo();
        // Verificar que el mundo ha sido salvado
        assertTrue(heroe.isMundoSalvado(), "El mundo debería estar salvado después de llamar al método salvarMundo.");
    }

    @Test
    public void testSalvarMundoUnaVez() {
        // Llamar al método salvarMundo una vez
        heroe.salvarMundo();
        // Volver a llamar al método
        heroe.salvarMundo();
        // Verificar que el mundo ya está salvado (no cambia después de la primera vez)
        assertTrue(heroe.isMundoSalvado(), "El mundo debería estar salvado después de la primera llamada.");
    }
}
