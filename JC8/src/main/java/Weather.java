public class Weather {
    private int id;
    private String city;
    private String localDate;
    private String weatherText;
    private String temperature;


    public String getCity() {
        return city;
    }

    public void setCity(String cityName) {
        this.city = city;
    }

    public Weather(int id, String city, String localDate, String weatherText, String temperature) {

        this.id = id;
        this.city = city;
        this.localDate = localDate;
        this.weatherText = weatherText;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLocalDate() {
        return localDate;
    }
    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }
    public String getWeatherText() {
        return weatherText;
    }
    public void setWeatherText(String weatherText) {
        this.weatherText = weatherText;
    }
    public String getTemperature() {
        return temperature;
    }
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }


}
