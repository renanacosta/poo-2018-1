package ILIST;

import Randomizer.MiddleSquareRandomizer;

class List implements IList {

	private Object[] lista = new Object[50]; // Comecei com 50
	private long semente = 756841;

	/*
	 * Tentei melhorar bastante esse algoritmo, adorei faze-lo Ficou bem rapido at�,
	 * tu mesmo viste que eu tinha o feito manualmente, mas mudei para ArrayCopy e
	 * melhorou bastante � claro que ficou grande porque tamb�m usei auto-indent.
	 * N�o suporto c�digo assim: void Seila(){ int x = 0; int y = 0; if(seila){ faz
	 * seila } return x; } void Seila2(){ int x = 0 if{(x>=0)} return x;} Outra
	 * coisa que resolvi usar s� quando necess�rio foi o IF tern�rio, ele �
	 * bonitinho, mas em certas ocasi�es torna o c�digo meio sujo de ver para um
	 * programador iniciante por exemplo. Assim, deixei pra usar s� quando for util,
	 * como no toString do Time
	 */

	public void addSpace() {
		Object[] NovaLista = new Object[this.lista.length + 25];
		System.arraycopy(this.lista, 0, NovaLista, 0, count());
		this.lista = NovaLista;
	}
	/*
	 * Adicionar espa�o, toda vez que this.lista[lista.length -25] for != de null,
	 * este m�todo ser� chamado, assim, nosso intervalo s�o 25 itens. Como te disse,
	 * primeiro fiz com this.lista -1 != null. Por�m pensei depois que, caso entrem
	 * 2 objetos de uma vez s� (o que n�o � o nosso caso, eu sei) ele j� quebraria.
	 * No m�todo criamos uma nova lista com + 25 espa�os. Usamos um Copy que vai
	 * desde this.lista[0], copia para os mesmos espa�os de a partir de
	 * NovaLista[0], e termina em count() (Nosso total de Objetos);
	 */

	@Override
	public void append(Object o) {
		if (this.lista[this.lista.length - 25] != null) {
			addSpace();
		}
		this.lista[count()] = o;
	}
	/*
	 * Adicionar o elemento no fim da lista, basta chamar o Count() e adicionar na
	 * posi��o dele, this.lista[tamanho-25] esteja ocupada, chamamos o m�todo de
	 * adicionar espa�o
	 */

	@Override
	public int count() {
		int y = 0;
		for (int x = 0; x < this.lista.length; x++) {
			if (this.lista[x] != null)
				y++;
		}
		return y;
	}
	/*
	 * Count, apenas criamos uma variavel y e contamos os itens. Caso this.lista[x]
	 * Seja diferente de Null, � porque tem Objetos e ent�o y++, e depois
	 * retornamos;
	 */

	@Override
	public boolean isEmpty() {
		if (count() == 0)
			return true;
		else
			return false;
	}
	/*
	 * Se o Count() de Objetos for igual a 0 (ele n�o pode ser menor, impossivel)
	 * Ent�o retorna true, sen�o retorna false;
	 */

	@Override
	public void prepend(Object o) {
		Object[] NovaLista = new Object[this.lista.length + 1];
		NovaLista[0] = o;
		System.arraycopy(this.lista, 0, NovaLista, 1, count());
		this.lista = NovaLista;
	}

	/*
	 * Prepend, adicionar o elemento no inicio da lista, Criamos um novo Vetor
	 * NovaLista e adicionar o Objeto na primeira posi��o, depois copiamos os
	 * Elementos da lista A partir do 0, para a posi��o 1 da Novalista, at� o fim do
	 * count();
	 */
	@Override
	public boolean insert(Object o, int index) {
		if (this.lista.length - 1 < index || index < 0 || index > count() || this.count() + 1 == index)
			return false;

		Object[] NovaLista = new Object[this.lista.length + 1];
		NovaLista[index] = o;
		System.arraycopy(this.lista, 0, NovaLista, 0, index);
		System.arraycopy(this.lista, index, NovaLista, index + 1, count());

		this.lista = NovaLista;
		return true;

	}
	/*
	 * Esse foi o mais facil de fazer, o Get, de adicionar o Elemento em qualquer
	 * indice. Fizemos o seguinte, primeiro valida-se o index. Depois cria-se uma
	 * Novalista com 1 espa�o a mais. Ent�o copia-se os objetos de this.lista 0,
	 * para index na posi��o 0, at� o index Depois, adiciona-se os elementos da
	 * lista, apartir da posi��o index, para a NovaLista na posi��o index+1, at� o
	 * fim do count();
	 * 
	 */

	@Override
	public Object get(int index) {
		if (isEmpty())
			return null;
		if (this.lista.length - 1 < index || index < 0)
			return null;
		if (this.lista[index] == null)
			return null;
		return this.lista[index];
	}

