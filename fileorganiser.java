import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class fileorganiser{
    public static void main(String args[]){
        String path="C:\\Users\\laksn\\OneDrive\\Desktop\\fileorhaniser";
        File folder=new File(path);
        if(!folder.exists() || !folder.isDirectory()){
            System.out.println("Invalid folder path");
            return;
        }
        File[] files=folder.listFiles();
        if (files==null){
            System.out.println("no files found");
            return;
        }
        for(File file:files){
            if(file.isFile()){
                String filename=file.getName().toLowerCase();
                String Catogory=getCatogory(filename);
                File Catogoryfolder=new File(path + file.separator+Catogory);
                if(!Catogoryfolder.exists()){
                    Catogoryfolder.mkdir();
                }
                File destination=new File(Catogoryfolder,file.getName());
                try{
                    Files.move(
                        file.toPath(),
                        destination.toPath(),
                        StandardCopyOption.REPLACE_EXISTING
                    );
                    System.out.println(file.getName()+" moved to "+ Catogory);

                }catch(IOException e){
                    System.out.println("error moving files "+file.getName());
                }

            }
        }
        System.out.println("file organization completed");
    }
    private static String getCatogory(String filename){
        if(filename.endsWith(".jpg")||
        filename.endsWith(".jpeg")||
        filename.endsWith(".png")||
        filename.endsWith(".gif")){
            return "images";
        }
        if(filename.endsWith(".pdf")||
        filename.endsWith(".doc")||
        filename.endsWith(".docs")||
        filename.endsWith(".txt")){
            return "Documents";
        }
        if(filename.endsWith(".mp4")||
        filename.endsWith(".avi")||
        filename.endsWith(".mkv")){
            return "vedios";
        }
        if(filename.endsWith(".mp3")||
        filename.endsWith(".wav")){
            return "audio";
        }
        return "others";

    }

}
