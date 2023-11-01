package jdbc.HRdatabase;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.Scanner;

public class HRDatabase {

	public static final String DRIVER_CLASS_NAME ="oracle.jdbc.driver.OracleDriver";

	public static final String URL ="jdbc:oracle:thin:@localhost:1521:XE";

	public static final String USER_NAME ="SYSTEM";

	public static final String PASSWORD ="Mano@16042000";

	public static final String SELECT_QUERY ="SELECT FIRST_NAME,LAST_NAME,JOB_ID,DEPARTMENT_ID,SALARY FROM PRAVEEN.EMPLOYEES WHERE JOB_ID ='ST_CLERK'";

	public static final String UPDATE_QUERY = "UPDATE PRAVEEN.EMPLOYEES SET SALARY = 18000 WHERE DEPARTMENT_ID = 90 AND JOB_ID = 'AD_VP'";





	public static Statement ConnectionandStatement() throws ClassNotFoundException, SQLException{



		Connection con = null;

		Statement statement = null;



		//			STEP 1: Register the driver class

		Class.forName(DRIVER_CLASS_NAME);



		//			STEP 2: Create the Connection

		con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);

		if(con!= null) System.out.println("Connection SUccesfull..!!");

		else System.out.println("Conection Failed..!!");



		//	    	STEP 3; Create the Statement

		statement =con.createStatement();



		return statement;

	}

	public static void main( String[] args ) throws SQLException

	{

		try {

			Statement statement;

			// STEP :2&3 CREATE CONNECTION AND STATEMENT

			statement = ConnectionandStatement();

			// USer Option

			while(true) {

				System.out.println("1.Update the salary of employees whose department_id is 90 and job_id is ‘AD_VP’ to 18000"

					+ "2.display the firstname, lastname, job_id, department_id and salary of the updated \r\n"
					+ "employees\n"

					+ "3.Exit ");

				System.out.println("User Choice");

				int option = new Scanner(System.in).nextInt();

				// STEP 4: Execute the Query Statement

				if(option==2) {

					ResultSet rs = statement.executeQuery(SELECT_QUERY);

					while(rs.next()) {

						System.out.println(rs.getString(1)+"|"+ rs.getString(2)+"|" +rs.getString(3)+"|"+rs.getInt(4)+"|"+rs.getInt(5));

					}

				}

				else if (option==1) {

					int rows;

					rows = statement.executeUpdate(UPDATE_QUERY);
					if(rows>0)System.out.println("Product is Updated");

					else System.out.println("Please check...!");


				}else if (option==3) {
					System.out.println("Thankyou");

					break;

				}

			}

		}catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

}