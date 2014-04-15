package org.dashbuilder.client.screens;

import javax.enterprise.context.Dependent;

import com.github.gwtbootstrap.client.ui.Label;
import com.google.gwt.user.client.ui.IsWidget;
import org.uberfire.client.annotations.WorkbenchPartTitle;
import org.uberfire.client.annotations.WorkbenchPartView;
import org.uberfire.client.annotations.WorkbenchScreen;

@Dependent
@WorkbenchScreen(identifier = "HomeScreen")
public class HomeScreen {

    private static final String ORIGINAL_TEXT = "Welcome to Dashbuilder!";

    private Label label = new Label( ORIGINAL_TEXT );

    @WorkbenchPartTitle
    public String getTitle() {
        return "Home";
    }

    @WorkbenchPartView
    public IsWidget getView() {
        return label;
    }
}