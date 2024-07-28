package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * 
 * 
 * 
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static final SingletonLazyHolder INSTANCE = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.INSTANCE;
    }
}
