package helper.prototypes;

import helper.Game;
import helper.Instance;

/**
 * Created by Лепрекон on 09.12.2016.
 */
public class GamePrototype implements Prototype {
  @Override
  public Instance clone(Instance example) {
    Game newObject = (Game)example;
    return newObject;
  }
}
