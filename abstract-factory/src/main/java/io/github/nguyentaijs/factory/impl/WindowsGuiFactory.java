package io.github.nguyentaijs.factory.impl;

import io.github.nguyentaijs.factory.GuiAbstractFactory;
import io.github.nguyentaijs.product.button.Button;
import io.github.nguyentaijs.product.dialog.Dialog;
import io.github.nguyentaijs.product.button.impl.WindowsButton;
import io.github.nguyentaijs.product.dialog.impl.WindowsDialog;

public class WindowsGuiFactory implements GuiAbstractFactory {
    @Override
    public Dialog createDialog() {
        return new WindowsDialog();
    }

    @Override
    public Button createButton() {

        return new WindowsButton();
    }
}
