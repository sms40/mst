package com.clarusft.api.model.margin;

import javax.annotation.Generated;

@Generated("clarusft-ms-api-gen/com.clarusft.generator.Generator")
public class ParSwapsIMRequest extends com.clarusft.api.model.ApiRequest {
	public ParSwapsIMRequest() {
		super("Margin", "ParSwapsIM", com.clarusft.api.OutputTypes.CSV, com.clarusft.api.model.ApiRequest.HTTP_POST);
	}

	public void setValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
	}

	public ParSwapsIMRequest withValueDate(java.time.LocalDate valueDate) {
		setParameter("valueDate", valueDate);
		return this;
	}


	public void setModel(java.lang.String model) {
		setParameter("model", model);
	}

	public ParSwapsIMRequest withModel(java.lang.String model) {
		setParameter("model", model);
		return this;
	}


	public void setProduct(java.lang.String product) {
		setParameter("product", product);
	}

	public ParSwapsIMRequest withProduct(java.lang.String product) {
		setParameter("product", product);
		return this;
	}


	public java.time.LocalDate getValueDate() {
		return (java.time.LocalDate)getParameter("valueDate");
	}

	public java.lang.String getModel() {
		return (java.lang.String)getParameter("model");
	}

	public java.lang.String getProduct() {
		return (java.lang.String)getParameter("product");
	}


}