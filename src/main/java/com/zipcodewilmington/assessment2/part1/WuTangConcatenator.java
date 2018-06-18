package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator{
    int input;

   public WuTangConcatenator(int input){
        this.input = input;
        }

    public Boolean isWuTang(){
       if(input % 3 == 0 && input % 5 == 0){
           return true;
       }
       return false;
    }

    public Boolean isWu(){
       if(input % 3 == 0){
           return true;
       }
       return false;
    }

    public Boolean isTang(){
       if(input % 5 == 0){
           return true;
       }
       return false;
    }

}
