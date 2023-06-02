package sprint;

import java.util.Scanner;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * Clase principal con selector de opciones
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 
 */

public class Principal {
	static Scanner sc = new Scanner(System.in);
	static Contenedor contenedor = new Contenedor();
	static Usuario usuario = new Usuario();
	static Cliente cliente = new Cliente();
	static Profesional profesional = new Profesional();
	static Administrativo administrativo = new Administrativo();
	static Capacitacion capacitacion = new Capacitacion();
	
	public static void main(String[] args) {
		int opcion=0;
		pideUsuario();
		do {
				System.out.println("Menu de Opciones");
				System.out.println("1. Ingreso de Cliente");
				System.out.println("2. Ingreso de Profesional");
				System.out.println("3. Ingreso de Administrativo");
				System.out.println("4. Ingreso de Capacitación");
				System.out.println("5. Eliminar Usuario");
				System.out.println("6. Listar Usuarios");
				System.out.println("7. Listar Usuario");
				System.out.println("8. Listar Capacitaciones");
				System.out.println("0. Salir");
				System.out.println("");
				
				System.out.println("Elija su opción: ");
				opcion=sc.nextInt();
				sc.nextLine();
				
				switch (opcion){
					case 1:
						opcion1();
						break;
					case 2:
						opcion2();
						break;
					case 3:
						opcion3();
						break;
					case 4:
						opcion4();
						break;
					case 5:
						opcion5();
						break;
					case 6:
						System.out.println("***   Lista de usuarios   ***");
						contenedor.listarUsuarios();
						System.out.println("*** Fin lista de usuarios ***");
						System.out.println("");
						break;
					case 7:
						opcion7();
						break;
					case 8:
						System.out.println("***   Lista capacitacion   ***");
						contenedor.listarCapacitaciones();
						System.out.println("*** Fin lista capacitacion ***");
						System.out.println("");
						break;
					case 0:
						System.out.println();
						break;
					default:
						System.out.println("*******************************");
						System.out.println("Opcion Erronea intente otra vez");
						System.out.println("*******************************");
				}
		}while (opcion!=0);
		System.out.println("Fin de la aplicación");
	}
	
	private static void pideUsuario() {
		
		System.out.println("*** Ingreso de Usuario ***");
		System.out.println("");
		// Pide rut
		while (usuario.getRunUsuario()==0) {
			System.out.println("Ingrese rut usuario: ");
			int dato = sc.nextInt();
			sc.nextLine();
			usuario.setRunUsuario(dato);
		}
		// Pide nombre Usuario
		while (usuario.getNombreUsuario()==null) {
			System.out.println("Ingrese nombre Usuario: ");
			usuario.setNombreUsuario(sc.nextLine());
		}
		// Pide nombre Usuario
		while (usuario.getFechaNacimientoUsuario()==null) {
			System.out.println("Ingrese fecha Nacimiento (DD/MM/AAAA): ");
			usuario.setFechaNacimientoUsuario(sc.nextLine());
		}
		
	}

