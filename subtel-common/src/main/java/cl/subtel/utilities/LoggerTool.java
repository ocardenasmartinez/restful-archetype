package cl.subtel.utilities;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public final class LoggerTool {
	
	public static void loggerParameters(SqlParameterSource in, Logger logger) {
		Arrays.asList(in.getParameterNames()).forEach(x -> logger.info(x + ": " + in.getValue(x)));
	}

}
