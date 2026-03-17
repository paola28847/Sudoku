
import com.murcia.utils.Consola;

public class Sudoku {
    private Tablero tablero;
    enum EstadoJuego {EN_CURSO, COMPLETADO, INVALIDO};
    private EstadoJuego estado;

    public Sudoku() {
        tablero = new Tablero();
    }

    public void iniciarNuevoJuego() {
        Consola.clrscr();
        do {
            System.out.print(tablero);
            
        } while (true);
    }

    public void cargarTablero(Tablero tablero) {
    
    }
    public boolean validarJuego() {
        return true;
    }

    public boolean estaCompleto() { return true; }

    public Tablero getTablero() { return tablero; }

    public String toString() {
        
        return "";
    }
}
