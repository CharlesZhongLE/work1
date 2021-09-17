package com;

import org.junit.Test;

@SuppressWarnings("ALL")
public class txtrwtest {

    @Test
    public void readTxtTest() {
        // 路径存在，正常读取
        String str = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        String[] strings = str.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }
    }

    @Test
    public void writeTxtTest() {
        // 路径存在，正常写入
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            txtrw.writeTxt(elem[i], "C:/Users/86136/Desktop/testtxt/ans1.txt");
        }
    }

    @Test
    public void readTxtFailTest() {
        // 路径不存在，读取失败
        String str = txtrw.readTxt("C:/test/none.txt");
    }

    @Test
    public void writeTxtFailTest() {
        // 路径错误，写入失败
        double[] elem = {0.11, 0.22, 0.33, 0.44, 0.55};
        for (int i = 0; i < elem.length; i++) {
            txtrw.writeTxt(elem[i], "C:/Users/86136/Desktop/esttxt/ans1.txt");
        }
    }

}
