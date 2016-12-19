package helper.mementos;

import helper.Team;

import java.util.List;

/**
 * Created by Лепрекон on 16.12.2016.
 */
public class MementoG {
  private final String state;
  private final List<Team> list;

  public MementoG(String state, List<Team> list) {
    this.state = state;
    this.list = list;
  }

  public String getState() {
    return state;
  }

  public List<Team> getList() {
    return list;
  }
}
