package com.company.model;

import com.company.interfaces.Command;

public class KirbyDownCommand implements Command {

    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyDownCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveDown();

    }
}
