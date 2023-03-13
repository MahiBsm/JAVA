package dailypractice;

public class Encapsulation {
	private int num;
	
	public int getNumber() {
		return num;
	}
	
	public void setNumber(int num) {
		this.num=num;
	}

	public static void main(String[] args) {
		Encapsulation encapsulation= new Encapsulation();
		encapsulation.setNumber(13);
		System.out.println(encapsulation.getNumber());
	}

}