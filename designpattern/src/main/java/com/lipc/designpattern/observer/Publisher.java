package com.lipc.designpattern.observer;

/**
 * @author Pengcheng.Li4
 */
public class Publisher {

    private Observer observer;

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public void onChange() {
        observer.onMessage();
    }

}
