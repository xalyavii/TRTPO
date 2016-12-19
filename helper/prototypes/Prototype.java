package helper.prototypes;

import helper.Instance;

/**
 * Created by Лепрекон on 09.12.2016.
 */
public interface Prototype {
  abstract public Instance clone(Instance example);
}
