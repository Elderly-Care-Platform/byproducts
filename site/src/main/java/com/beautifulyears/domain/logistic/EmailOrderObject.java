/**
 * 
 */
package com.beautifulyears.domain.logistic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.beautifulyears.BYConstants;

/**
 * @author Nitin
 *
 */
public class EmailOrderObject {

	private Integer deliveryType = BYConstants.DELIVERY_MODE_DELIVER;
	private String orderNumber;
	private Date submitDate;
	private String customerName;
	private String shippingAddr1;
	private String shippingAddr2;
	private BigDecimal subTotal;
	private BigDecimal total;
	private Float totalTax = 0f;
	private BigDecimal totalDeliveryCharges;
	private String orderPaymentType = "PPD";
	private List<OrderItem> orderItems = new ArrayList<EmailOrderObject.OrderItem>();
	private boolean isEmail = true;

	public boolean isEmail() {
		return isEmail;
	}

	public void setEmail(boolean isEmail) {
		this.isEmail = isEmail;
	}

	public Integer getDeliveryType() {
		return deliveryType;
	}

	public void setDeliveryType(Integer deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getOrderPaymentType() {
		return orderPaymentType;
	}

	public void setOrderPaymentType(String orderPaymentType) {
		this.orderPaymentType = orderPaymentType;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public static class OrderItem {
		private String itemName;
		private String itemId;
		private Integer quantity;
		private Float price = 0f;
		private BigDecimal deliveryCharge;
		private Float taxAmount = 0f;
		private String taxCode;
		private String awbNumber;
		private String barCodeImageDataPath;

		public String getBarCodeImageDataPath() {
			return barCodeImageDataPath;
		}

		public void setBarCodeImageDataPath(String barCodeImageDataPath) {
			this.barCodeImageDataPath = barCodeImageDataPath;
		}

		public String getAwbNumber() {
			return awbNumber;
		}

		public void setAwbNumber(String awbNumber) {
			this.awbNumber = awbNumber;
		}

		public String getTaxCode() {
			return taxCode;
		}

		public void setTaxCode(String taxCode) {
			this.taxCode = taxCode;
			try {
				this.setTaxAmount(Float.parseFloat(taxCode) * this.getPrice()
						/ 100);
			} catch (Exception e) {
				this.setTaxAmount(0f);
			}

		}

		public String getItemName() {
			return itemName;
		}

		public void setItemName(String itemName) {
			this.itemName = itemName;
		}

		public String getItemId() {
			return itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Float getPrice() {
			return price;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

		public BigDecimal getDeliveryCharge() {
			return deliveryCharge;
		}

		public void setDeliveryCharge(BigDecimal deliveryCharge) {
			this.deliveryCharge = deliveryCharge;
		}

		public Float getTaxAmount() {
			return taxAmount;
		}

		public void setTaxAmount(Float taxAmount) {
			this.taxAmount = taxAmount;
		}

	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getShippingAddr1() {
		return shippingAddr1;
	}

	public void setShippingAddr1(String shippingAddr1) {
		this.shippingAddr1 = shippingAddr1;
	}

	public String getShippingAddr2() {
		return shippingAddr2;
	}

	public void setShippingAddr2(String shippingAddr2) {
		this.shippingAddr2 = shippingAddr2;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal bigDecimal) {
		this.subTotal = bigDecimal;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal bigDecimal) {
		this.total = bigDecimal;
	}

	public Float getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(Float totalTax) {
		this.totalTax = totalTax;
	}

	public BigDecimal getTotalDeliveryCharges() {
		return totalDeliveryCharges;
	}

	public void setTotalDeliveryCharges(BigDecimal totalDeliveryCharges) {
		this.totalDeliveryCharges = totalDeliveryCharges;
	}

}
