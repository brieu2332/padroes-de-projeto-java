package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Eager" otimizado com Lazy Holder.
 * 
 * 
 */
public class SingletonEager {

    private static class InstanceHolder {
        public static final SingletonEager INSTANCE = new SingletonEager();
    }

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return InstanceHolder.INSTANCE;
    }
}
