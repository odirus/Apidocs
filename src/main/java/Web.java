/**
 * Created by odirus on 2015/4/10.
 */
import static spark.Spark.*;

public class Web {
    public void start() {
        get("/", (req, res) -> "Hello");
    }
}
