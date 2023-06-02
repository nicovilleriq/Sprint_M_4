package sprint;

public class Administrativo extends Usuario {

	private String area;
	private int aniosExperiencia;
	
	// Constructores
	public Administrativo(String nombreUsuario, String fechaNacimiento, int rut,
			String area, int aniosExperiencia) {
		super(nombreUsuario,fechaNacimiento,rut);
		
		this.setAniosExperiencia(aniosExperiencia);
		this.setArea(area);
		
		this.area = this.getArea();
		this.aniosExperiencia = this.getAniosExperiencia();
	}
	public Administrativo() {}

	// Métodos getters y setters
	
	// Metodo area
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		if (Validaciones.validaLargoCadena(area, 5, 20)) {
		this.area = area;
		}
	}

	// Metodo años de experiencia
	public int getAniosExperiencia() {
		return aniosExperiencia;
	}
	public void setAniosExperiencia(int aniosExperiencia) {
		if (aniosExperiencia<1 || aniosExperiencia>100) {
			System.out.println("Años de experiencia debe ser entre 1 y 100");
		} else { 
			this.aniosExperiencia = aniosExperiencia;
		}
	}
	
	// Métodos sobreescritos
	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", aniosExperiencia=" + aniosExperiencia + "]";
	}

	@Override
	public void analizarUsuario() {
		
		super.analizarUsuario();
		
		System.out.println("Area: "+this.getArea());
		System.out.println("Años experiencia: "+this.getAniosExperiencia());
		System.out.println("**********************************************");
	}	
}
