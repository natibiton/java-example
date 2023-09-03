package org.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Test exception - which exception is thrown? the myE which extends Exception? or Exception?
public class ExceptionQ {
    public static void main(String[] args) {

        try {
            throw new Exception("test");
        } catch (myE Ex) {
            System.out.println("mye");
        } catch (Exception ex) {
            System.out.println("ex"); //This one is thrown since we are looking for the most accurate exception
        }
    }

    class myE extends Exception {

    }
}