package epam_project_5.Exception_Logging;
import org.junit.Test;
public class log_HTestcases 
{
		@Test
		public void test1() 
		{
			Log_ConstructHouse m = new Log_ConstructHouse();
			 m.Housecost(3,3132);
		}
		@Test
		public void test2() 
		{
			Log_ConstructHouse m = new Log_ConstructHouse();
			 m.Housecost(5,375);
			
		}
		@Test
		public void test3() 
		{
			Log_ConstructHouse m = new Log_ConstructHouse();
			 m.Housecost(7,7531);
			
		}
		@Test
		public void test4()
		{
			Log_ConstructHouse m = new Log_ConstructHouse();
			 m.Housecost(9,73);
			
		}
		@Test
		public void test5() 
		{
			Log_ConstructHouse m = new Log_ConstructHouse();
			m.Housecost(7,563);
			
		}
		
	}
