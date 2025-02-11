package strategy;

public class Main {
    public static void main(String[] args) {

        System.out.println("================== STRATEGY ==================");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        System.out.println("=");
        robo.setStrategy(defensivo);
        robo.mover();
        robo.mover();
        System.out.println("=");
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();
        robo.mover();


    }
}
