package Challange.VBola
import java.util.*

fun main() {
    var jari : Float
    var volumephi : Float
    val reader = Scanner(System.`in`)
    print("Masukan Jari jari: ")
    jari = reader.nextFloat()
    volumephi = ((jari * jari * jari * 22 * 4 / 7) / 3)
    val s = String.format("%.2f", volumephi)
    println("==============================")
    print("Jadi Volume Bola = $s")
}

