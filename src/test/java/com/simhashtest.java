package com;

import org.junit.Test;

@SuppressWarnings("ALL")
public class simhashtest {

    @Test
    public void getHashTest(){
        String[] strings = {"林俊杰", "是", "一位", "顶级", "的", "歌手"};
        for (String string : strings) {
            String stringHash = simhash.getHash(string);
            System.out.println(stringHash.length());
            System.out.println(stringHash);
        }
    }

    @Test
    public void getSimHashTest(){
        String str0 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        String str1 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_add.txt");
        System.out.println(simhash.getSimHash(str0));
        System.out.println(simhash.getSimHash(str1));
    }

}
