package towerdefencegame

class Tower {
    fun attack(e: Enemy, attackStrength: Int) {
        e.getDamage(attackStrength)
    }
}