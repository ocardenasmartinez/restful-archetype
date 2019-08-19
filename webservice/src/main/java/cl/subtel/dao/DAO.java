package cl.subtel.dao;

public interface DAO extends BasicDAO {

	public String sayHelloOracle(String in) throws Exception;
	public String sayHelloMongo(String in) throws Exception;

}
