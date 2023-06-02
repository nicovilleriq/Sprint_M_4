package sprint;

import java.util.ArrayList;

/** 
 * @version 1.0.0  Trabajo Sprint M4
 * Clase principal con selector de opciones
 * @author Nicolae Villegas
 * @author Jesus Torres
 * @author Cristian Díaz
 * @author Fabiana Vega
 
 */

public class Contenedor {

	ArrayList<IAsesoria> listaIAsesoria = new ArrayList<>();
	ArrayList<Capacitacion> listaCapacitacion = new ArrayList<>();
	
	public void almacenarCliente(Cliente itemCliente) {
		listaIAsesoria.add(itemCliente);
	 }
	public void almacenarProfesional(Profesional itemProfesional) {
		listaIAsesoria.add(itemProfesional);
	 }

	public void almacenarAdministrativo(Administrativo itemAdministrativo) {
		listaIAsesoria.add(itemAdministrativo);
	 }
	public void almacenarCapacitacion(Capacitacion itemCapacitacion) {
		listaCapacitacion.add(itemCapacitacion);
	 }
	public void eliminarUsuario(int runUsuario) {
		for (int i = 0; i < listaIAsesoria.size(); i++) {
			if (listaIAsesoria.get(i).obtieneRutUsuario()==runUsuario) {
				listaIAsesoria.remove(i);
				System.out.println("Usuario eliminado.");
				System.out.println("******************");
			}
		}
	}
	public void listarUsuarios() {
		for (IAsesoria iasesoria: listaIAsesoria) {
			System.out.println("Usuario: "+iasesoria.toString());
		}
	}
	public void listarUsuarios(String tipoUsuario) {
		for (int i = 0; i < listaIAsesoria.size(); i++) {
			if (tipoUsuario.equals(listaIAsesoria.get(i).getClass().getName())){
				System.out.println("Usuario: "+listaIAsesoria.get(i).toString());
			}
		}
	}
	public void listarCapacitaciones() {
		for (Capacitacion capacitacion: listaCapacitacion) {
			System.out.println("Capacitacion: "+capacitacion.toString());
		}
	}
}
