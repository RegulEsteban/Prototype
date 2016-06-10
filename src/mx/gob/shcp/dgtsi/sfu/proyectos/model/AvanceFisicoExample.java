package mx.gob.shcp.dgtsi.sfu.proyectos.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AvanceFisicoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public AvanceFisicoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
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
     * This method corresponds to the database table AVANCE_FISICO
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
     * This method corresponds to the database table AVANCE_FISICO
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AVANCE_FISICO
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
     * This class corresponds to the database table AVANCE_FISICO
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdAvanceFisicoIsNull() {
            addCriterion("ID_AVANCE_FISICO is null");
            return (Criteria) this;
        }

        public Criteria andIdAvanceFisicoIsNotNull() {
            addCriterion("ID_AVANCE_FISICO is not null");
            return (Criteria) this;
        }

        public Criteria andIdAvanceFisicoEqualTo(Integer value) {
            addCriterion("ID_AVANCE_FISICO =", value, "idAvanceFisico");
            return (Criteria) this;
        }

        public Criteria andIdAvanceFisicoNotEqualTo(Integer value) {
            addCriterion("ID_AVANCE_FISICO <>", value, "idAvanceFisico");
            return (Criteria) this;
        }

        public Criteria andIdAvanceFisicoGreaterThan(Integer value) {
            addCriterion("ID_AVANCE_FISICO >", value, "idAvanceFisico");
            return (Criteria) this;
        }

        public Criteria andIdAvanceFisicoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_AVANCE_FISICO >=", value, "idAvanceFisico");
            return (Criteria) this;
        }

        public Criteria andIdAvanceFisicoLessThan(Integer value) {
            addCriterion("ID_AVANCE_FISICO <", value, "idAvanceFisico");
            return (Criteria) this;
        }

        public Criteria andIdAvanceFisicoLessThanOrEqualTo(Integer value) {
            addCriterion("ID_AVANCE_FISICO <=", value, "idAvanceFisico");
            return (Criteria) this;
        }

        public Criteria andIdAvanceFisicoIn(List<Integer> values) {
            addCriterion("ID_AVANCE_FISICO in", values, "idAvanceFisico");
            return (Criteria) this;
        }

        public Criteria andIdAvanceFisicoNotIn(List<Integer> values) {
            addCriterion("ID_AVANCE_FISICO not in", values, "idAvanceFisico");
            return (Criteria) this;
        }

        public Criteria andIdAvanceFisicoBetween(Integer value1, Integer value2) {
            addCriterion("ID_AVANCE_FISICO between", value1, value2, "idAvanceFisico");
            return (Criteria) this;
        }

        public Criteria andIdAvanceFisicoNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_AVANCE_FISICO not between", value1, value2, "idAvanceFisico");
            return (Criteria) this;
        }

        public Criteria andPeriodoIsNull() {
            addCriterion("PERIODO is null");
            return (Criteria) this;
        }

        public Criteria andPeriodoIsNotNull() {
            addCriterion("PERIODO is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodoEqualTo(String value) {
            addCriterion("PERIODO =", value, "periodo");
            return (Criteria) this;
        }

        public Criteria andPeriodoNotEqualTo(String value) {
            addCriterion("PERIODO <>", value, "periodo");
            return (Criteria) this;
        }

        public Criteria andPeriodoGreaterThan(String value) {
            addCriterion("PERIODO >", value, "periodo");
            return (Criteria) this;
        }

        public Criteria andPeriodoGreaterThanOrEqualTo(String value) {
            addCriterion("PERIODO >=", value, "periodo");
            return (Criteria) this;
        }

        public Criteria andPeriodoLessThan(String value) {
            addCriterion("PERIODO <", value, "periodo");
            return (Criteria) this;
        }

        public Criteria andPeriodoLessThanOrEqualTo(String value) {
            addCriterion("PERIODO <=", value, "periodo");
            return (Criteria) this;
        }

        public Criteria andPeriodoLike(String value) {
            addCriterion("PERIODO like", value, "periodo");
            return (Criteria) this;
        }

        public Criteria andPeriodoNotLike(String value) {
            addCriterion("PERIODO not like", value, "periodo");
            return (Criteria) this;
        }

        public Criteria andPeriodoIn(List<String> values) {
            addCriterion("PERIODO in", values, "periodo");
            return (Criteria) this;
        }

        public Criteria andPeriodoNotIn(List<String> values) {
            addCriterion("PERIODO not in", values, "periodo");
            return (Criteria) this;
        }

        public Criteria andPeriodoBetween(String value1, String value2) {
            addCriterion("PERIODO between", value1, value2, "periodo");
            return (Criteria) this;
        }

        public Criteria andPeriodoNotBetween(String value1, String value2) {
            addCriterion("PERIODO not between", value1, value2, "periodo");
            return (Criteria) this;
        }

        public Criteria andFechaIsNull() {
            addCriterion("FECHA is null");
            return (Criteria) this;
        }

        public Criteria andFechaIsNotNull() {
            addCriterion("FECHA is not null");
            return (Criteria) this;
        }

        public Criteria andFechaEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA =", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA <>", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThan(Date value) {
            addCriterionForJDBCDate("FECHA >", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA >=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThan(Date value) {
            addCriterionForJDBCDate("FECHA <", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("FECHA <=", value, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaIn(List<Date> values) {
            addCriterionForJDBCDate("FECHA in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotIn(List<Date> values) {
            addCriterionForJDBCDate("FECHA not in", values, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECHA between", value1, value2, "fecha");
            return (Criteria) this;
        }

        public Criteria andFechaNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("FECHA not between", value1, value2, "fecha");
            return (Criteria) this;
        }

        public Criteria andTipoMapaIsNull() {
            addCriterion("TIPO_MAPA is null");
            return (Criteria) this;
        }

        public Criteria andTipoMapaIsNotNull() {
            addCriterion("TIPO_MAPA is not null");
            return (Criteria) this;
        }

        public Criteria andTipoMapaEqualTo(String value) {
            addCriterion("TIPO_MAPA =", value, "tipoMapa");
            return (Criteria) this;
        }

        public Criteria andTipoMapaNotEqualTo(String value) {
            addCriterion("TIPO_MAPA <>", value, "tipoMapa");
            return (Criteria) this;
        }

        public Criteria andTipoMapaGreaterThan(String value) {
            addCriterion("TIPO_MAPA >", value, "tipoMapa");
            return (Criteria) this;
        }

        public Criteria andTipoMapaGreaterThanOrEqualTo(String value) {
            addCriterion("TIPO_MAPA >=", value, "tipoMapa");
            return (Criteria) this;
        }

        public Criteria andTipoMapaLessThan(String value) {
            addCriterion("TIPO_MAPA <", value, "tipoMapa");
            return (Criteria) this;
        }

        public Criteria andTipoMapaLessThanOrEqualTo(String value) {
            addCriterion("TIPO_MAPA <=", value, "tipoMapa");
            return (Criteria) this;
        }

        public Criteria andTipoMapaLike(String value) {
            addCriterion("TIPO_MAPA like", value, "tipoMapa");
            return (Criteria) this;
        }

        public Criteria andTipoMapaNotLike(String value) {
            addCriterion("TIPO_MAPA not like", value, "tipoMapa");
            return (Criteria) this;
        }

        public Criteria andTipoMapaIn(List<String> values) {
            addCriterion("TIPO_MAPA in", values, "tipoMapa");
            return (Criteria) this;
        }

        public Criteria andTipoMapaNotIn(List<String> values) {
            addCriterion("TIPO_MAPA not in", values, "tipoMapa");
            return (Criteria) this;
        }

        public Criteria andTipoMapaBetween(String value1, String value2) {
            addCriterion("TIPO_MAPA between", value1, value2, "tipoMapa");
            return (Criteria) this;
        }

        public Criteria andTipoMapaNotBetween(String value1, String value2) {
            addCriterion("TIPO_MAPA not between", value1, value2, "tipoMapa");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AVANCE_FISICO
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
     * This class corresponds to the database table AVANCE_FISICO
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