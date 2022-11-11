package GraficosSwing;

public class SincronizacionThreads2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hilosvarioss hilo1=new hilosvarioss();	
		hilosvariados hilo0=new hilosvariados(hilo1);
		System.out.println("Este hilo se ejecutara independientemente");
		hilo0.start();
		hilo1.start();
	}

}
class hilosvarioss extends Thread{
	public void run(){
		for(int i=0;i<15;i++) {
			
			System.out.println("Ejecutando Hilo "+ getName());
			try{Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			}
	}
	}
class hilosvariados extends Thread{
	hilosvariados(Thread hilo){
		this.hilo=hilo;
	}
	Thread hilo;
	public void run(){
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(int i=0;i<15;i++) {
			
			System.out.println("Ejecutando Hilo "+ getName());
			try{Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
			}
	}
	}