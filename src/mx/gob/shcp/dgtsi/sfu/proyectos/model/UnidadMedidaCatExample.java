package mx.gob.shcp.dgtsi.sfu.proyectos.model;

import java.util.ArrayList;
import java.util.List;

public class UnidadMedidaCatExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table UNIDAD_MEDIDA_CAT
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table UNIDAD_MEDIDA_CAT
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table UNIDAD_MEDIDA_CAT
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIDAD_MEDIDA_CAT
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public UnidadMedidaCatExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIDAD_MEDIDA_CAT
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIDAD_MEDIDA_CAT
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIDAD_MEDIDA_CAT
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIDAD_MEDIDA_CAT
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIDAD_MEDIDA_CAT
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIDAD_MEDIDA_CAT
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIDAD_MEDIDA_CAT
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
     * This method corresponds to the database table UNIDAD_MEDIDA_CAT
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
     * This method corresponds to the database table UNIDAD_MEDIDA_CAT
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIDAD_MEDIDA_CAT
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
     * This class corresponds to the database table UNIDAD_MEDIDA_CAT
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

        public Criteria andIdUnidadMedidaIsNull() {
            addCriterion("ID_UNIDAD_MEDIDA is null");
            return (Criteria) this;
        }

        public Criteria andIdUnidadMedidaIsNotNull() {
            addCriterion("ID_UNIDAD_MEDIDA is not null");
            return (Criteria) this;
        }

        public Criteria andIdUnidadMedidaEqualTo(Integer value) {
            addCriterion("ID_UNIDAD_MEDIDA =", value, "idUnidadMedida");
            return (Criteria) this;
        }

        public Criteria andIdUnidadMedidaNotEqualTo(Integer value) {
            addCriterion("ID_UNIDAD_MEDIDA <>", value, "idUnidadMedida");
            return (Criteria) this;
        }

        public Criteria andIdUnidadMedidaGreaterThan(Integer value) {
            addCriterion("ID_UNIDAD_MEDIDA >", value, "idUnidadMedida");
            return (Criteria) this;
        }

        public Criteria andIdUnidadMedidaGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_UNIDAD_MEDIDA >=", value, "idUnidadMedida");
            return (Criteria) this;
        }

        public Criteria andIdUnidadMedidaLessThan(Integer value) {
            addCriterion("ID_UNIDAD_MEDIDA <", value, "idUnidadMedida");
            return (Criteria) this;
        }

        public Criteria andIdUnidadMedidaLessThanOrEqualTo(Integer value) {
            addCriterion("ID_UNIDAD_MEDIDA <=", value, "idUnidadMedida");
            return (Criteria) this;
        }

        public Criteria andIdUnidadMedidaIn(List<Integer> values) {
            addCriterion("ID_UNIDAD_MEDIDA in", values, "idUnidadMedida");
            return (Criteria) this;
        }

        public Criteria andIdUnidadMedidaNotIn(List<Integer> values) {
            addCriterion("ID_UNIDAD_MEDIDA not in", values, "idUnidadMedida");
            return (Criteria) this;
        }

        public Criteria andIdUnidadMedidaBetween(Integer value1, Integer value2) {
            addCriterion("ID_UNIDAD_MEDIDA between", value1, value2, "idUnidadMedida");
            return (Criteria) this;
        }

        public Criteria andIdUnidadMedidaNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_UNIDAD_MEDIDA not between", value1, value2, "idUnidadMedida");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNull() {
            addCriterion("DESCRIPCION is null");
            return (Criteria) this;
        }

        public Criteria andDescripcionIsNotNull() {
            addCriterion("DESCRIPCION is not null");
            return (Criteria) this;
        }

        public Criteria andDescripcionEqualTo(String value) {
            addCriterion("DESCRIPCION =", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotEqualTo(String value) {
            addCriterion("DESCRIPCION <>", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThan(String value) {
            addCriterion("DESCRIPCION >", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION >=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThan(String value) {
            addCriterion("DESCRIPCION <", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPCION <=", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionLike(String value) {
            addCriterion("DESCRIPCION like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotLike(String value) {
            addCriterion("DESCRIPCION not like", value, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionIn(List<String> values) {
            addCriterion("DESCRIPCION in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotIn(List<String> values) {
            addCriterion("DESCRIPCION not in", values, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionBetween(String value1, String value2) {
            addCriterion("DESCRIPCION between", value1, value2, "descripcion");
            return (Criteria) this;
        }

        public Criteria andDescripcionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPCION not between", value1, value2, "descripcion");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table UNIDAD_MEDIDA_CAT
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
     * This class corresponds to the database table UNIDAD_MEDIDA_CAT
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