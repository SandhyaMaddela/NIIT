package com.jap.ballad;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ballad {
    public void writePoemToAFile(String fileName, String data){
        byte dataArray[]=data.getBytes();
        try{
            FileOutputStream file=new FileOutputStream(fileName);
            file.write(dataArray);
        }catch (IOException exception){
            System.out.println(exception);
        }
    }

    public static void main(String[] args) {

        String ballad = "'Twas the night before Christmas, when all through the house\n" +
                "Not a creature was stirring, not even a mouse;\n" +
                "The stockings were hung by the chimney with care,\n" +
                "In hopes that St. Nicholas soon would be there;\n" +
                "\n" +
                "The children were nestled all snug in their beds,\n" +
                "While visions of sugar-plums danced in their heads;\n" +
                "And mamma in her 'kerchief, and I in my cap,\n" +
                "Had just settled down for a long winter's nap,\n" +
                "\n" +
                "When out on the lawn there arose such a clatter,\n" +
                "I sprang from the bed to see what was the matter.\n" +
                "Away to the window I flew like a flash,\n" +
                "Tore open the shutters and threw up the sash.\n";
        // Call the function and write the ballad to the file
        Ballad b=new Ballad();
        b.writePoemToAFile("ballad.txt",ballad);
    }
}
