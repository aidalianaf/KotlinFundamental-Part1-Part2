fun main() {
    val nilai = 60
    val Grade = 70

    if (nilai > 90 && nilai <=100){
        print("Nilai Kamu $nilai, A")
    }else if (nilai > 80 && nilai <=90){
        print("Nilai Kamu $nilai, B")
    }else if (nilai > 70 && nilai <=80) {
        print("Nilai Kamu $nilai, C")
    }else if (nilai > 60 && nilai <=70){
        print("Nilai Kamu $nilai, D")
    }else if (nilai >=50 && nilai <=60){
        print("Nilai Kamu $nilai, E")
    }else{
        print("Yang Anda Masukan Tidak Sesuai")
    }
}