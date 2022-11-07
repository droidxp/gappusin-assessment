public class com.zong.android.engine.xml.pojo.lookup.ZongPricePointItem implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 java.lang.String entrypointUrl;
	 Float exactPrice;
	 java.lang.String itemRef;
	 Float outPayment;
	 Boolean priceMatched;
	 java.util.HashMap providers;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
Float requestCurrencyOutpayment;
Boolean supportedAllProviders;
Float workingPrice;
Boolean zongPlusOnly;
/* # direct methods */
public com.zong.android.engine.xml.pojo.lookup.ZongPricePointItem ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->supportedAllProviders:Z */
int v0 = 0; // const/4 v0, 0x0
this.providers = v0;
return;
} // .end method
/* # virtual methods */
public java.lang.String getEntrypointUrl ( ) {
/* .locals 1 */
v0 = this.entrypointUrl;
} // .end method
public Float getExactPrice ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->exactPrice:F */
} // .end method
public java.lang.String getItemRef ( ) {
/* .locals 1 */
v0 = this.itemRef;
} // .end method
public Float getOutPayment ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->outPayment:F */
} // .end method
public java.util.HashMap getProviders ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
v0 = this.providers;
} // .end method
public Float getRequestCurrencyOutpayment ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->requestCurrencyOutpayment:F */
} // .end method
public Float getWorkingPrice ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->workingPrice:F */
} // .end method
public Boolean isPriceMatched ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->priceMatched:Z */
} // .end method
public Boolean isSupportedAllProviders ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->supportedAllProviders:Z */
} // .end method
public Boolean isZongPlusOnly ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->zongPlusOnly:Z */
} // .end method
public void putProvider ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
v0 = this.providers;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->supportedAllProviders:Z */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.providers = v0;
} // :cond_0
v0 = this.providers;
(( java.util.HashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public void setEntrypointUrl ( java.lang.String p0 ) {
/* .locals 0 */
this.entrypointUrl = p1;
return;
} // .end method
public void setExactPrice ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->exactPrice:F */
return;
} // .end method
public void setItemRef ( java.lang.String p0 ) {
/* .locals 0 */
this.itemRef = p1;
return;
} // .end method
public void setOutPayment ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->outPayment:F */
return;
} // .end method
public void setPriceMatched ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->priceMatched:Z */
return;
} // .end method
public void setRequestCurrencyOutpayment ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->requestCurrencyOutpayment:F */
return;
} // .end method
public void setWorkingPrice ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->workingPrice:F */
return;
} // .end method
public void setZongPlusOnly ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;->zongPlusOnly:Z */
return;
} // .end method
