public class Bisnis extends Tabungan{
    private double SALDO_AWAL_MINIMUM = 1_000_000;
    private double SALDO_MINIMUM = 1_000_000;
    private double SETORAN_MINIMUM = 50_000;

    Bisnis(String nama, long noRekening, double saldoAwal){
        super(nama,noRekening);
        if(saldoAwal >= SALDO_AWAL_MINIMUM){ 
            setSaldo(saldoAwal);
            setSaldoMinimum(SALDO_MINIMUM);
            setSetoranMinimum(SETORAN_MINIMUM);
        }
    }
}