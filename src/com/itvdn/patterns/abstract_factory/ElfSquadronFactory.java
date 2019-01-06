package com.itvdn.patterns.abstract_factory;

public class ElfSquadronFactory extends SquadronFactory  {
    public Mage createMage() {
        return new ElfMage();
    }

    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
