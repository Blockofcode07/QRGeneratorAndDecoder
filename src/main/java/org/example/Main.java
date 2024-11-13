package org.example;

//QRGenerator Class based on content


import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    try{

        File file =new File("C:\\Users\\adity\\OneDrive\\Desktop\\apurwa.jpg");
//        Scanner sc =new Scanner(System.in);
//        System.out.print(" Enter your input: ");
        String content = "Oyye! tula tujhya boifrnd sathi secret message lihun deu ka asa?? ";


        ByteArrayOutputStream out = QRCode.from(content).to(ImageType.PNG).stream();
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(out.toByteArray());

        System.out.println("QR generated");
    } catch(Exception e){

        e.printStackTrace();
    }

    }
}