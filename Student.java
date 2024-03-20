 //Write a Java program in illustrate type of variable 
//(local.Intance and Stastic variable)
class Student
{
	int rollno,m1,m2;
	string bname;
	void getDate(int x,int y, int z,String s){
		rollno=x;
		m1=y;
		m2=z;
		bname=s;
	}
	
	void display(){
		float avg=(m1+m2)/2;
		system.out.println("Rollno="+rollno);
		system.out.println("m1="+m1);
		system.out.println("m2="+m2);
		system.out.println("Branch="+bname);
	}
}
class Student
{
	public static void main(String[ ]args)
	{
		StudentDemo S1=new StudentDemo();
		S1.getData(12,30,40,"Comp sc");
		S1.display();
	}
}
		       