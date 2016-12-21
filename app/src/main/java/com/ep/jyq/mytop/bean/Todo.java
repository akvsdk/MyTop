package com.ep.jyq.mytop.bean;

import java.util.List;

/**
 * author  Joy
 * Date:  2016/12/21 0021.
 * version:  V1.0
 * Description:
 */
public class Todo {

    private String cost;
    private int limit;
    private int pageNo;
    private int total;
    private int totalPages;
    private List<RowsEntity> rows;

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<RowsEntity> getRows() {
        return rows;
    }

    public void setRows(List<RowsEntity> rows) {
        this.rows = rows;
    }

    public static class RowsEntity {
        /**
         * abstracts :
         * activity : {"abstracts":"","actionList":[],"activityKey":"","activityList":[],"activityParticipationList":[],"alias":"发送","clazz":"","createTasks":0,"createdBy":"","createdDt":"2016-12-21 23:10:48","cssClass":"","cssStyle":"","currentTaskInstanceList":[],"decisionConditionList":[],"decisionDelegationSid":"","decisionExpression":"","delegation":"","delegationList":[],"description":"","duration":"","entity":"","eventList":[],"exceptionHandler":"","exceptionHandlerList":[],"exceptionHandlerSid":"","expandFiled":"","histTaskInstanceList":[],"isAsync":"","isBlocking":"","isMultiTask":"","isTransient":false,"isValid":true,"isVote":"","name":"发送","olderPk":"","parentActivitySid":"","parentSid":"","platOrganizationEname":"","platOrganizationSid":"","position":"","prevActivitySid":"","processDefinition":"","processDefinitionSid":"","sid":"3123541","status":"","statusLable":"","subProcessDefinitionSid":"","sysOrganizationSid":"","transitionList":[],"type":"","updatedBy":"","updatedDt":"","variableDefinitionList":[],"version":"1","visited":false,"visitedFlag":"","voteRate":""}
         * activityName :
         * activitySid :
         * businessSid : FW201608301058555421217C506684B9
         * clockDay :
         * clockExpected :
         * comment :
         * createdBy :
         * createdDt : 2016-12-21 23:10:48
         * duration :
         * end :
         * enter : 2016-12-21 20:53:45
         * entity :
         * expandFiled :
         * isScanned :
         * isUrged :
         * isValid : true
         * jx :
         * lightType : 1
         * operatorCname :
         * operatorOrgCname :
         * operatorOrgSid :
         * operatorSid :
         * overdue :
         * parentProcessInstance :
         * parentToken :
         * participation :
         * platOrganizationEname :
         * platOrganizationSid : 1963
         * processDefinition : {"abstracts":"","actionList":[],"activityList":[],"activityParticipationList":[],"createdBy":"","createdDt":"2016-12-21 20:53:43","decisionConditionList":[],"delegationList":[],"entity":"","eventList":[],"exceptionHandlerList":[],"expandFiled":"","formBaseName":"","formBaseSid":"","initiatorNameList":"","initiatorSidList":"","initiatorType":"","isTerminationImplicit":"","isTransient":false,"isValid":true,"name":"发文流程","oldName":"","olderPk":"","parentSid":"","platOrganizationEname":"","platOrganizationSid":"","processDefinition":"","processInitiatorList":[],"processKey":"","processType":"","processTypeSid":"1","processVersion":"","sid":"3114195","status":"","statusDesc":"","statusLable":"","sysOrganizationSid":"","transitionList":[],"updatedBy":"","updatedDt":"2016-12-21 20:53:43","variableDefinitionList":[],"version":"1"}
         * processDefinitionSid : 3114195
         * processInstance : {"abstracts":"","activity":"","businessSid":"FW201608301058555421217C506684B9","createdBy":"","createdDt":"2016-12-21 23:10:48","duration":"","end":"","entity":"","expandFiled":"","expectationDuration":"","finisherCname":"","finisherSid":"","initiatorCname":"oatest1","initiatorOrgCname":"重庆电信天翼办公演示","initiatorOrgSid":"1963","initiatorSid":"1010174","instanceStatus":"active","interruptCname":"","interruptSid":"","interruptTime":"","isArchive":"0","isInterrupted":"0","isSuspended":"0","isValid":true,"name":"2013ceshi","parentProcessInstance":"","parentToken":"","platOrganizationEname":"","platOrganizationSid":"1963","processDefinition":"","processDefinitionCname":"发文流程","processDefinitionSid":"3114195","processInstance":"","processInstanceBusiness":"","processType":"","processTypeSid":"1","quantity":"","rootTokenSid":"11887611787153158","sid":"11887611777346854","start":"2016-08-30 10:58:55","status":1,"statusLable":"","superProcessInstanceSid":"","superProcessTokenSid":"","suspendCname":"","suspendSid":"","suspendTime":"","sysOrganizationSid":"","taskInstanceSid":"","token":"","transition":"","typeName":"","updatedBy":"","updatedDt":"","variableMap":"","variables":"","version":"2"}
         * processInstanceSid : 11887611777346854
         * processType : {"abstracts":"","createdBy":"","createdDt":"2016-12-21 20:53:43","descriptions":"","entity":"","expandFiled":"","isValid":true,"name":"发文","orderBy":"","parentSid":"","platOrganizationEname":"","platOrganizationSid":"","sid":"1","status":"","statusLable":"","sysOrganizationSid":"","updatedBy":"","updatedDt":"2016-12-21 20:53:43","version":"1"}
         * processTypeSid : 1
         * responsorCname : oatest1
         * responsorOrgCname : 测试部门
         * responsorOrgSid : 3008128
         * responsorSid : 1010174
         * senderCname : oatest1
         * senderOrgCname : 重庆电信天翼办公演示
         * senderOrgSid : 1963
         * senderSid : 1010174
         * sid : 21686433433521576
         * start : 2016-12-21 20:53:43
         * status : 1
         * statusLable :
         * sysOrganizationSid :
         * taskStatus : open
         * taskTitle :
         * title : 〔发送〕2013ceshi
         * token :
         * tokenSid : 21686433428120936
         * transition :
         * type : 12
         * updatedBy :
         * updatedDt :
         * urgent :
         * variableMap :
         * variables :
         * version : 2
         * warnTime :
         */

