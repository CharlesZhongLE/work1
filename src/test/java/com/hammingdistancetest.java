package com;

import org.junit.Test;

@SuppressWarnings("ALL")
public class hammingdistancetest {

    @Test
    public void getHammingDistanceTest() {
        String str0 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        String str1 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_add.txt");
        int distance = hammingdistance.getHammingDistance(simhash.getSimHash(str0), simhash.getSimHash(str1));
        System.out.println("海明距离：" + distance);
        System.out.println("相似度: " + (100 - distance * 100 / 128) + "%");
    }

    @Test
    public void getHammingDistanceFailTest() {
        // 测试str0.length()!=str1.length()的情况
        String str0 = "10101010";
        String str1 = "1010101";
        System.out.println(hammingdistance.getHammingDistance(str0, str1));
    }

    @Test
    public void getSimilarityTest() {
        String str0 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        String str1 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_add.txt");
        int distance = hammingdistance.getHammingDistance(simhash.getSimHash(str0), simhash.getSimHash(str1));
        double similarity = hammingdistance.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        System.out.println("str0和str1的汉明距离: " + distance);
        System.out.println("str0和str1的相似度:" + similarity);
    }

}
