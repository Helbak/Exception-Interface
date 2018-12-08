package ExampleOfException;

import forMyException.MyException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student(true, "Bvanov", 18, 1,3.3);
		Student b = new Student(true, "Nvanov", 48, 1,2.2);
		Student c = new Student(true, "Mvanov", 8, 1,4.4);
		Student d = new Student(true, "Dvanov", 8, 1,4.3);
		Student e = new Student(true, "Kvanov", 18, 1,2.5);
		Student f = new Student(true, "Evanov", 28, 1,4.8);
		Student g = new Student(true, "Lvanov", 18, 1,4.8);
		Student h = new Student(true, "Cvanov", 18, 1,4.5);
		Student i = new Student(true, "Ovanov", 18, 1,3.0);
		Student k = new Student(true, "Avanov", 11, 1,3.9);
		Student l = new Student(true, "Yvanov", 49, 1,4.4);
		Student x = new Student(true, "Oopvanov", 18, 1,4.4);
		Student xr = new Student(true, "Oopvanov", 18, 1,4.4);
		
		Group gr = new Group();

		try {
			gr.addToGroup( a);
			gr.addToGroup( b);
			gr.addToGroup( c);
			gr.addToGroup( d);
			gr.addToGroup( e);
			gr.addToGroup( f);
			gr.addToGroup( g);
			gr.addToGroup( h);
			gr.addToGroup( i);
			gr.addToGroup( k);
			gr.addToGroup( l);

		} catch (MyException q) {
			System.out.println(q.getMessage());
		}
		
gr.rangeOfAlphabet();
		
		gr.printList();
	
		
	System.out.println();
	System.out.println(gr.searchOfStudent("Avanov"));
	System.out.println();
	gr.removeFromGroup(k);
	gr.removeFromGroup(k);
	gr.rangeOfAlphabet();
	gr.printList();
	
	gr.removeFromGroup(i);
	gr.removeFromGroup(d);
	
	gr.removeFromGroup(g);
	gr.removeFromGroup(h);
	
	System.out.println();
	
	gr.printList();
	try {
	gr.addToGroup( x);
	gr.addToGroup( l);
	} catch (MyException q) {
		System.out.println(q.getMessage());
	}
	
	gr.rangeOfAlphabet();
	
	gr.printList();
	

gr.addInteractiveToGroup();

gr.rangeOfAlphabet();

gr.printList();

gr.whoIsReady();

gr.rangeOfRating();

gr.printList();

	}
	}
