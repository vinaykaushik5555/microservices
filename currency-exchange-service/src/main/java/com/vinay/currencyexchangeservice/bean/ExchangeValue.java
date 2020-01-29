package com.vinay.currencyexchangeservice.bean;

public class ExchageValue {

	private Long id;
	private String from;
	private String to;
	private Long conversionMultipe;
	public Long getId() {
		return id;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public Long getConversionMultipe() {
		return conversionMultipe;
	}
	public ExchageValue(Long id, String from, String to, Long conversionMultipe) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultipe = conversionMultipe;
	}
	public ExchageValue() {
		super();
	}
	
	
}
