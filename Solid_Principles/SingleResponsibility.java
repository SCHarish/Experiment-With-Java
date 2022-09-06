public class SingleResponsibility{
    public static void main(String args[]){

    }


}

abstract class SingleResponsibility_Task{ // Violates Single Responsibility principle
    abstract void downloadFile(String file);
    abstract void parseFile(File file);
    abstract void saveFile();
}