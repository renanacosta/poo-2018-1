package AbstractDataTypeseInterfaces;

import AbstractDataTypeseInterfaces.IKeyValue;

public class KeyValue implements IKeyValue {

	private String key[] = new String[0];
	private Integer[] value = new Integer[0];
	private boolean x = false;

	@Override
	public void put(String string, int index) {
		if (index >= 0) {
			for (int i = 0; i < key.length; i++)
				if (this.key[i] == string) {
					this.value[i] = index;
					x = true;
				}
			if (x == false) {
				String thisKey[] = this.key;
				this.key = new String[key.length + 1];
				this.key[key.length - 1] = string;
				Integer thisValue[] = this.value;
				this.value = new Integer[value.length + 1];
				this.value[value.length - 1] = index;
				for (int i = 0; i < key.length - 1; i++) {
					this.key[i] = thisKey[i];
					this.value[i] = thisValue[i];
				}
			}
		}
		x = false;
	}

	@Override
	public Integer get(String string) {
		for (int i = 0; i < key.length; i++)
			if (this.key[i] == string)
				return this.value[i];
		return null;
	}

	@Override
	public boolean hasKey(String string) {
		for (int i = 0; i < key.length; i++)
			if (this.key[i] == string)
				return true;
		return false;
	}

	@Override
	public String[] getKeys() {
		return this.key;
	}

	@Override
	public Integer[] getValues() {
		return this.value;
	}

	@Override
	public boolean deleteKey(String string) {
		for (int i = 0; i < key.length; i++) {
			if (key[i] == string) {
				del(i);
				return true;
			}
		}
		return false;
	}

	@Override
	public void clean() {
		for (int i = key.length - 1; i >= 0; i--)
			del(i);
	}

	private void del(int index) {
		String tempkey[] = key;
		Integer tempvalue[] = value;
		key = new String[key.length - 1];
		value = new Integer[value.length - 1];
		for (int i = 0; i < index; i++) {
			key[i] = tempkey[i];
			value[i] = tempvalue[i];
		}
		for (int i = index; i < key.length - 1; i++) {
			key[i] = tempkey[i++];
			value[i] = tempvalue[i++];
		}
	}
}