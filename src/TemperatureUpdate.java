import java.util.ArrayList;

public class TemperatureUpdate {
    StringBuilder statement = new StringBuilder();

    ArrayList<String> day = new ArrayList<String>(); //day of the week
    ArrayList<Double> windSpeed = new ArrayList<Double>(); //speed of wind in miles per hour
    ArrayList<Double> temp = new ArrayList<Double>(); //temperature in Celsius
    Double feelLikeTemp;

    // Constructor method
    public TemperatureUpdate(Double temp, Double windSpeed, String day) {
        this.windSpeed.add(windSpeed);
        this.temp.add(temp);
        this.day.add(day.toUpperCase());
        this.feelLikeTemp = calcFeelLikeTemp();
    }

    //Calculate Fell Like Temperature
    public double calcFeelLikeTemp()
    {
        int size = day.size(); // latest updated
        return ((this.temp.get(size-1)) * (this.windSpeed.get(size-1)));
    }

    // Final String to display
   public StringBuilder makeString(){

       for(int i =0; i<day.size();i++) {
           this.statement.append("Day:\t");
           this.statement.append(this.day.get(i));
           this.statement.append("\n");
           this.statement.append("Temperature:\t");
           this.statement.append(this.temp.get(i));
           this.statement.append("\n");
           this.statement.append("Wind Speed:\t");
           this.statement.append(this.windSpeed.get(i));
           this.statement.append("\n");
           this.statement.append("Feels Like Temperature:\t");
           this.statement.append(this.feelLikeTemp);
           this.statement.append("\n\n");

       }

       return this.statement;
   }
}
