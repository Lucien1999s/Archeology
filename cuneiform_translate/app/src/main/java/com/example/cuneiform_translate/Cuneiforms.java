package com.example.cuneiform_translate;

public class Cuneiforms {
    protected String language;

    public Cuneiforms(String language){
        this.language = language;
    }
    public int match(String text){
        int index;
        int pLen = text.length();
        int sLen = language.length();

        if(pLen<sLen){
            return -1;
        }

        int i = 0;
        int j = 0;

        while (i<pLen && j<sLen){
            if (text.charAt(i)==language.charAt(j)){
                i++;
                j++;
            }
            else {
                i = i-j+1;
                j = 0;
            }
        }
        if (j>=sLen){
            index = i-j;
            return index;
        }
        else {
            return -1;
        }
    }
    public String getLanguage(){
        return this.language;
    }
    public String getNewStr(String originalStr,String subStr){
        String New =originalStr.replaceAll(subStr,"");
        //New.replaceAll("  "," ");
        return New;
    }
}
