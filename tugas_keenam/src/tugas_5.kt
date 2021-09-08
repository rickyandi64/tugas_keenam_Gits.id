/*
Diketahui Ricky mengambil SKS sebesar 18 sedangkan Kelvin mengambil SKS sebesar 32 SKS
sedangkan diwajibkan untuk mengambil SKS sebesar 24 SKS
Nahh pada codingan ini saya membuat dengan menggunakan Get dan Set
 */
fun main(args: Array<String>) {

    val sks_ricky = hasil()
    sks_ricky.jumlah_sks_dipilih = 18
    sks_ricky.sks = 18
    println("sks_ricky: Jumlah sks yang dia ambil sebanyak = ${sks_ricky.jumlah_sks_dipilih}")
    println("sks_ricky: Jumlah  sks seharusnya di ambil sebesar= ${sks_ricky.sks}")

    val sks_kelvin = hasil()
    sks_kelvin.jumlah_sks_dipilih = 32
    sks_kelvin.sks = 32
    println("sks_kelvin: actual sks = ${sks_kelvin.jumlah_sks_dipilih}")
    println("sks_kelvin: pretended sks = ${sks_kelvin.sks}")
}

class hasil {
    var sks: Int = 0
        get() = field
        set(value) {
            field = if (value <= 18)
                value+6
            else if (value >= 23 && value <= 32)
                value-8
            else
                value
        }

    var jumlah_sks_dipilih: Int = 0
}
