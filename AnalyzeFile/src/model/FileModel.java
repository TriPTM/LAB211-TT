
package model;

public class FileModel {
    private String linkFile;

    public FileModel() {
    }

    public FileModel(String linkFile) {
        this.linkFile = linkFile;
    }

    public String getLinkFile() {
        return linkFile;
    }

    public void setLinkFile(String linkFile) {
        this.linkFile = linkFile;
    }
    
    public String getPath(){
        String path = linkFile;
        return path.substring(0, path.lastIndexOf("\\"));
    }
    
    public String getFileName(){
        String fileName = linkFile;
        return fileName.substring(fileName.lastIndexOf("\\")+1, fileName.lastIndexOf("."));
    }
    
    public String getExtension(){
        String extension = linkFile;
        return extension.substring(extension.lastIndexOf(".")+1);
    }
    
    public String getDisk(){
        String disk = linkFile;
        return disk.substring(0,disk.indexOf(":")+1);
    }
    
    public String[] getFolders(){
        String folder = linkFile;
        folder=folder.substring(folder.indexOf("\\")+1,folder.lastIndexOf("\\"));
        return folder.split("\\\\");
    }
}
