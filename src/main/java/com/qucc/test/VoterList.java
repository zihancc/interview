package com.qucc.test;

class VoterList {
    static private int voters = 0;
    int totalVolters;
    private static synchronized int Counter(){
        return ++voters;
    }
    public void getTotalV(){
        totalVolters = Counter();
    }
}
