/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.homeproject.tafulop.fxtest;

import java.io.File;
import static org.apache.commons.io.IOUtils.DIR_SEPARATOR;


/**
 *
 * @author fulop
 */
public final class FileHandling {
    
    private static final String RESIZED_FOLDER_NAME = "atmeretezett";
    
    /**
     * Returns a File which points to the newly created resized file. Automatically created the necessary folders.
     * @param toResize The File that should be resized.
     * @return The File points to the new, resized file.
     */
    public static File getResizedFile(File toResize){
        
        File resizedFolder = checkResizedFolder(toResize.getParent()); 
        File resizedFile = new File(resizedFolder.getAbsolutePath() + DIR_SEPARATOR + toResize.getName());   
        return resizedFile;
    }
    
    
   /**
    * Creates a folder to store the resized images.
    * @param parentFolder The parent folder path in string representation, where the resized folder should be created as a child.
    * @return The folder where the resized files should be stored.
    */ 
   private static File checkResizedFolder(String parentFolder){
       
       File resizedFolder = new File(parentFolder + DIR_SEPARATOR + RESIZED_FOLDER_NAME);
       resizedFolder.mkdirs();
       return resizedFolder;  
   }
    
}
