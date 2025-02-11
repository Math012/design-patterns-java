package singleton;

/**
 *  Testando o padrão singleton
 */
public class PadraoSingleton {
    public static void main(String[] args) {

        System.out.println("=================== Singleton Lazy =====================");

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println("Singleton Lazy #1 - instance: " + lazy);

        lazy = SingletonLazy.getInstance();
        System.out.println("Singleton Lazy #2 - instance: " + lazy);

        System.out.println("=================== Singleton Eager =====================");

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println("Singleton Eager #1 - instance: " + eager);

        eager = SingletonEager.getInstance();
        System.out.println("Singleton Eager #2 - instance: " +eager);

        System.out.println("=================== Singleton Lazy Holder =====================");

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("Singleton Lazy Holder #1 - instance: " +lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println("Singleton Lazy Holder #2 - instance: " +lazyHolder);



    }
}
