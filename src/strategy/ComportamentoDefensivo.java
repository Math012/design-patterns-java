package strategy;

/**
 * @author math012
 *
 * O padrão Strategy visa simplificar a variação de algoritmos para a resolução de um mesmo problema.
 */

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente!");
    }
}
