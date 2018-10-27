package com.test;

public class AA {
    public static void main(String[] args) {

        AA aa=new AA();

        System.out.println(aa.panduan("aadda".toCharArray()));

        String str1="";
        int len=0;
        String str ="abcddcba";
        for (int i = 0; i <str.length()-1 ; i++) {
            for (int j = i+1; j <str.length() ; j++) {

                String s2=str.substring(i,j+1);
               // System.out.println(s2+" --- "+i+"----"+j);
                char[] arr=s2.toCharArray();
                if (aa.panduan(arr)==true&&arr.length>len) {


                    len = arr.length;
                    System.out.println("len=="+len);
                    System.out.println("S2==="+s2);
                    str1 = s2;
                }
            }
        }

        System.out.println(str1);
    }





    public  boolean panduan(char [] c){
    boolean a=true;
        for (int i = 0; i <c.length/2 ; i++) {
            if (c[i]==c[c.length-1-i]&&a==true){
                a=true;
            }else{
                a=false;
            }
        }

    return  a;
    }

}
