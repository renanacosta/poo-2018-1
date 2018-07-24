package Randomizer;

public interface Randomizer {
	  /**
	   * Gera um número aleatório onde 0 =< número < 1.0
	   *
	   * @return double entre 0 (inclusive) e 1 (exclusivo)
	   */
	    public double random();
	 
	    /**
	     * Gera um número aleatório inteiro de 0 (inclusive) até max (inclusive)
	     *
	     * @param max inteiro não negativo representando o maior inteiro possível
	     * @return double entre 0 (inclusive) e max (inclusivo)
	     */
	    public int randomInt(int max);
	 
	    /**
	     * Gera um número aleatório inteiro de min (inclusive) até max (inclusive)
	     *
	     * @param min inteiro não negativo representando o menor inteiro possível
	     * @param max inteiro não negativo representando o maior inteiro possível
	     * @return double entre min (inclusive) e max (exclusivo)
	     */
	    public int randomInt(int min, int max);
	    
	}

