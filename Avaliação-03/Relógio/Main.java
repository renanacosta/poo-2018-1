// Implementar uma classe para gerar objetos que representem
// Tempo e suas operações. (0.6 pts)
class Main {
	public static void main(String[] args) {

		System.out.println("==============================");
		System.out.println("     SAVE THE CLOCK TOWER     ");
		System.out.println("==============================");

		Time t1 = new Time();
		System.out.println(t1.toString().equals("00:00:00"));
		Time t2 = new Time(1, 40, 5);
		System.out.println(t2.toString().equals("01:40:05"));
		t1.plus(t2);
		System.out.println(t1.toString().equals("01:40:05"));
		System.out.println(t1.hours() == 1);
		System.out.println(t1.minutes() == 40);
		System.out.println(t1.seconds() == 05);
		t1.plus(t2);
		System.out.println(t1.toString().equals("03:20:10"));
		System.out.println(t1.hours() == 3);
		System.out.println(t1.minutes() == 20);
		System.out.println(t1.seconds() == 10);

		System.out.println(t2.hours() == 1);
		System.out.println(t2.minutes() == 40);
		System.out.println(t2.seconds() == 05);
		t2.plusHours(1);
		System.out.println(t2.toString().equals("02:40:05"));
		t2.plusMinutes(10);
		System.out.println(t2.toString().equals("02:50:05"));
		t2.plusSeconds(10);
		System.out.println(t2.toString().equals("02:50:15"));
		System.out.println(t2.hours() == 2);
		System.out.println(t2.minutes() == 50);
		System.out.println(t2.seconds() == 15);
		// até aqui 0.2

		Time t3 = new Time(t2);
		t3.plusHours(20);
		System.out.println(t3.hours() == 22);
		System.out.println(t3.minutes() == 50);
		System.out.println(t3.seconds() == 15);

		t3.plusHours(6);
		System.out.println(t3.toString().equals("04:50:15"));
		t3.plusMinutes(20);
		System.out.println(t3.toString().equals("05:10:15"));
		t3.plusSeconds(50);
		System.out.println(t3.toString().equals("05:11:05"));

		Time t4 = new Time(t3);
		System.out.println(t4.hours() == 5);
		System.out.println(t4.minutes() == 11);
		System.out.println(t4.seconds() == 5);

		t4.shift(); // inverte o turno +12/-12h
		System.out.println(t4.hours() == 17);
		System.out.println(t4.minutes() == 11);
		System.out.println(t4.seconds() == 5);

		t4.tick();
		System.out.println(t4.hours() == 17);
		System.out.println(t4.minutes() == 11);
		System.out.println(t4.seconds() == 6);

		t4.plusSeconds(53);
		System.out.println(t4.toString().equals("17:11:59"));
		t4.tick();
		System.out.println(t4.toString().equals("17:12:00"));
		// até aqui 0.4

		Time t5 = new Time(17, 12, 0);
		System.out.println(t4.equals(t5) == true);
		t5.tick();
		System.out.println(t4.equals(t5) == false);
		System.out.println(new Time().equals(new Time()) == true);
		// até aqui 0.6

		System.out.println("==============================");
		System.out.println("        GREAT SCOTT !!!       ");
		System.out.println("==============================");

	}
}

//====>>> https://www.youtube.com/watch?v=nSlUoUuVktw
