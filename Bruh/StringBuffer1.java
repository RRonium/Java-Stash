public class StringBuffer1
{
	public static void main(String args[])
	{
		StringBuffer sb=new StringBuffer("Biswas");
		//System.out.println(sb.capacity());
		//sb.ensureCapacity(50);
		//sb.reverse();
		//sb.delete(1,3);
		//sb.insert(5,"JAVA");
		//sb.append("JAVA");
		//sb.replace(0,6,"JAVA");
		System.out.println(sb.codePointAt(0));
		System.out.println(sb.capacity());
		System.out.println("\u00C1");
	}
}