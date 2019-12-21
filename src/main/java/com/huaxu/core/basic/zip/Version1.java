package com.huaxu.core.basic.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * <p>项目名称: core</p>
 * <p>文件名称: Version1</p>
 * <p>文件描述: </p>
 * <p>创建日期: 2019/09/06 15:43</p>
 * <p>创建用户：huaxu</p>
 */
public class Version1 {

    public static String JPG_FILE = "/Users/huaxu/Downloads/1563861564.png";
    public static String ZIP_FILE = "/Users/huaxu/Downloads/huaxu.zip";
    public static String FILE_NAME = "huaxu.zip";

    public static void zipFileNoBuffer() {
        File zipFile = new File(ZIP_FILE);
        try (ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile))) {
            //开始时间
            long beginTime = System.currentTimeMillis();

            for (int i = 0; i < 10; i++) {
                try (InputStream input = new FileInputStream(JPG_FILE)) {
                    zipOut.putNextEntry(new ZipEntry(FILE_NAME + i));
                    int temp = 0;
                    while ((temp = input.read()) != -1) {
                        zipOut.write(temp);
                    }
                }
            }
            System.out.println(System.currentTimeMillis()-beginTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        zipFileNoBuffer();
    }
}