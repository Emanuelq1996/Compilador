public class AccionSemantica8 {
	// CONCATENA Y AGREGA EN LA TABLA DE SIMBOLOS DE UNA, ES PARA TOKENS QUE PASAN DIRECTO AL ESTADO FINAL

	public void Ejecutar(String buffer, char c){
		buffer=buffer + c;
		if(tablaSimbolos.contains(buffer)){
			// RETURN tablaSimbolos.get(buffer);
		}
		else
			tablaSimbolos.add(buffer);
			//return tablaSimbolos.get(buffer);
	}
}