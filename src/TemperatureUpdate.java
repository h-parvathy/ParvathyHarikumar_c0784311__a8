public class TemperatureUpdate {
    StringBuilder str = new StringBuilder();


    int windSpeed; //speed of wind in miles per hour
    int temperature; //temperature in Celsius
    int feelLikeTemp; //unknown degrees
    String day; //day of the week

    public void FeelLikeTemp(int windSpeed, int temperature, String day) {
        this.windSpeed = windSpeed;
        this.temperature = temperature;
        this.day = day.toUpperCase();
        calcFeelLikeTemp();
    }

    public void calcFeelLikeTemp()
    {
        feelLikeTemp = temperature * windSpeed;
    }

    @Override
    public String toString() {
        //to print Object
        StringBuilder sb= new StringBuilder();
        sb.append("Today is "+day);
        sb.append("\nWind Speed : "+windSpeed+" mph");
        sb.append("\nTemperature : "+temperature+" Celsius");
        sb.append("\nFeels Like Temperature : "+feelLikeTemp);
        return new String(sb);
    }
}
