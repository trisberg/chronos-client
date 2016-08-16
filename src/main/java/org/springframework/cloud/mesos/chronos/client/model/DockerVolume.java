package org.springframework.cloud.mesos.chronos.client.model;

public class DockerVolume {

	private String containerPath;
	private String hostPath;
	private String mode;

	public String getContainerPath() {
		return containerPath;
	}

	public void setContainerPath(String containerPath) {
		this.containerPath = containerPath;
	}

	public String getHostPath() {
		return hostPath;
	}

	public void setHostPath(String hostPath) {
		this.hostPath = hostPath;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
}
