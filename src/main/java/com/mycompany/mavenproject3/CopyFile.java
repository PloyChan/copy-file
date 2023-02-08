package com.mycompany.mavenproject3;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) throws Throwable{
        //java CopyFile source dest.
        String sourceFile = args[0];
        String destinationFile = args[1];
        try(InputStream in = new FileInputStream(sourceFile);
                OutputStream file = new FileOutputStream(destinationFile)){
            
                    while(true){
                        int b = in.read();
                            if(b == -1){
                                break;
                            } 
                    file.write((char)b);
                    }
            }
   }
}

