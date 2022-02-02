package objects;

public class Table {

    int waterLevel;
    int tableNumber;

    public Table(int tableNumber, int waterLevel){
        this.tableNumber = tableNumber;
        this.waterLevel = waterLevel;
    }

    public boolean needRefill(){
        if (waterLevel < 50){
            return true;
        }
        return false;
    }

    public String refill(){
        waterLevel = 100;
        return "*refilling*";
    }

    public int getTable(){
        return tableNumber;
    }


    
}
