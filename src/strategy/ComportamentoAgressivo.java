package strategy;

/**
 * @author math012
 *
 * O padrão Strategy visa simplificar a variação de algoritmos para a resolução de um mesmo problema.
 */

public class ComportamentoAgressivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente!");
    }
}
