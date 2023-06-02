package sprint;

public class Profesional extends Usuario {
	
	private String titulo;
	private String fechaIngreso;
	
	// Constructores
	public Profesional(String nombreUsuario, String fechaNacimiento, int rut,
			String titulo, String fechaIngreso) {
		super(nombreUsuario, fechaNacimiento, rut);
		
		this.setTitulo(titulo);
		this.setFechaIngreso(fechaIngreso);
		this.titulo = this.getTitulo();
		this.fechaIngreso = this.getFechaIngreso();
	}
	public Profesional() {}

	// Metodos getters y setters

	// Metodo titulo
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		if (Validaciones.validaLargoCadena(titulo, 10, 50)) {
		this.titulo = titulo;
		}
	}

	// Metodo fecha ingreso
	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		if (Validaciones.validaFecha(fechaIngreso)) {
		this.fechaIngreso = fechaIngreso;
		}
	}

	
	// Metodos sobreescritos
	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	@Override
	public void analizarUsuario() {
		
		super.analizarUsuario();
		
		System.out.println("Titulo: "+this.getTitulo());
		System.out.println("Fecha de Ingreso: "+this.getFechaIngreso());
		System.out.println("**********************************************");
	}
}
