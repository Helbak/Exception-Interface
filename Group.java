package ExampleOfException;

import java.util.Scanner;

//import exc.VoenCom;

import java.util.Arrays;

import forMyException.MyException;

public class Group implements VoenCom {

	private Student[] listOfGroup = new Student[10];
	private VoenCom[] VoenComList = new VoenCom[10];
	private Student st;

	private boolean tempAlive;
	private int a;
	private String tempName;
	private int tempAge;
	private int tempNumberOfGroup;
	private double rating;

	public Group() {
		super();
	}

	public Student[] getListOfGroup() {
		return listOfGroup;
	}

	public void setListOfGroup(Student[] listOfGroup) {
		this.listOfGroup = listOfGroup;
	}

	@Override
	public String toString() {
		rangeOfAlphabet();

		return "Group [listOfGroup=" + Arrays.toString(listOfGroup) + "]";
	}

	public void addToGroup(Student st) throws MyException {
		rangeOfAlphabet();
		for (int i = listOfGroup.length - 1; i >= 0; i--) {
			if (listOfGroup[i] == null) {
				listOfGroup[i] = st;
				System.out.println(st);

				return;
			}
		}
		throw new MyException();

	}

	public void addInteractiveToGroup() {
		rangeOfAlphabet();
		int index = checkEmptyIndexOfList();
		if (index < 0) {
			System.out.println("The group is full. addInteractive unpossible");
			return;
		}
		if (index >= 0) {

			System.out.println("It is a method addInteractive");
			System.out.println("Is this student alive? if yes enter 1 if not enter 0");
			Scanner s = new Scanner(System.in);
			a = s.nextInt();
			if (a == 1)
				tempAlive = true;
			if (a == 0)
				tempAlive = false;
			Scanner h = new Scanner(System.in);
			System.out.println("Enter name of student");
			tempName = h.nextLine();
			System.out.println("Enter age");
			tempAge = s.nextInt();
			System.out.println("Enter NumberOfGroup");
			tempNumberOfGroup = s.nextInt();
			System.out.println("Enter rating");
			rating = s.nextDouble();
			Student newSt = new Student(tempAlive, tempName, tempAge, tempNumberOfGroup, rating);
			System.out.println("New student " + newSt + "added");
			try {
				addToGroup(newSt);
			} catch (MyException q) {
				System.out.println(q.getMessage());
			}
		}

	}

	public int checkEmptyIndexOfList() {
		rangeOfAlphabet();
		for (int i = listOfGroup.length - 1; i >= 0; i--) {
			if (listOfGroup[i] == null) {
				return i;
			}

		}
		return -1;
	}

	public void removeFromGroup(Student x) {
		rangeOfAlphabet();
		int index = getIndexOfStudent(x);
		if (index < 0) {
			System.out.println("Impossible to dellete. This student is not in the group");
		}
		if (index >= 0) {

			listOfGroup[index] = null;
			System.out.println(x.getName() + "  is fired");
		}
		rangeOfAlphabet();
	}

	public int getIndexOfStudent(Student y) {
		rangeOfAlphabet();
		if (y == null)
			return -1;
		if (y != null) {
			for (int i = listOfGroup.length - 1; i >= 0; i--) {
				if (listOfGroup[i] != null && listOfGroup[i].equals(y))
					return i;
			}
		}
		return -1;
	}

	public void rangeOfAlphabet() {
		for (int i = 0; i < listOfGroup.length - 1; i++) {
			for (int j = i + 1; j < listOfGroup.length; j++) {

				if (rangeAsistAlphabet(listOfGroup[i], listOfGroup[j]) > 0) {
					Student delivery = listOfGroup[i];
					listOfGroup[i] = listOfGroup[j];
					listOfGroup[j] = delivery;

				}
			}

		}
	}

	public void rangeOfRating() {
		for (int i = 0; i < listOfGroup.length - 1; i++) {
			for (int j = i + 1; j < listOfGroup.length; j++) {

				if (rangeAsistRating(listOfGroup[i], listOfGroup[j]) > 0) {
					Student delivery = listOfGroup[i];
					listOfGroup[i] = listOfGroup[j];
					listOfGroup[j] = delivery;

				}
			}

		}	
		
	}
	
	private int rangeAsistRating (Student a, Student b) {
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}

		if (a != null && b != null) {
			if(a.getRating()>b.getRating())
				return -1;
				
		}
//		if(a.getRating()<b.getRating())
		return 1;	
	}

	private int rangeAsistAlphabet(Student a, Student b) {
		if (a != null && b == null) {
			return 1;
		}
		if (a == null && b != null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}

		return a.getName().compareTo(b.getName());
	}

	public Student searchOfStudent(String n) {
		int i;
		for (i = 0; i < listOfGroup.length; i++) {
			Student y = listOfGroup[i];
			if (n.equals(y.getName())) {
				st = y;
				System.out.println("It is a student " + listOfGroup[i]);

			}
		}
		return st;
	}

	public void printList() {
		for (int i = 0; i < listOfGroup.length; i++)
			System.out.println(listOfGroup[i]);
	}

	@Override
	public ExampleOfException.VoenCom[] whoIsReady() {
		// TODO Auto-generated method stub

		for (int i = listOfGroup.length - 1; i >= 0; i--) {
			if (listOfGroup[i] == null) {
				VoenComList[i] = null;
			}
			if (listOfGroup[i] != null) {
				if (listOfGroup[i].getage() >= 18 && listOfGroup[i].getage() <= 27) {
					VoenComList[i] = listOfGroup[i];
				}
			}
		}
		System.out.println();
		
		System.out.println("VoenComList:");
		for (int i = 0; i < VoenComList.length; i++)
			System.out.println(VoenComList[i]);
		System.out.println();
		return VoenComList;
	}

}
