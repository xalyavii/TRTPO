package helper.prototypes;

import helper.Fact;
import helper.Instance;

/**
 * Created by Лепрекон on 16.12.2016.
 */
public class FactPrototype implements Prototype {
  @Override
  public Instance clone(Instance example) {
    Fact newObject = (Fact) example;
    return newObject;
  }
}
