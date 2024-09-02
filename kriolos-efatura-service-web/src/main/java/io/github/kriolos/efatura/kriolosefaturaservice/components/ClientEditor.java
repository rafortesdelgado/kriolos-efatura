package io.github.kriolos.efatura.kriolosefaturaservice.components;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;

import io.github.kriolos.efatura.kriolosefaturaservice.models.Client;

public class ClientEditor extends Composite<VerticalLayout> {
    public interface SaveListener {
        void onSave(Client employee);
    }

    public interface DeleteListener {
        void onDelete(Client employee);
    }

    public interface CancelListener {
        void onCancel();
    }

    private Client client;

    private SaveListener saveListener;
    private DeleteListener deleteListener;
    private CancelListener cancelListener;

    private final Binder<Client> binder = new BeanValidationBinder<>(Client.class);

    public void setEmployee(Client client) {
        this.client = client;
        binder.readBean(client);
    }

    public ClientEditor() {
        var firstName = new TextField("First name");
        var lastName = new TextField("Last name");

        var save = new Button("Save", VaadinIcon.CHECK.create());
        var cancel = new Button("Cancel");
        var delete = new Button("Delete", VaadinIcon.TRASH.create());

        binder.forField(firstName).bind("firstName");
        binder.forField(lastName).bind("lastName");

        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        // save.addClickListener(e -> save());
        save.addClickShortcut(Key.ENTER);

        delete.addThemeVariants(ButtonVariant.LUMO_ERROR);
        delete.addClickListener(e -> deleteListener.onDelete(this.client));

        cancel.addClickListener(e -> cancelListener.onCancel());

        getContent().add(firstName, lastName, new HorizontalLayout(save, cancel, delete));
    }
}
