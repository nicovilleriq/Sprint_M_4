package sprint;

public class Validaciones {
	public static boolean validaFecha(String fecha) {
		
		try {		
			if (fecha.length()!=10) {
				System.out.println("Fecha inválida,(Largo) ingrese formato DD/MM/AAAA");
				return false;
			}
			
			int anio=Integer.parseInt(fecha.substring(6,10));
			int mes=Integer.parseInt(fecha.substring(3,5));
			int dia=Integer.parseInt(fecha.substring(0,2));
			
			if (dia<0 || dia>31) {
				System.out.println("Dia inválido");
				return false;			
			}
	
			if (mes<0 || mes>12) {
				System.out.println("Mes inválido");
				return false;			
			}
	
			if (anio<1 || anio>9999) {
				System.out.println("Año inválido");
				return false;			
			}
		}catch (Exception e) {
			System.out.println("Fecha invalida, (Error) ingrese formato DD/MM/AAAA");
			return false;
		}

		return true;
	}

	public static boolean validaHora(String hora) {

		try {
			if (hora.length()!=5) {
				System.out.println("Hora invalida, (Largo) ingrese formato HH:MM");
				return false;
			}
			if (hora.indexOf(":")==-1) {
				System.out.println("Hora invalida, (:) ingrese formato HH:MM");
				return false;
			}
		
			int hh = Integer.parseInt(hora.substring(0,2));
			int mm = Integer.parseInt(hora.substring(3,5));
			
			if (hh<0 || hh>23) {
				System.out.println("Hora invalida, (Hora) ingrese formato HH:MM");
				return false;
			}
			if (mm<0 || mm>59) {
				System.out.println("Hora invalida, (Minuto) ingrese formato HH:MM");
				return false;
			}
		}catch (Exception e) {
			System.out.println("Hora invalida, (Error) ingrese formato HH:MM");
			return false;
		}
		
		return true;
	}
	
	public static boolean validaRut(int rut) {
		if(rut<1 || rut>99999998) {
			System.out.println("El largo del rut es inválido,"
					+ " debe ser entre 1 y 99999998.");
			return false;
		}

		return true;
	}
	
	public static boolean validaDia(String dia) {
		String dias = "LUNES-MARTES-MIERCOLES-JUEVES-VIERNES-SABADO-DOMINGO";
		
		if (dias.indexOf(dia.toUpperCase())==-1) {
			System.out.println("Dia de la semana es inválido, favor ingresar "+dias);
			return false;
		}
		
		return true;
	}
	
	public static boolean validaLargoCadena(String cadena,int minimo, int maximo) {
		if (cadena.length()<minimo || cadena.length()>maximo) {
			System.out.println("El largo del dato es inválido,"
					+ " debe ser entre "+minimo+" y "+maximo+" caracteres.");
			return false;
		}
		
		return true;
	}
	
	public static boolean validaDuracion(String duracion) {
		if(duracion.length()>70) {
			System.out.println("El largo de duración es inválido,"
					+ " debe ser máximo 70 caracteres.");
			return false;
		}
		
		return true;
	}
	
	public static boolean validaCantidadAsistentes(int cantidadAsistentes) {

		if(cantidadAsistentes<1 || cantidadAsistentes>1000) {
			System.out.println("La cantidad de asistentes es inválida,"
					+ " debe ser entre 1 y 1000.");
			return false;
		}

		return true;
	}
	
	public static boolean esNumero(String cadena){
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe){
			return false;
		}
	}
}
