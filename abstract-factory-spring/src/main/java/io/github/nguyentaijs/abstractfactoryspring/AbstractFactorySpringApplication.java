package io.github.nguyentaijs.abstractfactoryspring;

import io.github.nguyentaijs.abstractfactoryspring.client.Application;
import io.github.nguyentaijs.abstractfactoryspring.factory.GuiAbstractFactory;
import io.github.nguyentaijs.abstractfactoryspring.factory.GuiFactoryBeanManager;
import io.github.nguyentaijs.abstractfactoryspring.factory.impl.IosGuiFactory;
import io.github.nguyentaijs.abstractfactoryspring.factory.impl.WindowsGuiFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AbstractFactorySpringApplication {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(AbstractFactorySpringApplication.class, args);

        Application application = context.getBean(Application.class);
        GuiFactoryBeanManager factoryBeanManager = context.getBean(GuiFactoryBeanManager.class);
        GuiAbstractFactory factory = factoryBeanManager.getInstance();

        application.createComponents(factory);
        application.render();
        application.interact();
    }
}
