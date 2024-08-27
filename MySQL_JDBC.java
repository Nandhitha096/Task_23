package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_JDBC {

	public static void main(String[] args) throws Exception {
		
				//creating connection
		
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/task_23", "root" , "Viji@9843116611");
				
				//creating statement
				
				Statement s = con.createStatement();
				
				//String ins1 = "insert into employees (values (101,'Jenny',25,10000)";
				String ins2= "insert into employees values (102,'Jacky',30,20000)";
				String ins3 = "insert into employees values (103,'Joe',20,40000)";
				String ins4 = "insert into employees values (104,'John',40,80000)";
				String ins5 = "insert into employees values (105,'Shameer',25,90000)";
				
				//executing statements
				
				//s.execute(ins1);
				s.execute(ins2);
				s.execute(ins3);
				s.execute(ins4);
				s.execute(ins5);
				
				
				//closing connection
				
				con.close();
				
				System.out.println("Query executed succesfully");


	}

}
