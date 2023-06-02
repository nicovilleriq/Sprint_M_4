package sprint;

public class Capacitacion {
	
	// Variables de clase (atributos)
	private int identificador;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String duracion;
	private int cantidadAsistentes;
	
	// Metodos Constructores
	public Capacitacion(int identificador,
			int rutCliente,
			String dia,
			String hora,
			String lugar,
			String duracion,
			int cantidadAsistentes) {
		
		this.setIdentificador(identificador);
		this.setRutCliente(rutCliente);
		this.setDia(dia);
		this.setHora(hora);
		this.setLugar(lugar);
		this.setDuracion(duracion);
		this.setCantidadAsistentes(cantidadAsistentes);
		
		this.identificador = this.getIdentificador();
		this.rutCliente = this.getRutCliente();
		this.dia = this.getDia();
		this.hora = this.getHora();
		this.lugar = this.getLugar();
		this.duracion = this.getDuracion();
		this.cantidadAsistentes = this.getCantidadAsistentes();
	}
	public Capacitacion() {	}

	//Metodos de la clase
	public String mostrarDetalle(String lugar,
			String hora,
			String dia,
			int duracion) {
		
		String mensaje= "La capacitación será en "+lugar
				+ " a las "+hora
				+ " del dia "+dia
				+ " y durará "+duracion+" minutos";
		
		return mensaje;
	}
	
	// Metodos getters y setters
	
	// Metodos Identificador
	public int getIdentificador() {
		return this.identificador;
	}
	
	public void setIdentificador(int identificador) {
		if (identificador==0) {
			System.out.println("Este dato es obligatorio");
		}else {
			this.identificador = identificador;
		}
	}
	// Fin Metodos Identificador
	
	// Metodos RutCliente
	public int getRutCliente() {
		return this.rutCliente;
	}
	
	public void setRutCliente(int rutCliente) {
		if (Validaciones.validaRut(rutCliente)) {
			this.rutCliente = rutCliente;
		}
	}
	// Fin Metodos RutCliente
	
	// Metodo Dia
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		if (Validaciones.validaDia(dia)) {
			this.dia=dia.toUpperCase();
		}
	}
	// Metodo Dia
	
	// Metodo Hora
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		if (Validaciones.validaHora(hora)) {
			this.hora = hora;
		}
	}
	// Metodo Hora
	
	// Metodo Lugar
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		if (Validaciones.validaLargoCadena(lugar,10,50)) {
			this.lugar = lugar;
		}
	}
	// Fin Metodo Lugar
	
	// Metodo duracion
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		if (Validaciones.validaDuracion(duracion)) {
			this.duracion = duracion;
		}
	}
	// Fin Metodo duracion
	
	// Metodo Cantidad de asistentes
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}
	public void setCantidadAsistentes(int cantidadAsistentes) {
		if (Validaciones.validaCantidadAsistentes(cantidadAsistentes)) {
			this.cantidadAsistentes = cantidadAsistentes;
		}
	}
	// Fin Metodo Cantidad de asistentes
	
	
	// Metodos sobreescritos
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadAsistentes="
				+ cantidadAsistentes + "]";
	}	
}
