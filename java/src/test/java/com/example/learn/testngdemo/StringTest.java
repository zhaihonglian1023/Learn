package com.example.learn.testngdemo;
import org.testng.annotations.Test;


public class StringTest {
//    public static void main(String[] args) {
//        StringTest stringTest = new StringTest();
//        System.out.println(stringTest.reverse("sbhfusc",2,4));
//    }
    public String reverse(String str, int startIndex, int endIndex){
            String reverseStr = str.substring(0, startIndex);
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
                System.out.println(reverseStr);
            }
            reverseStr += str.substring(endIndex+1);
            return reverseStr;
    }
    public String reverse2(String str, int startIndex, int endIndex){
        String reverseStr = str.substring(0, startIndex);
        for (int i = endIndex; i >= startIndex; i--) {
            reverseStr += str.charAt(i);
            System.out.println(reverseStr);
        }
        reverseStr += str.substring(endIndex+1);
        return reverseStr;
    }
    public String reverse3(String str, int startIndex, int endIndex){
        char[] arr = str.toCharArray();
        for(int x=startIndex,y=endIndex;x<y;x++,y--){
            char temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return new String(arr);
    }
    public String MaxString(String str1, String str2){
        String maxStr = (str1.length() >= str2.length())? str1:str2;
        String minStr = (str1.length() < str2.length())? str1:str2;
        int length = minStr.length();
        for (int i = 0; i < length; i++) {
            for (int x=0,y=length-i;y<=length;x++,y++){
                String subStr = minStr.substring(x,y);
                if(maxStr.contains(subStr)){
                    return subStr;
                }
            }
        }
        return null;
    }

    @Test
    public void testReverse(){
        String str = "abcdefg";
        String reverse  = reverse3(str,2,6);
        System.out.println(reverse);
    }

    @Test
    public void TestMaxString(){
        String str1 = "abchhjdssec";
        String str2 = "awhhjdsdd";
        String maxStr = MaxString(str1,str2);
        System.out.println(maxStr);
    }
}
