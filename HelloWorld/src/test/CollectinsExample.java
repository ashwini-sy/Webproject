package test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectinsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> name=new ArrayList<>();
		name.add("Ash");
		name.add("Wini");
		name.add("Nayan");
		name.add("Singh");
		System.out.println("BRfore Sorting :" + name);
		//sorting
		Collections.sort(name);
		System.out.println("After sorting :"+ name);
		
		Collections.sort(name,Collections.reverseOrder());
		System.out.println("Reverse format:"+ name);
		//Array list ineger
		ArrayList<Integer> age=new ArrayList<>();
		age.add(12);
		age.add(15);
		age.add(16);
		age.add(18);
		System.out.println(age);
		
		if(age.contains(11))
		{
			System.out.println("List contains the Entered age");
		}
		//List
		//List ls=new List();
		//ls.add("ash");
		//.add("ashwini", 0);
		//System.out.println(ls);
		
		//Stack-----------
		Stack<String>st=new Stack<>();
		st.push("String");
		st.push("Char");
		st.push("integer");
		System.out.println(st);
		st.pop();
		System.out.println(st);
		
		Stack st2=(Stack) st.clone();
		System.out.println(st2);
		st2.clear();
		System.out.println(st2);
		System.out.println(st);
		System.out.println(st.lastElement());
		
		
		
	}

}