	private static void opcion1 () {
		int dato;
		String respuesta="N";
		
		System.out.println("*** Ingreso de Cliente ***");
		System.out.println("");
		// Pide rut cliente
		while (cliente.getRutCliente()==0) {
			System.out.println("Rut cliente: ");
			dato = sc.nextInt();
			sc.nextLine();
			cliente.setRutCliente(dato);
		}
		// Pide nombres
		while (cliente.getNombres()==null) {
			System.out.println("Nombres: ");
			cliente.setNombres(sc.nextLine());
		}
		// Pide apellidos
		while (cliente.getApellidos()==null) {
			System.out.println("Apellidos: ");
			cliente.setApellidos(sc.nextLine());
		}
		// Pide telefonos
		while (cliente.getTelefonos()==null) {
			System.out.println("Telefonos: ");
			cliente.setTelefonos(sc.nextLine());
		}
		// Pide afp
		while (cliente.getAfp()==null) {
			System.out.println("Nombre AFP: ");
			cliente.setAfp(sc.nextLine());
		}
		// Pide sistema salud
		while (cliente.getSistemaSalud()==0) {
			System.out.println("Sistema salud (1=FONASA, 2=ISAPRE: ");
			dato = sc.nextInt();
			sc.nextLine();
			cliente.setSistemaSalud(dato);
		}
		// Pide direccion
		while (cliente.getDireccion()==null) {
			System.out.println("Dirección: ");
			cliente.setDireccion(sc.nextLine());
		}
		// Pide comuna
		while (cliente.getComuna()==null) {
			System.out.println("Comuna: ");
			cliente.setComuna(sc.nextLine());
		}
		// Pide edad
		while (cliente.getEdad()==0) {
			System.out.println("Edad: ");
			dato = sc.nextInt();
			sc.nextLine();
			cliente.setEdad((byte)dato);
		}
		
		// Pasa los datos a usuario
		cliente.setRunUsuario(usuario.getRunUsuario());
		cliente.setNombreUsuario(usuario.getNombreUsuario());
		cliente.setFechaNacimientoUsuario(usuario.getFechaNacimientoUsuario());
			
		System.out.println("¿Desea agregar Cliente? (S/N): ");
		respuesta=sc.nextLine();
		
		if ("S".equals(respuesta.toUpperCase())) {
			contenedor.almacenarCliente(cliente);
		}
	}
	private static void opcion2 () {
		String respuesta="N";
		
		System.out.println("*** Ingreso de profesional ***");
		System.out.println("");
		
		// Pide fecha de ingreso
		while (profesional.getFechaIngreso()==null) {
			System.out.println("Fecha de ingreso: ");
			profesional.setFechaIngreso(sc.nextLine());
		}
		
		// Pide titulo
		while (profesional.getTitulo()==null) {
			System.out.println("Titulo: ");
			profesional.setTitulo(sc.nextLine());
		}
		
		// Pasa los datos a usuario
		profesional.setRunUsuario(usuario.getRunUsuario());
		profesional.setNombreUsuario(usuario.getNombreUsuario());
		profesional.setFechaNacimientoUsuario(usuario.getFechaNacimientoUsuario());

		System.out.println("¿Desea agregar Profesional? (S/N): ");
		respuesta=sc.nextLine();
		
		if ("S".equals(respuesta.toUpperCase())) {
			contenedor.almacenarProfesional(profesional);
		}	
	}
	
	private static void opcion3 () {
		int dato;
		String respuesta="N";
		
		System.out.println("*** Ingreso de Administrativo***");
		System.out.println("");
		
		// Pide Area
		System.out.println("Area: ");
		administrativo.setArea(sc.nextLine());

		// Pide experiencia
		System.out.println("Años de experiencia: ");
		dato = sc.nextInt();
		sc.nextLine();
		administrativo.setAniosExperiencia(dato);
		
		System.out.println("¿Desea agregar Administrativo? (S/N): ");
		respuesta=sc.nextLine();
		
		if ("S".equals(respuesta.toUpperCase())) {
			contenedor.almacenarAdministrativo(administrativo);
		}			
	}
	
	private static void opcion4 () {
		int dato;
		String respuesta="N";
		
		System.out.println("*** Ingreso de Capacitacion***");
		System.out.println("");
		
		// identificador
		System.out.println("Número identificador: ");
		dato = sc.nextInt();
		sc.nextLine();
		capacitacion.setIdentificador(dato);
		
		//pide rut cliente
		System.out.println("Rut de cliente: ");
		dato = sc.nextInt();
		sc.nextLine();
		capacitacion.setRutCliente(dato);
		
		// Pide dia
		System.out.println("Dia de la capacitación: ");
		capacitacion.setDia(sc.nextLine());
		
		// Pide hora
		System.out.println("Hora de la capacitacion: ");
		capacitacion.setHora(sc.nextLine());
		
		// Pide lugar
		System.out.println("Lugar de capacitacion");
		capacitacion.setLugar(sc.nextLine());
		
		// Pide duracion
		System.out.println("Duracion de la capacitacion");
		capacitacion.setDuracion(sc.nextLine());
		
		// Pide cantidad de asistentes
		System.out.println("Ingrese la cantidad de asistentes");
		dato = sc.nextInt();
		sc.nextLine();
		capacitacion.setCantidadAsistentes(dato);
		
		System.out.println("¿Desea agregar la Capacitación? (S/N): ");
		respuesta=sc.nextLine();
		
		if ("S".equals(respuesta.toUpperCase())) {
			contenedor.almacenarCapacitacion(capacitacion);
		}	
	}
	
	public static void opcion5() {
		int dato=0;
		
		//pide run usuario
		System.out.println("Digite Run de Usuario a eliminar: ");
		dato = sc.nextInt();
		sc.nextLine();
		contenedor.eliminarUsuario(dato);
		System.out.println("Usuario eliminado");
	}

	public static void opcion7() {
		int dato=0;
		
		//pide run usuario
		//System.out.println("Digite Run de Usuario a consultar: ");
		// dato = sc.nextInt();
		//sc.nextLine();
		contenedor.listarUsuarios("Sprint.Profesional");
	}

}
