package oopsConcept;
//implementation class
// should implement 100% from interface if implementeing
//this  class can have new methods
public class CalcIndiTax extends Vehicle implements TaxInterface, IncomeInterface {

	//override
	public void calcDeduction() {
		// TODO Auto-generated method stub
		System.out.println("CIT-DEC");
	}
	
    //override
	public void calGrossIncome() {
		// TODO Auto-generated method stub
		System.out.println("CIT -GI");
	}
	
	//own method
	public int taxSlab() {
		return 30;
	}
	
	public static void main(String[] args) {
		//TaxInterface obj = new TaxInterface();---> cannot instationate object in interface
		//because interface does not have any implemented methods - so no use
	}

	public void netIncome() {
		// TODO Auto-generated method stub
		
	}

}

