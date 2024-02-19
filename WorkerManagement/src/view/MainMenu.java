
package view;

public class MainMenu extends Menu {
    private static String[] mc={"Add a Worker","Increase salary for worker","Decrease for worker","Show adjusted salary worker information","Exit"};
    private WorkerView wView= new WorkerView();

    public MainMenu() {
        super("Worker Management", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: wView.addWorker();System.err.flush();break;
            case 2: wView.increaseSalary();System.err.flush();break;
            case 3: wView.decreaseSalary();System.err.flush();break;
            case 4: wView.show();break;
            case 5: System.exit(0);
        }
    }

}
