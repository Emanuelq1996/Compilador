package AccionesSemanticas;

public class AccionSemantica6 {
	//ES PARA CONSTANTES ENTEROS LARGOS SIN SIGNO
	//CHEQUEA RANGO CONSTANTE Y AGREGA A TABLA DE SIMBOLOS, SI SE VA DE RANGO REEMPLAZA CON EL MAYOR DEL RANGO
		//PIDE DEVOLVER EL PAR <ID,PTR>
		
		public void Ejecutar(String buffer, char c){
			if (((Integer.parseInt(buffer) <= 3.40282347) && (Integer.parseInt(buffer)>=1.17549435))||(Integer.parseInt(buffer)==0))
				tablaSimbolos.add("single");
			 else 	
			 	buffer = "3.40282347";
			 	tablaSimbolos.add(buffer,nuevoSimbolo);
			 	System.out.print("Warning: Se excedio del rango permitido, se procede a realizar tecnica de reemplazo");
		 }


}