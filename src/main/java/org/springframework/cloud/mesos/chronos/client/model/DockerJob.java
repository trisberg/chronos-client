package org.springframework.cloud.mesos.chronos.client.model;

public class DockerJob extends Job {

	DockerContainer container;

	public DockerContainer getContainer() {
		return container;
	}

	public void setContainer(DockerContainer container) {
		this.container = container;
	}
}
