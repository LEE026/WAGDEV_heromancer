package com.example.game.object;

import com.example.game.object.data.Damage;

public class Warrior extends Mob{
    public Warrior(){
        MaxHP=700;     //최대hp
        HP=MaxHP;        //현재 hp
        MaxMP=500;     //최대 mp
        MP=MaxMP;        //현재 mp
        Atk=50;       //공격력
        Mag=0;       //마력
        Def=200;       //방어력
        MRt=70;       //마법 저항력
    }

    @Override
    public Damage Attack() {
        damage.Physical=Atk;
        return damage;
    }

    @Override
    public void Die() {

    }
}
