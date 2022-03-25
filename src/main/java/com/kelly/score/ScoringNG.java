package com.kelly.score;

public class ScoringNG {
    public static void main(String[] args) {
        // 5 students each
        int[] englishs = {88,90,75,45,60};
        int[] maths = {90,100,50,77,62};
        String[]  name = {"Tank","Selina" ,"William" ,"jack","julia" };
        for (int i = 0; i < 5; i++) {
            if (i!= 1){
                System.out.println(name[i] + "\t" + englishs[i] + "\t" + maths[i] + "\t" + (englishs[i] + maths[i]) / 2);
            }
        }
    }
}
