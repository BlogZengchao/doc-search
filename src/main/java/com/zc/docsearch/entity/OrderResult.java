package com.zc.docsearch.entity;


import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class OrderResult {
    @XmlTransient
    private String mongoId;

    @XmlElementWrapper(name = "details")
    @XmlElements(value = {@XmlElement(name = "detail", type = OrderDetail.class)})
    private List<OrderDetail> details;

    private Integer id;
    private String siteid; //网店ID
    private Date order_date; //订单日期
    private String site_order_id; //网上订单号
    private String order_id; //本地订单号

    /**
     * 订单类型 0:手工单 1: 淘宝网 2:富润网店 3:换货产生 4:拆单产生 5:拍拍网店 6京东网店 7:当当网店
     * 8:一号店 9:ECShop网店 10:ShopEx网店 11:亚马逊网店 12:凡客V+ 13:优购商城 14:西街网 15:聚美优品
     * 16:唯品会 17:邮乐网 18:苏宁易购 19:阿里巴巴 20:国美在线 21:口袋通 22:微购物
     */
    private int ordertype; //订单类型
    private String dep;//网店所属部门
    private String cus_no;//网店核算客户
    private BigDecimal amtn;//金额含税
    private String buyernick;//买家昵称
    private String consignee;//收货人
    private String telephone;//联系电话
    private String zip;//邮政编码
    private String deliveryaddress;//收货地址
    private String logisticsid;//物流公司代号
    private String logisticscomp;//物流公司
    private String logisticsorder;//物流单号

    private BigDecimal logisticsconst;//物流成本
    private BigDecimal weight;//重量(克)
    private BigDecimal buyerfreight;//买家运费
    private String merge_order;//合并订单信息（子订单)
    private boolean merge_status;//合并状态

    //交易状态 0:待付款 1:已付款 2:已发货 3:交易成功 4:交易关闭 5:已付款(已分账),待发货 6:已付款(已分账),已发货  7:已分账发货成功8:已付款,确认收货
    private int transaction_status;
    private boolean appraisal_status;//评价状态
    //处理状态 0:待审核 1:待配货 2:待发货 3:已发货 4:交易关闭
    private int order_status;
    private String lock_status;//锁定状态，Y/N
    private String lock_rem;//锁定说明
    private String print_express;//快递单打印Y/N

    private String print_send;//发货单打印Y/N
    private String invoice_status;//是否已开票Y/N
    private String chk_man;//审核人
    private String pick_man;//配货员---配货处理回写
    private String shipping_man;//发货人–发货处理回写
    private String pick_rem;//配货备注
    private String order_rem;//订单备注
    private String shipping_rem;//发货备注
    private String createdate;//创建日期
    private String modifydate;//修改日期
    private String transaction_close_reason;//交易关闭原因
    private String wh;//取网店默认仓库

    private int order_flag;//旗帜
    private boolean appraisal_buyer;//买家评价
    private boolean appraisal_seller;//卖家评价
    private String print_pick;//配货单打印Y/N
    private String logisticsdate = null;//物流日期
    private String deliveryprovince;//省
    private String deliverycity;//市
    private String deliverydistrict;//区
    private String site_order_date;//淘宝订单日期
    private String site_end_date;//交易完成日期
    private String site_pay_date;//付款日期
    private BigDecimal amtn_old;//	合并订单时记录原订单金额
    private BigDecimal buyerfreight_old;//合并订单时记录原单运费
    private String mobile;//收货人手机
    private String transaction_type;//交易类型:货到付款等
    private String shipping_type;//运送方式:EMS,平邮,快递,免邮
    private String site_modifydate;//网上订单修改日期
    private BigDecimal buyer_codfee;//服务费
    private boolean weight_status;//是否产生费用
    private int print_express_count;//快递单打印次数
    private int print_send_count;//发货单打印次数
    private String ft_no;//费用单号
    private String chk_rem;//审核备注
    private String sa_bilno;//出库单号
    private BigDecimal amt_balance;//订单变更差价
    private String buyer_message;//买家留言
    private String order_rem_old;//原单订单备注
    private String buyer_message_old;//原单买家留言

    private int send_type;//0	物流方式:无需物流0，自己联系1，在线下单2
    private BigDecimal discount_fee;//优惠金额
    private int bil_type;//单据类别
    private int delay_date;//延迟发货的天数
    private String send_date;//发货日期
    private String msal_no;//归属客服
    private boolean is_claim;//客服是否认领
    private String src_no;//来源单号
    private BigDecimal buyer_codfee_old;//原单服务费
    private BigDecimal discount_fee_old;//原单优惠金额
    private String order_user;//录入人
    private String pick_date;//配货日期
    private boolean is_export;//是否退货转单
    private String lock_man;//锁单人
    private Integer shippingid;//发货地址id
    private boolean is_zdexpress;//是否指定物流公司（在审核时指定物流公司）
    private Integer site_order_itm;//网上订单的自增ID
    private BigDecimal amtn_oldsp;//拆单前的金额
    private BigDecimal discount_fee_oldsp;//拆单前优惠金额
    private boolean isdaixiao;//是否代销
    private BigDecimal amtn_pay;//原付款金额
    private BigDecimal buyer_freight_old;///原买家运费
    private int print_pick_count;//配货单打印次数
    private boolean is_split;//拆单标志
    private boolean is_part_consign;//卖家部份发货
    private String jx_audit_time_applier;//分销商审核时间


    private String card_id;//分销商身份证号
    private int site_deal_status;//经销采购状态
    private String fenxiao_message;//分销商留言
    private int pay_type;//支付方式
    private boolean mark;//是否为异常订单
    private boolean reachable;//是否物流不到达地
    private String mark_desc;//异常订单描述
    private String tc_order_id;//下游买家订单编号
    private boolean isnotchangeaddr;//除淘宝平台外修改收货地址后，平台不再同步
    private BigDecimal balance_used;//平台已付金额(京东、当当余额支付)
    private String buyer_alipayno;//买家支付宝账号
    private String companycode;//淘宝物流公司代号(指定物流服务使用)
    private int service_type;//服务类型
    private String parent_id;//网上订单id
    private String chk_date;//审核时间
    private String fenx_nick;//分销商
    /**
     * 订单中的处理状态
     * 0正常订单
     * 1预售订单
     * 2囤货订单
     * 3等货订单
     * 4其他订单
     * 5作废订单
     * 6价格异常订单
     * 7暂不发货(异常)
     * 8已流转ERP
     * 9商品异常
     * 10商品属性异常
     */
    private int pro_order_status;

    private boolean is_append;//是否补发单据
    private int append_state;//补发情况
    private String append_reason;//补发原因
    private boolean is_openinvoice;//是否开票
    private boolean is_upsend;//是否上传发货
    private String upsend_rem;//上传备注
    private int pro_send_status;//发货中处理的状态
    private String pro_chk_date;//验货时间
    private boolean pro_chk_status;//0:未验货 1:已验货
    private String wlb_order_id;//物流宝订单号
    private boolean pro_sale_status;//售后处理0:未作售后处理 1：已处理
    private String send_chk_man;//发货审核人
    private String send_chk_date;//发货审核日期
    private String pick_print_date;//配货打印时间
    private String send_print_date;//发货打印时间
    private String express_print_date;//快递打印时间
    private int wlb_site_status;//本地物流宝同步状态
    private int wlb_status;//物流宝状态
    private boolean is_logisticsdz;//是否进行了物流费用对账
    private int is_apidz;//是否进行了支付宝对账(0:未对账,1:已对账)
    private int is_xxpay;//应付对账(小熊)
    private int is_xxrcv;//应收对账(小熊)
    private BigDecimal fx_discount_fee;//下游买家优惠金额
    private BigDecimal fx_total_fee;//下游买家优惠总额

    /**
     * 下游买家付款方式:
     * 0财付通
     * 1支付宝
     * 2金额支付
     * 3银行汇款
     * 4存款支付
     * 5网银支付
     */
    private int fx_payment;

    private BigDecimal fx_post_fee;//下游买家物流费
    private String nullify_man;//作废人
    private String nullify_rem;//作废原因
    private String sitelogisticsid;//网上物流公司代号
    private String invoiceaddress;//发票地址
    private boolean isexpressprint;//是否订单开票快递打印
    private int hasinvoice;//发票需要情况 0不需要，1旧版普通，2新版普通，3增值税发票
    private String invoicetitle;//发票标题
    private String invoicecontent;//发票内容
    private String site_iteminfo;//网上商品信息
    private BigDecimal invoicemoney;//发票金额
    private boolean is_brand_sale;//是否是品牌特卖订单
    private boolean is_lgtype;//是否需要物流宝发货的标识
    private boolean is_force_wlb;//订单是否是强制使用物流宝发货
    private int invocetpye;//开票类型
    private String fxtradeid;//分销交易号
    private int wlb_out_biz_code;//wlb唯一编号
    private boolean istoutuo;//是否投妥
    private String signuser;//签收人
    private String signdate;//签收时间
    private int waytopay;//待付方式
    private BigDecimal prepaidsum;//预付金额
    private int advanceway;//预付方式
    private int step_trade_status;//分阶段付款的订单状态
    private BigDecimal step_paid_fee;//分阶段付款的已付金额
    private int logisticsid_inv;//寄票物流公司
    private boolean iskjorders;//是否科捷订单
    private String acc_no;//付款账户

    /**
     * 付款方式:
     * 0财付通
     * 1支付宝
     * 2金额支付
     * 3银行汇款
     * 4存款支付
     * 5网银支付
     */
    private int payment;
    private String inrem;//内部备注信息
    private boolean is_sentsms;//发货发短信
    private String pro_chk_man;//验货人
    private String dispatchingcenter;//配送中心
    private String dispatchingpoint;//配送站点
    private String logisticsbranch;//物流网点
    private String rem_accrefund;//退款账户备注
    private int refund_status;//退款方式
    private int pickup_status;//取件状态
    private int isbatchmark;//批次标记
    private String batch_no;//批次号
    private String batch_date;//批次日期
    private String tm_src_no;//来源手工单号
    private boolean is_missing;//是否扣减库存
    private int point_fee;//买家使用积分
    private int is_pickprintagain;//配货单允许重打次数
    private String printcheckman;//重打审批人
    private String printcheckdtime;//重打审批时间
    private boolean iswlbwaybill;//是否电子面单发货
    private boolean is_serviceorder;//是否家居服务
    private boolean isemsship;//是否由EMS仓储发货(0：否 1：是)
    private int is_sendprintagain;//发货单允许重打次数
    private int is_expressprintagain;//快递单允许重打次数
    private boolean isemswaybill;//是否EMS自助服务发货(0:否 1:是)
    private int emswaybillprint;//打印EMS热敏面单次数
    private BigDecimal buyer_obtain_point_fee;//买家获得的积分
    private BigDecimal credit_card_fee;//信用卡支付金额
    private BigDecimal commission_fee;//	交易佣金
    private BigDecimal available_confirm_fee;//剩余确认收货金额
    private BigDecimal received_payment;//卖家实际收到的支付宝打款金额
    private BigDecimal tao_orders_tagname;//	订单标签
    private boolean isfpxship;//是否由递四方仓储发货
    private String err_msg;//三方物流上传错误信息
    private String invoice_rem;//补开发票备注
    private String batch_man;//批次标记人
    private String alipay_no;//支付宝交易号
    private String pick_print_man;//配货单打印人
    private String send_print_man;//发货单打印人
    private String express_print_man;//快递单打印人
    private String weight_man;//称重人
    private boolean issfwaybill;//是否顺丰电子面单
    private String origincode;//寄件地代号
    private String destcode;//收件地代号
    private boolean isyunzhanwaybill;//是否云栈面单
    private int thirdwarehousetype;//第三方仓储订单类型
    private boolean isydwaybill;//是否韵达面单
    private BigDecimal insure_price;//顺丰保价
    private int sfexpress_type;//顺丰产品类型
    private int filter_result;//顺丰筛单结果
    private String short_address;//大头笔
    private String seller_nick;//卖家昵称
    private int linkcircuitstatus;//全链路状态
    private boolean specialaudit;//特审
    private String specialauditman;//特审人
    private String specialauditdt;//特审时间
    private int is_upsend_sa;//出库单产生服务中[1表示产生中 2表示产生完成]

    public String getMongoId() {
        return mongoId;
    }

    public void setMongoId(String mongoId) {
        this.mongoId = mongoId;
    }

    public List<OrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetail> details) {
        this.details = details;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
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

    public int getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(int ordertype) {
        this.ordertype = ordertype;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public String getCus_no() {
        return cus_no;
    }

    public void setCus_no(String cus_no) {
        this.cus_no = cus_no;
    }

    public BigDecimal getAmtn() {
        return amtn;
    }

    public void setAmtn(BigDecimal amtn) {
        this.amtn = amtn;
    }

    public String getBuyernick() {
        return buyernick;
    }

    public void setBuyernick(String buyernick) {
        this.buyernick = buyernick;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    public String getLogisticsid() {
        return logisticsid;
    }

    public void setLogisticsid(String logisticsid) {
        this.logisticsid = logisticsid;
    }

    public String getLogisticscomp() {
        return logisticscomp;
    }

    public void setLogisticscomp(String logisticscomp) {
        this.logisticscomp = logisticscomp;
    }

    public String getLogisticsorder() {
        return logisticsorder;
    }

    public void setLogisticsorder(String logisticsorder) {
        this.logisticsorder = logisticsorder;
    }

    public BigDecimal getLogisticsconst() {
        return logisticsconst;
    }

    public void setLogisticsconst(BigDecimal logisticsconst) {
        this.logisticsconst = logisticsconst;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getBuyerfreight() {
        return buyerfreight;
    }

    public void setBuyerfreight(BigDecimal buyerfreight) {
        this.buyerfreight = buyerfreight;
    }

    public String getMerge_order() {
        return merge_order;
    }

    public void setMerge_order(String merge_order) {
        this.merge_order = merge_order;
    }

    public boolean isMerge_status() {
        return merge_status;
    }

    public void setMerge_status(boolean merge_status) {
        this.merge_status = merge_status;
    }

    public int getTransaction_status() {
        return transaction_status;
    }

    public void setTransaction_status(int transaction_status) {
        this.transaction_status = transaction_status;
    }

    public boolean isAppraisal_status() {
        return appraisal_status;
    }

    public void setAppraisal_status(boolean appraisal_status) {
        this.appraisal_status = appraisal_status;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public String getLock_status() {
        return lock_status;
    }

    public void setLock_status(String lock_status) {
        this.lock_status = lock_status;
    }

    public String getLock_rem() {
        return lock_rem;
    }

    public void setLock_rem(String lock_rem) {
        this.lock_rem = lock_rem;
    }

    public String getPrint_express() {
        return print_express;
    }

    public void setPrint_express(String print_express) {
        this.print_express = print_express;
    }

    public String getPrint_send() {
        return print_send;
    }

    public void setPrint_send(String print_send) {
        this.print_send = print_send;
    }

    public String getInvoice_status() {
        return invoice_status;
    }

    public void setInvoice_status(String invoice_status) {
        this.invoice_status = invoice_status;
    }

    public String getChk_man() {
        return chk_man;
    }

    public void setChk_man(String chk_man) {
        this.chk_man = chk_man;
    }

    public String getPick_man() {
        return pick_man;
    }

    public void setPick_man(String pick_man) {
        this.pick_man = pick_man;
    }

    public String getShipping_man() {
        return shipping_man;
    }

    public void setShipping_man(String shipping_man) {
        this.shipping_man = shipping_man;
    }

    public String getPick_rem() {
        return pick_rem;
    }

    public void setPick_rem(String pick_rem) {
        this.pick_rem = pick_rem;
    }

    public String getOrder_rem() {
        return order_rem;
    }

    public void setOrder_rem(String order_rem) {
        this.order_rem = order_rem;
    }

    public String getShipping_rem() {
        return shipping_rem;
    }

    public void setShipping_rem(String shipping_rem) {
        this.shipping_rem = shipping_rem;
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

    public String getTransaction_close_reason() {
        return transaction_close_reason;
    }

    public void setTransaction_close_reason(String transaction_close_reason) {
        this.transaction_close_reason = transaction_close_reason;
    }

    public String getWh() {
        return wh;
    }

    public void setWh(String wh) {
        this.wh = wh;
    }

    public int getOrder_flag() {
        return order_flag;
    }

    public void setOrder_flag(int order_flag) {
        this.order_flag = order_flag;
    }

    public boolean isAppraisal_buyer() {
        return appraisal_buyer;
    }

    public void setAppraisal_buyer(boolean appraisal_buyer) {
        this.appraisal_buyer = appraisal_buyer;
    }

    public boolean isAppraisal_seller() {
        return appraisal_seller;
    }

    public void setAppraisal_seller(boolean appraisal_seller) {
        this.appraisal_seller = appraisal_seller;
    }

    public String getPrint_pick() {
        return print_pick;
    }

    public void setPrint_pick(String print_pick) {
        this.print_pick = print_pick;
    }

    public String getLogisticsdate() {
        return logisticsdate;
    }

    public void setLogisticsdate(String logisticsdate) {
        this.logisticsdate = logisticsdate;
    }

    public String getDeliveryprovince() {
        return deliveryprovince;
    }

    public void setDeliveryprovince(String deliveryprovince) {
        this.deliveryprovince = deliveryprovince;
    }

    public String getDeliverycity() {
        return deliverycity;
    }

    public void setDeliverycity(String deliverycity) {
        this.deliverycity = deliverycity;
    }

    public String getDeliverydistrict() {
        return deliverydistrict;
    }

    public void setDeliverydistrict(String deliverydistrict) {
        this.deliverydistrict = deliverydistrict;
    }

    public String getSite_order_date() {
        return site_order_date;
    }

    public void setSite_order_date(String site_order_date) {
        this.site_order_date = site_order_date;
    }

    public String getSite_end_date() {
        return site_end_date;
    }

    public void setSite_end_date(String site_end_date) {
        this.site_end_date = site_end_date;
    }

    public String getSite_pay_date() {
        return site_pay_date;
    }

    public void setSite_pay_date(String site_pay_date) {
        this.site_pay_date = site_pay_date;
    }

    public BigDecimal getAmtn_old() {
        return amtn_old;
    }

    public void setAmtn_old(BigDecimal amtn_old) {
        this.amtn_old = amtn_old;
    }

    public BigDecimal getBuyerfreight_old() {
        return buyerfreight_old;
    }

    public void setBuyerfreight_old(BigDecimal buyerfreight_old) {
        this.buyerfreight_old = buyerfreight_old;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public String getShipping_type() {
        return shipping_type;
    }

    public void setShipping_type(String shipping_type) {
        this.shipping_type = shipping_type;
    }

    public String getSite_modifydate() {
        return site_modifydate;
    }

    public void setSite_modifydate(String site_modifydate) {
        this.site_modifydate = site_modifydate;
    }

    public BigDecimal getBuyer_codfee() {
        return buyer_codfee;
    }

    public void setBuyer_codfee(BigDecimal buyer_codfee) {
        this.buyer_codfee = buyer_codfee;
    }

    public boolean isWeight_status() {
        return weight_status;
    }

    public void setWeight_status(boolean weight_status) {
        this.weight_status = weight_status;
    }

    public int getPrint_express_count() {
        return print_express_count;
    }

    public void setPrint_express_count(int print_express_count) {
        this.print_express_count = print_express_count;
    }

    public int getPrint_send_count() {
        return print_send_count;
    }

    public void setPrint_send_count(int print_send_count) {
        this.print_send_count = print_send_count;
    }

    public String getFt_no() {
        return ft_no;
    }

    public void setFt_no(String ft_no) {
        this.ft_no = ft_no;
    }

    public String getChk_rem() {
        return chk_rem;
    }

    public void setChk_rem(String chk_rem) {
        this.chk_rem = chk_rem;
    }

    public String getSa_bilno() {
        return sa_bilno;
    }

    public void setSa_bilno(String sa_bilno) {
        this.sa_bilno = sa_bilno;
    }

    public BigDecimal getAmt_balance() {
        return amt_balance;
    }

    public void setAmt_balance(BigDecimal amt_balance) {
        this.amt_balance = amt_balance;
    }

    public String getBuyer_message() {
        return buyer_message;
    }

    public void setBuyer_message(String buyer_message) {
        this.buyer_message = buyer_message;
    }

    public String getOrder_rem_old() {
        return order_rem_old;
    }

    public void setOrder_rem_old(String order_rem_old) {
        this.order_rem_old = order_rem_old;
    }

    public String getBuyer_message_old() {
        return buyer_message_old;
    }

    public void setBuyer_message_old(String buyer_message_old) {
        this.buyer_message_old = buyer_message_old;
    }

    public int getSend_type() {
        return send_type;
    }

    public void setSend_type(int send_type) {
        this.send_type = send_type;
    }

    public BigDecimal getDiscount_fee() {
        return discount_fee;
    }

    public void setDiscount_fee(BigDecimal discount_fee) {
        this.discount_fee = discount_fee;
    }

    public int getBil_type() {
        return bil_type;
    }

    public void setBil_type(int bil_type) {
        this.bil_type = bil_type;
    }

    public int getDelay_date() {
        return delay_date;
    }

    public void setDelay_date(int delay_date) {
        this.delay_date = delay_date;
    }

    public String getSend_date() {
        return send_date;
    }

    public void setSend_date(String send_date) {
        this.send_date = send_date;
    }

    public String getMsal_no() {
        return msal_no;
    }

    public void setMsal_no(String msal_no) {
        this.msal_no = msal_no;
    }

    public boolean isIs_claim() {
        return is_claim;
    }

    public void setIs_claim(boolean is_claim) {
        this.is_claim = is_claim;
    }

    public String getSrc_no() {
        return src_no;
    }

    public void setSrc_no(String src_no) {
        this.src_no = src_no;
    }

    public BigDecimal getBuyer_codfee_old() {
        return buyer_codfee_old;
    }

    public void setBuyer_codfee_old(BigDecimal buyer_codfee_old) {
        this.buyer_codfee_old = buyer_codfee_old;
    }

    public BigDecimal getDiscount_fee_old() {
        return discount_fee_old;
    }

    public void setDiscount_fee_old(BigDecimal discount_fee_old) {
        this.discount_fee_old = discount_fee_old;
    }

    public String getOrder_user() {
        return order_user;
    }

    public void setOrder_user(String order_user) {
        this.order_user = order_user;
    }

    public String getPick_date() {
        return pick_date;
    }

    public void setPick_date(String pick_date) {
        this.pick_date = pick_date;
    }

    public boolean isIs_export() {
        return is_export;
    }

    public void setIs_export(boolean is_export) {
        this.is_export = is_export;
    }

    public String getLock_man() {
        return lock_man;
    }

    public void setLock_man(String lock_man) {
        this.lock_man = lock_man;
    }

    public Integer getShippingid() {
        return shippingid;
    }

    public void setShippingid(Integer shippingid) {
        this.shippingid = shippingid;
    }

    public boolean isIs_zdexpress() {
        return is_zdexpress;
    }

    public void setIs_zdexpress(boolean is_zdexpress) {
        this.is_zdexpress = is_zdexpress;
    }

    public Integer getSite_order_itm() {
        return site_order_itm;
    }

    public void setSite_order_itm(Integer site_order_itm) {
        this.site_order_itm = site_order_itm;
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

    public BigDecimal getAmtn_pay() {
        return amtn_pay;
    }

    public void setAmtn_pay(BigDecimal amtn_pay) {
        this.amtn_pay = amtn_pay;
    }

    public BigDecimal getBuyer_freight_old() {
        return buyer_freight_old;
    }

    public void setBuyer_freight_old(BigDecimal buyer_freight_old) {
        this.buyer_freight_old = buyer_freight_old;
    }

    public int getPrint_pick_count() {
        return print_pick_count;
    }

    public void setPrint_pick_count(int print_pick_count) {
        this.print_pick_count = print_pick_count;
    }

    public boolean isIs_split() {
        return is_split;
    }

    public void setIs_split(boolean is_split) {
        this.is_split = is_split;
    }

    public boolean isIs_part_consign() {
        return is_part_consign;
    }

    public void setIs_part_consign(boolean is_part_consign) {
        this.is_part_consign = is_part_consign;
    }

    public String getJx_audit_time_applier() {
        return jx_audit_time_applier;
    }

    public void setJx_audit_time_applier(String jx_audit_time_applier) {
        this.jx_audit_time_applier = jx_audit_time_applier;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public int getSite_deal_status() {
        return site_deal_status;
    }

    public void setSite_deal_status(int site_deal_status) {
        this.site_deal_status = site_deal_status;
    }

    public String getFenxiao_message() {
        return fenxiao_message;
    }

    public void setFenxiao_message(String fenxiao_message) {
        this.fenxiao_message = fenxiao_message;
    }

    public int getPay_type() {
        return pay_type;
    }

    public void setPay_type(int pay_type) {
        this.pay_type = pay_type;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public boolean isReachable() {
        return reachable;
    }

    public void setReachable(boolean reachable) {
        this.reachable = reachable;
    }

    public String getMark_desc() {
        return mark_desc;
    }

    public void setMark_desc(String mark_desc) {
        this.mark_desc = mark_desc;
    }

    public String getTc_order_id() {
        return tc_order_id;
    }

    public void setTc_order_id(String tc_order_id) {
        this.tc_order_id = tc_order_id;
    }

    public boolean isIsnotchangeaddr() {
        return isnotchangeaddr;
    }

    public void setIsnotchangeaddr(boolean isnotchangeaddr) {
        this.isnotchangeaddr = isnotchangeaddr;
    }

    public BigDecimal getBalance_used() {
        return balance_used;
    }

    public void setBalance_used(BigDecimal balance_used) {
        this.balance_used = balance_used;
    }

    public String getBuyer_alipayno() {
        return buyer_alipayno;
    }

    public void setBuyer_alipayno(String buyer_alipayno) {
        this.buyer_alipayno = buyer_alipayno;
    }

    public String getCompanycode() {
        return companycode;
    }

    public void setCompanycode(String companycode) {
        this.companycode = companycode;
    }

    public int getService_type() {
        return service_type;
    }

    public void setService_type(int service_type) {
        this.service_type = service_type;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getChk_date() {
        return chk_date;
    }

    public void setChk_date(String chk_date) {
        this.chk_date = chk_date;
    }

    public String getFenx_nick() {
        return fenx_nick;
    }

    public void setFenx_nick(String fenx_nick) {
        this.fenx_nick = fenx_nick;
    }

    public int getPro_order_status() {
        return pro_order_status;
    }

    public void setPro_order_status(int pro_order_status) {
        this.pro_order_status = pro_order_status;
    }

    public boolean isIs_append() {
        return is_append;
    }

    public void setIs_append(boolean is_append) {
        this.is_append = is_append;
    }

    public int getAppend_state() {
        return append_state;
    }

    public void setAppend_state(int append_state) {
        this.append_state = append_state;
    }

    public String getAppend_reason() {
        return append_reason;
    }

    public void setAppend_reason(String append_reason) {
        this.append_reason = append_reason;
    }

    public boolean isIs_openinvoice() {
        return is_openinvoice;
    }

    public void setIs_openinvoice(boolean is_openinvoice) {
        this.is_openinvoice = is_openinvoice;
    }

    public boolean isIs_upsend() {
        return is_upsend;
    }

    public void setIs_upsend(boolean is_upsend) {
        this.is_upsend = is_upsend;
    }

    public String getUpsend_rem() {
        return upsend_rem;
    }

    public void setUpsend_rem(String upsend_rem) {
        this.upsend_rem = upsend_rem;
    }

    public int getPro_send_status() {
        return pro_send_status;
    }

    public void setPro_send_status(int pro_send_status) {
        this.pro_send_status = pro_send_status;
    }

    public String getPro_chk_date() {
        return pro_chk_date;
    }

    public void setPro_chk_date(String pro_chk_date) {
        this.pro_chk_date = pro_chk_date;
    }

    public boolean isPro_chk_status() {
        return pro_chk_status;
    }

    public void setPro_chk_status(boolean pro_chk_status) {
        this.pro_chk_status = pro_chk_status;
    }

    public String getWlb_order_id() {
        return wlb_order_id;
    }

    public void setWlb_order_id(String wlb_order_id) {
        this.wlb_order_id = wlb_order_id;
    }

    public boolean isPro_sale_status() {
        return pro_sale_status;
    }

    public void setPro_sale_status(boolean pro_sale_status) {
        this.pro_sale_status = pro_sale_status;
    }

    public String getSend_chk_man() {
        return send_chk_man;
    }

    public void setSend_chk_man(String send_chk_man) {
        this.send_chk_man = send_chk_man;
    }

    public String getSend_chk_date() {
        return send_chk_date;
    }

    public void setSend_chk_date(String send_chk_date) {
        this.send_chk_date = send_chk_date;
    }

    public String getPick_print_date() {
        return pick_print_date;
    }

    public void setPick_print_date(String pick_print_date) {
        this.pick_print_date = pick_print_date;
    }

    public String getSend_print_date() {
        return send_print_date;
    }

    public void setSend_print_date(String send_print_date) {
        this.send_print_date = send_print_date;
    }

    public String getExpress_print_date() {
        return express_print_date;
    }

    public void setExpress_print_date(String express_print_date) {
        this.express_print_date = express_print_date;
    }

    public int getWlb_site_status() {
        return wlb_site_status;
    }

    public void setWlb_site_status(int wlb_site_status) {
        this.wlb_site_status = wlb_site_status;
    }

    public int getWlb_status() {
        return wlb_status;
    }

    public void setWlb_status(int wlb_status) {
        this.wlb_status = wlb_status;
    }

    public boolean isIs_logisticsdz() {
        return is_logisticsdz;
    }

    public void setIs_logisticsdz(boolean is_logisticsdz) {
        this.is_logisticsdz = is_logisticsdz;
    }

    public int getIs_apidz() {
        return is_apidz;
    }

    public void setIs_apidz(int is_apidz) {
        this.is_apidz = is_apidz;
    }

    public int getIs_xxpay() {
        return is_xxpay;
    }

    public void setIs_xxpay(int is_xxpay) {
        this.is_xxpay = is_xxpay;
    }

    public int getIs_xxrcv() {
        return is_xxrcv;
    }

    public void setIs_xxrcv(int is_xxrcv) {
        this.is_xxrcv = is_xxrcv;
    }

    public BigDecimal getFx_discount_fee() {
        return fx_discount_fee;
    }

    public void setFx_discount_fee(BigDecimal fx_discount_fee) {
        this.fx_discount_fee = fx_discount_fee;
    }

    public BigDecimal getFx_total_fee() {
        return fx_total_fee;
    }

    public void setFx_total_fee(BigDecimal fx_total_fee) {
        this.fx_total_fee = fx_total_fee;
    }

    public int getFx_payment() {
        return fx_payment;
    }

    public void setFx_payment(int fx_payment) {
        this.fx_payment = fx_payment;
    }

    public BigDecimal getFx_post_fee() {
        return fx_post_fee;
    }

    public void setFx_post_fee(BigDecimal fx_post_fee) {
        this.fx_post_fee = fx_post_fee;
    }

    public String getNullify_man() {
        return nullify_man;
    }

    public void setNullify_man(String nullify_man) {
        this.nullify_man = nullify_man;
    }

    public String getNullify_rem() {
        return nullify_rem;
    }

    public void setNullify_rem(String nullify_rem) {
        this.nullify_rem = nullify_rem;
    }

    public String getSitelogisticsid() {
        return sitelogisticsid;
    }

    public void setSitelogisticsid(String sitelogisticsid) {
        this.sitelogisticsid = sitelogisticsid;
    }

    public String getInvoiceaddress() {
        return invoiceaddress;
    }

    public void setInvoiceaddress(String invoiceaddress) {
        this.invoiceaddress = invoiceaddress;
    }

    public boolean isIsexpressprint() {
        return isexpressprint;
    }

    public void setIsexpressprint(boolean isexpressprint) {
        this.isexpressprint = isexpressprint;
    }

    public int getHasinvoice() {
        return hasinvoice;
    }

    public void setHasinvoice(int hasinvoice) {
        this.hasinvoice = hasinvoice;
    }

    public String getInvoicetitle() {
        return invoicetitle;
    }

    public void setInvoicetitle(String invoicetitle) {
        this.invoicetitle = invoicetitle;
    }

    public String getInvoicecontent() {
        return invoicecontent;
    }

    public void setInvoicecontent(String invoicecontent) {
        this.invoicecontent = invoicecontent;
    }

    public String getSite_iteminfo() {
        return site_iteminfo;
    }

    public void setSite_iteminfo(String site_iteminfo) {
        this.site_iteminfo = site_iteminfo;
    }

    public BigDecimal getInvoicemoney() {
        return invoicemoney;
    }

    public void setInvoicemoney(BigDecimal invoicemoney) {
        this.invoicemoney = invoicemoney;
    }

    public boolean isIs_brand_sale() {
        return is_brand_sale;
    }

    public void setIs_brand_sale(boolean is_brand_sale) {
        this.is_brand_sale = is_brand_sale;
    }

    public boolean isIs_lgtype() {
        return is_lgtype;
    }

    public void setIs_lgtype(boolean is_lgtype) {
        this.is_lgtype = is_lgtype;
    }

    public boolean isIs_force_wlb() {
        return is_force_wlb;
    }

    public void setIs_force_wlb(boolean is_force_wlb) {
        this.is_force_wlb = is_force_wlb;
    }

    public int getInvocetpye() {
        return invocetpye;
    }

    public void setInvocetpye(int invocetpye) {
        this.invocetpye = invocetpye;
    }

    public String getFxtradeid() {
        return fxtradeid;
    }

    public void setFxtradeid(String fxtradeid) {
        this.fxtradeid = fxtradeid;
    }

    public int getWlb_out_biz_code() {
        return wlb_out_biz_code;
    }

    public void setWlb_out_biz_code(int wlb_out_biz_code) {
        this.wlb_out_biz_code = wlb_out_biz_code;
    }

    public boolean isIstoutuo() {
        return istoutuo;
    }

    public void setIstoutuo(boolean istoutuo) {
        this.istoutuo = istoutuo;
    }

    public String getSignuser() {
        return signuser;
    }

    public void setSignuser(String signuser) {
        this.signuser = signuser;
    }

    public String getSigndate() {
        return signdate;
    }

    public void setSigndate(String signdate) {
        this.signdate = signdate;
    }

    public int getWaytopay() {
        return waytopay;
    }

    public void setWaytopay(int waytopay) {
        this.waytopay = waytopay;
    }

    public BigDecimal getPrepaidsum() {
        return prepaidsum;
    }

    public void setPrepaidsum(BigDecimal prepaidsum) {
        this.prepaidsum = prepaidsum;
    }

    public int getAdvanceway() {
        return advanceway;
    }

    public void setAdvanceway(int advanceway) {
        this.advanceway = advanceway;
    }

    public int getStep_trade_status() {
        return step_trade_status;
    }

    public void setStep_trade_status(int step_trade_status) {
        this.step_trade_status = step_trade_status;
    }

    public BigDecimal getStep_paid_fee() {
        return step_paid_fee;
    }

    public void setStep_paid_fee(BigDecimal step_paid_fee) {
        this.step_paid_fee = step_paid_fee;
    }

    public int getLogisticsid_inv() {
        return logisticsid_inv;
    }

    public void setLogisticsid_inv(int logisticsid_inv) {
        this.logisticsid_inv = logisticsid_inv;
    }

    public boolean isIskjorders() {
        return iskjorders;
    }

    public void setIskjorders(boolean iskjorders) {
        this.iskjorders = iskjorders;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getInrem() {
        return inrem;
    }

    public void setInrem(String inrem) {
        this.inrem = inrem;
    }

    public boolean isIs_sentsms() {
        return is_sentsms;
    }

    public void setIs_sentsms(boolean is_sentsms) {
        this.is_sentsms = is_sentsms;
    }

    public String getPro_chk_man() {
        return pro_chk_man;
    }

    public void setPro_chk_man(String pro_chk_man) {
        this.pro_chk_man = pro_chk_man;
    }

    public String getDispatchingcenter() {
        return dispatchingcenter;
    }

    public void setDispatchingcenter(String dispatchingcenter) {
        this.dispatchingcenter = dispatchingcenter;
    }

    public String getDispatchingpoint() {
        return dispatchingpoint;
    }

    public void setDispatchingpoint(String dispatchingpoint) {
        this.dispatchingpoint = dispatchingpoint;
    }

    public String getLogisticsbranch() {
        return logisticsbranch;
    }

    public void setLogisticsbranch(String logisticsbranch) {
        this.logisticsbranch = logisticsbranch;
    }

    public String getRem_accrefund() {
        return rem_accrefund;
    }

    public void setRem_accrefund(String rem_accrefund) {
        this.rem_accrefund = rem_accrefund;
    }

    public int getRefund_status() {
        return refund_status;
    }

    public void setRefund_status(int refund_status) {
        this.refund_status = refund_status;
    }

    public int getPickup_status() {
        return pickup_status;
    }

    public void setPickup_status(int pickup_status) {
        this.pickup_status = pickup_status;
    }

    public int getIsbatchmark() {
        return isbatchmark;
    }

    public void setIsbatchmark(int isbatchmark) {
        this.isbatchmark = isbatchmark;
    }

    public String getBatch_no() {
        return batch_no;
    }

    public void setBatch_no(String batch_no) {
        this.batch_no = batch_no;
    }

    public String getBatch_date() {
        return batch_date;
    }

    public void setBatch_date(String batch_date) {
        this.batch_date = batch_date;
    }

    public String getTm_src_no() {
        return tm_src_no;
    }

    public void setTm_src_no(String tm_src_no) {
        this.tm_src_no = tm_src_no;
    }

    public boolean isIs_missing() {
        return is_missing;
    }

    public void setIs_missing(boolean is_missing) {
        this.is_missing = is_missing;
    }

    public int getPoint_fee() {
        return point_fee;
    }

    public void setPoint_fee(int point_fee) {
        this.point_fee = point_fee;
    }

    public int getIs_pickprintagain() {
        return is_pickprintagain;
    }

    public void setIs_pickprintagain(int is_pickprintagain) {
        this.is_pickprintagain = is_pickprintagain;
    }

    public String getPrintcheckman() {
        return printcheckman;
    }

    public void setPrintcheckman(String printcheckman) {
        this.printcheckman = printcheckman;
    }

    public String getPrintcheckdtime() {
        return printcheckdtime;
    }

    public void setPrintcheckdtime(String printcheckdtime) {
        this.printcheckdtime = printcheckdtime;
    }

    public boolean isIswlbwaybill() {
        return iswlbwaybill;
    }

    public void setIswlbwaybill(boolean iswlbwaybill) {
        this.iswlbwaybill = iswlbwaybill;
    }

    public boolean isIs_serviceorder() {
        return is_serviceorder;
    }

    public void setIs_serviceorder(boolean is_serviceorder) {
        this.is_serviceorder = is_serviceorder;
    }

    public boolean isIsemsship() {
        return isemsship;
    }

    public void setIsemsship(boolean isemsship) {
        this.isemsship = isemsship;
    }

    public int getIs_sendprintagain() {
        return is_sendprintagain;
    }

    public void setIs_sendprintagain(int is_sendprintagain) {
        this.is_sendprintagain = is_sendprintagain;
    }

    public int getIs_expressprintagain() {
        return is_expressprintagain;
    }

    public void setIs_expressprintagain(int is_expressprintagain) {
        this.is_expressprintagain = is_expressprintagain;
    }

    public boolean isIsemswaybill() {
        return isemswaybill;
    }

    public void setIsemswaybill(boolean isemswaybill) {
        this.isemswaybill = isemswaybill;
    }

    public int getEmswaybillprint() {
        return emswaybillprint;
    }

    public void setEmswaybillprint(int emswaybillprint) {
        this.emswaybillprint = emswaybillprint;
    }

    public BigDecimal getBuyer_obtain_point_fee() {
        return buyer_obtain_point_fee;
    }

    public void setBuyer_obtain_point_fee(BigDecimal buyer_obtain_point_fee) {
        this.buyer_obtain_point_fee = buyer_obtain_point_fee;
    }

    public BigDecimal getCredit_card_fee() {
        return credit_card_fee;
    }

    public void setCredit_card_fee(BigDecimal credit_card_fee) {
        this.credit_card_fee = credit_card_fee;
    }

    public BigDecimal getCommission_fee() {
        return commission_fee;
    }

    public void setCommission_fee(BigDecimal commission_fee) {
        this.commission_fee = commission_fee;
    }

    public BigDecimal getAvailable_confirm_fee() {
        return available_confirm_fee;
    }

    public void setAvailable_confirm_fee(BigDecimal available_confirm_fee) {
        this.available_confirm_fee = available_confirm_fee;
    }

    public BigDecimal getReceived_payment() {
        return received_payment;
    }

    public void setReceived_payment(BigDecimal received_payment) {
        this.received_payment = received_payment;
    }

    public BigDecimal getTao_orders_tagname() {
        return tao_orders_tagname;
    }

    public void setTao_orders_tagname(BigDecimal tao_orders_tagname) {
        this.tao_orders_tagname = tao_orders_tagname;
    }

    public boolean isIsfpxship() {
        return isfpxship;
    }

    public void setIsfpxship(boolean isfpxship) {
        this.isfpxship = isfpxship;
    }

    public String getErr_msg() {
        return err_msg;
    }

    public void setErr_msg(String err_msg) {
        this.err_msg = err_msg;
    }

    public String getInvoice_rem() {
        return invoice_rem;
    }

    public void setInvoice_rem(String invoice_rem) {
        this.invoice_rem = invoice_rem;
    }

    public String getBatch_man() {
        return batch_man;
    }

    public void setBatch_man(String batch_man) {
        this.batch_man = batch_man;
    }

    public String getAlipay_no() {
        return alipay_no;
    }

    public void setAlipay_no(String alipay_no) {
        this.alipay_no = alipay_no;
    }

    public String getPick_print_man() {
        return pick_print_man;
    }

    public void setPick_print_man(String pick_print_man) {
        this.pick_print_man = pick_print_man;
    }

    public String getSend_print_man() {
        return send_print_man;
    }

    public void setSend_print_man(String send_print_man) {
        this.send_print_man = send_print_man;
    }

    public String getExpress_print_man() {
        return express_print_man;
    }

    public void setExpress_print_man(String express_print_man) {
        this.express_print_man = express_print_man;
    }

    public String getWeight_man() {
        return weight_man;
    }

    public void setWeight_man(String weight_man) {
        this.weight_man = weight_man;
    }

    public boolean isIssfwaybill() {
        return issfwaybill;
    }

    public void setIssfwaybill(boolean issfwaybill) {
        this.issfwaybill = issfwaybill;
    }

    public String getOrigincode() {
        return origincode;
    }

    public void setOrigincode(String origincode) {
        this.origincode = origincode;
    }

    public String getDestcode() {
        return destcode;
    }

    public void setDestcode(String destcode) {
        this.destcode = destcode;
    }

    public boolean isIsyunzhanwaybill() {
        return isyunzhanwaybill;
    }

    public void setIsyunzhanwaybill(boolean isyunzhanwaybill) {
        this.isyunzhanwaybill = isyunzhanwaybill;
    }

    public int getThirdwarehousetype() {
        return thirdwarehousetype;
    }

    public void setThirdwarehousetype(int thirdwarehousetype) {
        this.thirdwarehousetype = thirdwarehousetype;
    }

    public boolean isIsydwaybill() {
        return isydwaybill;
    }

    public void setIsydwaybill(boolean isydwaybill) {
        this.isydwaybill = isydwaybill;
    }

    public BigDecimal getInsure_price() {
        return insure_price;
    }

    public void setInsure_price(BigDecimal insure_price) {
        this.insure_price = insure_price;
    }

    public int getSfexpress_type() {
        return sfexpress_type;
    }

    public void setSfexpress_type(int sfexpress_type) {
        this.sfexpress_type = sfexpress_type;
    }

    public int getFilter_result() {
        return filter_result;
    }

    public void setFilter_result(int filter_result) {
        this.filter_result = filter_result;
    }

    public String getShort_address() {
        return short_address;
    }

    public void setShort_address(String short_address) {
        this.short_address = short_address;
    }

    public String getSeller_nick() {
        return seller_nick;
    }

    public void setSeller_nick(String seller_nick) {
        this.seller_nick = seller_nick;
    }

    public int getLinkcircuitstatus() {
        return linkcircuitstatus;
    }

    public void setLinkcircuitstatus(int linkcircuitstatus) {
        this.linkcircuitstatus = linkcircuitstatus;
    }

    public boolean isSpecialaudit() {
        return specialaudit;
    }

    public void setSpecialaudit(boolean specialaudit) {
        this.specialaudit = specialaudit;
    }

    public String getSpecialauditman() {
        return specialauditman;
    }

    public void setSpecialauditman(String specialauditman) {
        this.specialauditman = specialauditman;
    }

    public String getSpecialauditdt() {
        return specialauditdt;
    }

    public void setSpecialauditdt(String specialauditdt) {
        this.specialauditdt = specialauditdt;
    }

    public int getIs_upsend_sa() {
        return is_upsend_sa;
    }

    public void setIs_upsend_sa(int is_upsend_sa) {
        this.is_upsend_sa = is_upsend_sa;
    }
}
