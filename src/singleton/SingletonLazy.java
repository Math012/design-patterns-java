package singleton;

/**
 * @author math012
 *
 *  O padrão Singleton permite a criação de uma única instancia de uma classe e fornecer um modo para recuperá-la.
 *
 *  O singleton lazy que no primeiro momento não disponibiliza a instancia para o usuario.
 */

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if (instance == null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
