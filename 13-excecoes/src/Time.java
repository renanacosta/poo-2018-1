 class Time {

  int time;

  Time() {
  }

  Time(int hor, int min, int seg) {
	  if (hor < 0) {
		  throw new IllegalArgumentException(
			"A hora " + hor + " não é válida (negativa). Entre com uma hora maior ou igual a 0"
		  );
	  }
    this.time = ( hor * 3600 ) + ( min * 60 ) + ( seg );// aqui contrutor de time com tres atributo
  }

  Time( Time nn ) {
    this.time = nn.time;
  }

  int hours() {
    int horas = (time / 3600) % 24;
    return horas;
  }

  int minutes() {
    int temp = time % 3600;
    int minutos = ( temp / 60 ) % 60;
    return minutos;
  }

  int seconds() {
    int temp = time % 60 ;
    int segundos = temp;
    return segundos;
  }

  void plus( Time tr ) {
    this.time += tr.time;
  }

  void plusHours(int hours){
    this.time += (hours * 3600);
  }

  void plusMinutes(int minutes){
    this.time += (minutes * 60);
  }

  void plusSeconds(int seconds){
    this.time += (seconds);
  }

  void shift() {
     plusHours(12);
  }

  void tick() {
    plusSeconds(1);
  }

  @Override
    public String toString() {
      String res = "";
      return res = (hours() < 10 ? "0" : "") + hours() + ":" + (minutes() < 10 ? "0" : "")
       + minutes() + ":" + (seconds() < 10 ? "0" : "") + seconds();
    }

    public boolean equals( Time ff ) {
      return this.hours() == ff.hours() && this.minutes() == ff.minutes()
       && this.seconds() == ff.seconds();
    }
}
