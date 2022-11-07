public class com.zong.android.engine.activities.ZongPaymentRequest implements android.os.Parcelable {
	 /* # interfaces */
	 /* # static fields */
	 public static final android.os.Parcelable$Creator CREATOR;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Landroid/os/Parcelable$Creator", */
	 /* "<", */
	 /* "Lcom/zong/android/engine/activities/ZongPaymentRequest;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static final java.lang.String a;
/* # instance fields */
private java.lang.Boolean b;
private java.lang.Boolean c;
private java.lang.Boolean d;
private java.lang.String e;
private java.lang.String f;
private java.lang.String g;
private java.lang.String h;
private java.lang.String i;
private java.lang.String j;
private java.lang.String k;
private java.lang.String l;
private java.lang.String m;
private java.util.ArrayList n;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/zong/android/engine/activities/ZongPricePointsElement;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.zong.android.engine.activities.ZongPaymentRequest ( ) {
/* .locals 1 */
/* const-class v0, Lcom/zong/android/engine/activities/ZongPaymentRequest; */
(( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
/* new-instance v0, Lcom/zong/android/engine/activities/b; */
/* invoke-direct {v0}, Lcom/zong/android/engine/activities/b;-><init>()V */
return;
} // .end method
public com.zong.android.engine.activities.ZongPaymentRequest ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
java.lang.Boolean .valueOf ( v1 );
this.b = v0;
java.lang.Boolean .valueOf ( v1 );
this.c = v0;
java.lang.Boolean .valueOf ( v1 );
this.d = v0;
final String v0 = "ZongApp"; // const-string v0, "ZongApp"
this.e = v0;
final String v0 = "en"; // const-string v0, "en"
this.h = v0;
final String v0 = "US"; // const-string v0, "US"
this.i = v0;
final String v0 = "USD"; // const-string v0, "USD"
this.j = v0;
int v0 = 0; // const/4 v0, 0x0
this.n = v0;
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.n = v0;
return;
} // .end method
 com.zong.android.engine.activities.ZongPaymentRequest ( ) { //synthethic
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;-><init>(Landroid/os/Parcel;B)V */
return;
} // .end method
private com.zong.android.engine.activities.ZongPaymentRequest ( ) {
/* .locals 5 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
java.lang.Boolean .valueOf ( v1 );
this.b = v0;
java.lang.Boolean .valueOf ( v1 );
this.c = v0;
java.lang.Boolean .valueOf ( v1 );
this.d = v0;
final String v0 = "ZongApp"; // const-string v0, "ZongApp"
this.e = v0;
final String v0 = "en"; // const-string v0, "en"
this.h = v0;
final String v0 = "US"; // const-string v0, "US"
this.i = v0;
final String v0 = "USD"; // const-string v0, "USD"
this.j = v0;
int v0 = 0; // const/4 v0, 0x0
this.n = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
v0 = java.lang.Boolean .parseBoolean ( v0 );
java.lang.Boolean .valueOf ( v0 );
this.b = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
v0 = java.lang.Boolean .parseBoolean ( v0 );
java.lang.Boolean .valueOf ( v0 );
this.c = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
v0 = java.lang.Boolean .parseBoolean ( v0 );
java.lang.Boolean .valueOf ( v0 );
this.d = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.e = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.f = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.g = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.h = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.i = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.j = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.k = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.l = v0;
(( android.os.Parcel ) p1 ).readString ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;
this.m = v0;
v0 = (( android.os.Parcel ) p1 ).readInt ( ); // invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I
v2 = com.zong.android.engine.activities.ZongPricePointsElement.CREATOR;
/* check-cast v0, [Lcom/zong/android/engine/activities/ZongPricePointsElement; */
v2 = com.zong.android.engine.activities.ZongPricePointsElement.CREATOR;
(( android.os.Parcel ) p1 ).readTypedArray ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Landroid/os/Parcel;->readTypedArray([Ljava/lang/Object;Landroid/os/Parcelable$Creator;)V
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
this.n = v2;
/* array-length v2, v0 */
} // :goto_0
/* if-lt v1, v2, :cond_0 */
return;
} // :cond_0
/* aget-object v3, v0, v1 */
v4 = this.n;
(( java.util.ArrayList ) v4 ).add ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
/* # virtual methods */
public void addPricePoint ( java.lang.String p0, Float p1, Integer p2, java.lang.String p3, java.lang.String p4 ) {
/* .locals 6 */
/* new-instance v0, Lcom/zong/android/engine/activities/ZongPricePointsElement; */
/* move-object v1, p1 */
/* move v2, p2 */
/* move v3, p3 */
/* move-object v4, p4 */
/* move-object v5, p5 */
/* invoke-direct/range {v0 ..v5}, Lcom/zong/android/engine/activities/ZongPricePointsElement;-><init>(Ljava/lang/String;FILjava/lang/String;Ljava/lang/String;)V */
v1 = this.n;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
return;
} // .end method
public Integer describeContents ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void flushPricepointsList ( ) {
/* .locals 1 */
v0 = this.n;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.n;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
} // :cond_0
return;
} // .end method
public java.lang.String getAppName ( ) {
/* .locals 1 */
v0 = this.e;
} // .end method
public java.lang.String getCountry ( ) {
/* .locals 1 */
v0 = this.i;
} // .end method
public java.lang.String getCurrency ( ) {
/* .locals 1 */
v0 = this.j;
} // .end method
public java.text.NumberFormat getCurrencyFormatter ( ) {
/* .locals 4 */
int v3 = 2; // const/4 v3, 0x2
/* new-instance v0, Ljava/util/Locale; */
(( com.zong.android.engine.activities.ZongPaymentRequest ) p0 ).getLang ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getLang()Ljava/lang/String;
(( com.zong.android.engine.activities.ZongPaymentRequest ) p0 ).getCountry ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCountry()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
java.text.NumberFormat .getCurrencyInstance ( v0 );
(( java.text.NumberFormat ) v0 ).setMinimumFractionDigits ( v3 ); // invoke-virtual {v0, v3}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V
(( java.text.NumberFormat ) v0 ).setMaximumFractionDigits ( v3 ); // invoke-virtual {v0, v3}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V
} // .end method
public java.lang.String getCustomerKey ( ) {
/* .locals 1 */
v0 = this.f;
} // .end method
public java.lang.Boolean getDebugMode ( ) {
/* .locals 1 */
v0 = this.c;
} // .end method
public java.lang.String getLang ( ) {
/* .locals 1 */
v0 = this.h;
} // .end method
public java.lang.String getMno ( ) {
/* .locals 5 */
int v2 = 1; // const/4 v2, 0x1
int v4 = 0; // const/4 v4, 0x0
v0 = this.l;
/* if-nez v0, :cond_6 */
(( com.zong.android.engine.activities.ZongPaymentRequest ) p0 ).getCountry ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCountry()Ljava/lang/String;
final String v1 = "CA"; // const-string v1, "CA"
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.zong.android.engine.activities.ZongPaymentRequest.a;
final String v1 = "Using MNO"; // const-string v1, "Using MNO"
/* new-array v2, v2, [Ljava/lang/String; */
final String v3 = "CA - Bell Mobility - 302610"; // const-string v3, "CA - Bell Mobility - 302610"
/* aput-object v3, v2, v4 */
zongfuscated.q .a ( v0,v1,v2 );
final String v0 = "302610"; // const-string v0, "302610"
} // :goto_0
} // :cond_0
(( com.zong.android.engine.activities.ZongPaymentRequest ) p0 ).getCountry ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCountry()Ljava/lang/String;
final String v1 = "IT"; // const-string v1, "IT"
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = com.zong.android.engine.activities.ZongPaymentRequest.a;
final String v1 = "Using MNO"; // const-string v1, "Using MNO"
/* new-array v2, v2, [Ljava/lang/String; */
final String v3 = "IT - TIM - 22201"; // const-string v3, "IT - TIM - 22201"
/* aput-object v3, v2, v4 */
zongfuscated.q .a ( v0,v1,v2 );
final String v0 = "22201"; // const-string v0, "22201"
} // :cond_1
(( com.zong.android.engine.activities.ZongPaymentRequest ) p0 ).getCountry ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCountry()Ljava/lang/String;
final String v1 = "ZA"; // const-string v1, "ZA"
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = com.zong.android.engine.activities.ZongPaymentRequest.a;
final String v1 = "Using MNO"; // const-string v1, "Using MNO"
/* new-array v2, v2, [Ljava/lang/String; */
final String v3 = "ZA - Vodacom - 65501"; // const-string v3, "ZA - Vodacom - 65501"
/* aput-object v3, v2, v4 */
zongfuscated.q .a ( v0,v1,v2 );
final String v0 = "65501"; // const-string v0, "65501"
} // :cond_2
(( com.zong.android.engine.activities.ZongPaymentRequest ) p0 ).getCountry ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCountry()Ljava/lang/String;
final String v1 = "NZ"; // const-string v1, "NZ"
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = com.zong.android.engine.activities.ZongPaymentRequest.a;
final String v1 = "Using MNO"; // const-string v1, "Using MNO"
/* new-array v2, v2, [Ljava/lang/String; */
final String v3 = "NZ - Telecom NZ - 53003"; // const-string v3, "NZ - Telecom NZ - 53003"
/* aput-object v3, v2, v4 */
zongfuscated.q .a ( v0,v1,v2 );
final String v0 = "53003"; // const-string v0, "53003"
} // :cond_3
(( com.zong.android.engine.activities.ZongPaymentRequest ) p0 ).getCountry ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCountry()Ljava/lang/String;
final String v1 = "SE"; // const-string v1, "SE"
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = com.zong.android.engine.activities.ZongPaymentRequest.a;
final String v1 = "Using MNO"; // const-string v1, "Using MNO"
/* new-array v2, v2, [Ljava/lang/String; */
final String v3 = "SE - Hi3G Access AB - 24002"; // const-string v3, "SE - Hi3G Access AB - 24002"
/* aput-object v3, v2, v4 */
zongfuscated.q .a ( v0,v1,v2 );
final String v0 = "24002"; // const-string v0, "24002"
} // :cond_4
(( com.zong.android.engine.activities.ZongPaymentRequest ) p0 ).getCountry ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/activities/ZongPaymentRequest;->getCountry()Ljava/lang/String;
final String v1 = "DK"; // const-string v1, "DK"
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = com.zong.android.engine.activities.ZongPaymentRequest.a;
final String v1 = "Using MNO"; // const-string v1, "Using MNO"
/* new-array v2, v2, [Ljava/lang/String; */
final String v3 = "DK - TDC Mobil - 23801"; // const-string v3, "DK - TDC Mobil - 23801"
/* aput-object v3, v2, v4 */
zongfuscated.q .a ( v0,v1,v2 );
final String v0 = "23801"; // const-string v0, "23801"
/* goto/16 :goto_0 */
} // :cond_5
v0 = com.zong.android.engine.activities.ZongPaymentRequest.a;
final String v1 = "Dummy MNO"; // const-string v1, "Dummy MNO"
/* new-array v2, v2, [Ljava/lang/String; */
final String v3 = "0123456789"; // const-string v3, "0123456789"
/* aput-object v3, v2, v4 */
zongfuscated.q .a ( v0,v1,v2 );
final String v0 = "0123456789"; // const-string v0, "0123456789"
/* goto/16 :goto_0 */
} // :cond_6
v0 = this.l;
/* goto/16 :goto_0 */
} // .end method
public java.lang.String getPhoneNumber ( ) {
/* .locals 1 */
v0 = this.k;
} // .end method
public java.util.ArrayList getPricepointsList ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/zong/android/engine/activities/ZongPricePointsElement;", */
/* ">;" */
/* } */
} // .end annotation
v0 = this.n;
} // .end method
public java.lang.Boolean getSimulationMode ( ) {
/* .locals 1 */
v0 = this.b;
} // .end method
public java.lang.Boolean getTraceMode ( ) {
/* .locals 1 */
v0 = this.d;
} // .end method
public java.lang.String getTransactionRef ( ) {
/* .locals 1 */
v0 = this.m;
} // .end method
public java.lang.String getUrl ( ) {
/* .locals 1 */
v0 = this.g;
} // .end method
public void setAppName ( java.lang.String p0 ) {
/* .locals 0 */
this.e = p1;
return;
} // .end method
public void setCountry ( java.lang.String p0 ) {
/* .locals 0 */
this.i = p1;
return;
} // .end method
public void setCurrency ( java.lang.String p0 ) {
/* .locals 0 */
this.j = p1;
return;
} // .end method
public void setCustomerKey ( java.lang.String p0 ) {
/* .locals 0 */
this.f = p1;
return;
} // .end method
public void setDebugMode ( java.lang.Boolean p0 ) {
/* .locals 0 */
this.c = p1;
return;
} // .end method
public void setLang ( java.lang.String p0 ) {
/* .locals 0 */
this.h = p1;
return;
} // .end method
public void setMno ( java.lang.String p0 ) {
/* .locals 0 */
this.l = p1;
return;
} // .end method
public void setPhoneNumber ( java.lang.String p0 ) {
/* .locals 0 */
this.k = p1;
return;
} // .end method
public void setPricepointsList ( java.util.ArrayList p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/zong/android/engine/activities/ZongPricePointsElement;", */
/* ">;)V" */
/* } */
} // .end annotation
this.n = p1;
return;
} // .end method
public void setSimulationMode ( java.lang.Boolean p0 ) {
/* .locals 0 */
this.b = p1;
return;
} // .end method
public void setTraceMode ( java.lang.Boolean p0 ) {
/* .locals 0 */
this.d = p1;
return;
} // .end method
public void setTransactionRef ( java.lang.String p0 ) {
/* .locals 0 */
this.m = p1;
return;
} // .end method
public void setUrl ( java.lang.String p0 ) {
/* .locals 0 */
this.g = p1;
return;
} // .end method
public final java.lang.String toString ( ) {
/* .locals 5 */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v0 = "\n"; // const-string v0, "\n"
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "simulationMode: "; // const-string v0, "simulationMode: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.b;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "debugMode: "; // const-string v0, "debugMode: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "traceMode: "; // const-string v0, "traceMode: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.d;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "appName: "; // const-string v0, "appName: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.e;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "customerKey: "; // const-string v0, "customerKey: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.f;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "url: "; // const-string v0, "url: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.g;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "lang: "; // const-string v0, "lang: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.h;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "country: "; // const-string v0, "country: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.i;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "currency: "; // const-string v0, "currency: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.j;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "phoneNumber: "; // const-string v0, "phoneNumber: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.k;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "mno: "; // const-string v0, "mno: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.l;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "transactionRef: "; // const-string v0, "transactionRef: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.m;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v0 = "Price Point List: "; // const-string v0, "Price Point List: "
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "\n"; // const-string v2, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.n;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_0
/* if-nez v0, :cond_0 */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
/* check-cast v0, Lcom/zong/android/engine/activities/ZongPricePointsElement; */
final String v3 = "---------"; // const-string v3, "---------"
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\n"; // const-string v4, "\n"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.zong.android.engine.activities.ZongPricePointsElement ) v0 ).toString ( ); // invoke-virtual {v0}, Lcom/zong/android/engine/activities/ZongPricePointsElement;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "\n"; // const-string v3, "\n"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // .end method
public void writeToParcel ( android.os.Parcel p0, Integer p1 ) {
/* .locals 2 */
v0 = this.b;
(( java.lang.Boolean ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.c;
(( java.lang.Boolean ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.d;
(( java.lang.Boolean ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.e;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.f;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.g;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.h;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.i;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.j;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.k;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.l;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.m;
(( android.os.Parcel ) p1 ).writeString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V
v0 = this.n;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
(( android.os.Parcel ) p1 ).writeInt ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V
v1 = this.n;
/* new-array v0, v0, [Lcom/zong/android/engine/activities/ZongPricePointsElement; */
(( java.util.ArrayList ) v1 ).toArray ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* check-cast v0, [Lcom/zong/android/engine/activities/ZongPricePointsElement; */
(( android.os.Parcel ) p1 ).writeTypedArray ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeTypedArray([Landroid/os/Parcelable;I)V
return;
} // .end method
