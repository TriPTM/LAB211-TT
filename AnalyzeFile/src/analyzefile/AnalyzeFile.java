
package analyzefile;

import controller.FileController;
import model.FileModel;
import view.FileView;

public class AnalyzeFile {

    public static void main(String[] args) {
        FileModel model = new FileModel();
        FileView view = new FileView();
        new FileController(model,view).run();
    }
    
}
