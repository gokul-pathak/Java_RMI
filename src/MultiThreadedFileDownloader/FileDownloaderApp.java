package MultiThreadedFileDownloader;

import java.io.IOException;

public class FileDownloaderApp {
    public void start() {
        String[] urls ={
                "https://cdn.pixabay.com/photo/2014/11/30/14/11/cat-551554_1280.jpg",
                "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg",
                "https://cdn.pixabay.com/photo/2017/12/11/15/34/lion-3012515_1280.jpg"
        };
        String destinationDirectory = "C:/Users/Gokul Pathak/Desktop/java-ls/Java_RMI/Test_Images/";
        for(String url : urls){
            String fileName = getFileName(url);
            String destinationPath = destinationDirectory + fileName;
            try{
                FileDownloader.downloadFile(url,destinationPath);
                System.out.println("Downloading from: " + url);
            }catch (IOException e){
                System.out.println("Failed to download from "+ url);
                e.printStackTrace();
            }
        }
    }

    private String getFileName(String url){
        String[] parts = url.split("/");
        String fileName = parts[parts.length - 1];
        // Remove invalid characters from the filename
        fileName = fileName.replaceAll("[^a-zA-Z0-9.-]", "_");
        return fileName;
    }
}
