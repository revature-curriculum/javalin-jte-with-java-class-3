import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;
import objects.Table;

public class Main {

    static ArrayList<Table> tables = new ArrayList<>();

    public static void main(String[] args) {

        tables.add(new Table(1, 75));
        tables.add(new Table(2, 25));
        tables.add(new Table(3, 0));
        tables.add(new Table(4, 60));
        
        Javalin app = Javalin.create().start(4100);

        app.get("/", ctx -> ctx.render("index.jte"));

        app.get("/waiter", waiterHandler);

    }

    public static Handler waiterHandler = ctx -> {
        
        ctx.render("waiter.jte", Collections.singletonMap("tables", tables));

    };




}
