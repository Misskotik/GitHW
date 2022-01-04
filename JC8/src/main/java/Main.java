
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

            DbHandler dbHandler = new DbHandler();
            Weather weatheR = new Weather(1, "Moscow", "20-12-21",  "cold", "-15");

        dbHandler.addWeather(weatheR);


    }

}
