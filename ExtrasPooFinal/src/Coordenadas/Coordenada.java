package Coordenadas;

public class Coordenada {
	final double latitude;
	final double longitude;

	Coordenada() {
		this.latitude = 0;
		this.longitude = 0;
	}

	Coordenada(double latitude, double longitude) {
		if ((latitude < -90) || (latitude > 90))
			throw new IllegalArgumentException("ERRO - Latitude inválida!!!");
		if ((longitude < -180) || (longitude > 180))
			throw new IllegalArgumentException("ERRO - Longitude inválida!!!");
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public double latitude() {
		return latitude;
	}

	public double longitude() {
		return longitude;
	}

	Coordenada leste(double leste) {
		if ((this.longitude + leste == 180) || (this.longitude + leste == 0) || (this.longitude + leste == -180))
			return new Coordenada(this.latitude, this.longitude + leste);
		else
			return new Coordenada(this.latitude, (this.longitude + leste) % 180);
	}

	Coordenada oeste(double oeste) {
		if ((this.longitude - oeste == 180) || (this.longitude - oeste == 0) || (this.longitude - oeste == -180))
			return new Coordenada(this.latitude, this.longitude - oeste);
		else
			return new Coordenada(this.latitude, (this.longitude - oeste) % 180);
	}

	Coordenada norte(double norte) {
		if ((this.latitude + norte == 90) || (this.latitude + norte == 0) || (this.latitude + norte == -90))
			return new Coordenada(this.latitude + norte, this.longitude);
		else
			return new Coordenada((this.latitude + norte) % 90, this.longitude);
	}

	Coordenada sul(double sul) {
		if ((this.latitude - sul == 90) || (this.latitude - sul == 0) || (this.latitude - sul == -90))
			return new Coordenada(this.latitude - sul, this.longitude);
		else
			return new Coordenada((this.latitude - sul) % 90, this.longitude);
	}

	public boolean noEquador() {
		if (this.latitude == 0)
			return true;
		else
			return false;
	}

	public boolean noMeridiano() {
		if ((this.longitude == -180) || (this.longitude == 0) || (this.longitude == 180))
			return true;
		else
			return false;
	}

	public boolean noSul() {
		if (this.latitude < 0)
			return true;
		else
			return false;
	}

	public boolean noNorte() {
		if (this.latitude > 0)
			return true;
		else
			return false;
	}

	public boolean noOcidente() {
		if (this.longitude < 0)
			return true;
		else
			return false;
	}

	public boolean noOriente() {
		if (this.longitude > 0)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		int intLongitude = (int) longitude;
		if (intLongitude != longitude)
			return latitude + "°, " + longitude + "°";
		else
			return latitude + "000000°, " + longitude + "000000°";
	}

	public String googleMaps() {
		return "https://www.google.com.br/maps/@" + this.latitude + "," + this.longitude + ",10z?hl=pt-BR";
	}

}
