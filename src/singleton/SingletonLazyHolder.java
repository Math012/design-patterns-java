package singleton;

/**
 * @author math012
 *
 *  O padrão Singleton permite a criação de uma única instancia de uma classe e fornecer um modo para recuperá-la.
 *
 *  O singleton lazy holder faz o encapsulamento da instancia dentro de uma classe estatica interna.
 */

public class SingletonLazyHolder {
    private static class InstancerHolder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }


    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstancerHolder.instance;
    }
}
