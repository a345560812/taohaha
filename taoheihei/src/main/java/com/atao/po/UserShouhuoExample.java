package com.atao.po;

import java.util.ArrayList;
import java.util.List;

public class UserShouhuoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserShouhuoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHygNameIsNull() {
            addCriterion("hyg_name is null");
            return (Criteria) this;
        }

        public Criteria andHygNameIsNotNull() {
            addCriterion("hyg_name is not null");
            return (Criteria) this;
        }

        public Criteria andHygNameEqualTo(String value) {
            addCriterion("hyg_name =", value, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygNameNotEqualTo(String value) {
            addCriterion("hyg_name <>", value, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygNameGreaterThan(String value) {
            addCriterion("hyg_name >", value, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygNameGreaterThanOrEqualTo(String value) {
            addCriterion("hyg_name >=", value, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygNameLessThan(String value) {
            addCriterion("hyg_name <", value, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygNameLessThanOrEqualTo(String value) {
            addCriterion("hyg_name <=", value, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygNameLike(String value) {
            addCriterion("hyg_name like", value, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygNameNotLike(String value) {
            addCriterion("hyg_name not like", value, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygNameIn(List<String> values) {
            addCriterion("hyg_name in", values, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygNameNotIn(List<String> values) {
            addCriterion("hyg_name not in", values, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygNameBetween(String value1, String value2) {
            addCriterion("hyg_name between", value1, value2, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygNameNotBetween(String value1, String value2) {
            addCriterion("hyg_name not between", value1, value2, "hygName");
            return (Criteria) this;
        }

        public Criteria andHygPhoneIsNull() {
            addCriterion("hyg_phone is null");
            return (Criteria) this;
        }

        public Criteria andHygPhoneIsNotNull() {
            addCriterion("hyg_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHygPhoneEqualTo(String value) {
            addCriterion("hyg_phone =", value, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygPhoneNotEqualTo(String value) {
            addCriterion("hyg_phone <>", value, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygPhoneGreaterThan(String value) {
            addCriterion("hyg_phone >", value, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("hyg_phone >=", value, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygPhoneLessThan(String value) {
            addCriterion("hyg_phone <", value, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygPhoneLessThanOrEqualTo(String value) {
            addCriterion("hyg_phone <=", value, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygPhoneLike(String value) {
            addCriterion("hyg_phone like", value, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygPhoneNotLike(String value) {
            addCriterion("hyg_phone not like", value, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygPhoneIn(List<String> values) {
            addCriterion("hyg_phone in", values, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygPhoneNotIn(List<String> values) {
            addCriterion("hyg_phone not in", values, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygPhoneBetween(String value1, String value2) {
            addCriterion("hyg_phone between", value1, value2, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygPhoneNotBetween(String value1, String value2) {
            addCriterion("hyg_phone not between", value1, value2, "hygPhone");
            return (Criteria) this;
        }

        public Criteria andHygAddrIsNull() {
            addCriterion("hyg_addr is null");
            return (Criteria) this;
        }

        public Criteria andHygAddrIsNotNull() {
            addCriterion("hyg_addr is not null");
            return (Criteria) this;
        }

        public Criteria andHygAddrEqualTo(String value) {
            addCriterion("hyg_addr =", value, "hygAddr");
            return (Criteria) this;
        }

        public Criteria andHygAddrNotEqualTo(String value) {
            addCriterion("hyg_addr <>", value, "hygAddr");
            return (Criteria) this;
        }

        public Criteria andHygAddrGreaterThan(String value) {
            addCriterion("hyg_addr >", value, "hygAddr");
            return (Criteria) this;
        }

        public Criteria andHygAddrGreaterThanOrEqualTo(String value) {
            addCriterion("hyg_addr >=", value, "hygAddr");
            return (Criteria) this;
        }

        public Criteria andHygAddrLessThan(String value) {
            addCriterion("hyg_addr <", value, "hygAddr");
            return (Criteria) this;
        }

        public Criteria andHygAddrLessThanOrEqualTo(String value) {
            addCriterion("hyg_addr <=", value, "hygAddr");
            return (Criteria) this;
        }

        public Criteria andHygAddrLike(String value) {
            addCriterion("hyg_addr like", value, "hygAddr");
            return (Criteria) this;
        }

        public Criteria andHygAddrNotLike(String value) {
            addCriterion("hyg_addr not like", value, "hygAddr");
            return (Criteria) this;
        }

        public Criteria andHygAddrIn(List<String> values) {
            addCriterion("hyg_addr in", values, "hygAddr");
            return (Criteria) this;
        }

        public Criteria andHygAddrNotIn(List<String> values) {
            addCriterion("hyg_addr not in", values, "hygAddr");
            return (Criteria) this;
        }

        public Criteria andHygAddrBetween(String value1, String value2) {
            addCriterion("hyg_addr between", value1, value2, "hygAddr");
            return (Criteria) this;
        }

        public Criteria andHygAddrNotBetween(String value1, String value2) {
            addCriterion("hyg_addr not between", value1, value2, "hygAddr");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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