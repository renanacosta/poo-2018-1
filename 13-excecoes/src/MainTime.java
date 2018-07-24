import static javax.swing.JOptionPane.*;

public class MainTime {
	public static void main(String[] args) {
		// QUEBRA, se não for tratada!
		// Time t = new Time(-1, -30, -15); 
		
		Time t = null;
		
		while (t == null) {
			try { // tente!
				String h = showInputDialog("Hora:");
				t = new Time(Integer.parseInt(h), 30, 15);		
				showMessageDialog(null, "Hora OK: " + t);			
			} catch (IllegalArgumentException e) {
				showMessageDialog(null,
						"ERRO: " + e.getMessage());
			} catch (Exception e) {
				showMessageDialog(null, "Aconteceu um erro inesperado");
			}
		}
		// lançar/disparar/arremessar exceção
		// throw
		
	}
}
