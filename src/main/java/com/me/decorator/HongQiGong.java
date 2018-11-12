package com.me.decorator;

// 装饰者具体实现类（ConcreteDecorator）
public class HongQiGong extends Master {

    public HongQiGong(Swordsman swordsman) {
        super(swordsman);
    }

    public void teachAttackMagic() {
        System.out.println("洪七公教授打狗棒法");
        System.out.println("杨过使用打狗棒法");
    }

    public void attackMagic() {
        super.attackMagic();
        teachAttackMagic();
    }
}
