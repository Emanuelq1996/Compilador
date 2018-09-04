package AccionesSemanticas;

public class AccionSemantica7 {
	//AGREGA EN LA TABLA DE SIMBOLOS SIN VERIFICAR EL <25

	public void Ejecutar(String buffer, char c){
		if(tablaSimbolos.contains(buffer)){
			// RETURN tablaSimbolos.get(buffer);
		}
		else
			tablaSimbolos.add(buffer);
			//return tablaSimbolos.get(buffer);
	}
}