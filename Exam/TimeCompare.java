import java.util.Scanner;
class Timer
{
	static private int []utc=new int[1000];
	private int hr,min,sec,time;
	Timer(int h,int m,int s,int t)
	{
		hr = h;
        min = m;
        sec = s;
        time = t;
		utc[66]=700;
		utc[64]=1245;
		utc[81]=900;
		calDiffTime();
	}
	public void calDiffTime()
	{
		int diffTime=(utc[time]-utc[66]);
		int diffMin=diffTime%100;
		int diffHr=diffTime/100;
		min+=diffMin;
		if(min>=60)
		{
			min-=60;
			hr++;
		}
		hr+=diffHr;
		 if(hr>=24)
		{
			hr-=24;
		}
	}
	public int getHr()
	{
		return hr;
	}
	public int getMin()
	{
		return min;
	}
	public int getSec()
	{
		return sec;
	}
}
public class TimeCompare
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("*Time of Thailand*");
		System.out.print("enter hour :");
		int hr=sc.nextInt();
		System.out.print("enter minute :");
		int min=sc.nextInt();
		System.out.print("enter secound :");
		int sec=sc.nextInt();
		System.out.print("country code =>");
		int utc=sc.nextInt();
		Timer a=new Timer(hr,min,sec,utc);
		if(utc>7)
		{
		System.out.println("	Time "+a.getHr()+":"+a.getMin()+":"+a.getSec());
		}
	}
}
