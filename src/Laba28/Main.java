package Laba28;

import java.util.regex.Pattern;

public class Main {
    static String cut(String str){
        int first_pos = 0, second_pos = 0;
        for(int i = 0; i < str.length(); i++)
            if(str.charAt(i) == '(')
                first_pos = i;
            else if(str.charAt(i) == ')') {
                second_pos = i;
                break;
            }
        return str.substring(first_pos, second_pos+1);
    }
    public static void main(String[] args){
        String regex = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        String[] ip_addresses = {
                "127.0.0.1",
                "255.255.255.0",
                "128.127.234.9",
                "1300.6.7.8",
                "abc.def.gha.bcd",
                "999.999.999.999"};
        for (String ip_address : ip_addresses)
            System.out.print(Pattern.matches(regex, ip_address) ? ip_address + '\n': "");
        System.out.println("-----");
        String[] expressions = {
                "(((3+5)-9*4)-7)+11",
                "(3-7)*(2-6)",
                "((5+6)-8",
                "(6-1+)-1",
                "7-2*(7-6)*4/7",
                "6*((2+7)-3)",
                "5-1/(4-)"};
        String[] expressions_copy = expressions.clone();
        int id = 0;
        for(String expression : expressions_copy) {
            int count1 = 0, count2 = 0;
            boolean matches_regex = true;
            for(int i = 0; i < expression.length(); i++)
                if(expression.charAt(i) == '(')
                    count1++;
                else if(expression.charAt(i) == ')')
                    count2++;
            if(count1 != count2)
                matches_regex = false;
            else
                for(int i = 0; i < count1; i++){
                    if(Pattern.matches("\\(?[0-9|x]([+\\-*/][0-9|x])*\\)?", cut(expression))) {
                        expression = expression.replace(cut(expression), "x");
                        matches_regex = true;
                    }
                    else
                        matches_regex = false;
                }
            System.out.print(matches_regex ? expressions_copy[id] + '\n' : "");
            id++;
        }
    }
}