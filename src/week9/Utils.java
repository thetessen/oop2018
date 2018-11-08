package week9;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

public class Utils {

    public static String readContentFromFile(String path) {
        File file = new File(path);
        try (Scanner sc = new Scanner(file)) {
            String s;
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            printStackTrace();
        }
        return "";
    }

    public static String writeContentFromFile(String path) {
        File file = new File(path);
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println("Six");
        } catch (Exception e) {
        }
        return "";
    }

    public static String writeContentFromFile2(String path) {
        File file = new File(path);
        try (FileWriter fwr = new FileWriter(file, true);
                BufferedWriter bwr = new BufferedWriter(fwr);
                PrintWriter pwr = new PrintWriter(bwr)) {
            pwr.println("Six");
        } catch (Exception e) {
        }
        return "";
    }

    public static int findFile(String folderPath, String fileName) {
        File file = new File(folderPath);
        int check = 0;
        if  (file.exists()) {
            if (file.isFile()) {
                if (file.getName().equals(fileName)) {
                    System.out.println("Da tim thay file " + file.getAbsolutePath());  
                    return 1;
                }
            }
            File[] subFiles = file.listFiles();
            if (subFiles != null) {
                for (File f : subFiles) {
                    check = findFile(f.getAbsolutePath(), fileName);
                }
            }
        } 
        return check;
    }

    public static File findFileByName(String folderPath, String fileName) {
        if(findFile(folderPath,fileName)==0){
            System.out.println("File ko ton tai");
            return  new File("G:\\notfind");}
        return  new File("");
    }
    

    public static void main(String[] args) {
        //writeContentFromFile2("C:\\Github\\Test\\File1.txt");
        // findFileByName("C:\\Github\\Test\\","File2.txt");
        // findFileByName("C:\\Github\\Test\\","File2.txt");
        findFileByName("C:\\Github\\Test\\", "File2.txt");
           
    }
}
