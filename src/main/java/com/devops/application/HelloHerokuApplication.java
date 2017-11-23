package com.devops.application;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.vaadin.server.VaadinSession;

public class HelloHerokuApplication extends UI {

    private static final Logger LOG = LoggerFactory.getLogger(HelloHerokuApplication.class);

    public static final String HELLO_WORLD = "Hello from Heroku, ";
    public static final String BUTTON_CAPTION = "Click me";
    public static final String NAME_LABEL = "What is your name?";
    public static final String NAME = "name";

    @Override
    public void init(final VaadinRequest vaadinRequest) {
		VaadinSession.getCurrent().getSession().setMaxInactiveInterval(600); // 1 minute

		final VerticalLayout layout = new VerticalLayout();
        
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
       /* button.addClickListener(e -> {
            layout.addComponent(new Label("Thanks " + name.getValue() 
                    + ", it works!"));
        });*/
        
        layout.addComponents(name, button);
        
        setContent(layout);
    }

   

}
