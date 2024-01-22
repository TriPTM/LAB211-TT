
package view;

import Library.Utils;
import controller.TextController;
import model.Text;

public class TextMenu {
    private Utils ut= new Utils();
    private Text text;
    
    public void readFile(){
        String fName= ut.getString("Enter file want to read");
        text=new Text(fName);
        System.out.println(text.getText());
    }
    
    public void saveFile(){
        String fName= ut.getString("Enter file want to save");
        System.out.println("Saving...");
        text.saveData(fName);
    }
    
    public void normalize(){
        text.setText(TextController.normalizeText(text.getText()));
        System.out.println("Normalize successful.");
    }
}
