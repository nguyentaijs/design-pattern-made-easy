package io.github.nguyentaijs.abstractfactoryspring.factory;

import io.github.nguyentaijs.abstractfactoryspring.product.button.Button;
import io.github.nguyentaijs.abstractfactoryspring.product.dialog.Dialog;

public interface GuiAbstractFactory {
    Dialog createDialog();
    Button createButton();
}
