package primitiva;

import java.util.ArrayList;

/**
 *
 * @author patriciapallares
 */
public class ListaBoletos {

    private ArrayList<BoletoLoteria> listaBoletosLoteria;

    public ListaBoletos() {
        this.listaBoletosLoteria = new ArrayList();
    }

    public ListaBoletos(ArrayList<BoletoLoteria> listaBoletosLoteria) {
        this.listaBoletosLoteria = listaBoletosLoteria;
    }

    // métodos
    public boolean anadirArticulo(BoletoLoteria boleto) {
        boolean insertado = false;
        if (boleto != null) {
            insertado = listaBoletosLoteria.add(boleto);
        }
        return insertado;

    }

}
