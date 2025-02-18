package pvtcnstrcttest;

import lombok.Synchronized;

public class SomeSingleton {

  private static SomeSingleton uniqueInstance = null;

  private SomeSingleton() {}
  
  @Synchronized
  public static SomeSingleton getInstance() {
    if (uniqueInstance == null) 
     uniqueInstance = new SomeSingleton();
    return uniqueInstance;
  }

  public String someMethod() {
    return "From someMethod";
  }
}
