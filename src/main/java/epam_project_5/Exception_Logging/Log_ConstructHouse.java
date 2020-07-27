package epam_project_5.Exception_Logging;
import java.util.logging.Logger;
public class Log_ConstructHouse 
{
	@SuppressWarnings("unused")
	private static final Logger LOGGER = Logger.getLogger(Log_ConstructHouse.class.getName());
	public double Housecost(double st,double aar)
	{
				double n=aar;
				if(st==3)
				{
					n=aar*1200;
					LOGGER.info("Cost for constructing the house is: "+n);
				}
				else if(st==5)
				{
					n=aar*1500;
					LOGGER.info("Cost for constructing the house is: "+n);
				}
				else if(st==7)
				{
					n=aar*1800;
					LOGGER.info("Cost for constructing the house is: "+n);
				}
				else if(st==9)
				{
					n=aar*2500;
					LOGGER.info("Cost for constructing the house is: "+n);
				}
				return n;
	}

}
