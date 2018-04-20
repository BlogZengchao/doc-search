package com.zc.docsearch.entity;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "sw_search_response")
@XmlType(propOrder = {
		"code",
		"message",
		"totalResults",
		"orderResult",
})
public class OrderResponse {
	@XmlElement(name = "code")
	private Integer code;
	@XmlElement(name = "message")
	private String message;
	@XmlElement(name = "total_results")
	private Integer totalResults;
	
	@XmlElementWrapper(name = "tao_orders")
    @XmlElements(value = { @XmlElement(name = "tao_order", type = OrderResult.class) })
	private List<OrderResult> orderResult;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getTotalResults() {
		return totalResults;
	}
	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}
	public List<OrderResult> getOrderResult() {
		return orderResult;
	}
	public void setOrderResult(List<OrderResult> orderResult) {
		this.orderResult = orderResult;
	}
		
}
