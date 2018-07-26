package ExcelFuntions;

import java.io.File;

import com.GenerateReports.GenerateReports;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ReadExcel extends GenerateReports {
	
	public static Fillo fillo;
	public static Connection connection;
	
	public static void connect_To_Excel()
	{
		String testdata_path= System.getProperty("user.dir")+"\\TestData\\TestData.xlsx";
		try
		{
			File testfile=new File(testdata_path);
			if (testfile.exists())
			{
				fillo = new Fillo();
				connection = fillo.getConnection(testdata_path);
				System.out.println("Connection Established successflly");		
			
			}
			else
			{
				throw new Exception("Testdata file is not available in the given path");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
							
		
	}
	public static String getCommonTestdata(String col)
	{
		String query="select * from CommonTestData where Environment= 'QA'";
		String celldata ="";
		try{
			
			Recordset rs=connection.executeQuery(query);
			
			while(rs.next())
			{
				System.out.println("URLField is " +rs.getField(col));
				celldata=rs.getField(col);
				break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return celldata;
		}

	

}
