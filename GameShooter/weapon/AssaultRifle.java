package com.company.GameShooter.weapon;

import com.company.GameShooter.Weapon;

public class AssaultRifle extends Weapon {
    @Override
    public void shot() {
        super.shot();
        System.out.println("Ту-ту-ту");
    }
}
