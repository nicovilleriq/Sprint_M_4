package sprint;

public class VisitaTerreno {
	// variables de la clase (Atributos)
	private int identificador;
	private int rutCliente;
	private String dia;
	private String hora;
	private String lugar;
	private String comentarios;
	
	// Constructores
	public VisitaTerreno() {}

	public VisitaTerreno(int identificador, 
			int rutCliente, 
			String dia, 
			String hora, 
			String lugar, 
			String comentarios) {
		
		this.setIdentificador(identificador);
		this.setRutCliente(rutCliente);
		this.setDia(dia);
		this.setHora(hora);
		this.setLugar(lugar);
		this.setComentarios(comentarios);
		
		this.identificador = this.getIdentificador();
		this.rutCliente = this.getRutCliente();
		this.dia = this.getDia();
		this.hora = this.getHora();
		this.lugar = this.getLugar();
		this.comentarios = this.getComentarios();
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

	// Metodo dia
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		if (Validaciones.validaDia(dia)) {
			this.dia = dia;
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

	// Metodo comentarios
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		if (Validaciones.validaLargoCadena(comentarios, 0, 100)) {
			this.comentarios = comentarios;
		}
	}
	
	// Metodos sobreescritos
	@Override
	public String toString() {
		return "Accidente [identificador=" + identificador + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", comentarios=" + comentarios + "]";
	}

}
