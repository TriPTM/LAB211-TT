
package analyzefile;

import controller.FileController;
import model.FileModel;
import view.FileView;

public class AnalyzeFile {

    public static void main(String[] args) {
        FileModel model = new FileModel();
        FileView view = new FileView();
        new FileController(model,view).run();
//        private static String checkInputString() {
//        while (true) {
//            String result = in.nextLine().trim();
//            if (result.length() == 0) {
//                System.err.println("Not empty.");
//            } else {
//                return result;
//            }
//        }
//    }
//
//    private static void checkInputPath() {
//        System.out.print("Please input Path: ");
//        String path = checkInputString();
//        File file = new File(path);
//        if (file.exists() && file.isFile()) {
//            System.out.println("Disk: " + getDisk(path));
//            System.out.println("Extension: " + getExtension(path));
//            System.out.println("File name: " + getFileName(path));
//            System.out.println("Path: " + getPath(path));
//        } else {
//            System.err.println("Path isn't file.");
//        }
//    }
//
//    private static String getPath(String path) {
//        int fromDisk = path.indexOf("\\");
//        int toNameFile = path.lastIndexOf("\\");
//        return path.substring(fromDisk + 1, toNameFile);
//    }
//
//    private static String getFileName(String path) {
//        int positionFrom = path.lastIndexOf("\\");
//        int positionTo = path.lastIndexOf(".");
//        return path.substring(positionFrom + 1, positionTo);
//    }
//
//    private static String getExtension(String path) {
//        int positionDot = path.lastIndexOf(".");
//        return path.substring(positionDot, path.length());
//    }
//
//    private static String getDisk(String path) {
//        int positionColon = path.indexOf("\\");
//        return path.substring(0, positionColon + 1);
//    }
//
//    private static String getForder(String path) {
//        int positionColon = path.indexOf("\\");
//        int positionDot = path.lastIndexOf("\\");
//        path = path.substring(positionColon, positionDot);
//        String[] splitFile = path.split("\\");
//        return splitFile[splitFile.length - 1];
//    }
    }
    
}
