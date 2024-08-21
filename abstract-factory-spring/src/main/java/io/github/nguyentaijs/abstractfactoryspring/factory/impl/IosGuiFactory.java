package io.github.nguyentaijs.abstractfactoryspring.factory.impl;

import io.github.nguyentaijs.abstractfactoryspring.factory.GuiAbstractFactory;
import io.github.nguyentaijs.abstractfactoryspring.product.button.Button;
import io.github.nguyentaijs.abstractfactoryspring.product.button.impl.IosButton;
import io.github.nguyentaijs.abstractfactoryspring.product.dialog.Dialog;
import io.github.nguyentaijs.abstractfactoryspring.product.dialog.impl.IosDialog;
import org.springframework.stereotype.Component;

@Component
public class IosGuiFactory implements GuiAbstractFactory {
    @Override
    public Dialog createDialog() {
        return new IosDialog();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }
}
