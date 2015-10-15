import java.util.StringTokenizer;


public class DiceRoller 
{
	private String dexpr;
	
	public DiceRoller(String dexpr)
	{
		this.dexpr = dexpr;
	}
	
	public void display()
	{
		System.out.println("DiceRoller: " + this.dexpr);
	}
	
	private int parseDice(String d)
	{
		System.out.println("Rolling: " + d);
		StringTokenizer st = new StringTokenizer(d,"D");
		int numberOfDice = Integer.parseInt(st.nextToken());
		int numberOfSides = Integer.parseInt(st.nextToken());
		
		Dice aDice = new Dice(numberOfSides);
		int total = 0;
		int aRoll;
		for(int i = 0; i < numberOfDice; i++)
		{
			aRoll = aDice.roll();
			System.out.println("Rolled a: " + aRoll);
			total += aRoll;
		}
		return total;
	}
	
	private int processExpression()
	{
		int total = 0;
		StringTokenizer st = new StringTokenizer(this.dexpr, "+-", true);
		String nextOp = "?";
		String currToken;
		while(st.hasMoreTokens())
		{
			currToken = st.nextToken();
			if(currToken.equals("+") || currToken.equals("-"))
			{
				nextOp = currToken;
			}
			else
			{
				int num = this.parseDice(currToken);
				if(nextOp.equals("-"))
				{
					total -= num;
				}
				else
				{
					total += num;
				}
			}
		}
		return total;
	}
	
	public int roll()
	{
		//logic
		return this.processExpression();
	}
}