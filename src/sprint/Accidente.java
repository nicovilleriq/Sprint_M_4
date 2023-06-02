package sprint;

public class Accidente {
	// variables de la clase (Atributos)
	private int identificador;
	private int rutCliente;
	private String fecha;
	private String hora;
	private String lugar;
	private String origen;
	private String consecuencias;
	
	// Constructores
	public Accidente() {}

	public Accidente(int identificador, int rutCliente, String fecha, String hora, String lugar, String origen,
			String consecuencias) {
		this.setIdentificador(identificador);
		this.setRutCliente(rutCliente);
		this.setFecha(fecha);
		this.setHora(hora);
		this.setLugar(lugar);
		this.setOrigen(origen);
		this.setConsecuencias(consecuencias);
		
		this.identificador = this.getIdentificador();
		this.rutCliente = this.getRutCliente();
		this.fecha = this.getFecha();
		this.hora = this.getHora();
		this.lugar = this.getLugar();
		this.origen = this.getOrigen();
		this.consecuencias = this.getConsecuencias();
	}
	
	// Metodos getters y setters
	
	// Metodo identificador
	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		if (identificador==0) {
			System.out.println("Este dato es obligatorio");
		}else {
			this.identificador = identificador;
		}
	}

	// Metodo rut clientes
	public int getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(int rutCliente) {
		if (Validaciones.validaRut(rutCliente)){
			this.rutCliente = rutCliente;
		}
	}

	// Metodo fecha
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		if (Validaciones.validaFecha(fecha)) {
			this.fecha = fecha;
		}
	}
	
	// Metodo hora
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		if (Validaciones.validaHora(hora)) {
			this.hora = hora;
		}
	}
	
	// Metodo lugar
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		if (Validaciones.validaLargoCadena(lugar, 10, 50)) {
			this.lugar = lugar;
		}
	}

	// Metodo origen
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		if (Validaciones.validaLargoCadena(origen, 0, 100)) {
			this.origen = origen;
		}
	}
	
	// Metodo consecuencia
	public String getConsecuencias() {
		return consecuencias;
	}
	public void setConsecuencias(String consecuencias) {
		if (Validaciones.validaLargoCadena(consecuencias, 0, 100)) {
			this.consecuencias = consecuencias;
		}
	}

	// Metodos sobreescritos
	@Override
	public String toString() {
		return "Accidente [identificador=" + identificador + ", rutCliente=" + rutCliente + ", fecha=" + fecha
				+ ", hora=" + hora + ", lugar=" + lugar + ", origen=" + origen + ", consecuencias=" + consecuencias
				+ "]";
	}
}