        private String abstracts;
        private ActivityEntity activity;
        private String activityName;
        private String activitySid;
        private String businessSid;
        private String clockDay;
        private String clockExpected;
        private String comment;
        private String createdBy;
        private String createdDt;
        private String duration;
        private String end;
        private String enter;
        private String entity;
        private String expandFiled;
        private String isScanned;
        private String isUrged;
        private boolean isValid;
        private String jx;
        private int lightType;
        private String operatorCname;
        private String operatorOrgCname;
        private String operatorOrgSid;
        private String operatorSid;
        private String overdue;
        private String parentProcessInstance;
        private String parentToken;
        private String participation;
        private String platOrganizationEname;
        private String platOrganizationSid;
        private ProcessDefinitionEntity processDefinition;
        private String processDefinitionSid;
        private ProcessInstanceEntity processInstance;
        private String processInstanceSid;
        private ProcessTypeEntity processType;
        private String processTypeSid;
        private String responsorCname;
        private String responsorOrgCname;
        private String responsorOrgSid;
        private String responsorSid;
        private String senderCname;
        private String senderOrgCname;
        private String senderOrgSid;
        private String senderSid;
        private String sid;
        private String start;
        private int status;
        private String statusLable;
        private String sysOrganizationSid;
        private String taskStatus;
        private String taskTitle;
        private String title;
        private String token;
        private String tokenSid;
        private String transition;
        private String type;
        private String updatedBy;
        private String updatedDt;
        private String urgent;
        private String variableMap;
        private String variables;
        private String version;
        private String warnTime;

        public String getAbstracts() {
            return abstracts;
        }

        public void setAbstracts(String abstracts) {
            this.abstracts = abstracts;
        }

        public ActivityEntity getActivity() {
            return activity;
        }

        public void setActivity(ActivityEntity activity) {
            this.activity = activity;
        }

        public String getActivityName() {
            return activityName;
        }

        public void setActivityName(String activityName) {
            this.activityName = activityName;
        }

        public String getActivitySid() {
            return activitySid;
        }

        public void setActivitySid(String activitySid) {
            this.activitySid = activitySid;
        }

        public String getBusinessSid() {
            return businessSid;
        }

        public void setBusinessSid(String businessSid) {
            this.businessSid = businessSid;
        }

        public String getClockDay() {
            return clockDay;
        }

        public void setClockDay(String clockDay) {
            this.clockDay = clockDay;
        }

        public String getClockExpected() {
            return clockExpected;
        }

        public void setClockExpected(String clockExpected) {
            this.clockExpected = clockExpected;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getCreatedBy() {
            return createdBy;
        }

        public void setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
        }

        public String getCreatedDt() {
            return createdDt;
        }

