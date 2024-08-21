package io.github.nguyentaijs.factory;

import io.github.nguyentaijs.product.button.Button;
import io.github.nguyentaijs.product.dialog.Dialog;

public interface GuiAbstractFactory {
    Dialog createDialog();
    Button createButton();
}