	/*
	 * aqui apenas validamos para n�o ter problemas, caso passe pelas valida��es,
	 * retorna this.lista[index]
	 */
	@Override
	public Object getFirst() {
		if (isEmpty())
			return null;
		else
			return this.lista[0];
	}
	/*
	 * Tamb�m, outro daqueles m�todos que voc� se sente aliviado por ter. Apenas
	 * passa pela valida��o (caso for vazio ele retornaria null ne) e retorna
	 * this.lista[0] J� cheguei a conclus�o de que os teus piores trabalhos s�o os
	 * que tem menos testes. vide o do noob saibot!
	 */

	@Override
	public Object getLast() {
		if (isEmpty())
			return null;
		else
			return this.lista[count() - 1];

	}
	/*
	 * A mesma coisa que o de cima, por�m como colocamos para ter sempre 25 espa�os
	 * a mais, n�o podemos usar o this.lista[this.lista.length-1] para retornar,
	 * retorna null, assim, usamos o count() ne.
	 */

	@Override
	public Object getSample() {
		if (count() == 0)
			return null;
		return this.lista[randomInt(count())];
	}

	/*
	 * � bem facil, utiliza-se o randomInt, que retorna um numero com valor entre 0,
	 * at� o valor maximo, que ser� o parametro, que obviamente usaremos o count();
	 */
	public double random() {
		long quadrado = this.semente * this.semente;
		quadrado = quadrado / 1000 % 1000000;
		double valor = (double) quadrado / 1000000;
		this.semente++;
		return valor;
	}

	/*
	 * O mesmo m�todo la do MiddleSquare, resolvi copiar e colar o metodo aqui, j�
	 * que fazer uma classe aqui s� pra isso achei desnecessario e tamb�m caso
	 * importe o arquivo de outra pasta, n�o vai funcionar no teu pc. Porque depende
	 * dos diretorios de onde ta arrumado.
	 */
	public int randomInt(int max) {
		MiddleSquareRandomizer c = new MiddleSquareRandomizer();
		return (int) (random() * max);
	}
	// M�todo do randomInt que foi usado la encima, consulte
	// o Random! kkk

	@Override
	public Object drop(int index) {
		if (index > this.lista.length) {
			return false;
			// throw new IllegalArgumentException("Vai estourar o vetor!");
		} else if (this.lista[index] == null)
			return null;
		Object o = get(index);
		delete(index);
		return o;
	}
	/*
	 * drop, Remove o elemento dado o indice passado. Aqui Fizemos primeiro as
	 * valida��es para n�o ter problemas. depois, reutilizamos m�todos, pegamos o
	 * objeto que vamos deletar, a partir de um get utilizando os parametros
	 * acima(int index). depois reaproveitamos o delete(index) e retornamos o.
	 * 
	 */

	@Override
	public boolean delete(int index) {
		if (get(index) != null) {
			Object[] NovaLista = new Object[count() + 1];
			this.lista[index] = null;
			System.arraycopy(this.lista, 0, NovaLista, 0, index);
			System.arraycopy(this.lista, index + 1, NovaLista, index, count());
			this.lista = NovaLista;
			return true;
		} else
			return false;
	}
	/*
	 * Aqui fazemos as valida��es. Depois fazemos a mesma manha que no insert,
	 * criamos uma novalista[count+1 de length] depois copiamos this.lista da
	 * posi��o 0 para nova lista a partir da posi��o 0 tb, ate o index. depois outro
	 * array copy que vai de this.lista na posicao index+1 (se fosse index daria
	 * nullpointer ne) e novalista na posicao index, ate o count();
	 */

	@Override
	public boolean remove(Object o) {
		if (has(o)) {
			delete(indexOf(o)); //Dica do marcio de abra�ar metodos
			return true;
		} else
			return false;
	}
	/*
	 * ficou bonitinho esse ne, fazemos uma validacao caso o objeto exista na nossa
	 * lista, caso sim, deleta reaproveitando o indexOf (ver abaixo como funciona)
	 * do objeto. e retorna true. Se nao retorna falso
	 */

	@Override
	public void reset() {
		this.lista = new Object[50];

	}

	/*
	 * Outro dos m�todos faceis, apenas retornamos uma novalista igual a que usamos
	 * como variavel e colocamos no objeto(this)
	 */
	@Override
	public boolean has(Object o) {
		boolean f = false;
		for (int x = 0; x < this.lista.length; x++) {
			if (this.lista[x] == o) {
				f = true;
				return f;
			}
		}
		return f;
	}
	/*
	 * Has, n�o achei uma forma de reaproveitar m�todos. Logo, usei um for para
	 * percorrer o vetor e, caso achar, retornar true Se nao retorna falso
	 */

	@Override
	public int indexOf(Object o) {
		if (has(o)) {
			for (int x = 0; x < this.lista.length; x++)
				if (this.lista[x] == o) {
					return x;
				}

		}
		return -1;
	}
}

/*
 * Mas ficou legal (acho kkkkk), claro que ficou imenso porque usei auto-indent,
 * mais valida��es. mais os coment�rios gigantes (eu era do Direito n�, certas
 * coisas n�o saem da gente), mas � isso!
 */
