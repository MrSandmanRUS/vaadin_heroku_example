package com.devops;

import com.devops.application.HelloHerokuApplication;

import static eu.hurion.vaadin.heroku.VaadinForHeroku.forApplication;
import static eu.hurion.vaadin.heroku.VaadinForHeroku.herokuServer;

public class Launcher {

    public static void main(final String[] args) {
            herokuServer(forApplication(HelloHerokuApplication.class)).start();
    }
}
