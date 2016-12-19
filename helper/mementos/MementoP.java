package helper.mementos;

import helper.Fact;
import helper.StoryLine;

import java.util.List;

/**
 * Created by Лепрекон on 16.12.2016.
 */
public class MementoP {
  private final String state;
  private final List<Fact> listOfFacts;
  private final List<StoryLine> listOfSL;

  public MementoP(String state, List<Fact> listOfFacts, List<StoryLine> listOfSL) {
    this.state = state;
    this.listOfFacts = listOfFacts;
    this.listOfSL = listOfSL;
  }

  public String getState() {
    return state;
  }

  public List<Fact> getListOfFacts() {
    return listOfFacts;
  }

  public List<StoryLine> getListOfSL() {
    return listOfSL;
  }
}
