package org.example;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;

public class QrReader {

    public static void main(String[] args) {

        try{

            JFileChooser ch =new JFileChooser();
            ch.showOpenDialog(null);
            File file = ch.getSelectedFile();

//            File file =new File("C:\\Users\\adity\\OneDrive\\Desktop\\Jyothi.jpg");
s
            Result r = new MultiFormatReader().decode(new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(ImageIO.read(file)))));

//            System.out.println(r.getText());

            //JOptionPane.showMessageDialog(null,r.getText());
            JOptionPane.showMessageDialog(null,r.getText(),"QR content", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(file.getAbsolutePath()));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
