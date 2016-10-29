package com.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Animal {
   private final String noise;
   protected Animal(String noise) {
      this.noise = noise;
   }

   public void makeNoise() {
      System.out.println(noise);
   }
}

class Pig extends Animal {
    public Pig() {
       super("Oink");
    }
}

public class Test
{
    public static void main(String args[])
    {
        Pig p=new Pig();
        p.makeNoise();
    }
}
