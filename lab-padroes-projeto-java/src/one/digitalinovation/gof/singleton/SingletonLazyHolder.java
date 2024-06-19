package one.digitalinovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * @author ThomasLincoln
 */
public class SingletonLazyHolder {
  private static class instanceHolder {
    private static SingletonLazyHolder instancia = new SingletonLazyHolder();  
  }

  
  private SingletonLazyHolder(){
    super();
  }

  public static SingletonLazyHolder getInstancia(){
    return instanceHolder.instancia;
  }
}
