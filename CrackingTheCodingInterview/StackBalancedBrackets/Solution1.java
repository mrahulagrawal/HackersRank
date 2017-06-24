package CrackingTheCodingInterview.StackBalancedBrackets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Stack{
	class Node{
		char data;
		Node next;
		public Node(char x){
			data=x;
		}
	}
	
	Node top;
	
	public boolean isEmpty(){
		return top==null;
	}
	
	public char peek(){
		return top.data;
	}
	
	public void push(char i){
	   Node node=new Node(i);
	   node.next=top;
	   top = node;
	}
	
	public char pop(){
		char data=top.data;
		top=top.next;
		return data;
	}
}
public class Solution1 {
    
    public static boolean isBalanced(String expression) {
        HashMap<Character, Character> ref=new HashMap<Character, Character>();
        ref.put('}','{');
        ref.put(')','(');
        ref.put(']','[');

        HashSet<Character> close=new HashSet<Character>();
        close.add('}');
        close.add(')');
        close.add(']');
        
        Stack exp=new Stack();
        
        for(int i=0;i<expression.length();i++){
            char c=expression.charAt(i);
            
            if(close.contains(c)){
                if(exp.isEmpty()) return false;
                
                if(exp.peek()==ref.get(c)){
                	char t=exp.pop();
                	System.out.println(t);
                }
                else return false;
            }
            else{
               exp.push(c);
            }
        }
        
        return exp.isEmpty();
    }
  
    public static void main(String[] args) {
    	System.out.println( (isBalanced("{{}}")) ? "YES" : "NO" );
        /*Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }*/
    }
}
