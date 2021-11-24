public class Haji extends Tabungan{
    private double SALDO_AWAL_MINIMUM = 500_000;
    private double SALDO_MINIMUM = 1_000_000;
    private double SETORAN_MINIMUM = 50_000;

    Haji(String nama, long noRekening, double saldoAwal){
        super(nama,noRekening);
        if(saldoAwal >= SALDO_AWAL_MINIMUM){
            setSaldo(saldoAwal);
            setSaldoMinimum(SALDO_MINIMUM);
            setSetoranMinimum(SETORAN_MINIMUM);
        }
    }

    @Override
    public void tarikUang(double jumlahPenarikan){
        if(jumlahPenarikan <= getSaldo()*0.1 && getSaldo()-jumlahPenarikan >= SALDO_MINIMUM){
            setSaldo(getSaldo()-jumlahPenarikan);
        }else if(getSaldo()-jumlahPenarikan >= SALDO_MINIMUM){
            setSaldo(getSaldo()-jumlahPenarikan-50000);
        }
    }
    

}