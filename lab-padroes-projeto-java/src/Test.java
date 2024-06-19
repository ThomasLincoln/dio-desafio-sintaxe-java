import one.digitalinovation.gof.facade.Facade;
import one.digitalinovation.gof.singleton.SingletonEager;
import one.digitalinovation.gof.singleton.SingletonLazy;
import one.digitalinovation.gof.singleton.SingletonLazyHolder;
import one.digitalinovation.gof.strategy.Comportamento;
import one.digitalinovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinovation.gof.strategy.Robo;
import one.digitalinovation.gof.strategy.ComportamentoNormal;

public class Test {
  public static void main(String[] args) {

    // Singleton
    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    lazy = SingletonLazy.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
    System.out.println(lazyHolder);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazyHolder);
  
    // Strategy
    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();
    robo.setComportamento(normal);
    robo.mover();
    robo.mover();
    robo.setComportamento(agressivo);
    robo.mover();
    robo.mover();
    robo.setComportamento(defensivo);
    robo.mover();

    // Facade
    Facade facade = new Facade();
    facade.migrarCliente("Thomas", "12345678");
  }
}
