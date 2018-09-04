package AnalizadorLexico;

public class AccionSemantica4 extends AccionSemantica {
    //PIDE DEVOLVER EL PAR <ID,PTR>

    public void Ejecutar(String buffer, char c) {
        if (buffer.length() < 25) {
            if (Analizador_Lexico.tablaSimbolos.contains(buffer)) {
                // RETURN tablaSimbolos.get(buffer);
            } else
                Analizador_Lexico.tablaSimbolos.add(buffer);
            //return tablaSimbolos.get(buffer);
        } else
            System.out.print("Error: fuera de rango");
    }
}