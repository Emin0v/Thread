package main;

import main.thread.Consumer;
import main.thread.Producer;


public class Main {
    
    public static void main(String[] args) throws InterruptedException {
        
        Producer p = new Producer();
        
        Consumer c1 = new Consumer("1");
        Consumer c2 = new Consumer("2");
        Consumer c3 = new Consumer("3");
        Consumer c4 = new Consumer("4");
        
        p.start();
        Thread.sleep(3000);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
       
    }


