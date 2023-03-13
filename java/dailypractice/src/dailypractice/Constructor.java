package dailypractice;
class Demo{
	int variable;
	Demo(int variable){
		this.variable=variable;
		System.out.println("demo constructor "+variable);
	}
}

public class Constructor extends Demo{
	
	 Constructor() {
			super(10);
	}
	public static void main(String[] args) {
		Constructor obj= new Constructor();

	}

}