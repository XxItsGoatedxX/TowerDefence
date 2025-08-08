import towerdefencegame.Enemy
import towerdefencegame.Tower

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val e1 = Enemy()
    val e2 = Enemy(500)
    println("### enemy HPs before tower attack ###")
    println("Enemy1: ${e1.hp}")
    println("Enemy2: ${e2.hp}")
    val tower = Tower()
    tower.attack(e1, 10)
    println("### enemy HPs after tower attack ###")
    println("Enemy1: ${e1.hp}")
    println("Enemy2: ${e2.hp}")
}