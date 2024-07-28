package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy" otimizado com Lazy Holder.
 * 
 * 
 */
public class SingletonLazy {

    private static class InstanceHolder {
        public static final SingletonLazy INSTANCE = new SingletonLazy();
    }

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        return InstanceHolder.INSTANCE;
    }
}
