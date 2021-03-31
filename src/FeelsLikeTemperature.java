import javax.swing.*;
import java.util.ArrayList;

public class FeelsLikeTemperature {
    public static void main(String[] args) {

        JFrame f;
        f = new JFrame();
        int input = JOptionPane.showConfirmDialog(null,
                "Hi! Wanna know what temperature feels like today??");
        while(input==0) {
            String inp = JOptionPane.showInputDialog("Enter the day, temperature and wind speed separated by spaces..");
            ArrayList<String> userInput = new ArrayList<String>(); //using ArrayList
            for (String s : inp.split(" ")) //inp.split(" ") returns an array of Strings
                userInput.add(s);
            String day = userInput.get(0);
            Double temp = Double.parseDouble(userInput.get(1));
            Double windSpeed = Double.parseDouble(userInput.get(2));

            TemperatureUpdate tempUpdate = new TemperatureUpdate(temp, windSpeed, day);
            JOptionPane.showMessageDialog(f, tempUpdate.makeString());

            input = JOptionPane.showConfirmDialog(null,
                    "Hi! Wanna know what temperature feels like today??");


        }


    }
}
