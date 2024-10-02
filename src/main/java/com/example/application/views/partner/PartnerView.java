package com.example.application.views.partner;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

@PageTitle("Partner")
@Route(value = "my-view2", layout = MainLayout.class)
@RolesAllowed("ADMIN")
public class PartnerView extends Composite<VerticalLayout> {

    public PartnerView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