        public void setCreatedDt(String createdDt) {
            this.createdDt = createdDt;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getEnd() {
            return end;
        }

        public void setEnd(String end) {
            this.end = end;
        }

        public String getEnter() {
            return enter;
        }

        public void setEnter(String enter) {
            this.enter = enter;
        }

        public String getEntity() {
            return entity;
        }

        public void setEntity(String entity) {
            this.entity = entity;
        }

        public String getExpandFiled() {
            return expandFiled;
        }

        public void setExpandFiled(String expandFiled) {
            this.expandFiled = expandFiled;
        }

        public String getIsScanned() {
            return isScanned;
        }

        public void setIsScanned(String isScanned) {
            this.isScanned = isScanned;
        }

        public String getIsUrged() {
            return isUrged;
        }

        public void setIsUrged(String isUrged) {
            this.isUrged = isUrged;
        }

        public boolean isIsValid() {
            return isValid;
        }

        public void setIsValid(boolean isValid) {
            this.isValid = isValid;
        }

        public String getJx() {
            return jx;
        }

        public void setJx(String jx) {
            this.jx = jx;
        }

        public int getLightType() {
            return lightType;
        }

        public void setLightType(int lightType) {
            this.lightType = lightType;
        }

        public String getOperatorCname() {
            return operatorCname;
        }

        public void setOperatorCname(String operatorCname) {
            this.operatorCname = operatorCname;
        }

        public String getOperatorOrgCname() {
            return operatorOrgCname;
        }

        public void setOperatorOrgCname(String operatorOrgCname) {
            this.operatorOrgCname = operatorOrgCname;
        }

        public String getOperatorOrgSid() {
            return operatorOrgSid;
        }

        public void setOperatorOrgSid(String operatorOrgSid) {
            this.operatorOrgSid = operatorOrgSid;
        }

        public String getOperatorSid() {
            return operatorSid;
        }

        public void setOperatorSid(String operatorSid) {
            this.operatorSid = operatorSid;
        }

        public String getOverdue() {
            return overdue;
        }

        public void setOverdue(String overdue) {
            this.overdue = overdue;
        }

        public String getParentProcessInstance() {
            return parentProcessInstance;
        }

        public void setParentProcessInstance(String parentProcessInstance) {
            this.parentProcessInstance = parentProcessInstance;
        }

        public String getParentToken() {
            return parentToken;
        }

        public void setParentToken(String parentToken) {
            this.parentToken = parentToken;
        }

        public String getParticipation() {
            return participation;
        }

        public void setParticipation(String participation) {
            this.participation = participation;
        }

        public String getPlatOrganizationEname() {
            return platOrganizationEname;
        }

        public void setPlatOrganizationEname(String platOrganizationEname) {
            this.platOrganizationEname = platOrganizationEname;
        }

        public String getPlatOrganizationSid() {
            return platOrganizationSid;
        }

        public void setPlatOrganizationSid(String platOrganizationSid) {
            this.platOrganizationSid = platOrganizationSid;
        }

        public ProcessDefinitionEntity getProcessDefinition() {
            return processDefinition;
        }

        public void setProcessDefinition(ProcessDefinitionEntity processDefinition) {
            this.processDefinition = processDefinition;
        }

        public String getProcessDefinitionSid() {
            return processDefinitionSid;
        }

        public void setProcessDefinitionSid(String processDefinitionSid) {
            this.processDefinitionSid = processDefinitionSid;
        }

        public ProcessInstanceEntity getProcessInstance() {
            return processInstance;
        }

        public void setProcessInstance(ProcessInstanceEntity processInstance) {
            this.processInstance = processInstance;
        }

        public String getProcessInstanceSid() {
            return processInstanceSid;
        }

        public void setProcessInstanceSid(String processInstanceSid) {
            this.processInstanceSid = processInstanceSid;
        }

        public ProcessTypeEntity getProcessType() {
            return processType;
        }

        public void setProcessType(ProcessTypeEntity processType) {
            this.processType = processType;
        }

        public String getProcessTypeSid() {
            return processTypeSid;
        }

        public void setProcessTypeSid(String processTypeSid) {
            this.processTypeSid = processTypeSid;
        }

        public String getResponsorCname() {
            return responsorCname;
        }

        public void setResponsorCname(String responsorCname) {
            this.responsorCname = responsorCname;
        }

        public String getResponsorOrgCname() {
            return responsorOrgCname;
        }

        public void setResponsorOrgCname(String responsorOrgCname) {
            this.responsorOrgCname = responsorOrgCname;
        }

        public String getResponsorOrgSid() {
            return responsorOrgSid;
        }

        public void setResponsorOrgSid(String responsorOrgSid) {
            this.responsorOrgSid = responsorOrgSid;
        }

        public String getResponsorSid() {
            return responsorSid;
        }

        public void setResponsorSid(String responsorSid) {
            this.responsorSid = responsorSid;
        }

        public String getSenderCname() {
            return senderCname;
        }

        public void setSenderCname(String senderCname) {
            this.senderCname = senderCname;
        }

        public String getSenderOrgCname() {
            return senderOrgCname;
        }

        public void setSenderOrgCname(String senderOrgCname) {
            this.senderOrgCname = senderOrgCname;
        }

        public String getSenderOrgSid() {
            return senderOrgSid;
        }

        public void setSenderOrgSid(String senderOrgSid) {
            this.senderOrgSid = senderOrgSid;
        }

        public String getSenderSid() {
            return senderSid;
        }

        public void setSenderSid(String senderSid) {
            this.senderSid = senderSid;
        }

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getStart() {
            return start;
        }

        public void setStart(String start) {
            this.start = start;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getStatusLable() {
            return statusLable;
        }

        public void setStatusLable(String statusLable) {
            this.statusLable = statusLable;
        }

        public String getSysOrganizationSid() {
            return sysOrganizationSid;
        }

        public void setSysOrganizationSid(String sysOrganizationSid) {
            this.sysOrganizationSid = sysOrganizationSid;
        }

        public String getTaskStatus() {
            return taskStatus;
        }

        public void setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
        }

        public String getTaskTitle() {
            return taskTitle;
        }

        public void setTaskTitle(String taskTitle) {
            this.taskTitle = taskTitle;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getTokenSid() {
            return tokenSid;
        }

        public void setTokenSid(String tokenSid) {
            this.tokenSid = tokenSid;
        }

        public String getTransition() {
            return transition;
        }

        public void setTransition(String transition) {
            this.transition = transition;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUpdatedBy() {
            return updatedBy;
        }

        public void setUpdatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
        }

        public String getUpdatedDt() {
            return updatedDt;
        }

        public void setUpdatedDt(String updatedDt) {
            this.updatedDt = updatedDt;
        }

        public String getUrgent() {
            return urgent;
        }

        public void setUrgent(String urgent) {
            this.urgent = urgent;
        }

        public String getVariableMap() {
            return variableMap;
        }

        public void setVariableMap(String variableMap) {
            this.variableMap = variableMap;
        }

        public String getVariables() {
            return variables;
        }

        public void setVariables(String variables) {
            this.variables = variables;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getWarnTime() {
            return warnTime;
        }

        public void setWarnTime(String warnTime) {
            this.warnTime = warnTime;
        }

        public static class ActivityEntity {
            /**
             * abstracts :
             * actionList : []
             * activityKey :
             * activityList : []
             * activityParticipationList : []
             * alias : 发送
             * clazz :
             * createTasks : 0
             * createdBy :
             * createdDt : 2016-12-21 23:10:48
             * cssClass :
             * cssStyle :
             * currentTaskInstanceList : []
             * decisionConditionList : []
             * decisionDelegationSid :
             * decisionExpression :
             * delegation :
             * delegationList : []
             * description :
             * duration :
             * entity :
             * eventList : []
             * exceptionHandler :
             * exceptionHandlerList : []
             * exceptionHandlerSid :
             * expandFiled :
             * histTaskInstanceList : []
             * isAsync :
             * isBlocking :
             * isMultiTask :
             * isTransient : false
             * isValid : true
             * isVote :
             * name : 发送
             * olderPk :
             * parentActivitySid :
             * parentSid :
             * platOrganizationEname :
             * platOrganizationSid :
             * position :
             * prevActivitySid :
             * processDefinition :
             * processDefinitionSid :
             * sid : 3123541
             * status :
             * statusLable :
             * subProcessDefinitionSid :
             * sysOrganizationSid :
             * transitionList : []
             * type :
             * updatedBy :
             * updatedDt :
             * variableDefinitionList : []
             * version : 1
             * visited : false
             * visitedFlag :
             * voteRate :
             */

            private String abstracts;
            private String activityKey;
            private String alias;
            private String clazz;
            private int createTasks;
            private String createdBy;
            private String createdDt;
            private String cssClass;
            private String cssStyle;
            private String decisionDelegationSid;
            private String decisionExpression;
            private String delegation;
            private String description;
            private String duration;
            private String entity;
            private String exceptionHandler;
            private String exceptionHandlerSid;
            private String expandFiled;
            private String isAsync;
            private String isBlocking;
            private String isMultiTask;
            private boolean isTransient;
            private boolean isValid;
            private String isVote;
            private String name;
            private String olderPk;
            private String parentActivitySid;
            private String parentSid;
            private String platOrganizationEname;
            private String platOrganizationSid;
            private String position;
            private String prevActivitySid;
            private String processDefinition;
            private String processDefinitionSid;
            private String sid;
            private String status;
            private String statusLable;
            private String subProcessDefinitionSid;
            private String sysOrganizationSid;
            private String type;
            private String updatedBy;
            private String updatedDt;
            private String version;
            private boolean visited;
            private String visitedFlag;
            private String voteRate;
            private List<?> actionList;
            private List<?> activityList;
            private List<?> activityParticipationList;
            private List<?> currentTaskInstanceList;
            private List<?> decisionConditionList;
            private List<?> delegationList;
            private List<?> eventList;
            private List<?> exceptionHandlerList;
            private List<?> histTaskInstanceList;
            private List<?> transitionList;
            private List<?> variableDefinitionList;

            public String getAbstracts() {
                return abstracts;
            }

            public void setAbstracts(String abstracts) {
                this.abstracts = abstracts;
            }

            public String getActivityKey() {
                return activityKey;
            }

            public void setActivityKey(String activityKey) {
                this.activityKey = activityKey;
            }

            public String getAlias() {
                return alias;
            }

            public void setAlias(String alias) {
                this.alias = alias;
            }

            public String getClazz() {
                return clazz;
            }

            public void setClazz(String clazz) {
                this.clazz = clazz;
            }

            public int getCreateTasks() {
                return createTasks;
            }

            public void setCreateTasks(int createTasks) {
                this.createTasks = createTasks;
            }

            public String getCreatedBy() {
                return createdBy;
            }

            public void setCreatedBy(String createdBy) {
                this.createdBy = createdBy;
            }

            public String getCreatedDt() {
                return createdDt;
            }

            public void setCreatedDt(String createdDt) {
                this.createdDt = createdDt;
            }

            public String getCssClass() {
                return cssClass;
            }

            public void setCssClass(String cssClass) {
                this.cssClass = cssClass;
            }

            public String getCssStyle() {
                return cssStyle;
            }

            public void setCssStyle(String cssStyle) {
                this.cssStyle = cssStyle;
            }

            public String getDecisionDelegationSid() {
                return decisionDelegationSid;
            }

            public void setDecisionDelegationSid(String decisionDelegationSid) {
                this.decisionDelegationSid = decisionDelegationSid;
            }

            public String getDecisionExpression() {
                return decisionExpression;
            }

            public void setDecisionExpression(String decisionExpression) {
                this.decisionExpression = decisionExpression;
            }

            public String getDelegation() {
                return delegation;
            }

            public void setDelegation(String delegation) {
                this.delegation = delegation;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getEntity() {
                return entity;
            }

            public void setEntity(String entity) {
                this.entity = entity;
            }

            public String getExceptionHandler() {
                return exceptionHandler;
            }

            public void setExceptionHandler(String exceptionHandler) {
                this.exceptionHandler = exceptionHandler;
            }

            public String getExceptionHandlerSid() {
                return exceptionHandlerSid;
            }

            public void setExceptionHandlerSid(String exceptionHandlerSid) {
                this.exceptionHandlerSid = exceptionHandlerSid;
            }

            public String getExpandFiled() {
                return expandFiled;
            }

            public void setExpandFiled(String expandFiled) {
                this.expandFiled = expandFiled;
            }

            public String getIsAsync() {
                return isAsync;
            }

            public void setIsAsync(String isAsync) {
                this.isAsync = isAsync;
            }

            public String getIsBlocking() {
                return isBlocking;
            }

            public void setIsBlocking(String isBlocking) {
                this.isBlocking = isBlocking;
            }

            public String getIsMultiTask() {
                return isMultiTask;
            }

            public void setIsMultiTask(String isMultiTask) {
                this.isMultiTask = isMultiTask;
            }

            public boolean isIsTransient() {
                return isTransient;
            }

            public void setIsTransient(boolean isTransient) {
                this.isTransient = isTransient;
            }

            public boolean isIsValid() {
                return isValid;
            }

            public void setIsValid(boolean isValid) {
                this.isValid = isValid;
            }

            public String getIsVote() {
                return isVote;
            }

            public void setIsVote(String isVote) {
                this.isVote = isVote;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getOlderPk() {
                return olderPk;
            }

            public void setOlderPk(String olderPk) {
                this.olderPk = olderPk;
            }

            public String getParentActivitySid() {
                return parentActivitySid;
            }

            public void setParentActivitySid(String parentActivitySid) {
                this.parentActivitySid = parentActivitySid;
            }

            public String getParentSid() {
                return parentSid;
            }

            public void setParentSid(String parentSid) {
                this.parentSid = parentSid;
            }

            public String getPlatOrganizationEname() {
                return platOrganizationEname;
            }

            public void setPlatOrganizationEname(String platOrganizationEname) {
                this.platOrganizationEname = platOrganizationEname;
            }

            public String getPlatOrganizationSid() {
                return platOrganizationSid;
            }

            public void setPlatOrganizationSid(String platOrganizationSid) {
                this.platOrganizationSid = platOrganizationSid;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getPrevActivitySid() {
                return prevActivitySid;
            }

            public void setPrevActivitySid(String prevActivitySid) {
                this.prevActivitySid = prevActivitySid;
            }

            public String getProcessDefinition() {
                return processDefinition;
            }

            public void setProcessDefinition(String processDefinition) {
                this.processDefinition = processDefinition;
            }

            public String getProcessDefinitionSid() {
                return processDefinitionSid;
            }

            public void setProcessDefinitionSid(String processDefinitionSid) {
                this.processDefinitionSid = processDefinitionSid;
            }

            public String getSid() {
                return sid;
            }

            public void setSid(String sid) {
                this.sid = sid;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getStatusLable() {
                return statusLable;
            }

            public void setStatusLable(String statusLable) {
                this.statusLable = statusLable;
            }

            public String getSubProcessDefinitionSid() {
                return subProcessDefinitionSid;
            }

            public void setSubProcessDefinitionSid(String subProcessDefinitionSid) {
                this.subProcessDefinitionSid = subProcessDefinitionSid;
            }

            public String getSysOrganizationSid() {
                return sysOrganizationSid;
            }

            public void setSysOrganizationSid(String sysOrganizationSid) {
                this.sysOrganizationSid = sysOrganizationSid;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUpdatedBy() {
                return updatedBy;
            }

            public void setUpdatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
            }

            public String getUpdatedDt() {
                return updatedDt;
            }

            public void setUpdatedDt(String updatedDt) {
                this.updatedDt = updatedDt;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }

            public boolean isVisited() {
                return visited;
            }

            public void setVisited(boolean visited) {
                this.visited = visited;
            }

            public String getVisitedFlag() {
                return visitedFlag;
            }

            public void setVisitedFlag(String visitedFlag) {
                this.visitedFlag = visitedFlag;
            }

            public String getVoteRate() {
                return voteRate;
            }

            public void setVoteRate(String voteRate) {
                this.voteRate = voteRate;
            }

            public List<?> getActionList() {
                return actionList;
            }

            public void setActionList(List<?> actionList) {
                this.actionList = actionList;
            }

            public List<?> getActivityList() {
                return activityList;
            }

            public void setActivityList(List<?> activityList) {
                this.activityList = activityList;
            }

            public List<?> getActivityParticipationList() {
                return activityParticipationList;
            }

            public void setActivityParticipationList(List<?> activityParticipationList) {
                this.activityParticipationList = activityParticipationList;
            }

            public List<?> getCurrentTaskInstanceList() {
                return currentTaskInstanceList;
            }

            public void setCurrentTaskInstanceList(List<?> currentTaskInstanceList) {
                this.currentTaskInstanceList = currentTaskInstanceList;
            }

            public List<?> getDecisionConditionList() {
                return decisionConditionList;
            }

            public void setDecisionConditionList(List<?> decisionConditionList) {
                this.decisionConditionList = decisionConditionList;
            }

            public List<?> getDelegationList() {
                return delegationList;
            }

            public void setDelegationList(List<?> delegationList) {
                this.delegationList = delegationList;
            }

            public List<?> getEventList() {
                return eventList;
            }

            public void setEventList(List<?> eventList) {
                this.eventList = eventList;
            }

            public List<?> getExceptionHandlerList() {
                return exceptionHandlerList;
            }

            public void setExceptionHandlerList(List<?> exceptionHandlerList) {
                this.exceptionHandlerList = exceptionHandlerList;
            }

            public List<?> getHistTaskInstanceList() {
                return histTaskInstanceList;
            }

            public void setHistTaskInstanceList(List<?> histTaskInstanceList) {
                this.histTaskInstanceList = histTaskInstanceList;
            }

            public List<?> getTransitionList() {
                return transitionList;
            }

            public void setTransitionList(List<?> transitionList) {
                this.transitionList = transitionList;
            }

            public List<?> getVariableDefinitionList() {
                return variableDefinitionList;
            }

            public void setVariableDefinitionList(List<?> variableDefinitionList) {
                this.variableDefinitionList = variableDefinitionList;
            }
        }

        public static class ProcessDefinitionEntity {
            /**
             * abstracts :
             * actionList : []
             * activityList : []
             * activityParticipationList : []
             * createdBy :
             * createdDt : 2016-12-21 20:53:43
             * decisionConditionList : []
             * delegationList : []
             * entity :
             * eventList : []
             * exceptionHandlerList : []
             * expandFiled :
             * formBaseName :
             * formBaseSid :
             * initiatorNameList :
             * initiatorSidList :
             * initiatorType :
             * isTerminationImplicit :
             * isTransient : false
             * isValid : true
             * name : 发文流程
             * oldName :
             * olderPk :
             * parentSid :
             * platOrganizationEname :
             * platOrganizationSid :
             * processDefinition :
             * processInitiatorList : []
             * processKey :
             * processType :
             * processTypeSid : 1
             * processVersion :
             * sid : 3114195
             * status :
             * statusDesc :
             * statusLable :
             * sysOrganizationSid :
             * transitionList : []
             * updatedBy :
             * updatedDt : 2016-12-21 20:53:43
             * variableDefinitionList : []
             * version : 1
             */

            private String abstracts;
            private String createdBy;
            private String createdDt;
            private String entity;
            private String expandFiled;
            private String formBaseName;
            private String formBaseSid;
            private String initiatorNameList;
            private String initiatorSidList;
            private String initiatorType;
            private String isTerminationImplicit;
            private boolean isTransient;
            private boolean isValid;
            private String name;
            private String oldName;
            private String olderPk;
            private String parentSid;
            private String platOrganizationEname;
            private String platOrganizationSid;
            private String processDefinition;
            private String processKey;
            private String processType;
            private String processTypeSid;
            private String processVersion;
            private String sid;
            private String status;
            private String statusDesc;
            private String statusLable;
            private String sysOrganizationSid;
            private String updatedBy;
            private String updatedDt;
            private String version;
            private List<?> actionList;
            private List<?> activityList;
            private List<?> activityParticipationList;
            private List<?> decisionConditionList;
            private List<?> delegationList;
            private List<?> eventList;
            private List<?> exceptionHandlerList;
            private List<?> processInitiatorList;
            private List<?> transitionList;
            private List<?> variableDefinitionList;

            public String getAbstracts() {
                return abstracts;
            }

            public void setAbstracts(String abstracts) {
                this.abstracts = abstracts;
            }

            public String getCreatedBy() {
                return createdBy;
            }

            public void setCreatedBy(String createdBy) {
                this.createdBy = createdBy;
            }

            public String getCreatedDt() {
                return createdDt;
            }

            public void setCreatedDt(String createdDt) {
                this.createdDt = createdDt;
            }

            public String getEntity() {
                return entity;
            }

            public void setEntity(String entity) {
                this.entity = entity;
            }

            public String getExpandFiled() {
                return expandFiled;
            }

            public void setExpandFiled(String expandFiled) {
                this.expandFiled = expandFiled;
            }

            public String getFormBaseName() {
                return formBaseName;
            }

            public void setFormBaseName(String formBaseName) {
                this.formBaseName = formBaseName;
            }

            public String getFormBaseSid() {
                return formBaseSid;
            }

            public void setFormBaseSid(String formBaseSid) {
                this.formBaseSid = formBaseSid;
            }

            public String getInitiatorNameList() {
                return initiatorNameList;
            }

            public void setInitiatorNameList(String initiatorNameList) {
                this.initiatorNameList = initiatorNameList;
            }

            public String getInitiatorSidList() {
                return initiatorSidList;
            }

            public void setInitiatorSidList(String initiatorSidList) {
                this.initiatorSidList = initiatorSidList;
            }

            public String getInitiatorType() {
                return initiatorType;
            }

            public void setInitiatorType(String initiatorType) {
                this.initiatorType = initiatorType;
            }

            public String getIsTerminationImplicit() {
                return isTerminationImplicit;
            }

            public void setIsTerminationImplicit(String isTerminationImplicit) {
                this.isTerminationImplicit = isTerminationImplicit;
            }

            public boolean isIsTransient() {
                return isTransient;
            }

            public void setIsTransient(boolean isTransient) {
                this.isTransient = isTransient;
            }

            public boolean isIsValid() {
                return isValid;
            }

            public void setIsValid(boolean isValid) {
                this.isValid = isValid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getOldName() {
                return oldName;
            }

            public void setOldName(String oldName) {
                this.oldName = oldName;
            }

            public String getOlderPk() {
                return olderPk;
            }

            public void setOlderPk(String olderPk) {
                this.olderPk = olderPk;
            }

            public String getParentSid() {
                return parentSid;
            }

            public void setParentSid(String parentSid) {
                this.parentSid = parentSid;
            }

            public String getPlatOrganizationEname() {
                return platOrganizationEname;
            }

            public void setPlatOrganizationEname(String platOrganizationEname) {
                this.platOrganizationEname = platOrganizationEname;
            }

            public String getPlatOrganizationSid() {
                return platOrganizationSid;
            }

            public void setPlatOrganizationSid(String platOrganizationSid) {
                this.platOrganizationSid = platOrganizationSid;
            }

            public String getProcessDefinition() {
                return processDefinition;
            }

            public void setProcessDefinition(String processDefinition) {
                this.processDefinition = processDefinition;
            }

            public String getProcessKey() {
                return processKey;
            }

            public void setProcessKey(String processKey) {
                this.processKey = processKey;
            }

            public String getProcessType() {
                return processType;
            }

            public void setProcessType(String processType) {
                this.processType = processType;
            }

            public String getProcessTypeSid() {
                return processTypeSid;
            }

            public void setProcessTypeSid(String processTypeSid) {
                this.processTypeSid = processTypeSid;
            }

            public String getProcessVersion() {
                return processVersion;
            }

            public void setProcessVersion(String processVersion) {
                this.processVersion = processVersion;
            }

            public String getSid() {
                return sid;
            }

            public void setSid(String sid) {
                this.sid = sid;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getStatusDesc() {
                return statusDesc;
            }

            public void setStatusDesc(String statusDesc) {
                this.statusDesc = statusDesc;
            }

            public String getStatusLable() {
                return statusLable;
            }

            public void setStatusLable(String statusLable) {
                this.statusLable = statusLable;
            }

            public String getSysOrganizationSid() {
                return sysOrganizationSid;
            }

            public void setSysOrganizationSid(String sysOrganizationSid) {
                this.sysOrganizationSid = sysOrganizationSid;
            }

            public String getUpdatedBy() {
                return updatedBy;
            }

            public void setUpdatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
            }

            public String getUpdatedDt() {
                return updatedDt;
            }

            public void setUpdatedDt(String updatedDt) {
                this.updatedDt = updatedDt;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }

            public List<?> getActionList() {
                return actionList;
            }

            public void setActionList(List<?> actionList) {
                this.actionList = actionList;
            }

            public List<?> getActivityList() {
                return activityList;
            }

            public void setActivityList(List<?> activityList) {
                this.activityList = activityList;
            }

            public List<?> getActivityParticipationList() {
                return activityParticipationList;
            }

            public void setActivityParticipationList(List<?> activityParticipationList) {
                this.activityParticipationList = activityParticipationList;
            }

            public List<?> getDecisionConditionList() {
                return decisionConditionList;
            }

            public void setDecisionConditionList(List<?> decisionConditionList) {
                this.decisionConditionList = decisionConditionList;
            }

            public List<?> getDelegationList() {
                return delegationList;
            }

            public void setDelegationList(List<?> delegationList) {
                this.delegationList = delegationList;
            }

            public List<?> getEventList() {
                return eventList;
            }

            public void setEventList(List<?> eventList) {
                this.eventList = eventList;
            }

            public List<?> getExceptionHandlerList() {
                return exceptionHandlerList;
            }

            public void setExceptionHandlerList(List<?> exceptionHandlerList) {
                this.exceptionHandlerList = exceptionHandlerList;
            }

            public List<?> getProcessInitiatorList() {
                return processInitiatorList;
            }

            public void setProcessInitiatorList(List<?> processInitiatorList) {
                this.processInitiatorList = processInitiatorList;
            }

            public List<?> getTransitionList() {
                return transitionList;
            }

            public void setTransitionList(List<?> transitionList) {
                this.transitionList = transitionList;
            }

            public List<?> getVariableDefinitionList() {
                return variableDefinitionList;
            }

            public void setVariableDefinitionList(List<?> variableDefinitionList) {
                this.variableDefinitionList = variableDefinitionList;
            }
        }

        public static class ProcessInstanceEntity {
            /**
             * abstracts :
             * activity :
             * businessSid : FW201608301058555421217C506684B9
             * createdBy :
             * createdDt : 2016-12-21 23:10:48
             * duration :
             * end :
             * entity :
             * expandFiled :
             * expectationDuration :
             * finisherCname :
             * finisherSid :
             * initiatorCname : oatest1
             * initiatorOrgCname : 重庆电信天翼办公演示
             * initiatorOrgSid : 1963
             * initiatorSid : 1010174
             * instanceStatus : active
             * interruptCname :
             * interruptSid :
             * interruptTime :
             * isArchive : 0
             * isInterrupted : 0
             * isSuspended : 0
             * isValid : true
             * name : 2013ceshi
             * parentProcessInstance :
             * parentToken :
             * platOrganizationEname :
             * platOrganizationSid : 1963
             * processDefinition :
             * processDefinitionCname : 发文流程
             * processDefinitionSid : 3114195
             * processInstance :
             * processInstanceBusiness :
             * processType :
             * processTypeSid : 1
             * quantity :
             * rootTokenSid : 11887611787153158
             * sid : 11887611777346854
             * start : 2016-08-30 10:58:55
             * status : 1
             * statusLable :
             * superProcessInstanceSid :
             * superProcessTokenSid :
             * suspendCname :
             * suspendSid :
             * suspendTime :
             * sysOrganizationSid :
             * taskInstanceSid :
             * token :
             * transition :
             * typeName :
             * updatedBy :
             * updatedDt :
             * variableMap :
             * variables :
             * version : 2
             */

            private String abstracts;
            private String activity;
            private String businessSid;
            private String createdBy;
            private String createdDt;
            private String duration;
            private String end;
            private String entity;
            private String expandFiled;
            private String expectationDuration;
            private String finisherCname;
            private String finisherSid;
            private String initiatorCname;
            private String initiatorOrgCname;
            private String initiatorOrgSid;
            private String initiatorSid;
            private String instanceStatus;
            private String interruptCname;
            private String interruptSid;
            private String interruptTime;
            private String isArchive;
            private String isInterrupted;
            private String isSuspended;
            private boolean isValid;
            private String name;
            private String parentProcessInstance;
            private String parentToken;
            private String platOrganizationEname;
            private String platOrganizationSid;
            private String processDefinition;
            private String processDefinitionCname;
            private String processDefinitionSid;
            private String processInstance;
            private String processInstanceBusiness;
            private String processType;
            private String processTypeSid;
            private String quantity;
            private String rootTokenSid;
            private String sid;
            private String start;
            private int status;
            private String statusLable;
            private String superProcessInstanceSid;
            private String superProcessTokenSid;
            private String suspendCname;
            private String suspendSid;
            private String suspendTime;
            private String sysOrganizationSid;
            private String taskInstanceSid;
            private String token;
            private String transition;
            private String typeName;
            private String updatedBy;
            private String updatedDt;
            private String variableMap;
            private String variables;
            private String version;

            public String getAbstracts() {
                return abstracts;
            }

            public void setAbstracts(String abstracts) {
                this.abstracts = abstracts;
            }

            public String getActivity() {
                return activity;
            }

            public void setActivity(String activity) {
                this.activity = activity;
            }

            public String getBusinessSid() {
                return businessSid;
            }

            public void setBusinessSid(String businessSid) {
                this.businessSid = businessSid;
            }

            public String getCreatedBy() {
                return createdBy;
            }

            public void setCreatedBy(String createdBy) {
                this.createdBy = createdBy;
            }

            public String getCreatedDt() {
                return createdDt;
            }

            public void setCreatedDt(String createdDt) {
                this.createdDt = createdDt;
            }

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }

            public String getEntity() {
                return entity;
            }

            public void setEntity(String entity) {
                this.entity = entity;
            }

            public String getExpandFiled() {
                return expandFiled;
            }

            public void setExpandFiled(String expandFiled) {
                this.expandFiled = expandFiled;
            }

            public String getExpectationDuration() {
                return expectationDuration;
            }

            public void setExpectationDuration(String expectationDuration) {
                this.expectationDuration = expectationDuration;
            }

            public String getFinisherCname() {
                return finisherCname;
            }

            public void setFinisherCname(String finisherCname) {
                this.finisherCname = finisherCname;
            }

            public String getFinisherSid() {
                return finisherSid;
            }

            public void setFinisherSid(String finisherSid) {
                this.finisherSid = finisherSid;
            }

            public String getInitiatorCname() {
                return initiatorCname;
            }

            public void setInitiatorCname(String initiatorCname) {
                this.initiatorCname = initiatorCname;
            }

            public String getInitiatorOrgCname() {
                return initiatorOrgCname;
            }

            public void setInitiatorOrgCname(String initiatorOrgCname) {
                this.initiatorOrgCname = initiatorOrgCname;
            }

            public String getInitiatorOrgSid() {
                return initiatorOrgSid;
            }

            public void setInitiatorOrgSid(String initiatorOrgSid) {
                this.initiatorOrgSid = initiatorOrgSid;
            }

            public String getInitiatorSid() {
                return initiatorSid;
            }

            public void setInitiatorSid(String initiatorSid) {
                this.initiatorSid = initiatorSid;
            }

            public String getInstanceStatus() {
                return instanceStatus;
            }

            public void setInstanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
            }

            public String getInterruptCname() {
                return interruptCname;
            }

            public void setInterruptCname(String interruptCname) {
                this.interruptCname = interruptCname;
            }

            public String getInterruptSid() {
                return interruptSid;
            }

            public void setInterruptSid(String interruptSid) {
                this.interruptSid = interruptSid;
            }

            public String getInterruptTime() {
                return interruptTime;
            }

            public void setInterruptTime(String interruptTime) {
                this.interruptTime = interruptTime;
            }

            public String getIsArchive() {
                return isArchive;
            }

            public void setIsArchive(String isArchive) {
                this.isArchive = isArchive;
            }

            public String getIsInterrupted() {
                return isInterrupted;
            }

            public void setIsInterrupted(String isInterrupted) {
                this.isInterrupted = isInterrupted;
            }

            public String getIsSuspended() {
                return isSuspended;
            }

            public void setIsSuspended(String isSuspended) {
                this.isSuspended = isSuspended;
            }

            public boolean isIsValid() {
                return isValid;
            }

            public void setIsValid(boolean isValid) {
                this.isValid = isValid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getParentProcessInstance() {
                return parentProcessInstance;
            }

            public void setParentProcessInstance(String parentProcessInstance) {
                this.parentProcessInstance = parentProcessInstance;
            }

            public String getParentToken() {
                return parentToken;
            }

            public void setParentToken(String parentToken) {
                this.parentToken = parentToken;
            }

            public String getPlatOrganizationEname() {
                return platOrganizationEname;
            }

            public void setPlatOrganizationEname(String platOrganizationEname) {
                this.platOrganizationEname = platOrganizationEname;
            }

            public String getPlatOrganizationSid() {
                return platOrganizationSid;
            }

            public void setPlatOrganizationSid(String platOrganizationSid) {
                this.platOrganizationSid = platOrganizationSid;
            }

            public String getProcessDefinition() {
                return processDefinition;
            }

            public void setProcessDefinition(String processDefinition) {
                this.processDefinition = processDefinition;
            }

            public String getProcessDefinitionCname() {
                return processDefinitionCname;
            }

            public void setProcessDefinitionCname(String processDefinitionCname) {
                this.processDefinitionCname = processDefinitionCname;
            }

            public String getProcessDefinitionSid() {
                return processDefinitionSid;
            }

            public void setProcessDefinitionSid(String processDefinitionSid) {
                this.processDefinitionSid = processDefinitionSid;
            }

            public String getProcessInstance() {
                return processInstance;
            }

            public void setProcessInstance(String processInstance) {
                this.processInstance = processInstance;
            }

            public String getProcessInstanceBusiness() {
                return processInstanceBusiness;
            }

            public void setProcessInstanceBusiness(String processInstanceBusiness) {
                this.processInstanceBusiness = processInstanceBusiness;
            }

            public String getProcessType() {
                return processType;
            }

            public void setProcessType(String processType) {
                this.processType = processType;
            }

            public String getProcessTypeSid() {
                return processTypeSid;
            }

            public void setProcessTypeSid(String processTypeSid) {
                this.processTypeSid = processTypeSid;
            }

            public String getQuantity() {
                return quantity;
            }

            public void setQuantity(String quantity) {
                this.quantity = quantity;
            }

            public String getRootTokenSid() {
                return rootTokenSid;
            }

            public void setRootTokenSid(String rootTokenSid) {
                this.rootTokenSid = rootTokenSid;
            }

            public String getSid() {
                return sid;
            }

            public void setSid(String sid) {
                this.sid = sid;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getStatusLable() {
                return statusLable;
            }

            public void setStatusLable(String statusLable) {
                this.statusLable = statusLable;
            }

            public String getSuperProcessInstanceSid() {
                return superProcessInstanceSid;
            }

            public void setSuperProcessInstanceSid(String superProcessInstanceSid) {
                this.superProcessInstanceSid = superProcessInstanceSid;
            }

            public String getSuperProcessTokenSid() {
                return superProcessTokenSid;
            }

            public void setSuperProcessTokenSid(String superProcessTokenSid) {
                this.superProcessTokenSid = superProcessTokenSid;
            }

            public String getSuspendCname() {
                return suspendCname;
            }

            public void setSuspendCname(String suspendCname) {
                this.suspendCname = suspendCname;
            }

            public String getSuspendSid() {
                return suspendSid;
            }

            public void setSuspendSid(String suspendSid) {
                this.suspendSid = suspendSid;
            }

            public String getSuspendTime() {
                return suspendTime;
            }

            public void setSuspendTime(String suspendTime) {
                this.suspendTime = suspendTime;
            }

            public String getSysOrganizationSid() {
                return sysOrganizationSid;
            }

            public void setSysOrganizationSid(String sysOrganizationSid) {
                this.sysOrganizationSid = sysOrganizationSid;
            }

            public String getTaskInstanceSid() {
                return taskInstanceSid;
            }

            public void setTaskInstanceSid(String taskInstanceSid) {
                this.taskInstanceSid = taskInstanceSid;
            }

            public String getToken() {
                return token;
            }

            public void setToken(String token) {
                this.token = token;
            }

            public String getTransition() {
                return transition;
            }

            public void setTransition(String transition) {
                this.transition = transition;
            }

            public String getTypeName() {
                return typeName;
            }

            public void setTypeName(String typeName) {
                this.typeName = typeName;
            }

            public String getUpdatedBy() {
                return updatedBy;
            }

            public void setUpdatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
            }

            public String getUpdatedDt() {
                return updatedDt;
            }

            public void setUpdatedDt(String updatedDt) {
                this.updatedDt = updatedDt;
            }

            public String getVariableMap() {
                return variableMap;
            }

            public void setVariableMap(String variableMap) {
                this.variableMap = variableMap;
            }

            public String getVariables() {
                return variables;
            }

            public void setVariables(String variables) {
                this.variables = variables;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }
        }

        public static class ProcessTypeEntity {
            /**
             * abstracts :
             * createdBy :
             * createdDt : 2016-12-21 20:53:43
             * descriptions :
             * entity :
             * expandFiled :
             * isValid : true
             * name : 发文
             * orderBy :
             * parentSid :
             * platOrganizationEname :
             * platOrganizationSid :
             * sid : 1
             * status :
             * statusLable :
             * sysOrganizationSid :
             * updatedBy :
             * updatedDt : 2016-12-21 20:53:43
             * version : 1
             */

            private String abstracts;
            private String createdBy;
            private String createdDt;
            private String descriptions;
            private String entity;
            private String expandFiled;
            private boolean isValid;
            private String name;
            private String orderBy;
            private String parentSid;
            private String platOrganizationEname;
            private String platOrganizationSid;
            private String sid;
            private String status;
            private String statusLable;
            private String sysOrganizationSid;
            private String updatedBy;
            private String updatedDt;
            private String version;

            public String getAbstracts() {
                return abstracts;
            }

            public void setAbstracts(String abstracts) {
                this.abstracts = abstracts;
            }

            public String getCreatedBy() {
                return createdBy;
            }

            public void setCreatedBy(String createdBy) {
                this.createdBy = createdBy;
            }

            public String getCreatedDt() {
                return createdDt;
            }

            public void setCreatedDt(String createdDt) {
                this.createdDt = createdDt;
            }

            public String getDescriptions() {
                return descriptions;
            }

            public void setDescriptions(String descriptions) {
                this.descriptions = descriptions;
            }

            public String getEntity() {
                return entity;
            }

            public void setEntity(String entity) {
                this.entity = entity;
            }

            public String getExpandFiled() {
                return expandFiled;
            }

            public void setExpandFiled(String expandFiled) {
                this.expandFiled = expandFiled;
            }

            public boolean isIsValid() {
                return isValid;
            }

            public void setIsValid(boolean isValid) {
                this.isValid = isValid;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getOrderBy() {
                return orderBy;
            }

            public void setOrderBy(String orderBy) {
                this.orderBy = orderBy;
            }

            public String getParentSid() {
                return parentSid;
            }

            public void setParentSid(String parentSid) {
                this.parentSid = parentSid;
            }

            public String getPlatOrganizationEname() {
                return platOrganizationEname;
            }

            public void setPlatOrganizationEname(String platOrganizationEname) {
                this.platOrganizationEname = platOrganizationEname;
            }

            public String getPlatOrganizationSid() {
                return platOrganizationSid;
            }

            public void setPlatOrganizationSid(String platOrganizationSid) {
                this.platOrganizationSid = platOrganizationSid;
            }

            public String getSid() {
                return sid;
            }

            public void setSid(String sid) {
                this.sid = sid;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getStatusLable() {
                return statusLable;
            }

            public void setStatusLable(String statusLable) {
                this.statusLable = statusLable;
            }

            public String getSysOrganizationSid() {
                return sysOrganizationSid;
            }

            public void setSysOrganizationSid(String sysOrganizationSid) {
                this.sysOrganizationSid = sysOrganizationSid;
            }

            public String getUpdatedBy() {
                return updatedBy;
            }

            public void setUpdatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
            }

            public String getUpdatedDt() {
                return updatedDt;
            }

            public void setUpdatedDt(String updatedDt) {
                this.updatedDt = updatedDt;
            }

            public String getVersion() {
                return version;
            }

            public void setVersion(String version) {
                this.version = version;
            }
        }
    }
}
