package helper.prototypes;

import helper.Instance;
import helper.Player;

/**
 * Created by Лепрекон on 16.12.2016.
 */
public class PlayerPrototype implements Prototype{
  @Override
  public Instance clone(Instance example) {
    Player newObject = (Player)example;
    return newObject;
  }
}
