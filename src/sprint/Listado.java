package sprint;

import java.util.ArrayList;
import java.util.List;

public class Listado {
	 List<Usuario> listaUsuarios = new ArrayList<>();
	
	 public void agregarLista(Usuario item) {
		 listaUsuarios.add(item);
	 }
	 
	 public void mostrarLista() {
		 for(Usuario elemento: listaUsuarios) {
			 System.out.println("Lista de Usuarios ");
			 elemento.analizarUsuario();
		 }
	 }
}
