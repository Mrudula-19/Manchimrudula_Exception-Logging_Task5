package epam_project_5.Exception_Logging;
import java.util.logging.Logger;
public class Log_Simple
{
	private static final Logger LOGGER = Logger.getLogger(Log_Simple.class.getName());
	public void s_interest(double p,double t,double r)
	{
		double si;
		si=(p*t*r)/100.0;
		LOGGER.info("Simple Interest: "+si);
	}
	public void c_interest(double p,double t,double r)
	{
		double ci;
		ci=p*Math.pow(1.0+r/100.0,t)-p;
		LOGGER.info("Compound Interest: "+ci);
	}
}
