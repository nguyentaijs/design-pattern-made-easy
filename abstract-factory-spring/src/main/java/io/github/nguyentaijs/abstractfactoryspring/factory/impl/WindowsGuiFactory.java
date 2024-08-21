package io.github.nguyentaijs.abstractfactoryspring.factory.impl;

import io.github.nguyentaijs.abstractfactoryspring.factory.GuiAbstractFactory;
import io.github.nguyentaijs.abstractfactoryspring.product.button.Button;
import io.github.nguyentaijs.abstractfactoryspring.product.button.impl.WindowsButton;
import io.github.nguyentaijs.abstractfactoryspring.product.dialog.Dialog;
import io.github.nguyentaijs.abstractfactoryspring.product.dialog.impl.WindowsDialog;
import org.springframework.stereotype.Component;

@Component
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
