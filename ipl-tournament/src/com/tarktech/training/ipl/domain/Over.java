package com.tarktech.training.ipl.domain;

import java.util.ArrayList;
import java.util.List;

public class Over {
    private final List<BallDelivery> ballsDelivered;

    public Over(){
        ballsDelivered = new ArrayList<>();
    }

    public void deliveredBall(BallDelivery ballDelivery){
        ballsDelivered.add(ballDelivery);
    }
}
