
public class MainPorta {
	public static void main(String[] args) {
		
		Porta p = new Porta(80, 210, "Angelim");
		
		System.out.println(p.trancada());
		System.out.println(p.aberta());
		
		try {
			p.abrir();
		} catch (IllegalStateException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(p.aberta());
		p.fechar();
		System.out.println(p.aberta());
		
		p.trancar();
		System.out.println(p.trancada());
		System.out.println(p.aberta());
		
		try {
			p.abrir();
		} catch (IllegalStateException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println(p.trancada());
		System.out.println(p.aberta());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
