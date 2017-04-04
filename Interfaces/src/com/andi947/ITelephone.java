package com.andi947;

/**
 * Created by Andrea on 2017/03/04.
 */
public interface ITelephone {
    void powerOn();             // Signatures of methods that should be created by class using this interface
    void dial(int phoneNumber);
    void answer();
    public boolean callPhone(int phoneNumber);  //don't need access modifier as you need to implement interface to use the methods
    public boolean isRinging();

}
