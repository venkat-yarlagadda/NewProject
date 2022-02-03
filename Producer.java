public class Producer extends Thread{
	Product p;
	Producer(Product p){
		this.p=p;
		Thread t = new Thread(this, "Producer");
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=1;
		while(i<50) {
			p.generateProduct(i);
			i++;
		}
		
	}
	
}