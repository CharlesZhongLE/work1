package work;

import work.simhash;
import work.txtrw;
import work.hammingdistance;

public class maincheck {

    public static void main(String[] args) {
        // 从命令行输入的路径名读取对应的文件，将文件的内容转化为对应的字符串
        String str0 = txtrw.readTxt(args[0]);
        String str1 = txtrw.readTxt(args[1]);
        String resultFileName = args[2];
        // 由字符串得出对应的 simHash值
        String simHash0 = simhash.getSimHash(str0);
        String simHash1 = simhash.getSimHash(str1);
        // 由 simHash值求出相似度
        double similarity = hammingdistance.getSimilarity(simHash0, simHash1);
        // 把相似度写入最后的结果文件中
        txtrw.writeTxt(similarity, resultFileName);
        // 退出程序
        System.exit(0);
    }

}