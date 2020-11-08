package com.company.GameShooter.weapon;

import com.company.GameShooter.Weapon;

public class Slingshot extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("Туф");
    }
}
