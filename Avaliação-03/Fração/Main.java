// Implementar operações com frações (0.8 pts)
public class Main {
	public static void main(String[] args) {

		System.out.println("==============================");
		System.out.println("            FRAÇÃO            ");
		System.out.println("==============================");

		Fracao f1 = new Fracao(3, 5);
System.out.println(f1.numerador == 3);
System.out.println(f1.denominador == 5);

// as seguintes duas linhas não devem compilar, comente-as
// f1.numerador = 1;
// f1.denominador = 1;

Fracao t1 = new Fracao(3, 5);
System.out.println(f1.equals(t1) == true);

Fracao f2 = new Fracao(1, 5);
System.out.println(f2.numerador == 1);
System.out.println(f2.denominador == 5);

System.out.println(f2.equals(t1) == false);

Fracao r1 = f1.add(f2);
System.out.println(r1.numerador == 4);
System.out.println(r1.denominador == 5);
System.out.println(f1.numerador == 3);
System.out.println(f1.denominador == 5);
System.out.println(f2.numerador == 1);
System.out.println(f2.denominador == 5);
// até aqui 0.2 pts

Fracao f3 = new Fracao(3, 7);
System.out.println(f3.numerador == 3);
System.out.println(f3.denominador == 7);

Fracao r2 = f2.add(f3);
System.out.println(r2.numerador == 22);
System.out.println(r2.denominador == 35);
System.out.println(f2.numerador == 1);
System.out.println(f2.denominador == 5);
System.out.println(f3.numerador == 3);
System.out.println(f3.denominador == 7);
// até aqui 0.4 pts

Fracao r3 = r1.sub(r2);
System.out.println(r3.numerador == 6);
System.out.println(r3.denominador == 35);

Fracao r4 = r1.mult(r2);
System.out.println(r4.numerador == 88);
System.out.println(r4.denominador == 175);

Fracao r5 = r2.div(r1);
System.out.println(r5.numerador == 110);
System.out.println(r5.denominador == 140);

Fracao r6 = f1.inv(); // inversa
System.out.println(r6.numerador == 5);
System.out.println(r6.denominador == 3);

Fracao f4 = new Fracao(); // valor padrão: 0/1
System.out.println(f4.numerador == 0);
System.out.println(f4.denominador == 1);
System.out.println(f4.add(f4).numerador == 0);
System.out.println(f4.add(f4).denominador == 1);

Fracao f5 = new Fracao(1, 2);
System.out.println(f5.numerador == 1);
System.out.println(f5.denominador == 2);
System.out.println(f5.mult(f5).numerador == 1);
System.out.println(f5.mult(f5).denominador == 4);
// garantindo que não há efeitos colaterais:
System.out.println(f5.numerador == 1);
System.out.println(f5.denominador == 2);
//
System.out.println(f5.mult(f5.mult(f5)).denominador == 8);
// até aqui 0.6 pts

Fracao f6 = new Fracao(1, 2);
System.out.println(f6.numerador == 1);
System.out.println(f6.denominador == 2);

Fracao r7 = f6.add(1);
System.out.println(r7.numerador == 3);
System.out.println(r7.denominador == 2);

Fracao r8 = f6.add(1);
System.out.println(r8.numerador == 3);
System.out.println(r8.denominador == 2);
// até aqui 0.8 pts

// como desafio, considere fazer: sub, mult, div e simplifica
// com misto de fração/inteiro e inteiro/fração
// é por "diversão" (quero dizer, para aprender!)
		System.out.println("***********************************");
		System.out.println("          Fim do programa          ");
		System.out.println("***********************************");
	}

}
