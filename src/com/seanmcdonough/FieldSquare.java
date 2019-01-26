package com.seanmcdonough;

import java.awt.*;

public class FieldSquare extends Fixed {

    private static final int SIZE = 5;
    private boolean owned;

    public FieldSquare(){
        this.owned = false;
        super.setColor(new Color(255, 0, 0));//red if not owned
    }
    public FieldSquare(boolean owned){
        this.owned = owned;
        if(owned){
            super.setColor(new Color(20, 255, 20));//green color if owned
        }
    }



}
