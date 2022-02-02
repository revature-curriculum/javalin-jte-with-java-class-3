import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.Table;

public class Main {

    static ArrayList<Table> tables = new ArrayList<>();

    // TO-DO create array for your new class

    public static void main(String[] args) {

      // Adding tables to the tables array
        tables.add(new Table(1, 75));
        tables.add(new Table(2, 25));
        tables.add(new Table(3, 0));
        tables.add(new Table(4, 60));
        
      // TO-DO add to your new array



        Javalin app = Javalin.create().start(4100);

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/waiter", waiterHandler);

        app.get("/timeSkip", timeSkipHandler);

        // TO-DO add routes

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

    // TO-DO create handlers




}
