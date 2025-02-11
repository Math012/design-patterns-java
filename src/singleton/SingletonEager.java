package singleton;

/**
 * @author math012
 *
 *  O padrão Singleton permite a criação de uma única instancia de uma classe e fornecer um modo para recuperá-la.
 *
 *  O singleton eager já especifica a instancia da classe quando definimos a variavel estatica.
 */

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
