package Challange

import java.util.*
import Challange.VBalok.main

fun main() {

    val input = Scanner(System.`in`)

    print("Name : ")
    input.nextLine()

    print("kelas : ")
    input.nextLine()

    print("No Absen : ")
    input.nextInt()
    println("===========================")
    println("Kamu Ingin Menghitung apa?")
    println("1. Volume Balok")
    println("2. Volume Bola")
    println("0. Batal")
    println("===========================")
    print("Pilihanmu : ")


    when (input.nextInt()) {
        1 -> {
            main()
        }
        2 -> {
            Challange.VBola.main()
        }
        0 -> {
        }
    }
}
