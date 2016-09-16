package com.example.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.3.0" }, date = "2016-09-16T14:47:58.975+0900")
public final class _Employee extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.entity.Employee> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.3.0");
    }

    private static final _Employee __singleton = new _Employee();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the empno */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.example.entity.Employee, java.lang.Integer, Object> $empno = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<>(com.example.entity.Employee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "empno", "", __namingType, false, __idGenerator);

    /** the ename */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.entity.Employee, java.lang.String, Object> $ename = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.entity.Employee.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "ename", "", __namingType, true, true, false);

    /** the job */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.entity.Employee, java.lang.String, Object> $job = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.entity.Employee.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "job", "", __namingType, true, true, false);

    /** the mgr */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.entity.Employee, java.lang.Integer, Object> $mgr = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.entity.Employee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "mgr", "", __namingType, true, true, false);

    /** the hiredate */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.entity.Employee, java.sql.Date, Object> $hiredate = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.entity.Employee.class, java.sql.Date.class, java.sql.Date.class, () -> new org.seasar.doma.wrapper.DateWrapper(), null, null, "hiredate", "", __namingType, true, true, false);

    /** the sal */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.entity.Employee, java.lang.Integer, Object> $sal = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.entity.Employee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "sal", "", __namingType, true, true, false);

    /** the comm */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.entity.Employee, java.lang.Integer, Object> $comm = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.entity.Employee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "comm", "", __namingType, true, true, false);

    /** the deptno */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.entity.Employee, java.lang.Integer, Object> $deptno = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.entity.Employee.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "deptno", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.example.entity.Employee>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.entity.Employee, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.entity.Employee, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.entity.Employee, ?>> __entityPropertyTypeMap;

    private _Employee() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "Employee";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.entity.Employee, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.entity.Employee, ?>> __list = new java.util.ArrayList<>(8);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.entity.Employee, ?>> __map = new java.util.HashMap<>(8);
        __idList.add($empno);
        __list.add($empno);
        __map.put("empno", $empno);
        __list.add($ename);
        __map.put("ename", $ename);
        __list.add($job);
        __map.put("job", $job);
        __list.add($mgr);
        __map.put("mgr", $mgr);
        __list.add($hiredate);
        __map.put("hiredate", $hiredate);
        __list.add($sal);
        __map.put("sal", $sal);
        __list.add($comm);
        __map.put("comm", $comm);
        __list.add($deptno);
        __map.put("deptno", $deptno);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.example.entity.Employee entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.example.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.example.entity.Employee entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.example.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.example.entity.Employee entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.example.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.example.entity.Employee entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.example.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.example.entity.Employee entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.example.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.example.entity.Employee entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.example.entity.Employee> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.entity.Employee, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.entity.Employee, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.entity.Employee, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.example.entity.Employee, ?, ?> getGeneratedIdPropertyType() {
        return $empno;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.example.entity.Employee, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.example.entity.Employee newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.example.entity.Employee, ?>> __args) {
        com.example.entity.Employee entity = new com.example.entity.Employee();
        __args.values().forEach(v -> v.save(entity));
        return entity;
    }

    @Override
    public Class<com.example.entity.Employee> getEntityClass() {
        return com.example.entity.Employee.class;
    }

    @Override
    public com.example.entity.Employee getOriginalStates(com.example.entity.Employee __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.entity.Employee __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Employee getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Employee newInstance() {
        return new _Employee();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.example.entity.Employee> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
