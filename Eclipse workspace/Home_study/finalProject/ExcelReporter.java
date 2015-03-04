package finalProject;

import java.io.File;

import java.io.IOException;
import java.net.URL;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Formula;
import jxl.write.Label;
import jxl.write.WritableHyperlink;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelReporter {
	WritableWorkbook wwb;
	WritableSheet wws;
	int Rowcount =1;
	
	public void createWorkSheet() throws IOException, BiffException, WriteException{
		
		wwb = Workbook.createWorkbook(new File ("C:\\Project1\\Results\\Results.xls"));
		wws = wwb.createSheet("Results",0);
		
		
	}
public void inserthyperlink(int i,int j, URL url ) throws RowsExceededException, WriteException{
	
	WritableHyperlink hyperlink= new WritableHyperlink(i,j,url);
	wws.addHyperlink(hyperlink);
	 
}
	
	public void addHeader() throws RowsExceededException, WriteException, IOException{
		
		Label l1 = new Label(0,0,"SetpNumber");
		wws.addCell(l1);
		Label l2 = new Label(1,0,"Teststep");
		wws.addCell(l2);
		Label l3 = new Label(2,0,"Result");
		wws.addCell(l3);
		Label l4 = new Label(3,0,"snap");
		wws.addCell(l4);
		wwb.write();
		wwb.close();
		
	}
	public void repotstep ( String Desc, String Result) throws RowsExceededException, WriteException, BiffException, IOException{
		Workbook wb = Workbook.getWorkbook(new File ("C:\\Project1\\Results\\Results.xls"));
		WritableWorkbook workbook = Workbook.createWorkbook(new File("C:\\Project1\\Results\\Results.xls"),wb);
		WritableSheet sheet =workbook.getSheet(0);
		int Rowcount = sheet.getRows();
		Label l4 = new Label (0,Rowcount,""+Rowcount);
		sheet.addCell(l4);
		Label l5 = new Label (1,Rowcount,Desc);
		sheet.addCell(l5);
		Label l6 = new Label (2,Rowcount,Result);
		sheet.addCell(l6);
		//add image link in the last cell 
		Formula F1= new Formula (3,Rowcount,"HYPERLINK(\"D://sandbox"+ Rowcount +".png\","+"\"link    \")");
		sheet.addCell(F1);
		workbook.write();
		workbook.close();
		
}
	public void createResultFile() throws IOException, WriteException{
		wwb.write();
		wwb.close();
	}
}
