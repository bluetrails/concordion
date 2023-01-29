package org.example;

public class LegalEntity {
    String country;
    String shortN;
    String extRef;
    public LegalEntity(String shortN, String ext, String country){
        this.shortN = shortN;
        this.country = country;
        this.extRef = ext;
    }

    public String getCountry(){
        return country;
    }

    public int countLettersInShort(){
        int count = 0;
        for (int i = 0 ;i < shortN.charAt(0); i++){
            count++;
        }
        return count;
    }
}
