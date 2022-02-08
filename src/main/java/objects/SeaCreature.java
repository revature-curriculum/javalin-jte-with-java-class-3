package objects;

public class SeaCreature {

    String name;
    int hungerLevel;
    int age;

    public SeaCreature(String name, int hungerLevel, int age){
      this.name = name;
      this.hungerLevel = hungerLevel;
      this.age = age;
    }

    public String getName(){
      return name;
    }

    public int getHungerLevel(){
      return hungerLevel;
    }

    public int getAge(){
      return age;
    }

    public String feed(){
      hungerLevel = 100;
      return "*Feeding*";
    }

    public boolean needFeed(){
      if (hungerLevel < 25) {
        return true;
      }
      return false;
    }

    public void timeSkip(){
      if (hungerLevel < 15){
            hungerLevel = 0;
        }
        else {
            hungerLevel -= 15;
        }
    }
    
}
