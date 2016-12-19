package helper;

import helper.mementos.MementoF;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by Лепрекон on 16.12.2016.
 */
public class Fact extends Composite {
  private String name;
  private String story;
  private String state = name + "&" + story;
  private List <WeakReference<Player>> listOfPlayers;

  @Override
  public String getName() {
    return this.name;
  }

  public void ChangeName(String newName) {
    this.name = newName;
  }

  public String GetStory() {
    return this.story;
  }

  public void ChangeStory(String newStory) {
    this.story = newStory;
  }

  public List<WeakReference<Player>> getList() {
    return this.listOfPlayers;
  }

  public void setList(List<WeakReference<Player>> newList) {
    this.listOfPlayers = newList;
  }

  public MementoF createMemento() {
    return new MementoF(state, listOfPlayers);
  }

  public void setMemento(MementoF memento) {
    this.state = memento.getState();
    String buffer[] = this.state.split("&");
    this.name = buffer[0];
    this.story = buffer[1];
    listOfPlayers = memento.getList();
  }

  @Override
  public void add(Instance element) {
    listOfPlayers.add(new WeakReference<Player>((Player)element));
  }

  @Override
  public void remove(Instance element) {
    listOfPlayers.remove(new WeakReference<Player>((Player)element));
  }
}
