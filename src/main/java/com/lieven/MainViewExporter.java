package com.lieven;

import com.vaadin.flow.component.WebComponentExporter;
import com.vaadin.flow.component.webcomponent.WebComponent;

public class MainViewExporter extends WebComponentExporter<MainView> {
	public MainViewExporter() {
		super("main-view");
	}

	@Override
	public void configureInstance(WebComponent<MainView> webComponent, MainView component) {
		// Nothing to configure here
	}
}