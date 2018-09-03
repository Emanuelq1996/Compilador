import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Analizador_Lexico {
    private static final int MAX = 25;
    private static final int ESTADO_FINAL = 6;

    private HashMap<String, Integer> tablaSimbolos = null;
    private HashMap<String, Integer> equivalentes = null;
    private MatrizLexica MLexica = null;
    private int cantLN = 0;
    private String fuente = null;
    private String buffer = null;
    private int estadoActual = 0;
    private int cursor = 0;

    public Analizador_Lexico(File mFile) throws IOException {
        MLexica = new MatrizLexica();
        CargarEquivalentes();
        fuente = FileManager.Read(mFile);
    }

    public String GetToken() {// Hay que revisarla y testearla
        String buffer = "";
        int estadoActual = 0;
        while ((estadoActual != 9999/*<-MODIFICAR*/) && (estadoActual != 1)) {//OBVIAMENTE NO VA 9999
            char c = fuente.charAt(cursor);
            int columna = this.Equivalente(c); //A partir del caracter indica que columna de la matriz debo posicionarme
            int estadoFuturo = MLexica.GetEstado(estadoActual, columna);
            MLexica.GetAS(estadoActual, columna).Ejecutar(buffer, c);//Se ejecuta la accion semantica correspondiente
        }
        return buffer;
    }

    private void CargarEquivalentes() {
        equivalentes.put("Error", -1);
        equivalentes.put("Numero", 0);
        equivalentes.put("Letra", 1);
        equivalentes.put("F", 2);
        equivalentes.put("_", 3);
        equivalentes.put("/", 4);
        equivalentes.put("*", 5);
        equivalentes.put("+", 6);
        equivalentes.put("-", 7);
        equivalentes.put("<", 8);
        equivalentes.put(">", 9);
        equivalentes.put("=", 10);
        equivalentes.put("!", 11);
        equivalentes.put("BTS", 12);
    }


    private int Equivalente(char c) {//Devuelve el indice (correspondiente al caracter) de la matriz lexica
        if ((c >= 48) && (c < 57)) {//Es un digito?
            return equivalentes.get("Numero");
        }
        if (((c >= 48) && (c <= 57)) || ((c >= 97) && (c <= 122))) {//Es una letra?
            return equivalentes.get("Letra");
        }
        String caracter = "";
        caracter += c;//La clave es un string del caracter que recibo
        Integer indice = equivalentes.get(caracter);
        if (indice == null)
            return -1;//Si el caracter no existe en el lenguaje
        return indice;//Si es un caracter valido
    }
}
/*import java.io.File;

import java.io.IOException;
import java.util.HashMap;

public class Analizador_Lexico {
    private HashMap<String, Integer> equivalentes = null;
    private MatrizLexica MLexica = null;
    private HashMap<String, Integer> tablaSimbolos;
    private int cantLN = 0;
    private String fuente = null;
    private static final int ESTADO_FINAL=6;
    private static final int Max = 25;
    private int cursor;
    public Analizador_Lexico(File mFile) throws IOException {
        //CargarMatriz(mFile);
        CargarEquivalentes();
        cantLN=0;
		fuente=FileManager.Read(mFile);
		int cursor=0;
    }

	public String GetToken() {// Hay que revisarla y testearla
        String buffer="";
        int estadoActual=0;
        while( (estadoActual!=9999)&&(estadoActual!=1) ){//OBVIAMENTE NO VA 9999 
        	char c=fuente.charAt(cursor);
        	int columna=this.Equivalente(c); //A partir del caracter indica que columna de la matriz debo posicionarme
        	int estadoFuturo=MLexica.GetEstado(estadoActual, columna);
        	MLexica.GetAS(estadoActual, columna).Ejecutar(buffer,c);//Se ejecuta la accion semantica correspondiente
        	
        }
        return buffer;
    }

    private void CargarMatriz(File mFile) throws IOException {//METODO OBSOLETO??? no se si sirve para algo guardar la matriz en memoria secundaria y sacarla de ahi si puede quedar guardada en el ejecutable y no cambia nunca
        //Las dos primeras lineas del archivo contienen el alto y el ancho de la matriz
        String input = FileManager.Read(mFile);
        String[] tamM = input.split("\n", 2);
        MLexica = new MatrizLexica(Integer.parseInt(tamM[0]), Integer.parseInt(tamM[1]));
        //Elimino esas dos primeras lineas
        input = input.substring(input.indexOf('\n') + 1);
        input = input.substring(input.indexOf('\n') + 1);
        MLexica.AddAll(input);
    }

    private void CargarEquivalentes(){ 
        equivalentes.put("Numero",0);
        equivalentes.put("Letra",1);
        //equivalentes.put("",,);
        
     
        //TODO completar la hash
    }

    private int Equivalente(char c) {//Devuelve el indice (correspondiente al caracter) de la matriz lexica
        if((c>=48)&&(c<57)){//Es un digito?
        	return equivalentes.get("Numero");
        }
        if( ( (c>=48)&&(c<=57))||((c>=97)&&(c<=122)) ){//Es una letra?
        	return equivalentes.get("Letra");
        }
        String caracter="";
        caracter+=c;//La clave es un string del caracter que recibo
        Integer indice=equivalentes.get(caracter);
        if (indice==null)
        	return -1;//Si el caracter no existe en el lenguaje
        return indice;//Si es un caracter valido
    }
    public static void main(String [] args){
    	
    		
    	
    }
}
*/

