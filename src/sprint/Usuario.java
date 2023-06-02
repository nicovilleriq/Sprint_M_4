package sprint;

import java.util.Calendar;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * Clase Usuario
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 
 */

public class Usuario implements IAsesoria {
	
	// Variables de clase
	private String nombreUsuario; 
	private String fechaNacimientoUsuario;
	private int runUsuario;
	
	// Constructores
	public Usuario() {	}
	
	public Usuario(String nombreUsuario, String fechaNacimiento, int run) {
		this.setNombreUsuario(nombreUsuario);
		this.setFechaNacimientoUsuario(fechaNacimientoUsuario);
		this.setRunUsuario(run);
		
		this.nombreUsuario = this.getNombreUsuario();
		this.fechaNacimientoUsuario = this.getFechaNacimientoUsuario();
		this.runUsuario = this.getRunUsuario();
	}


	/**
	 * @param fechaNacimientoUsuario
	 * @return mensaje que indica la edad del usuario
	 */
	public String mostrarEdad(String fechaNacimientoUsuario) {
		Calendar hoy = Calendar.getInstance();
		int anoActual=hoy.get(Calendar.YEAR);	 
		int anoNacimiento = Integer.parseInt(fechaNacimientoUsuario.substring(6));
		String edad = "El usuario tiene: " + (anoActual - anoNacimiento)+ " años";
		return edad; 
	} 
	
	
	//Metodos setters y getters
	
	
	/**
	 * @return Nombre del usuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario Nombre del usuario
	 */
	public void setNombreUsuario(String nombreUsuario) {
		if (Validaciones.validaLargoCadena(nombreUsuario, 10, 50)) {
			this.nombreUsuario = nombreUsuario;
		}
	}

	/**
	 * @return Fecha de nacimiento del usuario
	 */
	public String getFechaNacimientoUsuario() {
		return fechaNacimientoUsuario;
	}

	public void setFechaNacimientoUsuario(String fechaNacimientoUsuario) {
		if (Validaciones.validaFecha(fechaNacimientoUsuario)) {
			this.fechaNacimientoUsuario = fechaNacimientoUsuario;
		}
	}

	public int getRunUsuario() {
		return runUsuario;
	}

	public void setRunUsuario(int runUsuario) {
		if (Validaciones.validaRut(runUsuario)) {
			this.runUsuario=runUsuario;
		}
	}
	
	// Métodos sobreescritos
	
	
	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", fechaNacimientoUsuario=" + fechaNacimientoUsuario + ", runUsuario=" + runUsuario + "]";
	}
	

	@Override
	public void analizarUsuario() {
		System.out.println("El nombre del usuario es: "+this.nombreUsuario);
		System.out.println("La fecha de nacimiento es: "+this.fechaNacimientoUsuario);
		System.out.println("El rut es: "+this.runUsuario);
		System.out.println("**********************************************");
	}

	@Override
	public int obtieneRutUsuario() {
		return this.getRunUsuario();
	}
}
