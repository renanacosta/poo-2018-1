package AbstractDataTypeseInterfaces;

public interface IKeyValue {

	void put(String string, int index);

	Integer get(String string);

	boolean hasKey(String string);

	String[] getKeys();

	Integer[] getValues();

	boolean deleteKey(String string);

	void clean();
}