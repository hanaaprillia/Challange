package Challange.VBalok

import java.util.*

fun main() {
    val panjang:Double
    val lebar:Double
    val tinggi:Double
    val volume : Double

    val reader = Scanner(System.`in`)

    print("Masukkan Panjang : ")
    panjang = reader.nextInt().toDouble()

    print("Masukkan Lebar : ")
    lebar = reader.nextInt().toDouble()

    print("Masukkan Tinggi : ")
    tinggi = reader.nextInt().toDouble()

    volume = hitungVolume(panjang,lebar, tinggi)
    val s = String.format("%.2f", volume)
    println("==============================")
    print("Jadi Volume Balok = $s")

}
fun hitungVolume(p: Double, l:Double, t:Double): Double {
    return p * l * t
}
