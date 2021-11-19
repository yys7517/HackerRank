package JAVA;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
    private static Scanner sc = new Scanner( System.in );
    private static Stack<Integer> inBox = new Stack();
    private static Stack<Integer> outBox = new Stack();

    public static void enqueue( int value ) {
        inBox.add( value );
    }

    public static int dequeue() {
        if ( outBox.isEmpty() ) {
            while ( ! inBox.isEmpty() ) {
                outBox.add( inBox.pop() );
            }
        }
        return outBox.pop();
    }

    public static void print() {
        if ( outBox.isEmpty() ) {
            while ( ! inBox.isEmpty() ) {
                outBox.add( inBox.pop() );
            }
        }
        System.out.println( outBox.peek() );
    }

    public static void main(String[] args) {
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
           int query = sc.nextInt();
           switch ( query ) {
               default:
               case 1 :
                   int value = sc.nextInt();
                   enqueue(value);
                   break;
               case 2 :
                   dequeue();
                   break;
               case 3:
                   print();
                   break;

           }

        }

    }




}

