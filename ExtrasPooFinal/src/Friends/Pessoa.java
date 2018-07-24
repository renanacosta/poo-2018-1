package Friends;

public class Pessoa {
	private String nome;
	private IList amigos = new List();

	public Pessoa(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public IList getamigos() {
		return amigos;
	}

	public int getContadorDeAmigos() {
		return this.getamigos().count();
	}

	public void adicionaAmigo(Pessoa pessoa) {
		if (this.equals(pessoa))
			return;
		if (this.getamigos().has(pessoa))
			return;
		if (pessoa.getamigos().has(this))
			return;
		this.getamigos().append(pessoa);
		pessoa.getamigos().append(this);

	}

	public Object[] getAmigos() {
		Object[] o = new Object[this.getamigos().count()];
		return o;
	}

	public Pessoa getAmigo(int i) {
		return (Pessoa) this.getamigos().get(i);
	}

	@Override
	public int hashCode() {
		return this.getNome().hashCode();
	}

	public boolean equals(Pessoa p) {
		return p.hashCode() == this.hashCode();
	}

	public void removeAmigo(Pessoa p) {
		if (!p.getamigos().has(this))
			return;
		if (!this.getamigos().has(p))
			return;
		p.getamigos().remove(this);
		this.getamigos().remove(p);
	}

	public String toString() {
		return this.hashCode() + "";
	}

	public void removeAmigo(int i) {
		this.getamigos().drop(i);

	}

}
