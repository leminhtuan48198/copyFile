import java.io.*;
import java.util.Scanner;

public class Clone {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Moi ban nhap URL file goc");
        String sourceFileURL=scanner.nextLine();
        System.out.println("Moi ban nhap ten file dich");
        String targetFileName=scanner.nextLine();

       try{
           File sourceFile=new File(sourceFileURL);

        File targetFile=new File(targetFileName);
        if(targetFile.exists()){
            System.out.println("file da ton tai");
        }
        FileReader fileReader=new FileReader(sourceFile);
        FileWriter fileWriter =new FileWriter(targetFile);
        int ch;
        int count=0;
        while ((ch=fileReader.read())!=-1){
           fileWriter.write(ch);
            count++;
        }
        System.out.println("So ki tu da sao chep la "+count);
        fileWriter.close();
        fileReader.close();
       } catch(IOException e){
           System.out.println("file goc khong ton tai");
       }

    }

}
