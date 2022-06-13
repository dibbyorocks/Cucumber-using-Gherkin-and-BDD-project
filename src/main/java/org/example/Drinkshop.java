package org.example;

public class Drinkshop {
    int noofdrinks;
    int price;



    public int gettotalamount(int noofdrinks,int price)
    {
        return noofdrinks*price;

    }

    public int getcount(int c,int p) {

             c=noofdrinks;
            if (c > 1)
                return p%2;
            else
                return p;
    }

}

