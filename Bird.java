package zoom;

class Bird extends Animal {
	
    public Bird(int weight) {
		super(weight);
	}
	public void move() {
    	System.out.println("Moves by flying");
    }
    public void eat() {
    	System.out.println("Eats grass seeds");
    }

    public static void staticFunction(String value) {
    	System.out.println(value + " with feather！");    	
    }
    
}
