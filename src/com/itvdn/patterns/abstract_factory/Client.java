package com.itvdn.patterns.abstract_factory;

public class Client {
    public void createSquadron(SquadronFactory factory) {
        Mage mage = factory.createMage();
        Warrior warrior = factory.createWarrior();
    }
}
