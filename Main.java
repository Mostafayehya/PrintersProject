class Main{
	
	static PrintBasiony BP = new PrintBasiony(); 
	static PrintSalma SP = new PrintSalma(); 
	static MostafaPrinter MP = new MostafaPrinter(); 
	
	public static void main(String...args){
		
		System.out.println("This is the main");
		
		MP.print();
		
	    PrintBasiony.print();
		PrintSalma.print();
		
	}
	
}