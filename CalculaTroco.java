import java.util.LinkedList;
import java.util.List;

public class CalculaTroco implements IMaquina {

    @Override
    public List<troco> montarTroco(double valor) {
        List<troco> result = new LinkedList<>();

        valor = contarCedulas(NOTA100, valor, result);
        valor = contarCedulas(NOTA50, valor, result);
        valor = contarCedulas(NOTA20, valor, result);
        valor = contarCedulas(NOTA10, valor, result);
        valor = contarCedulas(NOTA5, valor, result);
        valor = contarCedulas(NOTA2, valor, result);
        valor = contarCedulas(MOEDA100, valor, result);
        valor = contarCedulas(MOEDA50, valor, result);
        valor = contarCedulas(MOEDA25, valor, result);
        valor = contarCedulas(MOEDA10, valor, result);
        valor = contarCedulas(MOEDA5, valor, result);
        valor = contarCedulas(MOEDA1, valor, result);

        return result;
    }

    private double contarCedulas(ECedula cedula, double valor, List<troco> result) {
        troco troco = new troco(cedula, 0);
        while (valor >= cedula.getValor()) {
            troco.adicionaQuantidade(1);
            valor -= cedula.getValor();
        }
        if (troco.getQuantidade() > 0) {
            result.add(troco);
        }
        return valor;
    }

}