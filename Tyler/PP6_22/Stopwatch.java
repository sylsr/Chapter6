package PP6_22;

public class Stopwatch
{
	static int hour;
	static int minute;
	static int second;
	static boolean timeGoing=false;
	public Stopwatch(int hour, int minute, int second)
	{
		Stopwatch.hour=hour;
		Stopwatch.minute=minute;
		Stopwatch.second=second;
	}
	public int incrementHour()
	{
		if(second==59)
		{
			if(minute==59)
			{
				if(hour<12)
				{
					hour++;
				}
			}
		}
		if(second==59)
		{	
			if(minute==59)
			{
				if(hour==12)
				{
					hour=1;
				}
			}
		}
		
		return hour;
	}
	public int incrementMinute()
	{
		if(second==59)
		{
			if(minute<59)
			{
				minute++;
			}
		}
	
		if(second==59)
		{
			if(minute==59)
			{
				minute=0;
			}
		}
		
		return minute;
	}
	public int incrementSecond()
	{
		if(second<59)
		{
			second++;
		}
		else
			second=0;
		return second;
	}
	public int straightIncrementHour()
	{
		if(hour<12)
		{
			hour++;
		}
		return hour;
	}
	public int straightIncrementMinute()
	{
		if(minute<59)
		{
			minute++;
		}
		return minute;
	}
	public int straightIncrementSecond()
	{
		if(second<59)
		{
			second++;
		}
		return second;
	}
	public int decrementHour()
	{
		if(hour>0)
		{
			hour--;
		}
		return hour;
	}
	public int decrementMinute()
	{
		if(minute>0)
		{
			minute--;
		}
		return minute;
	}
	public int decrementSecond()
	{
		if(second>0)
		{
			second--;
		}
		return second;
	}
	public void time()
	{
		incrementHour();
		incrementMinute();
		incrementSecond();
	}

	
}

