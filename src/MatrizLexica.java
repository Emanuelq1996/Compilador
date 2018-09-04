import AccionesSemanticas.*;

public class MatrizLexica {

    private final int cantEstados = 21;//cambiar
    private final int cantCaracteres = 20;//cambiar

    private CasillaLexica[][] MatrizCL = null;

    public MatrizLexica() {
        MatrizCL = new CasillaLexica[cantEstados][cantCaracteres];
        ConstruirMatriz();
    }

    private void ConstruirMatriz() {
        int i = 0;
        AccionSemantica[] AS = {null, new AccionSemantica1(), new AccionSemantica2(), new AccionSemantica3(), new AccionSemantica4(), new AccionSemantica5(), new AccionSemantica6(), new AccionSemantica7(), new AccionSemantica8()};
        CasillaLexica[] filaLexica;

        /*0*/filaLexica = new CasillaLexica[]{c(AS[1], 3), c(AS[1], 11), null, c(AS[1], 1), c(AS[1], 4), c(AS[8], -1), c(AS[8], -1), c(AS[8], -1), c(AS[1], 7), c(AS[1], 8), c(AS[1], 9), c(AS[1], 10), c(AS[3], 0), c(AS[1], 1), c(AS[1], 16), c(AS[8], -1), c(AS[8], -1), c(AS[8], -1), c(AS[8], -1),c(AS[1], 12)};
        AddFila(filaLexica, i++);

        /*1*/filaLexica = new CasillaLexica[]{c(AS[1], 2), c(AS[1], 2), null, c(AS[1], 13), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*2*/filaLexica = new CasillaLexica[]{c(AS[1], 2), c(AS[1], 2), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS["ALGO"], 14), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1),c(AS[4], -1)};
        AddFila(filaLexica, i++);

        /*3*/filaLexica = new CasillaLexica[]{c(AS[1], 3), c(AS[2], -1), c(AS[2], -1), c("ALGO"), c(AS[2], -1), c(AS[2], -1), c(AS[2], -1), c(AS[2], 14), c(AS[2], -1), c(AS[2], -1), c(AS[2], -1), c(AS[2], -1), c(AS[2], -1), c(AS[2], -1), c(AS[1], 15), c(AS[2], -1), c(AS[2], -1), c(AS[2], -1), c(AS[2], -1),c(AS[2], -1)};
        AddFila(filaLexica, i++);

        /*4*/filaLexica =  new CasillaLexica[]{c(AS[7], -1), c(AS[7], -1), null, null, c(AS[1], 5), c(AS[1], 5), null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*5*/filaLexica = new CasillaLexica[]{c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 6), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5),c(AS[1], 5)};
        AddFila(filaLexica, i++);

        /*6*/filaLexica = new CasillaLexica[]{c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[3], 0), c(AS[1], 6), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5), c(AS[1], 5),c(AS[1], 5)};
        AddFila(filaLexica, i++);

        /*7*/filaLexica = new CasillaLexica[]{c(AS[7], -1), c(AS[7], -1), null, null, null, null, null, null, null, null, c(AS[7], -1), null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*8*/filaLexica = new CasillaLexica[]{c(AS[7], -1), c(AS[7], -1), null, null, null, null, null, null, null, null, c(AS[7], -1), null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*9*/filaLexica = new CasillaLexica[]{c(AS[7], -1), c(AS[7], -1), null, null, null, null, null, null, null, null, c(AS[7], -1), null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*10*/filaLexica = new CasillaLexica[]{null, null, null, null, null, null, null, null, null, null, c(AS[7], -1), null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*11*/filaLexica = new CasillaLexica[]{c(AS[4], -1), c(AS[1], 11), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1), c(AS[4], -1),};
        AddFila(filaLexica, i++);

        /*12*/filaLexica = new CasillaLexica[]{null, null, null, null, null, null, null, null, null, null, c(AS[7], -1), null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*13*/filaLexica = new CasillaLexica[]{c(AS[1], 2), c(AS[1], 2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*14*/filaLexica = new CasillaLexica[]{null, null, null, null, null, null, null, null, null, null, null, null, c(AS[ALGO],2), null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*15*/filaLexica = new CasillaLexica[]{c(AS[1], 15), null, c(AS[1], 17), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*16*/filaLexica = new CasillaLexica[]{c(AS[1], 15), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*17*/filaLexica = new CasillaLexica[]{c(AS[1], 20), null, null, null, null, null, c(AS[1],18), c(AS[1],19), null, null, null, null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*18*/filaLexica = new CasillaLexica[]{c(AS[1], 20), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*19*/filaLexica = new CasillaLexica[]{c(AS[1], 20), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        AddFila(filaLexica, i++);

        /*20*/filaLexica = new CasillaLexica[]{c(AS[1], 20), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1), c(AS[6], -1)};
        AddFila(filaLexica, i++);
    }


    private CasillaLexica c(AccionSemantica a, int e) {
        return new CasillaLexica(a, e);
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
