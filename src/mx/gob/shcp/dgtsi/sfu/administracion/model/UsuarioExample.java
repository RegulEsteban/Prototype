package mx.gob.shcp.dgtsi.sfu.administracion.model;

import java.util.ArrayList;
import java.util.List;

public class UsuarioExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public UsuarioExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdUsuarioIsNull() {
            addCriterion("ID_USUARIO is null");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIsNotNull() {
            addCriterion("ID_USUARIO is not null");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioEqualTo(Integer value) {
            addCriterion("ID_USUARIO =", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotEqualTo(Integer value) {
            addCriterion("ID_USUARIO <>", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioGreaterThan(Integer value) {
            addCriterion("ID_USUARIO >", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_USUARIO >=", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioLessThan(Integer value) {
            addCriterion("ID_USUARIO <", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioLessThanOrEqualTo(Integer value) {
            addCriterion("ID_USUARIO <=", value, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioIn(List<Integer> values) {
            addCriterion("ID_USUARIO in", values, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotIn(List<Integer> values) {
            addCriterion("ID_USUARIO not in", values, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioBetween(Integer value1, Integer value2) {
            addCriterion("ID_USUARIO between", value1, value2, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andIdUsuarioNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_USUARIO not between", value1, value2, "idUsuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioIsNull() {
            addCriterion("USUARIO is null");
            return (Criteria) this;
        }

        public Criteria andUsuarioIsNotNull() {
            addCriterion("USUARIO is not null");
            return (Criteria) this;
        }

        public Criteria andUsuarioEqualTo(String value) {
            addCriterion("USUARIO =", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotEqualTo(String value) {
            addCriterion("USUARIO <>", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioGreaterThan(String value) {
            addCriterion("USUARIO >", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioGreaterThanOrEqualTo(String value) {
            addCriterion("USUARIO >=", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLessThan(String value) {
            addCriterion("USUARIO <", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLessThanOrEqualTo(String value) {
            addCriterion("USUARIO <=", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioLike(String value) {
            addCriterion("USUARIO like", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotLike(String value) {
            addCriterion("USUARIO not like", value, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioIn(List<String> values) {
            addCriterion("USUARIO in", values, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotIn(List<String> values) {
            addCriterion("USUARIO not in", values, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioBetween(String value1, String value2) {
            addCriterion("USUARIO between", value1, value2, "usuario");
            return (Criteria) this;
        }

        public Criteria andUsuarioNotBetween(String value1, String value2) {
            addCriterion("USUARIO not between", value1, value2, "usuario");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEstatusIsNull() {
            addCriterion("ESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andEstatusIsNotNull() {
            addCriterion("ESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEstatusEqualTo(String value) {
            addCriterion("ESTATUS =", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusNotEqualTo(String value) {
            addCriterion("ESTATUS <>", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusGreaterThan(String value) {
            addCriterion("ESTATUS >", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusGreaterThanOrEqualTo(String value) {
            addCriterion("ESTATUS >=", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusLessThan(String value) {
            addCriterion("ESTATUS <", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusLessThanOrEqualTo(String value) {
            addCriterion("ESTATUS <=", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusLike(String value) {
            addCriterion("ESTATUS like", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusNotLike(String value) {
            addCriterion("ESTATUS not like", value, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusIn(List<String> values) {
            addCriterion("ESTATUS in", values, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusNotIn(List<String> values) {
            addCriterion("ESTATUS not in", values, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusBetween(String value1, String value2) {
            addCriterion("ESTATUS between", value1, value2, "estatus");
            return (Criteria) this;
        }

        public Criteria andEstatusNotBetween(String value1, String value2) {
            addCriterion("ESTATUS not between", value1, value2, "estatus");
            return (Criteria) this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("NOMBRE is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("NOMBRE is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("NOMBRE =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("NOMBRE <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("NOMBRE >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("NOMBRE >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("NOMBRE <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("NOMBRE <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("NOMBRE like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("NOMBRE not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("NOMBRE in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("NOMBRE not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("NOMBRE between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("NOMBRE not between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andApPaternoIsNull() {
            addCriterion("AP_PATERNO is null");
            return (Criteria) this;
        }

        public Criteria andApPaternoIsNotNull() {
            addCriterion("AP_PATERNO is not null");
            return (Criteria) this;
        }

        public Criteria andApPaternoEqualTo(String value) {
            addCriterion("AP_PATERNO =", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoNotEqualTo(String value) {
            addCriterion("AP_PATERNO <>", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoGreaterThan(String value) {
            addCriterion("AP_PATERNO >", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoGreaterThanOrEqualTo(String value) {
            addCriterion("AP_PATERNO >=", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoLessThan(String value) {
            addCriterion("AP_PATERNO <", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoLessThanOrEqualTo(String value) {
            addCriterion("AP_PATERNO <=", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoLike(String value) {
            addCriterion("AP_PATERNO like", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoNotLike(String value) {
            addCriterion("AP_PATERNO not like", value, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoIn(List<String> values) {
            addCriterion("AP_PATERNO in", values, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoNotIn(List<String> values) {
            addCriterion("AP_PATERNO not in", values, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoBetween(String value1, String value2) {
            addCriterion("AP_PATERNO between", value1, value2, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApPaternoNotBetween(String value1, String value2) {
            addCriterion("AP_PATERNO not between", value1, value2, "apPaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoIsNull() {
            addCriterion("AP_MATERNO is null");
            return (Criteria) this;
        }

        public Criteria andApMaternoIsNotNull() {
            addCriterion("AP_MATERNO is not null");
            return (Criteria) this;
        }

        public Criteria andApMaternoEqualTo(String value) {
            addCriterion("AP_MATERNO =", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoNotEqualTo(String value) {
            addCriterion("AP_MATERNO <>", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoGreaterThan(String value) {
            addCriterion("AP_MATERNO >", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoGreaterThanOrEqualTo(String value) {
            addCriterion("AP_MATERNO >=", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoLessThan(String value) {
            addCriterion("AP_MATERNO <", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoLessThanOrEqualTo(String value) {
            addCriterion("AP_MATERNO <=", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoLike(String value) {
            addCriterion("AP_MATERNO like", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoNotLike(String value) {
            addCriterion("AP_MATERNO not like", value, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoIn(List<String> values) {
            addCriterion("AP_MATERNO in", values, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoNotIn(List<String> values) {
            addCriterion("AP_MATERNO not in", values, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoBetween(String value1, String value2) {
            addCriterion("AP_MATERNO between", value1, value2, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andApMaternoNotBetween(String value1, String value2) {
            addCriterion("AP_MATERNO not between", value1, value2, "apMaterno");
            return (Criteria) this;
        }

        public Criteria andCorreoIsNull() {
            addCriterion("CORREO is null");
            return (Criteria) this;
        }

        public Criteria andCorreoIsNotNull() {
            addCriterion("CORREO is not null");
            return (Criteria) this;
        }

        public Criteria andCorreoEqualTo(String value) {
            addCriterion("CORREO =", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoNotEqualTo(String value) {
            addCriterion("CORREO <>", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoGreaterThan(String value) {
            addCriterion("CORREO >", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoGreaterThanOrEqualTo(String value) {
            addCriterion("CORREO >=", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoLessThan(String value) {
            addCriterion("CORREO <", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoLessThanOrEqualTo(String value) {
            addCriterion("CORREO <=", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoLike(String value) {
            addCriterion("CORREO like", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoNotLike(String value) {
            addCriterion("CORREO not like", value, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoIn(List<String> values) {
            addCriterion("CORREO in", values, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoNotIn(List<String> values) {
            addCriterion("CORREO not in", values, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoBetween(String value1, String value2) {
            addCriterion("CORREO between", value1, value2, "correo");
            return (Criteria) this;
        }

        public Criteria andCorreoNotBetween(String value1, String value2) {
            addCriterion("CORREO not between", value1, value2, "correo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USUARIO
     *
     * @mbggenerated do_not_delete_during_merge Thu Jun 09 18:10:57 CDT 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table USUARIO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}