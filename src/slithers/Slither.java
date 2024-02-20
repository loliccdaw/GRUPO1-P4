package slithers;

public class Slither {

	//atributos
	private int slither[];
	private Alimentos alimento;
	
	//constructor
	public Slither( ) {
		this.slither = new int[5];
		
	}

	//get y set
	public int[] getSlither() {
		return this.slither;
	}

	public void setSlither(int[] slither) {
		this.slither = slither;
	}

	public String getAlimento() {
		return this.alimento.toString();
	}

	public void setAlimento(String alimento) {
		this.alimento = Alimentos.valueOf(alimento);
	}
	// metodos
	
	
	
}
