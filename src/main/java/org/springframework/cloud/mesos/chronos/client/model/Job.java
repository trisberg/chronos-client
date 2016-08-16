package org.springframework.cloud.mesos.chronos.client.model;

import java.util.Collection;
import java.util.List;

public class Job extends AbstractModel {

	private String name;
	private String command;
	private Boolean shell;
	private String epsilon;
	private String executor;
	private String executorFlags;
	private Integer retries;
	private String owner;
	private String ownerName;
	private String description;
	private Boolean async;
	private Integer successCount;
	private Integer errorCount;
	private String lastSuccess;
	private String lastError;
	private Double cpus;
	private Double disk;
	private Double mem;
	private Boolean disabled;
	private Boolean softError;
	private Boolean dataProcessingJobType;
	private Integer errorsSinceLastSuccess;
	private Collection<String> uris;
	private Collection<String> environmentVariables;
	private Collection<String> arguments;
	private Boolean highPriority;
	private String runAsUser;
	private List<List<String>> constraints;
	private String schedule;
	private String scheduleTimeZone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public Boolean getShell() {
		return shell;
	}

	public void setShell(Boolean shell) {
		this.shell = shell;
	}

	public String getEpsilon() {
		return epsilon;
	}

	public void setEpsilon(String epsilon) {
		this.epsilon = epsilon;
	}

	public String getExecutor() {
		return executor;
	}

	public void setExecutor(String executor) {
		this.executor = executor;
	}

	public String getExecutorFlags() {
		return executorFlags;
	}

	public void setExecutorFlags(String executorFlags) {
		this.executorFlags = executorFlags;
	}

	public Integer getRetries() {
		return retries;
	}

	public void setRetries(Integer retries) {
		this.retries = retries;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getAsync() {
		return async;
	}

	public void setAsync(Boolean async) {
		this.async = async;
	}

	public Integer getSuccessCount() {
		return successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public Integer getErrorCount() {
		return errorCount;
	}

	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}

	public String getLastSuccess() {
		return lastSuccess;
	}

	public void setLastSuccess(String lastSuccess) {
		this.lastSuccess = lastSuccess;
	}

	public String getLastError() {
		return lastError;
	}

	public void setLastError(String lastError) {
		this.lastError = lastError;
	}

	public Double getCpus() {
		return cpus;
	}

	public void setCpus(Double cpus) {
		this.cpus = cpus;
	}

	public Double getDisk() {
		return disk;
	}

	public void setDisk(Double disk) {
		this.disk = disk;
	}

	public Double getMem() {
		return mem;
	}

	public void setMem(Double mem) {
		this.mem = mem;
	}

	public Boolean getDisabled() {
		return disabled;
	}

	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	public Boolean getSoftError() {
		return softError;
	}

	public void setSoftError(Boolean softError) {
		this.softError = softError;
	}

	public Boolean getDataProcessingJobType() {
		return dataProcessingJobType;
	}

	public void setDataProcessingJobType(Boolean dataProcessingJobType) {
		this.dataProcessingJobType = dataProcessingJobType;
	}

	public Integer getErrorsSinceLastSuccess() {
		return errorsSinceLastSuccess;
	}

	public void setErrorsSinceLastSuccess(Integer errorsSinceLastSuccess) {
		this.errorsSinceLastSuccess = errorsSinceLastSuccess;
	}

	public Collection<String> getUris() {
		return uris;
	}

	public void setUris(Collection<String> uris) {
		this.uris = uris;
	}

	public Collection<String> getEnvironmentVariables() {
		return environmentVariables;
	}

	public void setEnvironmentVariables(Collection<String> environmentVariables) {
		this.environmentVariables = environmentVariables;
	}

	public Collection<String> getArguments() {
		return arguments;
	}

	public void setArguments(Collection<String> arguments) {
		this.arguments = arguments;
	}

	public Boolean getHighPriority() {
		return highPriority;
	}

	public void setHighPriority(Boolean highPriority) {
		this.highPriority = highPriority;
	}

	public String getRunAsUser() {
		return runAsUser;
	}

	public void setRunAsUser(String runAsUser) {
		this.runAsUser = runAsUser;
	}

	public List<List<String>> getConstraints() {
		return constraints;
	}

	public void setConstraints(List<List<String>> constraints) {
		this.constraints = constraints;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getScheduleTimeZone() {
		return scheduleTimeZone;
	}

	public void setScheduleTimeZone(String scheduleTimeZone) {
		this.scheduleTimeZone = scheduleTimeZone;
	}

}
