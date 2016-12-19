package helper.mementos;

import helper.Player;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by Лепрекон on 16.12.2016.
 */
public class MementoF {
  private final String state;
  private final List<WeakReference<Player>> list;

  public MementoF(String state, List<WeakReference<Player>> list) {
    this.state = state;
    this.list = list;
  }

  public String getState() {
    return state;
  }

  public List<WeakReference<Player>> getList() {
    return list;
  }
}
