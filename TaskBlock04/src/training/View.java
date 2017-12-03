package training;

import java.util.Locale;
import java.util.ResourceBundle;

import static training.TextConstant.*;

/**
 * Created by Viacheslav Skryl on 10.11.2017
 */

public class View {

    // Resource Bundle Installation's
    static String BUNDLE_NAME = "ApplicationResources";
    public static final ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_NAME,
    											new Locale("uk", "UA")); // Ukrainian
                    							//new Locale("en")); // English
    
    //Print to console
    public static void print(String toPrint) {
    	System.out.println(toPrint);
    }
    
    public void welcome() {
    	View.print(bundle.getString(WELCOME));
    }
    
}
