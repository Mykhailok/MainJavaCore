package module3.homework.questions.filesystem;

public class FileSystem {
    private  byte SystemCode;
    private  long capacityInBytes;
    private  String name;
    private  int foldersCount;
    private  int filesCount;

    public FileSystem(byte systemCode, long capacityInBytes, String name, int foldersCount, int filesCount) {
        this.SystemCode = systemCode;
        this.capacityInBytes = capacityInBytes;
        this.name = name;
        this.foldersCount = 0;
        this.filesCount = 0;
    }

    public void setFoldersCount(){
        this.foldersCount++;
    }

    public void setFilesCount(){
        this.filesCount++;
    }

}
