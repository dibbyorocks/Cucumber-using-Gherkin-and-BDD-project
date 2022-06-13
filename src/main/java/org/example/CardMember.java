package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CardMember {
    int Quantity;
    public void addname(String name) {

        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the name----->");
        name=sc.next();
        System.out.println(" "+name);

    }

    public void addorders(String drinkname, Integer cost) {
        Map<String,Integer> order=new HashMap<>();
        order.put(drinkname,cost);
    }


    public int getquantity(int q) {
        //int q=0;
      q=0;
      q+=Quantity;
      return q;
    }
}
