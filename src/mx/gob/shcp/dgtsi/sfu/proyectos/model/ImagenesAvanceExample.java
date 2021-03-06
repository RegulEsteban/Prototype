package mx.gob.shcp.dgtsi.sfu.proyectos.model;

import java.util.ArrayList;
import java.util.List;

public class ImagenesAvanceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public ImagenesAvanceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IMAGENES_AVANCE
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
     * This method corresponds to the database table IMAGENES_AVANCE
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
     * This method corresponds to the database table IMAGENES_AVANCE
     *
     * @mbggenerated Thu Jun 09 18:10:57 CDT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table IMAGENES_AVANCE
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
     * This class corresponds to the database table IMAGENES_AVANCE
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

        public Criteria andIdImagenesAvanceIsNull() {
            addCriterion("ID_IMAGENES_AVANCE is null");
            return (Criteria) this;
        }

        public Criteria andIdImagenesAvanceIsNotNull() {
            addCriterion("ID_IMAGENES_AVANCE is not null");
            return (Criteria) this;
        }

        public Criteria andIdImagenesAvanceEqualTo(Integer value) {
            addCriterion("ID_IMAGENES_AVANCE =", value, "idImagenesAvance");
            return (Criteria) this;
        }

        public Criteria andIdImagenesAvanceNotEqualTo(Integer value) {
            addCriterion("ID_IMAGENES_AVANCE <>", value, "idImagenesAvance");
            return (Criteria) this;
        }

        public Criteria andIdImagenesAvanceGreaterThan(Integer value) {
            addCriterion("ID_IMAGENES_AVANCE >", value, "idImagenesAvance");
            return (Criteria) this;
        }

        public Criteria andIdImagenesAvanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID_IMAGENES_AVANCE >=", value, "idImagenesAvance");
            return (Criteria) this;
        }

        public Criteria andIdImagenesAvanceLessThan(Integer value) {
            addCriterion("ID_IMAGENES_AVANCE <", value, "idImagenesAvance");
            return (Criteria) this;
        }

        public Criteria andIdImagenesAvanceLessThanOrEqualTo(Integer value) {
            addCriterion("ID_IMAGENES_AVANCE <=", value, "idImagenesAvance");
            return (Criteria) this;
        }

        public Criteria andIdImagenesAvanceIn(List<Integer> values) {
            addCriterion("ID_IMAGENES_AVANCE in", values, "idImagenesAvance");
            return (Criteria) this;
        }

        public Criteria andIdImagenesAvanceNotIn(List<Integer> values) {
            addCriterion("ID_IMAGENES_AVANCE not in", values, "idImagenesAvance");
            return (Criteria) this;
        }

        public Criteria andIdImagenesAvanceBetween(Integer value1, Integer value2) {
            addCriterion("ID_IMAGENES_AVANCE between", value1, value2, "idImagenesAvance");
            return (Criteria) this;
        }

        public Criteria andIdImagenesAvanceNotBetween(Integer value1, Integer value2) {
            addCriterion("ID_IMAGENES_AVANCE not between", value1, value2, "idImagenesAvance");
            return (Criteria) this;
        }

        public Criteria andImagenIsNull() {
            addCriterion("IMAGEN is null");
            return (Criteria) this;
        }

        public Criteria andImagenIsNotNull() {
            addCriterion("IMAGEN is not null");
            return (Criteria) this;
        }

        public Criteria andImagenEqualTo(String value) {
            addCriterion("IMAGEN =", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenNotEqualTo(String value) {
            addCriterion("IMAGEN <>", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenGreaterThan(String value) {
            addCriterion("IMAGEN >", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGEN >=", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenLessThan(String value) {
            addCriterion("IMAGEN <", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenLessThanOrEqualTo(String value) {
            addCriterion("IMAGEN <=", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenLike(String value) {
            addCriterion("IMAGEN like", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenNotLike(String value) {
            addCriterion("IMAGEN not like", value, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenIn(List<String> values) {
            addCriterion("IMAGEN in", values, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenNotIn(List<String> values) {
            addCriterion("IMAGEN not in", values, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenBetween(String value1, String value2) {
            addCriterion("IMAGEN between", value1, value2, "imagen");
            return (Criteria) this;
        }

        public Criteria andImagenNotBetween(String value1, String value2) {
            addCriterion("IMAGEN not between", value1, value2, "imagen");
            return (Criteria) this;
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table IMAGENES_AVANCE
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
     * This class corresponds to the database table IMAGENES_AVANCE
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