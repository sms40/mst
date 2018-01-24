package com.clarusft.api;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;

public class LocalDateSerializer extends com.fasterxml.jackson.databind.JsonSerializer<LocalDate> {

	@Override
	public void serialize(LocalDate obj, JsonGenerator gen, SerializerProvider sp) throws IOException {
		
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		gen.writeString(obj.format(formatter));
	}
	
	@Override
	public Class<LocalDate> handledType() {
		return LocalDate.class;
	}
}