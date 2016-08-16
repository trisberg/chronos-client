package org.springframework.cloud.mesos.chronos.client.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class AbstractModel {

	public static final Gson GSON =
			new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

	@Override
	public String toString() {
		return GSON.toJson(this);
	}

}
