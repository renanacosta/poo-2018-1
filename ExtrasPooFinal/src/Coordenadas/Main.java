package Coordenadas;

public class Main {

	public static void main(String[] args) {

		System.out.println("=================================================================");
		System.out.println("| More Object: construtores, instâncias válidas e imutabilidade |");
		System.out.println("=================================================================");
		System.out.println();

		System.out.println();
		System.out.println("<><><><><><><>");
		System.out.println(" CONSTRUTORES ");
		System.out.println("<><><><><><><>");
		System.out.println();
		// construtores
		Coordenada c1 = new Coordenada();
		System.out.println(c1.latitude == 0.0);
		System.out.println(c1.longitude == 0.0);

		Coordenada c2 = new Coordenada(50.0, 134.0);
		System.out.println(c2.latitude == 50.0);
		System.out.println(c2.longitude == 134.0);

		Coordenada c3 = new Coordenada(-90.0, -180.0);
		System.out.println(c3.latitude == -90.0);
		System.out.println(c3.longitude == -180.0);

		// estas coordenadas são inválida e devem lançar exceção
		// faça serem rejeitadas e depois comente-as para não parar o programa
		// Coordenada e1 = new Coordenada(-91.0, 0.0);
		// Coordenada e2 = new Coordenada(100.0, 0.0);
		// Coordenada e3 = new Coordenada(10.0, -182.0);
		// Coordenada e4 = new Coordenada(10.0, 200.0);
		// Coordenada e5 = new Coordenada(-95.0, -200.0);

		// imutabilidade: as linhas a seguir devem causar erro de compilação
		// verifique se está de acordo e depois comente-as
		// Coordenada c4 = new Coordenada();

		// c4.latitude = 30.0;
		// c4.longitude = 80.0;

		System.out.println();
		System.out.println("<><><><><><><><><><><>");
		System.out.println("  OPERAÇÕES/COMANDOS ");
		System.out.println("<><><><><><><><><><><>");
		System.out.println();

		// operações/comandos

		Coordenada in = new Coordenada(30.0, 50.0);
		Coordenada out = in.norte(5.0);

		System.out.println(in.latitude == 30.0); // deve ser imutável
		System.out.println(out.latitude == 35.0);
		out.norte(5.0); // sem reatribuição sem alteração
		System.out.println(out.latitude == 35.0);
		out = out.norte(5.0); // reatribuindo
		System.out.println(out.latitude == 40.0);
		out = out.sul(60.0);
		System.out.println(out.latitude == -20.0);
		out = out.sul(30.0);
		System.out.println(out.latitude == -50.0);
		out = out.sul(-10.0);
		System.out.println(out.latitude == -40.0);
		out = out.norte(-10.0);
		System.out.println(out.latitude == -50.0);
		System.out.println(out.longitude == 50.0);
		out = out.leste(50.0);
		System.out.println(out.longitude == 100.0);
		out = out.oeste(180.0);
		System.out.println(out.longitude == -80.0);
		out = out.oeste(-10.0);
		System.out.println(out.longitude == -70.0);
		out = out.leste(-10.0);
		System.out.println(out.longitude == -80.0);

		System.out.println();
		System.out.println("<><><><><><>");
		System.out.println("  CONSULTAS ");
		System.out.println("<><><><><><>");
		System.out.println();
		// consultas
		Coordenada q = new Coordenada();
		System.out.println(q.noEquador() == true);
		System.out.println(q.noMeridiano() == true);
		q = q.norte(10.0);
		System.out.println(q.noEquador() == false);
		q = q.leste(10.0);
		System.out.println(q.noMeridiano() == false);
		q = q.leste(170.0);
		System.out.println(q.longitude == 180.0);
		System.out.println(q.noMeridiano() == true);
		q = q.oeste(200.0);
		System.out.println(q.longitude == -20.0);
		System.out.println(q.noMeridiano() == false);
		q = q.oeste(160.0);
		System.out.println(q.longitude == -180.0);
		System.out.println(q.noMeridiano() == true);

		Coordenada r = new Coordenada(30.0, 70.0);
		System.out.println(r.latitude() == 30.0);
		System.out.println(r.longitude() == 70.0);
		System.out.println(r.noNorte() == true);
		System.out.println(r.noSul() == false);
		System.out.println(r.noOriente() == true);
		System.out.println(r.noOcidente() == false);

		r = r.oeste(140.0).sul(60.0);
		System.out.println(r.latitude() == -30.0);
		System.out.println(r.longitude() == -70.0);
		System.out.println(r.noNorte() == false);
		System.out.println(r.noSul() == true);
		System.out.println(r.noOriente() == false);
		System.out.println(r.noOcidente() == true);

		System.out.println();
		System.out.println("<><><><><><><><><><><><><>");
		System.out.println("  SOBRESCREVER toString() ");
		System.out.println("<><><><><><><><><><><><><>");
		System.out.println();

		// sobrescrever o método toString()

		Coordenada t = new Coordenada(-32.0714021, -52.1425059);
		// https://www.google.com.br/maps/@-32.0714021,-52.1425059,13z?hl=pt-BR
		System.out.println(t);
		; // imprime -32.0714021°, -52.1425059°
		System.out.println(t.toString().equals("-32.0714021°, -52.1425059°"));

		System.out.println();
		System.out.println(" ## DESAFIO ## ");
		System.out.println();

		// desafio2: escrever método que retorna link para Google Maps!
		Coordenada t1 = new Coordenada(37.402473, -122.3212843);
		String url = t1.googleMaps();
		System.out.println(url.equals("https://www.google.com.br/maps/@37.402473,-122.3212843,10z?hl=pt-BR"));
		System.out.println(url);
		// descomente para ver se funciona (não testei)
		// Runtime.getRuntime().exec("google-chrome " + url);
		// tente outro navegador, no windows tente "start " + url

	}
}
