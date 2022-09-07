package com.training.java.java8.files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class FileRead {

    public static void main(final String[] args) throws Exception {
        Path path = Paths.get("my.txt");
        List<String> readAllLinesLoc = Files.readAllLines(path);
        System.out.println(readAllLinesLoc);

        //        File fileLoc = new File("my.txt");
        //        FileInputStream fileInputStreamLoc = new FileInputStream(fileLoc);
        //        FileChannel channelLoc = fileInputStreamLoc.getChannel();
        //        ByteBuffer d = ByteBuffer.allocateDirect(1024);
        //        channelLoc.read(d);
        //        Reader readerLoc = new FileReader(fileLoc);
        //        BufferedReader bufferedReaderLoc = new BufferedReader(readerLoc);
        //        bufferedReaderLoc.readLine();

    }
}
