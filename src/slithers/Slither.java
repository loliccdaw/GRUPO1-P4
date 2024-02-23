package slithers;

public class Slither {

	// atributos
	private String nombre;
	private int tamano;
	private Alimentos alimento;
	private String ultimoComido;

	// constructor
	public Slither(String nombre) {
		this.nombre = nombre;
		this.tamano = 5;

	}

	// get y set

	public int getTamano() {
		return this.tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getAlimento() {
		return this.alimento.toString();
	}

	public void setAlimento(String alimento) {
		this.alimento = Alimentos.valueOf(alimento);
	}

	public Object getUltimoComido() {
		return this.ultimoComido;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getnombre() {
		return this.nombre;
	}

	/*public void setUltimoComido(String ultimoComido) {
		this.ultimoComido = ultimoComido;
	}*/

	// metodos
	public void comer(Alimentos alimento) {
		switch (alimento) {
		case ROJO:
			this.tamano = this.tamano + (2 - 1);
			break;
		case NARANJA:
			this.tamano = this.tamano + (5 - 1);
			break;
		case VERDE:
			this.tamano = this.tamano + (10 - 1);
			break;
		default:
		}
		this.ultimoComido = alimento.toString();
	}

	public void comer(Slither slither) {
		if (this.tamano >= slither.getTamano()) {
			this.tamano = this.tamano + slither.getTamano();
			this.ultimoComido = slither.nombre;
		} else {
			slither.comer(this);
			this.tamano = 1;
		}
	}

	public void mostrarInfo() {
		System.out.println("Nombre: " + this.nombre + " Tamaño: " + this.tamano + " Ultimo comido: " + this.ultimoComido);

	}

	public void dibujarSlither() {
		System.out.println("            @");

		int espacios = 12;

		for (int i = 1; i < this.tamano; i++) {
			int serpenteo = (int) ((Math.random() * 3) - 1);
			espacios = espacios + serpenteo;
			for (int j = 0; j < espacios; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}
