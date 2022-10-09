package com.driver;

public class Main {
static class Product{
    public int product(int x, int y) {
      return x+y;
    }
    public int product(int x, int y, int z) {
         return x+y+z;
    }
    public double product(double x, double y) {

     return x+y;
    }
}

    public static void main(String[] args) {
        Product p = new Product();
        int x=0,y=0,z=0;
        double a=0,b=0;

        p.product(x,y);

        p.product(x,y,z);

        p.product(a,b);

    }

}