package com.example.arena;

import java.util.Arrays;
import java.util.Collection;

public enum ArmourType {
    HELMET(0, 2, Arrays.asList(BodyPart.HEAD)),
    ARMOR(0,4, Arrays.asList(BodyPart.TRUNK)),
    GLOVES(0,3, Arrays.asList(BodyPart.RIGHT_ARM,BodyPart.LEFT_ARM)),
    GREAVES(0,2, Arrays.asList(BodyPart.LEFT_LEG,BodyPart.RIGHT_LEG)),
    SHIELD(0,1, Arrays.asList(BodyPart.values()));


    int minProtection;
    int maxProtection;

    Collection protectedBodyParts;

    ArmourType (int minDefence, int maxDefence, Collection<BodyPart> protectedBodyParts){
        this.minProtection = minDefence;
        this.maxProtection = maxDefence;
        this.protectedBodyParts = protectedBodyParts;
    }

    public int getMinProtection() {
        return minProtection;
    }

    public int getMaxProtection() {
        return maxProtection;
    }

    public boolean isProtecting(BodyPart bodyPart){
        return this.protectedBodyParts.contains(bodyPart);
    }

}
