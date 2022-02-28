package dio.digitalinnovatione.gof;

import dio.digitalinnovatione.gof.facade.Facade;
import dio.digitalinnovatione.gof.singleton.SingletonEager;
import dio.digitalinnovatione.gof.singleton.SingletonLazy;
import dio.digitalinnovatione.gof.singleton.SingletonLazyHolder;
import dio.digitalinnovatione.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

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

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();


        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Alessandra","50060-080");




    }
}
