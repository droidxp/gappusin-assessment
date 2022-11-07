public class com.zong.android.engine.xml.pojo.lookup.ZongPricePoint implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 java.lang.String countryCode;
	 Float exchangeRate;
	 java.util.ArrayList items;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList", */
	 /* "<", */
	 /* "Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
java.lang.String localCurrency;
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
/* # direct methods */
public com.zong.android.engine.xml.pojo.lookup.ZongPricePoint ( ) {
/* .locals 1 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.providers = v0;
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.items = v0;
return;
} // .end method
/* # virtual methods */
public java.lang.String getCountryCode ( ) {
/* .locals 1 */
v0 = this.countryCode;
} // .end method
public Float getExchangeRate ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;->exchangeRate:F */
} // .end method
public java.util.ArrayList getItems ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;", */
/* ">;" */
/* } */
} // .end annotation
v0 = this.items;
} // .end method
public java.lang.String getLocalCurrency ( ) {
/* .locals 1 */
v0 = this.localCurrency;
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
public void putProvider ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
v0 = this.providers;
(( java.util.HashMap ) v0 ).put ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
return;
} // .end method
public void setCountryCode ( java.lang.String p0 ) {
/* .locals 0 */
this.countryCode = p1;
return;
} // .end method
public void setExchangeRate ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;->exchangeRate:F */
return;
} // .end method
public void setItems ( java.util.ArrayList p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePointItem;", */
/* ">;)V" */
/* } */
} // .end annotation
this.items = p1;
return;
} // .end method
public void setLocalCurrency ( java.lang.String p0 ) {
/* .locals 0 */
this.localCurrency = p1;
return;
} // .end method
