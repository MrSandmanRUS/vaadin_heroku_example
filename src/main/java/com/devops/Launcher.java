package com.devops;

import com.devops.application.HelloHerokuApplication;

import static com.devops.heroku.VaadinForHeroku.forApplication;
import static com.devops.heroku.VaadinForHeroku.herokuServer;

public class Launcher {

    public static void main(final String[] args) {
            herokuServer(forApplication(HelloHerokuApplication.class)).start();
    }
}
