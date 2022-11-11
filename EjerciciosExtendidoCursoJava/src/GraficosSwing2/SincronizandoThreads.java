package GraficosSwing;

public class SincronizandoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hilosvarios hilo1=new hilosvarios();
		hilo1.start();
		try{hilo1.join();}catch(InterruptedException e) {e.printStackTrace();}
		hilosvarios hilo2=new hilosvarios();
		hilo2.start();
try {		hilo2.join();}catch(InterruptedException e) {
	e.printStackTrace();
}
		System.out.println("Estan terinadas las tareas");
	}

}

class hilosvarios extends Thread{
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

