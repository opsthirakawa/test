package com.example.dao;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.3.0" }, date = "2016-09-16T14:47:59.055+0900")
public class EmployeeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.example.dao.EmployeeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.3.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.example.dao.EmployeeDao.class, "findAll");

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public EmployeeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<com.example.entity.Employee> findAll() {
        entering("com.example.dao.EmployeeDaoImpl", "findAll");
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/example/dao/EmployeeDao/findAll.sql");
            __query.setEntityType(com.example.entity._Employee.getSingletonInternal());
            __query.setCallerClassName("com.example.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("findAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.example.entity.Employee>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.entity.Employee>(com.example.entity._Employee.getSingletonInternal()));
            java.util.List<com.example.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("com.example.dao.EmployeeDaoImpl", "findAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.dao.EmployeeDaoImpl", "findAll", __e);
            throw __e;
        }
    }

}
