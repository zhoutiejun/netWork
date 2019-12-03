package com.ztj.tourist.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


/**
 * @author : zhoutiejun@youngyedu.com, 2019/6/13 0013 上午 10:11
 * @description :
 * @modified : zhoutiejun@youngyedu.com, 2019/6/13 0013
 */

@Configuration
@MapperScan(basePackages =MysqlMybatisConfig.PACKAGE ,  sqlSessionFactoryRef = "mysqlSqlSessionFactory" )
public class MysqlMybatisConfig {
    // mysqldao扫描路径
    static final String PACKAGE = "com.mybatis.demo.dao.domain";
    // mybatis mapper扫描路径
    static final String MAPPER_LOCATION = "classpath:mapper/*.xml";

    @Primary
    @Bean(name = "mysqldatasource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource primaryDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name= "mysqlTransactionManager")
    @Primary
    public DataSourceTransactionManager mysqlTransactionManager() {
        return new DataSourceTransactionManager(primaryDataSource());
    }

    @Bean(name = "mysql1SqlSessionFactory")
    @Primary
    public SqlSessionFactory mysqlSessionFactory(@Qualifier("mysqldatasource") DataSource dataSource) throws Exception{
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        //如果不使用xml的方式配置mapper，则可以省去下面这行mapper location的配置。
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MysqlMybatisConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
