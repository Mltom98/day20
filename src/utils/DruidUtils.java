package utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.Properties;

/**
 * @Author yml
 * Date on 2019/12/21  9:28
 */
public class DruidUtils {
    private static DruidDataSource ds;
    static {
        Properties properties=new Properties();
        try {
            properties.load(DruidUtils.class.getClassLoader().getResourceAsStream("database.properties"));
            ds= (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static DruidDataSource getDs(){
        return ds;
    }
}
