fun main() {
    var x = 55

    if(x % 11 == 1) {
        println("$x людям")
    } else if(x == 1) {
        println("$x человеку")
    } else if(x % 10 == 1) {
        println("$x человеку")
    } else {
        println("$x людям")
    }

}