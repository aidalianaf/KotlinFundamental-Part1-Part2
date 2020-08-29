fun main() {
    val KKM = 75
    val nilaimu = 78
    val keterangan: String
    if (nilaimu >= KKM) {
        keterangan = "Nilai kamu $nilaimu,selamat ya!"
    } else {
        keterangan = "Nilai kamu $nilaimu,silakan ikuti remidial."
    }
    print(keterangan)
}