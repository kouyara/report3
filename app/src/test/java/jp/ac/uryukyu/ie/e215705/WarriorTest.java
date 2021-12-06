package jp.ac.uryukyu.ie.e215705;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test

    void attackTest() {
        int damage = 3;
        Warrior warrior = new Warrior("勇者", 10, 2);
        Enemy enemy = new Enemy("スライム", 10, 10);
        for (int i = 0; i <= 2; i++) {
            int EnemyHp = enemy.getHitPoint();
            warrior.attackWithWeponSkill(enemy);
            assertEquals(damage, EnemyHp - enemy.getHitPoint());
        }
    }

}
