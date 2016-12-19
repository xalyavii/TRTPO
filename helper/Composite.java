package helper;

/**
 * Created by Лепрекон on 09.12.2016.
 */
abstract public class Composite implements Instance {
  abstract public void add(Instance element);
  abstract public void remove(Instance element);
}
