import java.util.ArrayList;

public class NextHomework {
  ArrayList<GameCharacter> list = new ArrayList<>();
  private int limit = 5;

  public void addCharacter(GameCharacter c){
    if (list.size() < limit){
      list.add(c);
    } else {

    }
  }

  public String getCurrentSize(){
    return "";
  }
}