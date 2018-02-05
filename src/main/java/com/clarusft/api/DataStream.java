package com.clarusft.api;

import java.io.IOException;
import java.io.InputStream;

public interface DataStream {
	public InputStream open() throws IOException;
}
