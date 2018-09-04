package AnalizadorLexico;

public class AccionSemantica1 extends AccionSemantica{
//CONCATENA
	
	public void Ejecutar(String buffer, char c){
		buffer=buffer + c;
	}

}