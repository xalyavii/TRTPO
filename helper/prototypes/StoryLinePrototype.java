package helper.prototypes;

import helper.Instance;
import helper.StoryLine;

/**
 * Created by Лепрекон on 16.12.2016.
 */
public class StoryLinePrototype implements Prototype {
  @Override
  public Instance clone(Instance example) {
    StoryLine newObject = (StoryLine)example;
    return newObject;
  }
}
