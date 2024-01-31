
package view;

public class MainMenu extends Menu {
    private static String[] mc={"Add Doctor","Update Doctor","Delete Doctor","Search Doctor","Exit"};
    private DoctorView dView= new DoctorView();

    public MainMenu() {
        super("Doctor Management", mc);
    }

    @Override
    public void execute(int ch) {
        switch(ch){
            case 1: dView.addDoctor();break;
            case 2: dView.updateDoctor();break;
            case 3: dView.deleteDoctor();break;
            case 4: dView.searchDoctor();break;
            case 5: System.exit(0);
        }
    }

}
