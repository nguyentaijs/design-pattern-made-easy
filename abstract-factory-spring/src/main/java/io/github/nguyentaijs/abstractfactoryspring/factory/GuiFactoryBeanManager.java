package io.github.nguyentaijs.abstractfactoryspring.factory;

import io.github.nguyentaijs.abstractfactoryspring.factory.impl.IosGuiFactory;
import io.github.nguyentaijs.abstractfactoryspring.factory.impl.WindowsGuiFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GuiFactoryBeanManager {
    public static final String OS_WIN = "win";
    public static final String OS_MAC = "mac";
    private final List<GuiAbstractFactory> guiAbstractFactories;

    public GuiAbstractFactory getInstance() throws Exception {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains(OS_WIN)) {
            return guiAbstractFactories.stream()
                    .filter(factory -> factory.getClass().getName().equalsIgnoreCase(WindowsGuiFactory.class.getName()))
                    .findFirst()
                    .orElseThrow(() -> new Exception("Can not find factory"));
        } else if (os.contains(OS_MAC)) {
            return guiAbstractFactories.stream()
                    .filter(factory -> factory.getClass().getName().equalsIgnoreCase(IosGuiFactory.class.getName()))
                    .findFirst()
                    .orElseThrow(() -> new Exception("Can not find factory"));
        }
        throw new Exception("Can not find factory");
    }

}
