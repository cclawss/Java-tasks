package com.company.GameShooter;

import com.company.GameShooter.weapon.*;

class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                new Pistol(), new RPG(),new Slingshot(),new WaterGun(),new AssaultRifle()
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {

        // TODO проверить на выход за границы
        // выбросить IllegalArgumentException,
        // если значение slot некорректно

        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}