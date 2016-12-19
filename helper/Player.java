package helper;

import helper.mementos.MementoP;

import java.util.List;

/**
 * Created by Лепрекон on 09.12.2016.
 */
public class Player extends Composite {
  private String name;
  private String legend;
  private String state = name + "&" + legend;
  private List<Fact> listOfFacts;
  private List<StoryLine> listOfSL;

  @Override
  public String getName() {
    return this.name;
  }

  public void ChangeName(String newName) {
    this.name = newName;
  }

  public String GetLegend() {
    return this.legend;
  }

  public void ChangeLegend(String newLegend) {
    this.legend = newLegend;
  }

  public List<Fact> getListOfFacts() {
    return this.listOfFacts;
  }

  public void setListOfFacts(List<Fact> newList) {
    this.listOfFacts = newList;
  }

  public List<StoryLine> getListOfSL() {
    return this.listOfSL;
  }

  public void setListOfSL(List<StoryLine> newList) {
    this.listOfSL = newList;
  }

  public MementoP createMemento() {
    return new MementoP(state, listOfFacts, listOfSL);
  }

  public void setMemento(MementoP memento) {
    this.state = memento.getState();
    String buffer[] = this.state.split("&");
    this.name = buffer[0];
    this.legend = buffer[1];
    listOfFacts = memento.getListOfFacts();
    listOfSL = memento.getListOfSL();
  }

  @Override
  public void add(Instance element) {
    listOfFacts.add((Fact) element);
  }

  @Override
  public void remove(Instance element) {
    listOfFacts.remove((Fact) element);
  }

  public void addSL(Instance element) {
    listOfSL.add((StoryLine) element);
  }

  public void removeSL(Instance element) {
    listOfSL.remove((StoryLine) element);
  }
}
