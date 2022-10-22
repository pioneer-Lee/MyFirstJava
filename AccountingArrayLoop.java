
public class AccountingArrayLoop {

	public static void main(String[] args) {
		//물건 가격 관련
		double price = 5000;
		double VATRate = 0.1;
		double Total = price*1.1;
		//이익률 관련
		double ExpenseRate = 0.3;
		double IncomeRate = 0.7;
		double Income = price*IncomeRate;
		//주주들
		double[] DividendRates = new double[3];
			DividendRates[0]=0.5;
			DividendRates[1]=0.3;
			DividendRates[2]=0.2;
		double[] Dividend = new double[3];
			Dividend[0] = Income * DividendRates[0];
			Dividend[1] = Income * DividendRates[1];
			Dividend[2] = Income * DividendRates[2];

		
		System.out.println("Value of supply : "+ Total);
		System.out.println("VAT : "+(price*VATRate));
		System.out.println("Price : "+ price);
		System.out.println("Expense : "+(price*ExpenseRate));
		System.out.println("Income : "+ (price*IncomeRate));

			
		if(Income<10000) {
			Dividend[0]=Income*1;
			Dividend[1]=0;
			Dividend[2]=0;
		}
			else {
				Dividend[0] = Income * DividendRates[0];
				Dividend[1] = Income * DividendRates[1];
				Dividend[2] = Income * DividendRates[2];
			}
		
		int i =0;
		while(i<DividendRates.length) {
			System.out.println("Dividend" +(1+i)+ ":" + Dividend[i]);
			i=i+1;

	}

}
}
