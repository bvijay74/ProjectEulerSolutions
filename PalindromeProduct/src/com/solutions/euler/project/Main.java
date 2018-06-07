package com.solutions.euler.project;

public class Main {

    public static void main(String[] args) {
        int maxprod=0;

        for (int i=999; i>=100; i--) {
            for (int j=999;j>100; j--) {
                int prod=i*j;
                String nstr = Integer.toString(prod);
                StringBuilder sb = new StringBuilder();
                sb.append(nstr);
                sb = sb.reverse();
                if (sb.toString().equals(nstr))
                {
                    if (prod > maxprod)
                    {
                        maxprod = prod;
                        break;
                    }
                }
            }
        }

        System.out.println(maxprod);
    }
}
