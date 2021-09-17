package com;

import com.hammingdistance;
import org.junit.Test;

@SuppressWarnings("ALL")
public class mainchecktest {

    @Test
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        str[1] = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_add.txt");
        str[2] = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_del.txt");
        str[3] = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_dis_1.txt");
        str[4] = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_dis_10.txt");
        str[5] = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_dis_15.txt");
        String ansFileName = "C:/Users/86136/Desktop/testtxt/origandAllTest.txt";
        for(int i = 0; i <= 5; i++){
            double ans = hammingdistance.getSimilarity(simhash.getSimHash(str[0]), simhash.getSimHash(str[i]));
            txtrw.writeTxt(ans, ansFileName);
        }
    }

    @Test
    public void origAndOrigTest(){
        String str0 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        String str1 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        String ansFileName = "C:/Users/86136/Desktop/testtxt/ansOrigAndOrigTest.txt";
        double ans = hammingdistance.getSimilarity(simhash.getSimHash(str0),simhash.getSimHash(str1));
        txtrw.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndAddTest(){
        String str0 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        String str1 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_add.txt");
        String ansFileName = "C:/Users/86136/Desktop/testtxt/ansOrigAndAddTest.txt";
        double ans = hammingdistance.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtrw.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDelTest(){
        String str0 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        String str1 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_del.txt");
        String ansFileName = "C:/Users/86136/Desktop/testtxt/ansOrigAndDelTest.txt";
        double ans = hammingdistance.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtrw.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis1Test(){
        String str0 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        String str1 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_dis_1.txt");
        String ansFileName = "C:/Users/86136/Desktop/testtxt/ansOrigAndDis1Test.txt";
        double ans = hammingdistance.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtrw.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis10Test(){
        String str0 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        String str1 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_dis_10.txt");
        String ansFileName = "C:/Users/86136/Desktop/testtxt/ansOrigAndDis10Test.txt";
        double ans = hammingdistance.getSimilarity(simhash.getSimHash(str0),simhash.getSimHash(str1));
        txtrw.writeTxt(ans, ansFileName);
    }

    @Test
    public void origAndDis15Test(){
        String str0 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig.txt");
        String str1 = txtrw.readTxt("C:/Users/86136/Desktop/testtxt/orig_0.8_dis_15.txt");
        String ansFileName = "C:/Users/86136/Desktop/testtxt/ansOrigAndDis15Test.txt";
        double ans = hammingdistance.getSimilarity(simhash.getSimHash(str0), simhash.getSimHash(str1));
        txtrw.writeTxt(ans,ansFileName);
    }

}
