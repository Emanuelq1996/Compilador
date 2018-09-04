package AnalizadorLexico;

public class AccionSemantica5 extends AccionSemantica{
	//ES PARA CONSTANTES ENTEROS LARGOS SIN SIGNO
	//CHEQUEA RANGO CONSTANTE Y AGREGA A TABLA DE SIMBOLOS, SI SE VA DE RANGO REEMPLAZA CON EL MAYOR DEL RANGO
		//PIDE DEVOLVER EL PAR <ID,PTR>
		
		public void Ejecutar(String buffer, char c){
			if ((Integer.parseInt(buffer) <= 4294967295) && (Integer.parseInt(buffer)>=0))
				Analizador_Lexico.tablaSimbolos.add("uslinteger");
			 else 	
			 	buffer = "4294967295";
			Analizador_Lexico.tablaSimbolos.add(buffer,nuevoSimbolo);
			 	System.out.print("Warning: Se excedio del rango permitido, se procede a realizar tecnica de reemplazo");
		 }

}