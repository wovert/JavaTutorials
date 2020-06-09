package com.wovert.multition;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
  
  private static int maxNumOfEmperor = 2; // max 2 man
  private static ArrayList<String> emperorInfoList = new ArrayList<String>(maxNumOfEmperor);
  private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>(maxNumOfEmperor);
  private static int countNumOfEmperor = 0;

  static {
    for (int i=0; i<maxNumOfEmperor; i++) {
      emperorList.add(new Emperor("King" + (i+1)));
    }
  }

  private Emperor(String info) {
    emperorInfoList.add(info);
  }

  public static Emperor getInstance() {
    Random random = new Random();
    countNumOfEmperor = random.nextInt(maxNumOfEmperor);
    return (Emperor)emperorList.get(countNumOfEmperor);
  }

  public static void emperorInfo() {
    System.out.println(emperorInfoList.get(countNumOfEmperor));
  }
}