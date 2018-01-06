/**
 * 
 */

/**
 * @author Jessica
 *
 */
public class studentMain {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Student studentVP = new Student();
		Student studentP = new Student();
		Student studentA = new Student();
		Student studentG = new Student();
		Student studentVG = new Student();
		System.out.println(studentVP.getAttendanceGrade(20));
		System.out.println(studentP.getAttendanceGrade(40));
		System.out.println(studentA.getAttendanceGrade(60));
		System.out.println(studentG.getAttendanceGrade(80));
		System.out.println(studentVG.getAttendanceGrade(95));
		
	}

}
