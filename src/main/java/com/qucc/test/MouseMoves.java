package com.qucc.test;

public interface MouseMoves {
    static int scrollUp=1, scrollDown=1;
}

interface CursorMoves extends MouseMoves{
    //final int down=scrollDown++, up=scrollUp+1;
}

