package io.github.nguyentaijs.subsystems;

public class Facade {
    private final SubsystemA subsystemA;
    private final SubsystemB subsystemB;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
    }

    public void operation() {
        subsystemA.operationA();
        subsystemB.operationB();
    }
}