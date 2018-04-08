package com.atao.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AtaoOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AtaoOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
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

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Integer value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Integer value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Integer value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Integer value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Integer value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Integer> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Integer> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Integer value1, Integer value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(BigDecimal value) {
            addCriterion("order_money =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(BigDecimal value) {
            addCriterion("order_money <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(BigDecimal value) {
            addCriterion("order_money >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_money >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(BigDecimal value) {
            addCriterion("order_money <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_money <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<BigDecimal> values) {
            addCriterion("order_money in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<BigDecimal> values) {
            addCriterion("order_money not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_money between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_money not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andAtaoNameIsNull() {
            addCriterion("atao_name is null");
            return (Criteria) this;
        }

        public Criteria andAtaoNameIsNotNull() {
            addCriterion("atao_name is not null");
            return (Criteria) this;
        }

        public Criteria andAtaoNameEqualTo(String value) {
            addCriterion("atao_name =", value, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoNameNotEqualTo(String value) {
            addCriterion("atao_name <>", value, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoNameGreaterThan(String value) {
            addCriterion("atao_name >", value, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoNameGreaterThanOrEqualTo(String value) {
            addCriterion("atao_name >=", value, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoNameLessThan(String value) {
            addCriterion("atao_name <", value, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoNameLessThanOrEqualTo(String value) {
            addCriterion("atao_name <=", value, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoNameLike(String value) {
            addCriterion("atao_name like", value, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoNameNotLike(String value) {
            addCriterion("atao_name not like", value, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoNameIn(List<String> values) {
            addCriterion("atao_name in", values, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoNameNotIn(List<String> values) {
            addCriterion("atao_name not in", values, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoNameBetween(String value1, String value2) {
            addCriterion("atao_name between", value1, value2, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoNameNotBetween(String value1, String value2) {
            addCriterion("atao_name not between", value1, value2, "ataoName");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneIsNull() {
            addCriterion("atao_phone is null");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneIsNotNull() {
            addCriterion("atao_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneEqualTo(Integer value) {
            addCriterion("atao_phone =", value, "ataoPhone");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneNotEqualTo(Integer value) {
            addCriterion("atao_phone <>", value, "ataoPhone");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneGreaterThan(Integer value) {
            addCriterion("atao_phone >", value, "ataoPhone");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("atao_phone >=", value, "ataoPhone");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneLessThan(Integer value) {
            addCriterion("atao_phone <", value, "ataoPhone");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneLessThanOrEqualTo(Integer value) {
            addCriterion("atao_phone <=", value, "ataoPhone");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneIn(List<Integer> values) {
            addCriterion("atao_phone in", values, "ataoPhone");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneNotIn(List<Integer> values) {
            addCriterion("atao_phone not in", values, "ataoPhone");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneBetween(Integer value1, Integer value2) {
            addCriterion("atao_phone between", value1, value2, "ataoPhone");
            return (Criteria) this;
        }

        public Criteria andAtaoPhoneNotBetween(Integer value1, Integer value2) {
            addCriterion("atao_phone not between", value1, value2, "ataoPhone");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrIsNull() {
            addCriterion("atao_addr is null");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrIsNotNull() {
            addCriterion("atao_addr is not null");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrEqualTo(String value) {
            addCriterion("atao_addr =", value, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrNotEqualTo(String value) {
            addCriterion("atao_addr <>", value, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrGreaterThan(String value) {
            addCriterion("atao_addr >", value, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrGreaterThanOrEqualTo(String value) {
            addCriterion("atao_addr >=", value, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrLessThan(String value) {
            addCriterion("atao_addr <", value, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrLessThanOrEqualTo(String value) {
            addCriterion("atao_addr <=", value, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrLike(String value) {
            addCriterion("atao_addr like", value, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrNotLike(String value) {
            addCriterion("atao_addr not like", value, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrIn(List<String> values) {
            addCriterion("atao_addr in", values, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrNotIn(List<String> values) {
            addCriterion("atao_addr not in", values, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrBetween(String value1, String value2) {
            addCriterion("atao_addr between", value1, value2, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andAtaoAddrNotBetween(String value1, String value2) {
            addCriterion("atao_addr not between", value1, value2, "ataoAddr");
            return (Criteria) this;
        }

        public Criteria andOrderStatIsNull() {
            addCriterion("order_stat is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatIsNotNull() {
            addCriterion("order_stat is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatEqualTo(Byte value) {
            addCriterion("order_stat =", value, "orderStat");
            return (Criteria) this;
        }

        public Criteria andOrderStatNotEqualTo(Byte value) {
            addCriterion("order_stat <>", value, "orderStat");
            return (Criteria) this;
        }

        public Criteria andOrderStatGreaterThan(Byte value) {
            addCriterion("order_stat >", value, "orderStat");
            return (Criteria) this;
        }

        public Criteria andOrderStatGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_stat >=", value, "orderStat");
            return (Criteria) this;
        }

        public Criteria andOrderStatLessThan(Byte value) {
            addCriterion("order_stat <", value, "orderStat");
            return (Criteria) this;
        }

        public Criteria andOrderStatLessThanOrEqualTo(Byte value) {
            addCriterion("order_stat <=", value, "orderStat");
            return (Criteria) this;
        }

        public Criteria andOrderStatIn(List<Byte> values) {
            addCriterion("order_stat in", values, "orderStat");
            return (Criteria) this;
        }

        public Criteria andOrderStatNotIn(List<Byte> values) {
            addCriterion("order_stat not in", values, "orderStat");
            return (Criteria) this;
        }

        public Criteria andOrderStatBetween(Byte value1, Byte value2) {
            addCriterion("order_stat between", value1, value2, "orderStat");
            return (Criteria) this;
        }

        public Criteria andOrderStatNotBetween(Byte value1, Byte value2) {
            addCriterion("order_stat not between", value1, value2, "orderStat");
            return (Criteria) this;
        }

        public Criteria andOrderPayIsNull() {
            addCriterion("order_pay is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayIsNotNull() {
            addCriterion("order_pay is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayEqualTo(Byte value) {
            addCriterion("order_pay =", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotEqualTo(Byte value) {
            addCriterion("order_pay <>", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayGreaterThan(Byte value) {
            addCriterion("order_pay >", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_pay >=", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayLessThan(Byte value) {
            addCriterion("order_pay <", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayLessThanOrEqualTo(Byte value) {
            addCriterion("order_pay <=", value, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayIn(List<Byte> values) {
            addCriterion("order_pay in", values, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotIn(List<Byte> values) {
            addCriterion("order_pay not in", values, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayBetween(Byte value1, Byte value2) {
            addCriterion("order_pay between", value1, value2, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderPayNotBetween(Byte value1, Byte value2) {
            addCriterion("order_pay not between", value1, value2, "orderPay");
            return (Criteria) this;
        }

        public Criteria andOrderMesIsNull() {
            addCriterion("order_mes is null");
            return (Criteria) this;
        }

        public Criteria andOrderMesIsNotNull() {
            addCriterion("order_mes is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMesEqualTo(String value) {
            addCriterion("order_mes =", value, "orderMes");
            return (Criteria) this;
        }

        public Criteria andOrderMesNotEqualTo(String value) {
            addCriterion("order_mes <>", value, "orderMes");
            return (Criteria) this;
        }

        public Criteria andOrderMesGreaterThan(String value) {
            addCriterion("order_mes >", value, "orderMes");
            return (Criteria) this;
        }

        public Criteria andOrderMesGreaterThanOrEqualTo(String value) {
            addCriterion("order_mes >=", value, "orderMes");
            return (Criteria) this;
        }

        public Criteria andOrderMesLessThan(String value) {
            addCriterion("order_mes <", value, "orderMes");
            return (Criteria) this;
        }

        public Criteria andOrderMesLessThanOrEqualTo(String value) {
            addCriterion("order_mes <=", value, "orderMes");
            return (Criteria) this;
        }

        public Criteria andOrderMesLike(String value) {
            addCriterion("order_mes like", value, "orderMes");
            return (Criteria) this;
        }

        public Criteria andOrderMesNotLike(String value) {
            addCriterion("order_mes not like", value, "orderMes");
            return (Criteria) this;
        }

        public Criteria andOrderMesIn(List<String> values) {
            addCriterion("order_mes in", values, "orderMes");
            return (Criteria) this;
        }

        public Criteria andOrderMesNotIn(List<String> values) {
            addCriterion("order_mes not in", values, "orderMes");
            return (Criteria) this;
        }

        public Criteria andOrderMesBetween(String value1, String value2) {
            addCriterion("order_mes between", value1, value2, "orderMes");
            return (Criteria) this;
        }

        public Criteria andOrderMesNotBetween(String value1, String value2) {
            addCriterion("order_mes not between", value1, value2, "orderMes");
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