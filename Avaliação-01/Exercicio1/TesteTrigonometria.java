public class TesteTrigonometria {

	public static void main(String[] args) {
		//Casos de Teste
		System.out.println(" Casos de Teste: ");
		double catetoOposto = 3.0;
		double catetoAdjacente = 4.0;
		System.out.println(" Hipotenusa ");
		double hipotenusa = Trigonometria.hipotenusa(catetoAdjacente, catetoOposto);
    System.out.println(hipotenusa == 5.0);		
		System.out.println(hipotenusa==5.0);
		System.out.println(Trigonometria.hipotenusa(7.0, 24.0) == 25.0);
		System.out.println(Trigonometria.hipotenusa(792.0, 214.0) == 820.4023403184561);
		System.out.println(Trigonometria.hipotenusa(24.0, 10.0) == 26);
		System.out.println(Trigonometria.hipotenusa(111.0, 500.0) == 512.1728223949412);
		System.out.println(Trigonometria.hipotenusa(10258.0, 10005.0) == 14329.22150711615);






	}

}

