package com.wovert.multition;

public class Minister {
  public static void main(String[] args) {
    int ministerNum = 10;

    for (int i=0; i<ministerNum; i++) {
      Emperor emperor = Emperor.getInstance();
      System.out.println("The " + (i+1) + "is access to ");
      emperor.emperorInfo();
    }    
  }
}