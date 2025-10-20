class SimpleMobileTracker{
 String model;
 static int totalMobiles;
 
 SimpleMobileTracker(String model){
	 this.model=model;
	 totalMobiles++;
 }
 
    String getModel(){
		return model;
	}
	
	public static void showTotalMobiles(){
		System.out.println("total number of mobiles: "+totalMobiles);
	}
    
	public static void main (String [] args){
	    SimpleMobileTracker smt1 = new SimpleMobileTracker("Samsung Galaxy M32");
        SimpleMobileTracker smt2 = new SimpleMobileTracker("Redmi Note 12");
        

        System.out.println("Mobile type: " + smt1.getModel());
        System.out.println("Mobile type: " + smt2.getModel());
        
        showTotalMobiles();
}
}