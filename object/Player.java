package com.example.game.object;

import com.example.game.object.data.Damage;

abstract class Player extends Entity{

    protected int equipment;//임시, 수정해야함

    @Override
    public void Hurt(Damage damage){ //데미지를 입을때
        HP-=damage.Physical*(100.0/Def);
        HP-=damage.Magic*(100.0/MRt);
        HP-=damage.Fixed;
        if(HP<=0)
            Die();
    }

    @Override
    public void Heal(double heal){
        HP+=heal;
        if(HP>MaxHP)
            HP=MaxHP;
    }
}
