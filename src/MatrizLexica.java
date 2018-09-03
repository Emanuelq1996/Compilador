#define a (new AccionSemantica)
#define c (new CasillaLexica(a)

public class MatrizLexica {

   private static final int cantEstados = ;//cambiar
   private static final int cantCaracteres = ;//cambiar

    private CasillaLexica[][] MatrizCL = null;

    public MatrizLexica() {
        MatrizCL = new CasillaLexica[cantEstados][cantCaracteres];
        ConstruirMatriz();
    }

    private void ConstruirMatriz() {
        int i = 0;
        CasillaLexica[] filaLexica = new CasillaLexica[cantCaracteres];

        filaLexica = {.....} //FALTA PONER LA FILA DE LA MATRIZ
        AddFila(filaLexica, i++);
        filaLexica = {.....}
        AddFila(filaLexica, i++);
        filaLexica = {.....}
        AddFila(filaLexica, i++);
        filaLexica = {.....}
        AddFila(filaLexica, i++);
        filaLexica = {.....}
        AddFila(filaLexica, i++);
        filaLexica = {.....}
        AddFila(filaLexica, i++);
        filaLexica = {.....}
        AddFila(filaLexica, i++);
        filaLexica = {.....}
        AddFila(filaLexica, i++);
        filaLexica = {.....}
        AddFila(filaLexica, i++);
        filaLexica = {.....}
        AddFila(filaLexica, i++);*/
    }

    private void AddFila(CasillaLexica[] valores, int fila) {
        if (fila < cantEstados) {
            for (int i = 0; i < cantCaracteres; i++) {
                MatrizCL[fila][i] = valores[i];
            }
        }
    }

    private void Add(CasillaLexica valor, int i, int j) {
        if (i < cantEstados && j < cantCaracteres)
            MatrizCL[i][j] = valor;
    }

    public CasillaLexica Get(int i, int j) {
        if (i < cantEstados && j < cantCaracteres)
            return MatrizCL[i][j];
        return null;
    }

    public AccionSemantica GetAS(int i, int j) {
        if (i < cantEstados && j < cantCaracteres)
            return MatrizCL[i][j].AS;
        return null;
    }

    public int GetEstado(int i, int j) {
        if (i < cantEstados && j < cantCaracteres)
            return MatrizCL[i][j].estado;
        return -1;
    }

    public int GetSiguienteEstado(int estadoActual, char c) {
        return MatrizCL[estadoActual][c].estado;
    }
}