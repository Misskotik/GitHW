
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbHandler {

    private final String PATH_TO_DB = "jdbc:sqlite:src/main/resources/weatheR.db";
    private Connection connection;

    public DbHandler() throws SQLException {
//
        DriverManager.registerDriver(new JDBC());
        this.connection = DriverManager.getConnection(PATH_TO_DB);


    }

    public void addWeather(Weather weatheR) throws SQLException {
        try  (PreparedStatement ps = this.connection.prepareStatement(
                "INSERT INTO weatheR ('id', 'city', 'localDate', 'weatherText', 'temperature') VALUES (?, ?, ?, ?, ?)"
        )) {

            ps.setObject(1, weatheR.getId());
            ps.setObject(2, weatheR.getCity());
            ps.setObject(3, weatheR.getLocalDate());
            ps.setObject(4, weatheR.getWeatherText());
            ps.setObject(5, weatheR.getTemperature());
            ps.execute();
//            ResultSet rs = ps.executeQuery("select * from weatheR;");
//            while (rs.next()) {
//                System.out.println("city = " + rs.getString("city"));
//                System.out.println("localDate = " + rs.getString("localDate"));
//                System.out.println("weatherText = " + rs.getString("weatherText"));
//                System.out.println("temperature = " + rs.getString("temperature"));
            } catch(SQLException e){
                e.printStackTrace();
            }

        }



        }



