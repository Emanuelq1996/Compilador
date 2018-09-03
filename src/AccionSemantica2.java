public class AccionSemantica2 {
//CHEQUEA RANGO CONSTANTE Y AGREGA A TABLA DE SIMBOLOS, SI SE VA DE RANGO REEMPLAZA CON EL MAYOR DEL RANGO
	//PIDE DEVOLVER EL PAR <ID,PTR>
	
	public void Ejecutar(String buffer, char c){
		if (Integer.parseInt(buffer) <= 32767 && Integer.parseInt(buffer)>=-32768)
			tablaSimbolos.add(buffer,nuevosimbolo);
		 else 	
		 	buffer = "32767";
		 	tablaSimbolos.add(buffer,nuevoSimbolo);
		 	System.out.print("Warning: Se excedio del rango permitido, se procede a realizar tecnica de reemplazo");
	 }
}