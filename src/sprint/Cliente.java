package sprint;

/*
 * Por acuerdo con el profesor se elimina el atributo rut
 * porque este ya existe en la clase padre Usuario 
 */

public class Cliente extends Usuario{

	private int rutCliente;
	private String nombres;
	private String apellidos;
	private String telefonos;
	private String afp;
	private int sistemaSalud;
	private String direccion;
	private String comuna;
	private byte edad;
	
	// Constructores
	
	public Cliente(int rutCliente, String nombreUsuario, String fechaNacimiento,
			String nombres, String apellidos,String telefonos, String afp,
			int sistemaSalud, String direccion, String comuna, byte edad) {
		
		super(nombreUsuario, fechaNacimiento, rutCliente);
		
		this.rutCliente=rutCliente;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefonos = telefonos;
		this.afp = afp;
		this.sistemaSalud = sistemaSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public Cliente() {}
	
	//Metodos de la clase
	public String obtenerSistemaSalud(int sistemaSalud) {
		String sisSalud="";
		switch (sistemaSalud) {
			case 1:
				sisSalud="FONASA";
		break;
			case 2:
				sisSalud="ISAPRE";
				break;
		default:
			sisSalud="Sin Sistema de salud";
		}
		return "Sus sistema de salud es: "+sisSalud;
	}
	
	public String obtenerNombre(String nombres, String apellidos) {
		String nombreCompleto = nombres + " "+ apellidos; 
		return nombreCompleto; 
	}
	
	// Metodos getters y setters
	
	// Metodo rut del cliente
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
		if (Validaciones.validaRut(rutCliente)){
			this.rutCliente=rutCliente;
		}
	}
	
	// Metodo nombres
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		if (Validaciones.validaLargoCadena(nombres, 5, 30)) {
			this.nombres = nombres;
		}
	}
	
	// Metodo apellidos
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		if (Validaciones.validaLargoCadena(apellidos, 5, 30)) {
			this.apellidos = apellidos;
		}
	}
	
	// Metodo telefono
	public String getTelefonos() {
		return telefonos;
	}

	// Metodo telefono
	public void setTelefonos(String telefonos) {
		if (telefonos.length()!=0) {
			this.telefonos = telefonos;
		} else {
			System.out.println("El dato telefono es obligatorio");
		}
	}

	// Metodo AFP
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		if (Validaciones.validaLargoCadena(afp, 4, 30)) {
			this.afp = afp;
		}
	}

	// Metodo sistema de salud
	public int getSistemaSalud() {
		return sistemaSalud;
	}
	public void setSistemaSalud(int sistemaSalud) {
		if (sistemaSalud==1 || sistemaSalud==2) {
			this.sistemaSalud = sistemaSalud;
		}else {
			System.out.println("Sistema de salud debe ser 1=Fonasa o 2=Isapre");
		}
	}
	
	// Metodo direccion
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		if (Validaciones.validaLargoCadena(direccion, 0, 70)) {
			this.direccion = direccion;
		}
	}

	// Metodo comuna
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		if (Validaciones.validaLargoCadena(comuna, 0, 50)) {
			this.comuna = comuna;
		}
	}

	// Metodo edad
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		if (edad<0 || edad>150) {
			System.out.println("Error en edad, debe ser entre 0 uy 150");
		} else {
			this.edad = edad;
		}
	}

	
	// Métodos sobreescritos
	@Override
	public String toString() {
		return "Clientes [rutCliente=" + rutCliente +
				", Nombres=" + nombres + 
				", apellidos=" + apellidos + 
				", telefonos=" + telefonos + 
				", afp=" + afp + 
				", sistemaSalud=" + sistemaSalud + 
				", direccion=" + direccion + 
				", comuna=" + comuna + 
				", edad=" + edad + "]";
	}
	
	@Override
	public void analizarUsuario() {
		
		super.analizarUsuario();

		System.out.println("Rut Cliente: "+this.getRutCliente());
		System.out.println("Nombres: "+this.getNombres());
		System.out.println("Apellidos: "+this.getApellidos());
		System.out.println("Telefonos: "+this.getTelefonos());
		System.out.println("AFP: "+this.getAfp());
		System.out.println("Sistema Salud: "+this.getSistemaSalud());
		System.out.println("Direccion: "+this.getDireccion());
		System.out.println("Comuna: "+this.getComuna());
		System.out.println("Edad: "+this.getEdad());
		System.out.println("**********************************************");
	}
}
