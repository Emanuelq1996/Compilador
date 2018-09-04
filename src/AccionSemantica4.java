
public class AccionSemantica4 {
	//PIDE DEVOLVER EL PAR <ID,PTR>
	
	public void Ejecutar(String buffer, char c){	//COMENTARIO DE AS$
		if(buffer.length()<25){
			if(tablaSimbolos.contains(buffer)){
				// RETURN tablaSimbolos.get(buffer);
			}
			else
				tablaSimbolos.add(buffer);
				//return tablaSimbolos.get(buffer);
		}
		else
			System.out.print("Error: fuera de rango");
	}
}