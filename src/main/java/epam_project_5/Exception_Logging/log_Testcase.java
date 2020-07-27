package epam_project_5.Exception_Logging;
import org.junit.Test;
public class log_Testcase
{
	@Test
	public void test1() 
	{
		Log_Simple i = new Log_Simple();
		i.s_interest(4000,2,3);
	    i.c_interest(4000,2,3);
	}
	@Test
	public void test2()
	{
		Log_Simple in = new Log_Simple();
		in.s_interest(3000,3,3);
		in.c_interest(3000,3,3);
	}
	@Test
	public void test3() 
	{
		Log_Simple it = new Log_Simple();
		it.s_interest(7000,5,7);
		it.c_interest(7000,5,7);
	}

}
