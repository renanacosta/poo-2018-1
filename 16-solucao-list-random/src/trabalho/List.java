package trabalho;

public class List implements IList {

	private Object[] elementos = new Object[10];
	private int cont = 0;
	
	@Override
	public void append(Object o) {
		this.insert(o, cont);
	}

	@Override
	public void prepend(Object o) {
		this.insert(o, 0);
	}

	@Override
	public boolean insert(Object o, int index) {
		if (o == null) return false;
		if (index < 0) return false;
		if (index > cont) return false;
		if (cont < this.elementos.length + 2) grow();
		for (int i = cont - 1; i >= index; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[index] = o;
		cont++;
		return true;
	}
	
	private void grow() {
		Object[] novoVetor = new Object[this.elementos.length * 2];
		for (int i = 0; i < cont; i++) novoVetor[i] = elementos[i];
	}

	@Override
	public Object get(int index) {
		if (index < 0) return null;
		if (index >= this.cont) return null;
		return this.elementos[index];
	}

	@Override
	public Object getFirst() {
		return this.get(0);
	}
	
	@Override
	public Object getLast() {		
		return this.get(this.cont - 1);
	}
	
	@Override
	public Object getSample() {		
		return this.get((int) (Math.random() * cont));
	}

	@Override
	public Object drop(int index) {
		Object o = this.get(index);
		this.delete(index);
		return o;
	}

	@Override
	public boolean delete(int index) { // 5
		if (index < 0) return false;
		if (index >= this.cont) return false;
		for (int i = index; i < cont; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		cont--;
		return true;
	}

	@Override
	public boolean remove(Object o) {
		return this.delete(this.indexOf(o));		
	}

	@Override
	public void reset() {
		this.elementos = new Object[10];
		this.cont = 0;
	}

	@Override
	public int count() {
		return this.cont;
	}

	@Override
	public boolean has(Object o) {
		return this.indexOf(o) != -1;
	}

	@Override
	public boolean isEmpty() {		
		return this.count() == 0;
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i < cont; i++) {
			if (o.equals(this.elementos[i])) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
}