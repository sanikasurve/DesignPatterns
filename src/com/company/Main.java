package com.company;

import interfaces.Observer;
import model.EmailTopic;
import model.EmailTopicSubscriber;

public class Main {

    public static void main(String[] args) {
        EmailTopic topic = new EmailTopic();

        //create observers
        Observer firstObserver = new EmailTopicSubscriber("First Observer");
        Observer secondObserver = new EmailTopicSubscriber("Second Observer");
        Observer thirdObserver = new EmailTopicSubscriber("Third Observer");

        //register observers
        topic.register(firstObserver);
        topic.register(secondObserver);
        topic.register(thirdObserver);

        //attaching observer to subject
        firstObserver.setSubject(topic);
        secondObserver.setSubject(topic);
        thirdObserver.setSubject(topic);

        //checking for updates
        firstObserver.update();

        //provider
        topic.postMessage("Hello Subscribers");


    }
}
