class Time {
	private int segundos;

// INICIAR CLOCK EM ZERO;
	Time() {
}

	Time(Time clock) {
		clock.segundos = segundosTotal(clock.hours(), clock.minutes(), clock.seconds());
	}

	Time(int horas, int minutos, int segundos) {
		segundosTotal(horas, minutos, segundos);
	}

	void plus(Time clock) {
		this.segundos += segundosTotal(clock.hours(), clock.minutes(), clock.seconds());
	}

	void plusHours(int clock) {
		this.segundos  += (this.segundos + clock * 3600 > 86400) ?
		-86400 + clock * 3600 : clock * 3600;
	}

	void plusMinutes(int clock) {
		this.segundos += clock * 60;
	}

	void plusSeconds(int clock) {
		this.segundos += clock % 60;
	}

	//TROCA TURNO (12HRS)
	void shift() {
		this.segundos  += (this.segundos > 43200) ? -43200 : 43200;
	}

// AUMENTA 1 SEGUNDO;
	void tick() {
		this.segundos += 1;
	}

	public int segundosTotal(int hora, int minuto, int segundo) {
		return this.segundos = (hora * 3600) + (minuto * 60) + segundo;
	}

	public int hours() {
	return this.segundos / 3600;
	}

	public int minutes() {
		return this.segundos % 3600 / 60;
	}

	public int seconds() {
		return this.segundos % 60;
	}

	//COMPARATIVO DE IGUALDADE ENTRE this.segundos == clock.segundos (TRUE);
	public boolean equals(Time clock) {
		return this.segundos == clock.segundos;
	}

	@Override
	public String toString() {
		return
				((hours() < 10) ? "0" : "") + hours() + ":" +
				((minutes() < 10) ? "0" : "") + minutes() + ":" +
				((seconds() < 10) ? "0" : "") + seconds();
	}

}
