package com.wovert.javase.compare;

import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog dog, Dog dog2) {
        if (dog.getAge() < dog2.getAge()) {
            return -1;
        } else if (dog.getAge() > dog2.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
