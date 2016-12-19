package helper;

import helper.mementos.MementoSL;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * Created by Лепрекон on 16.12.2016.
 */
public class StoryLine extends Composite{
  private String name;
  private String line;
  private Boolean player1;
  private Boolean player2;
  private String state = name + "&" + line;
  private List <WeakReference<Player>> listOfPlayers;

  public Boolean possibilityOfWrite(){
    return player1&player2;
  }

  public void setPlayer1(){
    player1 = true;
  }

  public void setPlayer2(){
    player2 = true;
  }

  public void clearPlayer1(){
    player1 = false;
  }

  public void clearPlayer2(){
    player2 = false;
  }

  @Override
  public String getName() {
    return this.name;
  }

  public void ChangeName(String newName) {
    this.name = newName;
  }

  public String GetLine() {
    return this.line;
  }

  public void ChangeLine(String newLine) {
    this.line = newLine;
  }

  public List<WeakReference<Player>> getList() {
    return this.listOfPlayers;
  }

  public void setList(List<WeakReference<Player>> newList) {
    this.listOfPlayers = newList;
  }

  public MementoSL createMemento() {
    return new MementoSL(state, listOfPlayers, player1, player2);
  }

  public void setMemento(MementoSL memento) {
    this.state = memento.getState();
    String buffer[] = this.state.split("&");
    this.name = buffer[0];
    this.line = buffer[1];
    listOfPlayers = memento.getList();
    player1 = memento.getPlayer1();
    player2 = memento.getPlayer2();
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
