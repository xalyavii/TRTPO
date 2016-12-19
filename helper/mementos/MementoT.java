package helper.mementos;

import helper.Player;

import java.util.List;

/**
 * Created by Лепрекон on 16.12.2016.
 */
public class MementoT {
  private final String state;
  private final List<Player> list;

  public MementoT(String state, List<Player> list) {
    this.state = state;
    this.list = list;
  }

  public String getState() {
    return state;
  }

  public List<Player> getList() {
    return list;
  }
}
