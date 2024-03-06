
package managementccrm;

import controller.TaskController;
import model.TaskModel;
import view.TaskView;

public class ManagementCCRM {

    public static void main(String[] args) {
        TaskModel model = new TaskModel();
        TaskView view = new TaskView();
        new TaskController(model,view).run();
    }
    
}
