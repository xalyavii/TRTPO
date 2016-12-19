package helper.prototypes;

import helper.Instance;
import helper.Team;

/**
 * Created by Лепрекон on 16.12.2016.
 */
public class TeamPrototype implements Prototype {
  @Override
  public Instance clone(Instance example) {
    Team newObject = (Team)example;
    return newObject;
  }
}
