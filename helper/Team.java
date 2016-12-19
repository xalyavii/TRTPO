package helper;

import helper.mementos.MementoT;

import java.util.List;

/**
 * Created by Лепрекон on 09.12.2016.
 */
public class Team extends Composite{
  private List<Player> listOfPlayers;
  private String legend;
  private String name;
  private String state = name + "&" + legend;

  @Override
  public String getName() {
    return this.name;
  }

  public MementoT createMemento() {
    return new MementoT(state, listOfPlayers);
  }

  public void setMemento(MementoT memento) {
    this.state = memento.getState();
    String buffer[] = this.state.split("&");
    this.name = buffer[0];
    this.legend = buffer[1];
    listOfPlayers = memento.getList();
  }

  public void ChangeName(String newName){
    this.name = newName;
  }

  public String GetLegend(){
    return this.legend;
  }

  public void ChangeLegend(String newLegend){
    this.legend = newLegend;
  }

  public List<Player> getList(){
    return this.listOfPlayers;
  }

  public void setList (List<Player> newList) {
    this.listOfPlayers = newList;
  }

  @Override
  public void add(Instance player) {
    listOfPlayers.add((Player)player);
  }

  @Override
  public void remove(Instance player) {
    listOfPlayers.remove((Player)player);
  }
}
