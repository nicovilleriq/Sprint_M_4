package sprint;

public class Revision {
	
	// variables de la clase (Atributos)
	private int idRevision;
	private int idVisita;
	private String nombreRevision;
	private String detalle;
	private int estado;
	
	// Constructores
	public Revision() {}

	public Revision(int idRevision, 
			int idVisita, 
			String nombreRevision, 
			String detalle, 
			int estado) {
		
		this.setIdRevision(idRevision);
		this.setIdVisita(idVisita);
		this.setNombreRevision(nombreRevision);
		this.setDetalle(detalle);
		this.setEstado(estado);
		
		this.idRevision = this.getIdRevision();
		this.idVisita = this.getIdVisita();
		this.nombreRevision = this.getNombreRevision();
		this.detalle = this.getDetalle();
		this.estado = this.getEstado();
	}
	
	// Metodos getters y setters
	
	// Metodo identificador revision
	public int getIdRevision() {
		return idRevision;
	}
	public void setIdRevision(int idRevision) {
		if (idRevision==0) {
			System.out.println("Este dato es obligatorio");
		}else {
			this.idRevision = idRevision;
		}
	}

	// Metodo rut identificador visita
	public int getIdVisita() {
		return idVisita;
	}
	public void setIdVisita(int idVisita) {
			if (idVisita==0) {
				System.out.println("Este dato es obligatorio");
			}else {
				this.idVisita = idVisita;
			}
	}

	// Metodo nombre de la revision
	public String getNombreRevision() {
		return nombreRevision;
	}
	public void setNombreRevision(String nombreRevision) {
		if (Validaciones.validaLargoCadena(nombreRevision, 10, 50)) {
			this.nombreRevision = nombreRevision;
		}
	}
	
	// Metodo detalle
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		if (Validaciones.validaLargoCadena(detalle, 0, 100)) {
			this.detalle = detalle;
		}
	}
	
	// Metodo estado
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		if (estado<1 || estado>3) {
			System.out.println("El estado puede ser 1, 2, 3");
		}else {
			this.estado = estado;
		}
	}

	// Metodos sobreescritos
	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisita=" + idVisita + ", nombreRevision=" + nombreRevision
				+ ", detalle=" + detalle + ", estado=" + estado + "]";
	}
}
