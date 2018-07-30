package com.example.arena;

public enum ArmourType {
    HELMET(0,2),
    ARMOR(0,4),
    GLOVES(0,3),
    GREAVES(0,2),
    SHIELD(0,1);

    int minDefence;
    int maxDefence;

    ArmourType (int minDefence, int maxDefence){
        this.minDefence = minDefence;
        this.maxDefence = maxDefence;
    }

    public int getMinDefence() {
        return minDefence;
    }

    public int getMaxDefence() {
        return maxDefence;
    }

}
