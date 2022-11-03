package reverse_string;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Stack<String> wstack = new Stack<>();
        String mWord = "java string split method by viettuts";
        String[] wordss = mWord.split(" ");
        for(String s:wordss){
            wstack.push(s);
        }
        while (!wstack.empty())
            System.out.println(wstack.pop().toString());
    }
}


