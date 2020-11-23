package com.jessy.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTester {
    public static void main(String[] args) throws IOException {
        /*File kotlinDir = new File("D:\\kotlin_practice");
        kotlinDir.mkdir();*/
        FileWriter fw = new FileWriter("D:\\kotlin_practice\\output.txt");
        fw.write("abc");
        fw.flush();
        fw.close();
    }
}
