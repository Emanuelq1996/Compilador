package AnalizadorLexico;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Analizador_Lexico {
    private final int MAX = 25;
    private final int ESTADO_FINAL = 6;

    public static HashMap<String, Integer> tablaSimbolos = null;
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
        tablaSimbolos= new HashMap<>();
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
        equivalentes.put("'", 13);
        equivalentes.put(".", 14);
        equivalentes.put("{", 15);
        equivalentes.put("}", 16);
        equivalentes.put("(", 17);
        equivalentes.put(")", 18);
        equivalentes.put(":", 19);
    }


    private int Equivalente(char c) {//Devuelve el indice (correspondiente al caracter) de la matriz lexica
        if ((c >= 48) && (c < 57)) {//Es un digito?
            return equivalentes.get("Numero");
        }
        if (((c >= 65) && (c <= 69)) || ((c >= 71) && (c <= 90)) || ((c >= 97) && (c <= 122))) {//Es una letra? (distinta de Fk)
            return equivalentes.get("Letra");
        }
        // espacio|| tab  || salto de linea
        if((c==32)||(c==9)||(c==10)){
        	return equivalentes.get("BTS");
        }
        String caracter = "";
        caracter += c;//La clave es un string del caracter que recibo
        Integer indice = equivalentes.get(caracter);
        if (indice == null)
            return -1;//Si el caracter no existe en el lenguaje
        return indice;//Si es un caracter valido
    }
}
