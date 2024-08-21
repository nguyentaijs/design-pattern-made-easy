package io.github.nguyentaijs.abstractfactoryspring.client;

import io.github.nguyentaijs.abstractfactoryspring.factory.GuiAbstractFactory;
import io.github.nguyentaijs.abstractfactoryspring.product.button.Button;
import io.github.nguyentaijs.abstractfactoryspring.product.dialog.Dialog;
import org.springframework.stereotype.Component;

@Component
public class Application {
    private Button button;
    private Dialog dialog;

    public void createComponents(GuiAbstractFactory factory) {
        button = factory.createButton();
        dialog = factory.createDialog();
    }

    public void render() {
        button.render();
        button.render();
        System.out.println("Finish rendering");
        System.out.println("===");
    }

    public void interact() {
        dialog.show();
        button.click();
        System.out.println("Finish interacting");
        System.out.println("===");
    }
}
