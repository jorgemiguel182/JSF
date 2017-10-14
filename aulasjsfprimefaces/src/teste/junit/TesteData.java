package teste.junit;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import br.com.project.report.util.DateUtils;

public class TesteData {

	@Test
	public void test() {
		try{

		assertEquals("07102017", DateUtils.getDateAtualReportName());
		
		assertEquals("'2017-10-07'", DateUtils.fomartDateSql(Calendar.getInstance().getTime()));
		
		assertEquals("2017-10-07", DateUtils.fomartDateSqlSimple(Calendar.getInstance().getTime()));
		
	}catch(Exception e){
		e.printStackTrace();
		fail(e.getMessage());
	}
	
		
	}

}
