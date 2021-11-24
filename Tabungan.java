public class Tabungan {
       private String nama ;
       private long noRekening;
       private double saldo = 0;
       private double saldo_minimum = 0;
       private double setoran_minimum = 0;

       Tabungan(){
           nama = "Tamu";
           noRekening = 123456789;
       }
       

    Tabungan(String nama, long noRekening){
        this.nama = nama;
        this.noRekening = noRekening;
    }

       protected void setSaldoMinimum(double saldo_minimum){
           this.saldo_minimum = saldo_minimum;
       }

       public void setSetoranMinimum(double setoran_minimum){
           this.setoran_minimum = setoran_minimum; 
       }

       public double getSaldo(){
           return this.saldo;
       } 
       
       public void setSaldo(double saldo){
           if(saldo >= setoran_minimum ){
               this.saldo = saldo;
            }
       }

       public void simpanUang(double uang){
           if(uang >= this.setoran_minimum){
               this.saldo = this.saldo + uang;
           }
       }

       public void tarikUang(double jumlahPenarikan){
           if(jumlahPenarikan > 0){
               if(this.saldo - jumlahPenarikan >= saldo_minimum){
                   this.saldo = this.saldo - jumlahPenarikan;
               }
           }
       }
    
}

