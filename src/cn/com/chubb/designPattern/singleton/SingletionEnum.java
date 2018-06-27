/**
 * 
 */
package cn.com.chubb.designPattern.singleton;

/**
 * @author Devin
 *
 */
public enum SingletionEnum {
	DATASOURCE;
    private Singletion6 connection = null;
    private SingletionEnum() {
        connection = new Singletion6();
    }
    public Singletion6 getConnection() {
        return connection;
    }
}
