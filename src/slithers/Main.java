package slithers;

public class Main {

	public static void main(String[] args) {
		Slither s1 = new Slither("adri");
		Slither s2 = new Slither("loli");
		
		s1.comer(Alimentos.VERDE);
		s1.comer(Alimentos.NARANJA);
		s1.comer(s2);
		s1.mostrarInfo();
		
		s2.comer(s1);
		s2.mostrarInfo();
		s1.mostrarInfo();
		
		Slither s3 = new Slither("ansu");
		s3.comer(Alimentos.VERDE);
		s3.comer(Alimentos.ROJO);
		s3.mostrarInfo();
		
		}

}