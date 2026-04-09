import java.util.*;
class TestDate
{
	public static boolean isLeap(int y)
	{
		boolean ret=false;
		if(y%400==0)
		{
			ret=true;
		}
		else if(y%100==0)
		{
			ret=false;
		}
		else if(y%4==0)
		{
			ret=true;
		}
		else
		{
			ret=false;
		}
		return ret;
	}
	public static String compute(int day,int year)
	{
		int monthDays[]={31,28,31,30,31,30,31,31,30,31,30,31};
		String monthNames[]={"JAN","FEB","MAR","APR","MAY","JUNE","JULY","AUG","SEP","OCT","NOV","DEC"};
		boolean leap=isLeap(year);
		if(leap)
		{
			monthDays[1]=29;
		}
		int i=0;
		int daySum=0;
		for(i=0;i<monthDays.length;i++)
		{
			daySum+=monthDays[i];
			if(daySum>=day)
			{
				break;
			}
		}
		int date=day+monthDays[i]-daySum;
		StringBuffer sb=new StringBuffer();
		sb.append(date);
		sb.append("TH ");
		sb.append(monthNames[i]);
		sb.append(",");
		sb.append(year);
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Day Number:");
		int dayNum=in.nextInt();
		System.out.print("Year:");
		int year=in.nextInt();
		System.out.print("Date after:");
		int n=in.nextInt();
		if(dayNum<1||dayNum>366)
		{
			System.out.println("Out of Range");
			return;
		}
		String dateS=compute(dayNum,year);
		int nDays=dayNum+n;
		int nYear=year;
		boolean leap=isLeap(year);
		if(leap && nDays>366)
		{
			nYear=nYear+1;
			nDays=nDays-366;
		}
		else if(nDays>365)
		{
			nYear=nYear+1;
			nDays=nDays-365;
		}
		String nDate=compute(nDays,nYear);
		System.out.println("Date:"+dateS);
		System.out.println("Date After "+n+" Days:"+nDate);
	}
}