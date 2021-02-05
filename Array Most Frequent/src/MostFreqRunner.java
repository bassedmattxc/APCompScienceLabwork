import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

//add imports as needed

public class MostFreqRunner
{
	public static void main( String args[] )
	{										
	   ArrayList<Integer> l1 = new ArrayList<Integer>();
      l1.add(12);
      l1.add(12);
      l1.add(12);
      l1.add(12);
      l1.add(12);
      l1.add(34);
      l1.add(34);
      l1.add(34);
      l1.add(34);
      l1.add(23);
      System.out.println(ListMostFreq.go(l1));
     System.out.println(l1.remove(5));
	}
}