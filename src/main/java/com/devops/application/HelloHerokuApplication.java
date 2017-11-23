package com.devops.application;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.vaadin.server.VaadinSession;

public class HelloHerokuApplication extends UI {

    private static final Logger LOG = LoggerFactory.getLogger(HelloHerokuApplication.class);

    @Override
    public void init(final VaadinRequest vaadinRequest) {
		VaadinSession.getCurrent().getSession().setMaxInactiveInterval(600); // 1 minute

		final VerticalLayout layout = new VerticalLayout();
        
		Label message = new Label("Hello, DevOps!");

        
        layout.addComponents(message);
        
        setContent(layout);
    }

   

}
