package com.mga.foobarqix.model;

public class FooBarQix {
    public String fooBarQix(int anInteger) {
        String result = "";
        if(anInteger %3 == 0)
            result += "FOO";
        else if(anInteger %5 == 0)
            result += "BAR";
        else if(anInteger %7 == 0)
            result += "QIX";
        String integer = String.valueOf(anInteger);

        for(int i = 0; i < integer.length();i++) {
            if(integer.charAt(i) == '3')
                result += "FOO";
            if(integer.charAt(i) == '5')
                result += "BAR";
            if(integer.charAt(i) == '7')
                result += "QIX";
        }
        return result.equals("") ? integer : result;
    }
}
