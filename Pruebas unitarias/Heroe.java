
public class Heroe {
    private String nombre;
    private boolean mundoSalvado;

    public Heroe(String nombre) {
        this.nombre = nombre;
        this.mundoSalvado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMundoSalvado() {
        return mundoSalvado;
    }

    // Método salvarMundo
    public void salvarMundo() {
        // Aquí la lógica de salvar el mundo (por simplicidad, solo cambia el estado)
        this.mundoSalvado = true;
    }
}