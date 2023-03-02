package com.highpeak.assignments.t2017.hps311.faiz;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Random;


public class Advisor extends Random{

    String[] message ;


    public Advisor(){

          message = new String[]{"Don't be scared of memories", "Learn to tweak your intelligence", "Be Aware", "Be present", "learn from your mistakes"};

    }

    public void getAdvise(){

        Random random = new Random();

        int randomIndex = random.nextInt(message.length);

        System.out.println(message[randomIndex]);

    }
}
