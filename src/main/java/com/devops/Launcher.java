package com.devops;

import com.devops.HelloHerokuApplication;

import static com.devops.vaadin.heroku.VaadinForHeroku.forApplication;
import static com.devops.vaadin.heroku.VaadinForHeroku.herokuServer;

public class Launcher {

    public static void main(final String[] args) {
            herokuServer(forApplication(HelloHerokuApplication.class)).start();
    }
}
