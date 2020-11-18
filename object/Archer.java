package com.example.game.object;

import com.example.game.object.data.Damage;

public class Archer extends Mob{
    public Archer(){
        MaxHP=400;     //최대hp
        HP=MaxHP;        //현재 hp
        MaxMP=500;     //최대 mp
        MP=MaxMP;        //현재 mp
        Atk=80;       //공격력
        Mag=0;       //마력
        Def=50;       //방어력
        MRt=50;       //마법 저항력
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
