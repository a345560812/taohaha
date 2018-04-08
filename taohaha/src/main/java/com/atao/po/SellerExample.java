package com.atao.po;

import java.util.ArrayList;
import java.util.List;

public class SellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellerExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameIsNull() {
            addCriterion("seller_username is null");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameIsNotNull() {
            addCriterion("seller_username is not null");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameEqualTo(String value) {
            addCriterion("seller_username =", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameNotEqualTo(String value) {
            addCriterion("seller_username <>", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameGreaterThan(String value) {
            addCriterion("seller_username >", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_username >=", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameLessThan(String value) {
            addCriterion("seller_username <", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameLessThanOrEqualTo(String value) {
            addCriterion("seller_username <=", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameLike(String value) {
            addCriterion("seller_username like", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameNotLike(String value) {
            addCriterion("seller_username not like", value, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameIn(List<String> values) {
            addCriterion("seller_username in", values, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameNotIn(List<String> values) {
            addCriterion("seller_username not in", values, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameBetween(String value1, String value2) {
            addCriterion("seller_username between", value1, value2, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerUsernameNotBetween(String value1, String value2) {
            addCriterion("seller_username not between", value1, value2, "sellerUsername");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIsNull() {
            addCriterion("seller_password is null");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIsNotNull() {
            addCriterion("seller_password is not null");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordEqualTo(String value) {
            addCriterion("seller_password =", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotEqualTo(String value) {
            addCriterion("seller_password <>", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordGreaterThan(String value) {
            addCriterion("seller_password >", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("seller_password >=", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLessThan(String value) {
            addCriterion("seller_password <", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLessThanOrEqualTo(String value) {
            addCriterion("seller_password <=", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordLike(String value) {
            addCriterion("seller_password like", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotLike(String value) {
            addCriterion("seller_password not like", value, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordIn(List<String> values) {
            addCriterion("seller_password in", values, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotIn(List<String> values) {
            addCriterion("seller_password not in", values, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordBetween(String value1, String value2) {
            addCriterion("seller_password between", value1, value2, "sellerPassword");
            return (Criteria) this;
        }

        public Criteria andSellerPasswordNotBetween(String value1, String value2) {
            addCriterion("seller_password not between", value1, value2, "sellerPassword");
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