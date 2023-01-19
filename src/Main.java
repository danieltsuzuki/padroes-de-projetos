import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.Comportamento;
import gof.strategy.ComportamentoCorrer;
import gof.strategy.ComportamentoNormal;
import gof.strategy.Robo;

public class Main {
    public static void main(String[] args) {
        // Testes relacionados ao Design Patter Singleton

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);


        //Strategy
        Comportamento andar = new ComportamentoNormal();
        Comportamento correr = new ComportamentoCorrer();

        Robo robo = new Robo();
        robo.setComportamento(andar);
        robo.mover();
        robo.setComportamento(correr);
        robo.mover();
    }
}