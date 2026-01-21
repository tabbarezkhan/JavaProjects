package org.example.interview;

public class InterView {
    public static void main(String[] args) {
        int size =12;
        for (int i = 1; i <=size ; i++) {
            {
                for (int j = 1; j <=size ; j++) {
                    System.out.printf("%4d",i*j);
                }
                System.out.println("");
            }
        }


    }
}
