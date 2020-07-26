package gprec.cse;
import java.util.*; 


class StudentData 
{ 
	int roll_No; 
	String student_Name; 
	char stud_grade; 
	studentData(int roll_No, String student_Name, char stud_grade) 
	{ 
		this.roll_No = roll_No; 
		this.student_Name = student_Name; 
		this.stud_grade=stud_grade; 
	} 
} 
class CustomArrayList 
{ 
	static ArrayList<studentData> list=new ArrayList<studentData>();
	public static void main(String args[]) 
	{ 
		int m;
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("Enter number of students (>10):");
	    m=sc.nextInt();
		while(m<=2)
		{
			System.out.println("Enter number of students (>10):");
			m=sc.nextInt();
		}
		int roll_No[] = new int[m]; 
		String student_Name[] =new String[m] ; 
		char stud_grade[] = new char[m]; 
        System.out.println("Enter student details");
        for(int i=0;i<m;i++)
        {
        	System.out.println("Enter rollno of student "+(i+1)); 
            roll_No[i]=sc.nextInt();
            System.out.println("Enter student_name of student "+(i+1)); 
            sc.nextLine();
            student_Name[i]=sc.nextLine();
            System.out.println("Enter grade of student "+(i+1)); 
            stud_grade[i]=sc.next().charAt(0);
            addValues(rollno[i], student_Name[i], stud_grade[i]); 
        }
        printValues(list);
	} 
	public static void addValues(int roll_No, String student_Name, char stud_grade) 
	{
			 
			list.add(new studentData(roll_No, student_Name, stud_grade));  
	} 
	public static void printValues(ArrayList<studentData> list) 
	{ 
		System.out.println("Student details:");
		for (int i = 0; i < list.size(); i++) 
		{ 
			studentData data = list.get(i); 
			System.out.println(data.roll_No+" "+data.student_Name+" "+data.stud_grade); 
		} 
	} 
} 
