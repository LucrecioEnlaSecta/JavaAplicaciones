package GraficosSwing;
import java.util.concurrent.locks.*;
public class BancoSinSincronizar {

	public static void main(String[] args) {
	/*	banco patagonia=new banco();
		
		patagonia.transferencia(24,1999,76);
		
		System.out.println("el saldo total de la suma de las cuentas es: " + patagonia.getsaldoTotal());*/
		banco santander=new banco();
		for(int i=0;i<100;i++) {
			ejecucionTransferencia denazi=new ejecucionTransferencia(santander,2000,i);
			Thread Hilos=new Thread(denazi);
			Hilos.start();
		};
		
	}

}
class banco{
	private Lock cierreBanco=new ReentrantLock();
	public banco() {
		
		cuentas=new double[100];
		
		for(int i=0;i<cuentas.length;i++) {
			cuentas[i]=2000;	
		}
		}
	
	public void transferencia(int cuentaOrigen,double cantidad,int cuentaDestino) {
		cierreBanco.lock();
		try{
			if(cuentas[cuentaOrigen]<cantidad) {//Evalua si la cantidad de plata a transferir es suficiente en la cuenta 
		
			//System.out.println("La plata que quieres transferir es mas de la plata que tienes en la cuenta");
		return;
		
		}
		
		System.out.println(Thread.currentThread());
		
		cuentas[cuentaOrigen]-=cantidad;
		
		System.out.printf("%10.2f de la cuenta Nro° %d para la cuenta Nro°",cantidad,cuentaOrigen,cuentaDestino);
		
		cuentas[cuentaDestino]+=cantidad;
		
		System.out.printf(" Saldo Total %10.2f%n ", getsaldoTotal());
	}finally{
		cierreBanco.unlock();
	}
	}
		
	
	public double getsaldoTotal() {
		
		double saldoTotal=0;
	
		for(double a:cuentas) {
			saldoTotal+=a;
		}
		
		return saldoTotal;
	}
	private double[] cuentas;
}
class ejecucionTransferencia implements Runnable{
	ejecucionTransferencia(banco b,double cantidadMax,int deLaCuenta){
		this.banco=b;
		this.cantidadMax=cantidadMax;
		this.deLaCuenta=deLaCuenta;
	}
	@Override
	public void run() {
		try {
			
			while(true) {
				int paraLaCuenta=(int)(100*Math.random());
				double cantidad=cantidadMax*Math.random();
				banco.transferencia(deLaCuenta,cantidad,paraLaCuenta);
				Thread.sleep(40);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	banco banco;
	double cantidadMax;
	int deLaCuenta;
}