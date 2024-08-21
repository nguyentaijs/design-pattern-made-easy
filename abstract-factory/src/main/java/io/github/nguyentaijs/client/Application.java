package io.github.nguyentaijs.client;

import io.github.nguyentaijs.factory.GuiAbstractFactory;
import io.github.nguyentaijs.product.button.Button;
import io.github.nguyentaijs.product.dialog.Dialog;

public class Application {
    private Button button;
    private Dialog dialog;

    public Application(GuiAbstractFactory factory) {
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
