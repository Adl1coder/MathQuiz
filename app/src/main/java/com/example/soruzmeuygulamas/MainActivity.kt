import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val random = Random()

    println("Matematik Testine Hoş Geldiniz!")
    println("Toplama (1) veya Çıkarma (2) işlemi yapmak istiyor musunuz? (1/2):")
    val secim = scanner.nextInt()

    println("Kaç soru çözmek istiyorsunuz?")
    val soruSayisi = scanner.nextInt()

    var dogruSayisi = 0

    for (i in 1..soruSayisi) {
        val sayi1 = random.nextInt(100) // 0 ile 99 arasında rastgele bir sayı üretir
        val sayi2 = random.nextInt(100)

        val cevap: Int
        val islem: String

        if (secim == 1) {
            cevap = sayi1 + sayi2
            islem = "+"
        } else {
            cevap = sayi1 - sayi2
            islem = "-"
        }

        println("$i. Soru: $sayi1 $islem $sayi2 = ?")
        val kullaniciCevap = scanner.nextInt()

        if (kullaniciCevap == cevap) {
            println("Tebrikler, doğru cevap!")
            dogruSayisi++
        } else {
            println("Maalesef, yanlış cevap. Doğru cevap: $cevap")
        }
    }

    val basariYuzdesi = (dogruSayisi.toDouble() / soruSayisi) * 100
    println("Testi tamamladınız. Başarı yüzdeniz: $basariYuzdesi%")
}
