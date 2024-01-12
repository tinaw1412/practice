package zoom;

abstract class Animal {
	public  Animal () {
    }
	
    public  Animal (int weight) {
    	this.weight = weight;
    }

    static int MAX_LEN = 10;
    private String description = "";
    public Boolean setDes(String value){
        if (value.length() < MAX_LEN){
            this.description = value;
            return true;
        }else{
            return false;
        }
    }
    public void getDescribe() {
    	this.describe();
    }
    
    public void describe(){
    	System.out.println(this.description + this.getWeightDes() );
    }
    
    private int weight = 0;
    public void setWeight(int value) {
    	this.weight = value;
    }
    
    
    abstract public void move();
    abstract public void eat();
    
    private String getWeightDes() {
    	if (this.weight<10) {
    		return	"体重：瘦猴子";
    	}else if (this.weight<20) {
    		return	"体重：正常";
    	}else {
    		return	"体重：胖大象";
    	}
    }
    
    public static void staticFunction(String value) {
    	System.out.println(value);    	
    }
}
