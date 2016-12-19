package helper.mementos;

import helper.Player;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by Лепрекон on 16.12.2016.
 */
public class MementoSL {
  private final String state;
  private final List<WeakReference<Player>> list;
  private final Boolean player1;
  private final Boolean player2;

  public MementoSL(String state, List<WeakReference<Player>> list, Boolean player1, Boolean player2) {
    this.state = state;
    this.list = list;
    this.player1 = player1;
    this.player2 = player2;
  }

  public String getState() {
    return state;
  }

  public List<WeakReference<Player>> getList() {
    return list;
  }

  public Boolean getPlayer1(){
    return player1;
  }

  public Boolean getPlayer2(){
    return player2;
  }
}
