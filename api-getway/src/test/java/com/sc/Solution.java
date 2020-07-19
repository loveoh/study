package com.sc;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by loveoh on 2020/7/6.
 */
public class Solution {

    private Map map;

    public Solution() {
        this.map = new HashMap<Character,Character>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0 ; i< s.length();i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                char element = stack.isEmpty() ? '%' : stack.pop();

                if (element != (char)map.get(c)){
                    return false;
                }
            } else{
                stack.push(c);
            }


        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean flag = solution.isValid("()");
        System.out.println(flag);
    }
}
