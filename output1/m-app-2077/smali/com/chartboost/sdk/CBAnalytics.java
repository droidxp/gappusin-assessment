public class com.chartboost.sdk.CBAnalytics {
	 /* .source "CBAnalytics.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/chartboost/sdk/CBAnalytics$TransactionConnection; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String TAG;
private static com.chartboost.sdk.CBAnalytics sharedAnalytics;
/* # instance fields */
private android.app.Activity activity;
private android.content.Context context;
/* # direct methods */
static com.chartboost.sdk.CBAnalytics ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 14 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 12 */
	 return;
} // .end method
private com.chartboost.sdk.CBAnalytics ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 28 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 30 */
	 return;
} // .end method
public static synchronized com.chartboost.sdk.CBAnalytics getSharedAnalytics ( android.app.Activity p0 ) {
	 /* .locals 2 */
	 /* .param p0, "activity" # Landroid/app/Activity; */
	 /* .prologue */
	 /* .line 21 */
	 /* const-class v1, Lcom/chartboost/sdk/CBAnalytics; */
	 /* monitor-enter v1 */
	 try { // :try_start_0
		 v0 = com.chartboost.sdk.CBAnalytics.sharedAnalytics;
		 /* if-nez v0, :cond_0 */
		 /* .line 22 */
		 /* new-instance v0, Lcom/chartboost/sdk/CBAnalytics; */
		 /* invoke-direct {v0}, Lcom/chartboost/sdk/CBAnalytics;-><init>()V */
		 /* .line 23 */
	 } // :cond_0
	 v0 = com.chartboost.sdk.CBAnalytics.sharedAnalytics;
	 this.context = p0;
	 /* .line 24 */
	 v0 = com.chartboost.sdk.CBAnalytics.sharedAnalytics;
	 this.activity = p0;
	 /* .line 25 */
	 v0 = com.chartboost.sdk.CBAnalytics.sharedAnalytics;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit v1 */
	 /* .line 21 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit v1 */
	 /* throw v0 */
} // .end method
private java.lang.String round ( Double p0, Integer p1, Integer p2 ) {
	 /* .locals 5 */
	 /* .param p1, "unrounded" # D */
	 /* .param p3, "precision" # I */
	 /* .param p4, "roundingMode" # I */
	 /* .prologue */
	 /* .line 52 */
	 /* new-instance v0, Ljava/math/BigDecimal; */
	 /* invoke-direct {v0, p1, p2}, Ljava/math/BigDecimal;-><init>(D)V */
	 /* .line 53 */
	 /* .local v0, "bd":Ljava/math/BigDecimal; */
	 (( java.math.BigDecimal ) v0 ).setScale ( p3, p4 ); // invoke-virtual {v0, p3, p4}, Ljava/math/BigDecimal;->setScale(II)Ljava/math/BigDecimal;
	 /* .line 54 */
	 /* .local v1, "rounded":Ljava/math/BigDecimal; */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 (( java.math.BigDecimal ) v1 ).doubleValue ( ); // invoke-virtual {v1}, Ljava/math/BigDecimal;->doubleValue()D
	 /* move-result-wide v3 */
	 java.lang.String .valueOf ( v3,v4 );
	 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public java.lang.Boolean recordPaymentTransaction ( java.lang.String p0, java.lang.String p1, Double p2, java.lang.String p3, Integer p4, java.util.Map p5 ) {
	 /* .locals 11 */
	 /* .param p1, "sku" # Ljava/lang/String; */
	 /* .param p2, "title" # Ljava/lang/String; */
	 /* .param p3, "price" # D */
	 /* .param p5, "currency" # Ljava/lang/String; */
	 /* .param p6, "quantity" # I */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* "D", */
	 /* "Ljava/lang/String;", */
	 /* "I", */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Object;", */
	 /* ">;)", */
	 /* "Ljava/lang/Boolean;" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 60 */
/* .local p7, "meta":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
try { // :try_start_0
	 v5 = this.activity;
	 com.chartboost.sdk.ChartBoost .getSharedChartBoost ( v5 );
	 /* .line 61 */
	 /* .local v1, "cb":Lcom/chartboost/sdk/ChartBoost; */
	 (( com.chartboost.sdk.ChartBoost ) v1 ).getAppId ( ); // invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getAppId()Ljava/lang/String;
	 if ( v5 != null) { // if-eqz v5, :cond_0
		 (( com.chartboost.sdk.ChartBoost ) v1 ).getAppSignature ( ); // invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getAppSignature()Ljava/lang/String;
		 /* if-nez v5, :cond_1 */
		 /* .line 62 */
	 } // :cond_0
	 int v5 = 0; // const/4 v5, 0x0
	 java.lang.Boolean .valueOf ( v5 );
	 /* .line 86 */
} // .end local v1 # "cb":Lcom/chartboost/sdk/ChartBoost;
} // :goto_0
/* .line 64 */
/* .restart local v1 # "cb":Lcom/chartboost/sdk/ChartBoost; */
} // :cond_1
/* new-instance v3, Lcom/chartboost/sdk/CBAPIRequest; */
v5 = this.activity;
final String v6 = "api"; // const-string v6, "api"
final String v7 = "purchase"; // const-string v7, "purchase"
/* invoke-direct {v3, v5, v6, v7}, Lcom/chartboost/sdk/CBAPIRequest;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 65 */
/* .local v3, "request":Lcom/chartboost/sdk/CBAPIRequest; */
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendDeviceInfoParams ( ); // invoke-virtual {v3}, Lcom/chartboost/sdk/CBAPIRequest;->appendDeviceInfoParams()V
/* .line 66 */
final String v5 = "product_id"; // const-string v5, "product_id"
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendBodyArgument ( v5, p1 ); // invoke-virtual {v3, v5, p1}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 67 */
final String v5 = "title"; // const-string v5, "title"
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendBodyArgument ( v5, p2 ); // invoke-virtual {v3, v5, p2}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 68 */
final String v5 = "price"; // const-string v5, "price"
int v6 = 2; // const/4 v6, 0x2
int v7 = 4; // const/4 v7, 0x4
/* invoke-direct {p0, p3, p4, v6, v7}, Lcom/chartboost/sdk/CBAnalytics;->round(DII)Ljava/lang/String; */
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendBodyArgument ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 69 */
final String v5 = "currency"; // const-string v5, "currency"
/* move-object/from16 v0, p5 */
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendBodyArgument ( v5, v0 ); // invoke-virtual {v3, v5, v0}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 70 */
final String v5 = "quantity"; // const-string v5, "quantity"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-static/range {p6 ..p6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String; */
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendBodyArgument ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 71 */
final String v5 = "timestamp"; // const-string v5, "timestamp"
/* new-instance v6, Ljava/lang/StringBuilder; */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v7 */
/* long-to-double v7, v7 */
/* const-wide v9, 0x408f400000000000L # 1000.0 */
/* div-double/2addr v7, v9 */
java.lang.String .valueOf ( v7,v8 );
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendBodyArgument ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 73 */
if ( p7 != null) { // if-eqz p7, :cond_2
/* .line 75 */
/* new-instance v2, Lorg/json/JSONObject; */
/* move-object/from16 v0, p7 */
/* invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V */
/* .line 76 */
/* .local v2, "jsonObj":Lorg/json/JSONObject; */
final String v5 = "meta"; // const-string v5, "meta"
(( org.json.JSONObject ) v2 ).toString ( ); // invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v3 ).appendBodyArgument ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 79 */
} // .end local v2 # "jsonObj":Lorg/json/JSONObject;
} // :cond_2
(( com.chartboost.sdk.ChartBoost ) v1 ).getAppId ( ); // invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getAppId()Ljava/lang/String;
(( com.chartboost.sdk.ChartBoost ) v1 ).getAppSignature ( ); // invoke-virtual {v1}, Lcom/chartboost/sdk/ChartBoost;->getAppSignature()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v3 ).sign ( v5, v6 ); // invoke-virtual {v3, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;->sign(Ljava/lang/String;Ljava/lang/String;)V
/* .line 81 */
/* new-instance v4, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection; */
v5 = this.context;
/* invoke-direct {v4, p0, v5}, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;-><init>(Lcom/chartboost/sdk/CBAnalytics;Landroid/content/Context;)V */
/* .line 82 */
/* .local v4, "tc":Lcom/chartboost/sdk/CBAnalytics$TransactionConnection; */
int v5 = 1; // const/4 v5, 0x1
/* new-array v5, v5, [Lcom/chartboost/sdk/CBAPIRequest; */
int v6 = 0; // const/4 v6, 0x0
/* aput-object v3, v5, v6 */
(( com.chartboost.sdk.CBAnalytics$TransactionConnection ) v4 ).execute ( v5 ); // invoke-virtual {v4, v5}, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 86 */
} // .end local v1 # "cb":Lcom/chartboost/sdk/ChartBoost;
} // .end local v3 # "request":Lcom/chartboost/sdk/CBAPIRequest;
} // .end local v4 # "tc":Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;
} // :goto_1
int v5 = 1; // const/4 v5, 0x1
java.lang.Boolean .valueOf ( v5 );
/* goto/16 :goto_0 */
/* .line 83 */
/* :catch_0 */
/* move-exception v5 */
} // .end method
public java.lang.Boolean trackEvent ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "eventIdentifier" # Ljava/lang/String; */
/* .prologue */
/* .line 91 */
/* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
int v2 = 0; // const/4 v2, 0x0
(( com.chartboost.sdk.CBAnalytics ) p0 ).trackEvent ( p1, v0, v1, v2 ); // invoke-virtual {p0, p1, v0, v1, v2}, Lcom/chartboost/sdk/CBAnalytics;->trackEvent(Ljava/lang/String;DLjava/util/Map;)Ljava/lang/Boolean;
/* .line 92 */
int v0 = 1; // const/4 v0, 0x1
java.lang.Boolean .valueOf ( v0 );
} // .end method
public java.lang.Boolean trackEvent ( java.lang.String p0, Double p1 ) {
/* .locals 1 */
/* .param p1, "eventIdentifier" # Ljava/lang/String; */
/* .param p2, "value" # D */
/* .prologue */
/* .line 97 */
int v0 = 0; // const/4 v0, 0x0
(( com.chartboost.sdk.CBAnalytics ) p0 ).trackEvent ( p1, p2, p3, v0 ); // invoke-virtual {p0, p1, p2, p3, v0}, Lcom/chartboost/sdk/CBAnalytics;->trackEvent(Ljava/lang/String;DLjava/util/Map;)Ljava/lang/Boolean;
/* .line 98 */
int v0 = 1; // const/4 v0, 0x1
java.lang.Boolean .valueOf ( v0 );
} // .end method
public java.lang.Boolean trackEvent ( java.lang.String p0, Double p1, java.util.Map p2 ) {
/* .locals 11 */
/* .param p1, "eventIdentifier" # Ljava/lang/String; */
/* .param p2, "value" # D */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "D", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Ljava/lang/Boolean;" */
/* } */
} // .end annotation
/* .prologue */
/* .local p4, "meta":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
int v10 = 1; // const/4 v10, 0x1
/* .line 104 */
try { // :try_start_0
v4 = this.activity;
com.chartboost.sdk.ChartBoost .getSharedChartBoost ( v4 );
/* .line 105 */
/* .local v0, "cb":Lcom/chartboost/sdk/ChartBoost; */
(( com.chartboost.sdk.ChartBoost ) v0 ).getAppId ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->getAppId()Ljava/lang/String;
if ( v4 != null) { // if-eqz v4, :cond_0
(( com.chartboost.sdk.ChartBoost ) v0 ).getAppSignature ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->getAppSignature()Ljava/lang/String;
/* if-nez v4, :cond_1 */
/* .line 106 */
} // :cond_0
int v4 = 0; // const/4 v4, 0x0
java.lang.Boolean .valueOf ( v4 );
/* .line 127 */
} // .end local v0 # "cb":Lcom/chartboost/sdk/ChartBoost;
} // :goto_0
/* .line 108 */
/* .restart local v0 # "cb":Lcom/chartboost/sdk/ChartBoost; */
} // :cond_1
/* new-instance v2, Lcom/chartboost/sdk/CBAPIRequest; */
v4 = this.activity;
final String v5 = "api"; // const-string v5, "api"
final String v6 = "event"; // const-string v6, "event"
/* invoke-direct {v2, v4, v5, v6}, Lcom/chartboost/sdk/CBAPIRequest;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 109 */
/* .local v2, "request":Lcom/chartboost/sdk/CBAPIRequest; */
(( com.chartboost.sdk.CBAPIRequest ) v2 ).appendDeviceInfoParams ( ); // invoke-virtual {v2}, Lcom/chartboost/sdk/CBAPIRequest;->appendDeviceInfoParams()V
/* .line 110 */
final String v4 = "key"; // const-string v4, "key"
(( com.chartboost.sdk.CBAPIRequest ) v2 ).appendBodyArgument ( v4, p1 ); // invoke-virtual {v2, v4, p1}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 111 */
final String v4 = "value"; // const-string v4, "value"
/* new-instance v5, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p2,p3 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v2 ).appendBodyArgument ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 112 */
final String v4 = "timestamp"; // const-string v4, "timestamp"
/* new-instance v5, Ljava/lang/StringBuilder; */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v6 */
/* long-to-double v6, v6 */
/* const-wide v8, 0x408f400000000000L # 1000.0 */
/* div-double/2addr v6, v8 */
java.lang.String .valueOf ( v6,v7 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v2 ).appendBodyArgument ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 114 */
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 116 */
/* new-instance v1, Lorg/json/JSONObject; */
/* invoke-direct {v1, p4}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V */
/* .line 117 */
/* .local v1, "jsonObj":Lorg/json/JSONObject; */
final String v4 = "meta"; // const-string v4, "meta"
(( org.json.JSONObject ) v1 ).toString ( ); // invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v2 ).appendBodyArgument ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 120 */
} // .end local v1 # "jsonObj":Lorg/json/JSONObject;
} // :cond_2
(( com.chartboost.sdk.ChartBoost ) v0 ).getAppId ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->getAppId()Ljava/lang/String;
(( com.chartboost.sdk.ChartBoost ) v0 ).getAppSignature ( ); // invoke-virtual {v0}, Lcom/chartboost/sdk/ChartBoost;->getAppSignature()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) v2 ).sign ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lcom/chartboost/sdk/CBAPIRequest;->sign(Ljava/lang/String;Ljava/lang/String;)V
/* .line 122 */
/* new-instance v3, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection; */
v4 = this.context;
/* invoke-direct {v3, p0, v4}, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;-><init>(Lcom/chartboost/sdk/CBAnalytics;Landroid/content/Context;)V */
/* .line 123 */
/* .local v3, "tc":Lcom/chartboost/sdk/CBAnalytics$TransactionConnection; */
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Lcom/chartboost/sdk/CBAPIRequest; */
int v5 = 0; // const/4 v5, 0x0
/* aput-object v2, v4, v5 */
(( com.chartboost.sdk.CBAnalytics$TransactionConnection ) v3 ).execute ( v4 ); // invoke-virtual {v3, v4}, Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 127 */
} // .end local v0 # "cb":Lcom/chartboost/sdk/ChartBoost;
} // .end local v2 # "request":Lcom/chartboost/sdk/CBAPIRequest;
} // .end local v3 # "tc":Lcom/chartboost/sdk/CBAnalytics$TransactionConnection;
} // :goto_1
java.lang.Boolean .valueOf ( v10 );
/* .line 124 */
/* :catch_0 */
/* move-exception v4 */
} // .end method
