package helper;

import helper.mementos.MementoG;
import helper.prototypes.GamePrototype;

import java.util.List;

/**
 * Created by Лепрекон on 09.12.2016.
 */
public class Game extends Composite{
  private String name;
  private String preview;
  private String state = name + "&" + preview;
  private List<Team> listOfTeams;
  private GamePrototype prototype;

  public Game(Instance example) {
    Game newObject = (Game)prototype.clone(example);
    this.changeName(newObject.getName());
    this.changePreview(newObject.getPreview());
    this.setList(newObject.getList());
  }

  public MementoG createMemento() {
    return new MementoG(state, listOfTeams);
  }

  public void setMemento(MementoG memento) {
    this.state = memento.getState();
    String buffer[] = this.state.split("&");
    this.name = buffer[0];
    this.preview = buffer[1];
    listOfTeams = memento.getList();
  }

  public String getName(){
    return this.name;
  }

  public void changeName(String newName){
    this.name = newName;
  }

  public String getPreview(){
    return this.preview;
  }

  public void changePreview(String newPreview){
    this.preview = newPreview;
  }

  public List<Team> getList(){
    return this.listOfTeams;
  }

  public void setList (List<Team> newList) {
    this.listOfTeams = newList;
  }

  @Override
  public void add(Instance element) {
    listOfTeams.add((Team)element);
  }

  @Override
  public void remove(Instance element) {
    listOfTeams.remove((Team) element);
  }

}
