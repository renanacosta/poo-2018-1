
public class List implements IList {
	
	private Object[] Objs = new Object[10];
	private int cont = 0;
	
	@Override
	public void append(Object o) {
		
		if(o == null) return;
		
		Objs[cont] = o;
		cont ++;
	
	}

	@Override
	public void prepend(Object o) {
						
		for (int i = cont-1; i > cont; i--) {
			Objs[i+1] = Objs[i];
		}
		Objs[0] = o;
		cont ++;
		
	}

	@Override
	public boolean insert(Object o, int index) {
		
		int i = 0;
		
		if(index < cont) {
			for (i = cont-1; i > index; i--) {
				Objs[i+1] = Objs[i];
			}
		
			Objs[index] = o;
			cont++;
			
			return true;
		}
		
		return false;
	}

	@Override
	public Object get(int index) {
		// Se o valor de index for menor que o cont, retorna o valor de index,
		if(index < cont && index <= 0) {
			return Objs[index];
		}
		return null; // se não, ele retorna nulo.
	}

	@Override
	public Object getFirst() {
		
		if (cont > 0) {
			return Objs[0];
		}
		return null;
	}

	@Override
	public Object getLast() {
		
		if (cont > 0) {
			return Objs[cont - 1];
		}

		return null;
	}

	@Override
	public Object getSample() {
		
		this.get((int)(Math.random() * cont + 1));
		if (cont == 0) {
			return Objs[0];
		}
		return null;
	}
	

	@Override
	public Object drop(int index) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public boolean delete(int index) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean has(Object o) {
		return this.indexOf(o) !=-1;
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int indexOf(Object o) {
		for (int i = 0; i)
		return 0;
	}

}
