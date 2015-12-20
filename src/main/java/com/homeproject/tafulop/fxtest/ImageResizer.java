/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.homeproject.tafulop.fxtest;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.coobird.thumbnailator.Thumbnails;

/**
 * This class stores the image resize related methods.
 * 
 * @author fulop
 */
public final class ImageResizer {
    
    public static Integer resizeImages(File[] pictures, Integer x, Integer y) {

        Integer resizedCnt = 0;

        for (File pic : pictures) {
            try {
                Thumbnails.of(pic).size(1024, 768).toFile(FileHandling.getResizedFile(pic));
                resizedCnt++;
            } catch (IOException ex) {
                Logger.getLogger(FXMLController.class.getName()).log(Level.SEVERE, "Atmeretezes nem sikerult", ex);
            }
        }

        return resizedCnt;

    }

}
