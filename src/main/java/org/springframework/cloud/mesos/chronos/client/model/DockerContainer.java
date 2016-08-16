package org.springframework.cloud.mesos.chronos.client.model;

import java.util.List;

public class DockerContainer {

	private String type = "DOCKER";
	private String image;
	private String network;
	private List<DockerVolume> volumes;
	private Boolean forcePullImage;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public List<DockerVolume> getVolumes() {
		return volumes;
	}

	public void setVolumes(List<DockerVolume> volumes) {
		this.volumes = volumes;
	}

	public Boolean getForcePullImage() {
		return forcePullImage;
	}

	public void setForcePullImage(Boolean forcePullImage) {
		this.forcePullImage = forcePullImage;
	}
}
