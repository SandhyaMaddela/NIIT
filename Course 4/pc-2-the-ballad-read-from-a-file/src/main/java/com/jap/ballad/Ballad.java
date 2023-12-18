package com.jap.ballad;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ballad {
    public String readPoemFromAFile(String fileName){
       // Write the logic to read from a file
        String data=" ";
        String poem=" ";
        try{
            FileInputStream f=new FileInputStream(fileName);
            int line=f.read();
            while((line=f.read())!=-1){
                char c=(char)line;

            }

        }catch (IOException e){
            System.out.println(e);
        }
        return c;
    }


}
