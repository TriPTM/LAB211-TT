
package controller;

import model.FileModel;
import view.FileView;

public class FileController {
    private FileModel model;
    private FileView view;

    public FileController(FileModel model, FileView view) {
        this.model = model;
        this.view = view;
    }
    
    public void run(){
        view.displayMessage("===== Analysis Path Program =====");
        String linkFile = view.getString("Please input Path");
        try{
            model.setLinkFile(linkFile);
        } catch (Exception ex){
            view.displayMessage(ex.getMessage());
        }
        view.displayMessage("----- Result Analysis -----");
        view.displayMessage("Disk: " + model.getDisk());
        view.displayMessage("Extension: " + model.getExtension());
        view.displayMessage("File Name: " + model.getFileName());
        view.displayMessage("Path: " + model.getPath());
        view.displayFolders("Folders: ", model.getFolders());
    }
}
