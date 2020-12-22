/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.thread;

/**
 *
 * @author User
 */
public class Consumer extends Thread {

    private String name;

    public Consumer(String name) {

        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            int index = (Base.list.size() - 1);
            if (index > -1) {
                String s = Base.list.remove(index);

                System.out.println("s= " + s);
            }
        }
    }
}
