package strategy;

/**
 * @author math012
 *
 * O padrão Strategy visa simplificar a variação de algoritmos para a resolução de um mesmo problema.
 */

public class Robo {

    private  Comportamento strategy;

    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover(){
        strategy.mover();
    }
}
