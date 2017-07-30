package main.java.com.cardus.data.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import main.java.com.cardus.data.util.SecurityUtil;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Juhil on 7/28/2017.
 */
@Configuration
@ConfigurationProperties("e2e.database")
@PropertySource("classpath:database/database.properties")
public class DataSourceConfig {

    @Autowired
    private SecurityUtil securityUtil;

    @Value("${env:production}")
    String env;

    Map<String,String> qashoppingcart=new HashMap<String,String>();

    Map<String,String> devshoppingcart=new HashMap<String,String>();

    public Map<String, String> getLocalshoppingcart() {
        return localshoppingcart;
    }

    public void setLocalshoppingcart(Map<String, String> localshoppingcart) {
        this.localshoppingcart = localshoppingcart;
    }

    public Map<String, String> getDevshoppingcart() {
        return devshoppingcart;
    }

    public void setDevshoppingcart(Map<String, String> devshoppingcart) {
        this.devshoppingcart = devshoppingcart;
    }

    public Map<String, String> getQashoppingcart() {
        return qashoppingcart;
    }

    public void setQashoppingcart(Map<String, String> qashoppingcart) {
        this.qashoppingcart = qashoppingcart;
    }

    Map<String,String> localshoppingcart=new HashMap<String,String>();

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory()
    {
        LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();

        try {
            localContainerEntityManagerFactoryBean.setDataSource(dataSource());
        }
        catch (SQLException ee)
        {
            ee.printStackTrace();
        }
        String environment=System.getProperty("env");

        if("domain_locahost".equalsIgnoreCase(env) || "localhost".equalsIgnoreCase(env))
        {
            localContainerEntityManagerFactoryBean.getJpaPropertyMap().put("hibernate.default_schema","public");
        }
        else
        {
            localContainerEntityManagerFactoryBean.getJpaPropertyMap().put("hibernate.default_schema","system");
        }
        localContainerEntityManagerFactoryBean.setPackagesToScan(new String[]{"com.cardus.data.entities"});
        JpaVendorAdapter vendorAdapter=new HibernateJpaVendorAdapter();
        localContainerEntityManagerFactoryBean.setJpaVendorAdapter(vendorAdapter);

        return localContainerEntityManagerFactoryBean;
    }

    @Bean
    DataSource dataSource() throws SQLException
    {
        String username=null;
        String url=null;
        String driverClassName=null;
        String passwordKey=null;

        DataSource dataSource=null;

        String environment=System.getProperty("env");
        if(environment==null)
        {
            environment="production";
        }
        System.out.println("System env="+environment);

        if("qa01".equalsIgnoreCase(env))
        {
            passwordKey="e2e.database.qashoppingcart.password";
            username=this.qashoppingcart.get("username");
            url=this.qashoppingcart.get("url");
            driverClassName=this.qashoppingcart.get("driverClassName");
        }
        else if("production".equalsIgnoreCase(env))
        {
            passwordKey="e2e.database.localshoppingcart.password";
            System.out.println("production db"+localshoppingcart);
            username=this.localshoppingcart.get("username");
            url=this.localshoppingcart.get("url");
            driverClassName=this.localshoppingcart.get("driverClassName");
        }
        else
        {
            throw new SQLException("invalid env received .."+env);
        }

        return dataSource;
    }

}
