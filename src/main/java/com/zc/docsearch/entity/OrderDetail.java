package com.zc.docsearch.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;

@XmlAccessorType(XmlAccessType.FIELD)  
public class OrderDetail {
	private Integer id;
	private Integer parent_id;// 订单表头id
	private String site_order_id;// 网上订单号
	private String order_id;// 本地订单号
	private String prd_no;// 商品编码
	private String prd_name;// 商品名称
	private String prd_attribute;// 商品属性
	private String prd_spc;// 商品规格–取货品资料
	private String prd_unit;// 商品单位–取货品资料
	private double qty;// 数量
	private BigDecimal up;// 含税单价
	private BigDecimal amtn;// 含税金额
	private String wh;// 取网店默认仓库
	private String buyer_message;// 买家留言
	private String seller_message;// 卖家备注
	private int status;// 状态
	private double stock_real;// 实际库存
	private double stock_able;// 可用库存
	private String createdate;// 创建日期
	private String modifydate;// 修改日期
	private String buyer_appraisal;// 买家评价
	private String buyer_appraisal_text;// 买家评价内容
	private String seller_appraisal;// 卖家评价
	private String seller_appraisal_text;// 卖家评价内容
	private String child_order_id;// 子订单号
	private Integer parent_id_old;// 原订单表头ID
	private int refund_status;// 退款状态
	private String refund_id;// 退款单号
	private double qty_back;// 退货数量
	private String back_date;// 退回日期
	private String back_wh;// 退回仓库
	private String back_man;// 退货人
	private Integer num_iid;// 淘宝货品编号
	private Integer sku_id;// SKU
	private BigDecimal back_change_qty;//退回换货数量(售后处理)
	private boolean is_free;// 是否赠品
	private BigDecimal discount_fee;// 优惠金额
	private boolean is_prdmeal;// 是否套餐
	private Integer meal_id;// 套餐代号
	private String meal_name;// 套餐名称
	private String back_rem;// 退货备注
	private String change_rem;// 换货备注
	private int sale_status;// 1申请退货，2申请换货
	private String app_date;// 申请日期
	private String app_rem;// 申请备注
	private boolean rate_status;// 评价状态
	private double qty_check;// 检货数量
	private String rem;// 备注
	private String order_date;// 日期
	private BigDecimal fx_buyer_payment;// 分销买家实付
	private String fxtradeid;// 分销交易号
	private String bat_no;// 批号
	private int order_status;// 订单处理状态
	private Integer siteid;// 网店代号
	private int pro_send_status;// 发货状态
	private int pro_order_status;// 订单处理状态
	private BigDecimal amtn_oldsp;// 拆单前的金额
	private BigDecimal discount_fee_oldsp;// 拆单前优惠金额
	private boolean isdaixiao;// 是否代销
	private double qty_old;// 原数量
	private boolean is_recalup;// 是否自动计算单价-云瀚项目
	private boolean is_service_order;// 是否为服务订单
	private boolean is_split;// 拆单标志
	private boolean is_oversoid;// 是否为超卖
	private String end_time;// 子订单交易结束时间
	private String consign_time;// 子订单发货时间
	private int shipping_type;// 子订单运送方式
	private String bin_oid;// 捆绑的子订单号
	private String logistics_company;// 子订单发货的快递公司名称
	private String invoice_no;// 子订单所在包裹的运单号
	private boolean jx_is_deleted;// 经销采购货品是否被删除
	private String tc_order_id;// 下游买家订单编号
	private Integer salesactivity_id;// 促销政策ID
	private String sn;// 识别码
	private boolean buyer_refund_state;// 下游买家退款状态
	private String sa_bilno;// 销售出库单号
	private boolean iswww;// 是否WWW订单
	private String outer_id;// 商家编码

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getParent_id() {
		return parent_id;
	}

	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}

	public String getSite_order_id() {
		return site_order_id;
	}

	public void setSite_order_id(String site_order_id) {
		this.site_order_id = site_order_id;
	}

	public String getOrder_id() {
		return order_id;
	}

	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}

	public String getPrd_no() {
		return prd_no;
	}

	public void setPrd_no(String prd_no) {
		this.prd_no = prd_no;
	}

	public String getPrd_name() {
		return prd_name;
	}

	public void setPrd_name(String prd_name) {
		this.prd_name = prd_name;
	}

	public String getPrd_attribute() {
		return prd_attribute;
	}

	public void setPrd_attribute(String prd_attribute) {
		this.prd_attribute = prd_attribute;
	}

	public String getPrd_spc() {
		return prd_spc;
	}

	public void setPrd_spc(String prd_spc) {
		this.prd_spc = prd_spc;
	}

	public String getPrd_unit() {
		return prd_unit;
	}

	public void setPrd_unit(String prd_unit) {
		this.prd_unit = prd_unit;
	}

	public double getQty() {
		return qty;
	}

	public void setQty(double qty) {
		this.qty = qty;
	}

	public BigDecimal getUp() {
		return up;
	}

	public void setUp(BigDecimal up) {
		this.up = up;
	}

	public BigDecimal getAmtn() {
		return amtn;
	}

	public void setAmtn(BigDecimal amtn) {
		this.amtn = amtn;
	}

	public String getWh() {
		return wh;
	}

	public void setWh(String wh) {
		this.wh = wh;
	}

	public String getBuyer_message() {
		return buyer_message;
	}

	public void setBuyer_message(String buyer_message) {
		this.buyer_message = buyer_message;
	}

	public String getSeller_message() {
		return seller_message;
	}

	public void setSeller_message(String seller_message) {
		this.seller_message = seller_message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public double getStock_real() {
		return stock_real;
	}

	public void setStock_real(double stock_real) {
		this.stock_real = stock_real;
	}

	public double getStock_able() {
		return stock_able;
	}

	public void setStock_able(double stock_able) {
		this.stock_able = stock_able;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getModifydate() {
		return modifydate;
	}

	public void setModifydate(String modifydate) {
		this.modifydate = modifydate;
	}

	public String getBuyer_appraisal() {
		return buyer_appraisal;
	}

	public void setBuyer_appraisal(String buyer_appraisal) {
		this.buyer_appraisal = buyer_appraisal;
	}

	public String getBuyer_appraisal_text() {
		return buyer_appraisal_text;
	}

	public void setBuyer_appraisal_text(String buyer_appraisal_text) {
		this.buyer_appraisal_text = buyer_appraisal_text;
	}

	public String getSeller_appraisal() {
		return seller_appraisal;
	}

	public void setSeller_appraisal(String seller_appraisal) {
		this.seller_appraisal = seller_appraisal;
	}

	public String getSeller_appraisal_text() {
		return seller_appraisal_text;
	}

	public void setSeller_appraisal_text(String seller_appraisal_text) {
		this.seller_appraisal_text = seller_appraisal_text;
	}

	public String getChild_order_id() {
		return child_order_id;
	}

	public void setChild_order_id(String child_order_id) {
		this.child_order_id = child_order_id;
	}

	public Integer getParent_id_old() {
		return parent_id_old;
	}

	public void setParent_id_old(Integer parent_id_old) {
		this.parent_id_old = parent_id_old;
	}

	public int getRefund_status() {
		return refund_status;
	}

	public void setRefund_status(int refund_status) {
		this.refund_status = refund_status;
	}

	public String getRefund_id() {
		return refund_id;
	}

	public void setRefund_id(String refund_id) {
		this.refund_id = refund_id;
	}

	public double getQty_back() {
		return qty_back;
	}

	public void setQty_back(double qty_back) {
		this.qty_back = qty_back;
	}

	public String getBack_date() {
		return back_date;
	}

	public void setBack_date(String back_date) {
		this.back_date = back_date;
	}

	public String getBack_wh() {
		return back_wh;
	}

	public void setBack_wh(String back_wh) {
		this.back_wh = back_wh;
	}

	public String getBack_man() {
		return back_man;
	}

	public void setBack_man(String back_man) {
		this.back_man = back_man;
	}

	public Integer getNum_iid() {
		return num_iid;
	}

	public void setNum_iid(Integer num_iid) {
		this.num_iid = num_iid;
	}

	public Integer getSku_id() {
		return sku_id;
	}

	public void setSku_id(Integer sku_id) {
		this.sku_id = sku_id;
	}

	public BigDecimal getBack_change_qty() {
		return back_change_qty;
	}

	public void setBack_change_qty(BigDecimal back_change_qty) {
		this.back_change_qty = back_change_qty;
	}

	public boolean isIs_free() {
		return is_free;
	}

	public void setIs_free(boolean is_free) {
		this.is_free = is_free;
	}

	public BigDecimal getDiscount_fee() {
		return discount_fee;
	}

	public void setDiscount_fee(BigDecimal discount_fee) {
		this.discount_fee = discount_fee;
	}

	public boolean isIs_prdmeal() {
		return is_prdmeal;
	}

	public void setIs_prdmeal(boolean is_prdmeal) {
		this.is_prdmeal = is_prdmeal;
	}

	public Integer getMeal_id() {
		return meal_id;
	}

	public void setMeal_id(Integer meal_id) {
		this.meal_id = meal_id;
	}

	public String getMeal_name() {
		return meal_name;
	}

	public void setMeal_name(String meal_name) {
		this.meal_name = meal_name;
	}

	public String getBack_rem() {
		return back_rem;
	}

	public void setBack_rem(String back_rem) {
		this.back_rem = back_rem;
	}

	public String getChange_rem() {
		return change_rem;
	}

	public void setChange_rem(String change_rem) {
		this.change_rem = change_rem;
	}

	public int getSale_status() {
		return sale_status;
	}

	public void setSale_status(int sale_status) {
		this.sale_status = sale_status;
	}

	public String getApp_date() {
		return app_date;
	}

	public void setApp_date(String app_date) {
		this.app_date = app_date;
	}

	public String getApp_rem() {
		return app_rem;
	}

	public void setApp_rem(String app_rem) {
		this.app_rem = app_rem;
	}

	public boolean isRate_status() {
		return rate_status;
	}

	public void setRate_status(boolean rate_status) {
		this.rate_status = rate_status;
	}

	public double getQty_check() {
		return qty_check;
	}

	public void setQty_check(double qty_check) {
		this.qty_check = qty_check;
	}

	public String getRem() {
		return rem;
	}

	public void setRem(String rem) {
		this.rem = rem;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public BigDecimal getFx_buyer_payment() {
		return fx_buyer_payment;
	}

	public void setFx_buyer_payment(BigDecimal fx_buyer_payment) {
		this.fx_buyer_payment = fx_buyer_payment;
	}

	public String getFxtradeid() {
		return fxtradeid;
	}

	public void setFxtradeid(String fxtradeid) {
		this.fxtradeid = fxtradeid;
	}

	public String getBat_no() {
		return bat_no;
	}

	public void setBat_no(String bat_no) {
		this.bat_no = bat_no;
	}

	public int getOrder_status() {
		return order_status;
	}

	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}

	public Integer getSiteid() {
		return siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	public int getPro_send_status() {
		return pro_send_status;
	}

	public void setPro_send_status(int pro_send_status) {
		this.pro_send_status = pro_send_status;
	}

	public int getPro_order_status() {
		return pro_order_status;
	}

	public void setPro_order_status(int pro_order_status) {
		this.pro_order_status = pro_order_status;
	}

	public BigDecimal getAmtn_oldsp() {
		return amtn_oldsp;
	}

	public void setAmtn_oldsp(BigDecimal amtn_oldsp) {
		this.amtn_oldsp = amtn_oldsp;
	}

	public BigDecimal getDiscount_fee_oldsp() {
		return discount_fee_oldsp;
	}

	public void setDiscount_fee_oldsp(BigDecimal discount_fee_oldsp) {
		this.discount_fee_oldsp = discount_fee_oldsp;
	}

	public boolean isIsdaixiao() {
		return isdaixiao;
	}

	public void setIsdaixiao(boolean isdaixiao) {
		this.isdaixiao = isdaixiao;
	}

	public double getQty_old() {
		return qty_old;
	}

	public void setQty_old(double qty_old) {
		this.qty_old = qty_old;
	}

	public boolean isIs_recalup() {
		return is_recalup;
	}

	public void setIs_recalup(boolean is_recalup) {
		this.is_recalup = is_recalup;
	}

	public boolean isIs_service_order() {
		return is_service_order;
	}

	public void setIs_service_order(boolean is_service_order) {
		this.is_service_order = is_service_order;
	}

	public boolean isIs_split() {
		return is_split;
	}

	public void setIs_split(boolean is_split) {
		this.is_split = is_split;
	}

	public boolean isIs_oversoid() {
		return is_oversoid;
	}

	public void setIs_oversoid(boolean is_oversoid) {
		this.is_oversoid = is_oversoid;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public String getConsign_time() {
		return consign_time;
	}

	public void setConsign_time(String consign_time) {
		this.consign_time = consign_time;
	}

	public int getShipping_type() {
		return shipping_type;
	}

	public void setShipping_type(int shipping_type) {
		this.shipping_type = shipping_type;
	}

	public String getBin_oid() {
		return bin_oid;
	}

	public void setBin_oid(String bin_oid) {
		this.bin_oid = bin_oid;
	}

	public String getLogistics_company() {
		return logistics_company;
	}

	public void setLogistics_company(String logistics_company) {
		this.logistics_company = logistics_company;
	}

	public String getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}

	public boolean isJx_is_deleted() {
		return jx_is_deleted;
	}

	public void setJx_is_deleted(boolean jx_is_deleted) {
		this.jx_is_deleted = jx_is_deleted;
	}

	public String getTc_order_id() {
		return tc_order_id;
	}

	public void setTc_order_id(String tc_order_id) {
		this.tc_order_id = tc_order_id;
	}

	public Integer getSalesactivity_id() {
		return salesactivity_id;
	}

	public void setSalesactivity_id(Integer salesactivity_id) {
		this.salesactivity_id = salesactivity_id;
	}

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public boolean isBuyer_refund_state() {
		return buyer_refund_state;
	}

	public void setBuyer_refund_state(boolean buyer_refund_state) {
		this.buyer_refund_state = buyer_refund_state;
	}

	public String getSa_bilno() {
		return sa_bilno;
	}

	public void setSa_bilno(String sa_bilno) {
		this.sa_bilno = sa_bilno;
	}

	public boolean isIswww() {
		return iswww;
	}

	public void setIswww(boolean iswww) {
		this.iswww = iswww;
	}

	public String getOuter_id() {
		return outer_id;
	}

	public void setOuter_id(String outer_id) {
		this.outer_id = outer_id;
	}

}
