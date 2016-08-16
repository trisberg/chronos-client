package org.springframework.cloud.mesos.chronos.client;

import java.util.List;

import org.springframework.cloud.mesos.chronos.client.model.Job;

import feign.Param;
import feign.RequestLine;

public interface Chronos {

	@RequestLine("GET /scheduler/jobs")
	List<Job> getJobs() throws ChronosException;

	@RequestLine("POST /scheduler/iso8601")
	void createJob(Job job) throws ChronosException;

	@RequestLine("PUT /scheduler/job/{jobName}")
	void startJob(@Param("jobName") String jobName) throws ChronosException;

	@RequestLine("DELETE /scheduler/job/{jobName}")
	void deleteJob(@Param("jobName") String jobName) throws ChronosException;

	@RequestLine("DELETE /scheduler/task/kill/{jobName}")
	void deleteJobTasks(@Param("jobName") String jobName) throws ChronosException;

}
