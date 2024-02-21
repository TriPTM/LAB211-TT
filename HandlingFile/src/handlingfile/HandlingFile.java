
package handlingfile;

import controller.FileController;
import model.FileProgram;
import view.FileView;

public class HandlingFile {

    public static void main(String[] args) {
        FileProgram model = new FileProgram();
        FileView view = new FileView();
        new FileController(model,view).run();
    }
    
}
