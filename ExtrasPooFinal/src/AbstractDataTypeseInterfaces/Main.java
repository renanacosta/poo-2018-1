package AbstractDataTypeseInterfaces;

public class Main {
	public static void main(String[] args) {

		System.out.println("==========================================");
		System.out.println("| ED++: Abstract Data Types e Interfaces |");
		System.out.println("==========================================");
		System.out.println();

		// escreva a interface IKeyValue
		// lembre que nos testes a seguir não está previsto

		// o método para remover uma chave/valor
		IKeyValue tabela = new KeyValue(); // implemente na classe KeyValue

		tabela.put("noob saibot", 0); // put(String key, Integer value)
		tabela.put("abobo", 10);

		Integer v = tabela.get("noob saibot"); // 0
		System.out.println(v == 0);
		System.out.println(tabela.get("noob saibot") == 0);
		System.out.println(tabela.get("abobo") == 10);

		tabela.put("noob saibot", 50); // se já existe, subtitui o value
		System.out.println(tabela.get("noob saibot") == 50);

		tabela.put("noob saibot", tabela.get("noob saibot") + 20);
		System.out.println(tabela.get("noob saibot") == 70);

		Integer v2 = tabela.get("zitz"); // null
		System.out.println(v2 == null);
		System.out.println(tabela.get("zitz") == null);

		boolean b1 = tabela.hasKey("zitz"); // false
		boolean b2 = tabela.hasKey("abobo"); // true
		System.out.println(b1 == false);
		System.out.println(b2 == true);

		String[] keys = tabela.getKeys();
		Integer[] values = tabela.getValues();

		System.out.println(keys.length == 2);
		System.out.println(values.length == 2);

		System.out.println(keys[0].equals("noob saibot"));
		System.out.println(keys[1].equals("abobo"));

		System.out.println(values[0].equals(70));
		System.out.println(values[1].equals(10));

		// Adicione mais 10+ casos de teste, inclusive para remover elementos.
		// Escreva comentários explicando a intenção dos testes.

		// REMOVE STRING PASSADA POR PARAMETRO

		System.out.println();
		System.out.println("<><><><><><><><><><><><><><><><><><><><>");
		System.out.println("  REMOVE STRING PASSADA POR PARAMETRO ");
		System.out.println("<><><><><><><><><><><><><><><><><><><><>");
		System.out.println();

		System.out.println(tabela.deleteKey("c") == false);
		System.out.println(tabela.deleteKey("abobo") == true);
		System.out.println("====");

		keys = tabela.getKeys();
		values = tabela.getValues();

		System.out.println(keys.length == 1);
		System.out.println(values.length == 1);
		System.out.println("====");

		System.out.println(keys[0].equals("noob saibot"));
		System.out.println(values[0].equals(70));

		System.out.println(tabela.deleteKey("noob saibot"));
		System.out.println("====");

		keys = tabela.getKeys();
		values = tabela.getValues();

		System.out.println(keys.length == 0);
		System.out.println(values.length == 0);

		System.out.println("====");

		tabela.put("Arroz", 15);
		tabela.put("Feijao", 1);
		tabela.put("Macarrao", 71);
		tabela.put("Salada", 37);
		tabela.put("Tempero", 23);

		keys = tabela.getKeys();
		values = tabela.getValues();

		System.out.println(keys.length == 5);
		System.out.println(values.length == 5);

		System.out.println(keys[0].equals("Arroz"));
		System.out.println(keys[1].equals("Feijao"));
		System.out.println(keys[2].equals("Macarrao"));
		System.out.println(keys[3].equals("Salada"));
		System.out.println(keys[4].equals("Tempero"));

		System.out.println(values[0].equals(15));
		System.out.println(values[1].equals(1));
		System.out.println(values[2].equals(71));
		System.out.println(values[3].equals(37));
		System.out.println(values[4].equals(23));

		// REMOVE TODOS OS ELEMENTOS DA LISTA

		tabela.clean();

		keys = tabela.getKeys();
		values = tabela.getValues();

		System.out.println();
		System.out.println("<><><><><><><><><><><><><><><><><><>");
		System.out.println(" REMOVE TODOS OS ELEMENTOS DA LISTA ");
		System.out.println("<><><><><><><><><><><><><><><><><><>");
		System.out.println();

		System.out.println(keys.length == 0);
		System.out.println(values.length == 0);
		System.out.println();
		System.out.println("## FIM DO PROGRAMA ##");
	}

}
