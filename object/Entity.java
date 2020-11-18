package com.example.game.object;


import com.example.game.object.data.Damage;

abstract class Entity {

    /*hp와mp, drt와def를 합치는것 고민중*/
    protected double MaxHP;     //최대hp
    protected double HP;        //현재 hp
    protected double MaxMP;     //최대 mp
    protected double MP;        //현재 mp
    protected double Atk;       //공격력
    protected double Mag;       //마력
    protected double Def;       //방어력
    protected double MRt;       //마법 저항력
    protected Damage damage;

    abstract public void Hurt(Damage damage);    //데미지를 입을때 0:물리 1:마법 2: 고정
    abstract public Damage Attack();
    abstract public void Heal(double heal);
    abstract public void Die();
}
