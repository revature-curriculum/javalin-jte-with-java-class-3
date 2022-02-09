import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.Table;
import objects.SeaCreature;

public class Main {

    static ArrayList<Table> tables = new ArrayList<>();

    static ArrayList<SeaCreature> seaCreatures = new ArrayList<>();

    public static void main(String[] args) {

      // Adding tables to the tables array
      tables.add(new Table(1, 75));
      tables.add(new Table(2, 25));
      tables.add(new Table(3, 0));
      tables.add(new Table(4, 60));
        
      seaCreatures.add(new SeaCreature("Blobfish", 90, 22));
      seaCreatures.add(new SeaCreature("Sea Angel", 75, 5));
      seaCreatures.add(new SeaCreature("Peacock Mantis Shrimp", 55, 15));
      seaCreatures.add(new SeaCreature("Firefly Squid", 80, 75));



      Javalin app = Javalin.create().start(4100);

      app.get("/", ctx -> ctx.render("index.jte"));

      app.get("/waiter", waiterHandler);

      app.get("/timeSkip", timeSkipHandler);

      app.get("/seaCreatures", scHandler);

      app.get("/timeSkipSeaCreature", sctsHandler);

    }

    public static Handler waiterHandler = ctx -> {
        
        ctx.render("waiter.jte", Collections.singletonMap("tables", tables));

    };

    public static Handler timeSkipHandler = ctx -> {

        for (Table table : tables){
            table.timeSkip();
        }
        
        ctx.render("timeSkip.jte");

    };

    public static Handler scHandler = ctx -> {
        
        ctx.render("seaCreatures.jte", Collections.singletonMap("seaCreatures", seaCreatures));

    };

    public static Handler sctsHandler = ctx -> {

        for (SeaCreature sc : seaCreatures){
            sc.timeSkip();
        }
        
        ctx.render("timeSkipSeaCreature.jte");

    };




}
