package gof;

public class SingletonLazyHolder {

    private static class InstanceHolder{
        public static SingletonLazyHolder instancia = new gof.SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }

}
