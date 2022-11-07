class com.ansca.corona.Controller$23 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->openFeintInit(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final java.lang.String val$appId; //synthetic
final java.lang.String val$appKey; //synthetic
final java.lang.String val$appName; //synthetic
final java.lang.String val$appSecret; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$23 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1384 */
this.this$0 = p1;
this.val$appName = p2;
this.val$appKey = p3;
this.val$appSecret = p4;
this.val$appId = p5;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 6 */
/* .prologue */
/* .line 1386 */
/* monitor-enter p0 */
/* .line 1387 */
try { // :try_start_0
	 /* new-instance v5, Ljava/util/HashMap; */
	 /* invoke-direct {v5}, Ljava/util/HashMap;-><init>()V */
	 /* .line 1388 */
	 /* .local v5, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
	 final String v1 = "SettingCloudStorageCompressionStrategy"; // const-string v1, "SettingCloudStorageCompressionStrategy"
	 final String v2 = "CloudStorageCompressionStrategyDefault"; // const-string v2, "CloudStorageCompressionStrategyDefault"
	 /* .line 1389 */
	 /* new-instance v0, Lcom/openfeint/api/OpenFeintSettings; */
	 v1 = this.val$appName;
	 v2 = this.val$appKey;
	 v3 = this.val$appSecret;
	 v4 = this.val$appId;
	 /* invoke-direct/range {v0 ..v5}, Lcom/openfeint/api/OpenFeintSettings;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V */
	 /* .line 1390 */
	 /* .local v0, "settings":Lcom/openfeint/api/OpenFeintSettings; */
	 v1 = this.this$0;
	 com.ansca.corona.Controller .access$300 ( v1 );
	 /* new-instance v2, Lcom/ansca/corona/Controller$23$1; */
	 /* invoke-direct {v2, p0}, Lcom/ansca/corona/Controller$23$1;-><init>(Lcom/ansca/corona/Controller$23;)V */
	 com.openfeint.api.OpenFeint .initialize ( v1,v0,v2 );
	 /* .line 1391 */
	 v1 = this.this$0;
	 int v2 = 1; // const/4 v2, 0x1
	 com.ansca.corona.Controller .access$702 ( v1,v2 );
	 /* .line 1392 */
	 /* monitor-exit p0 */
	 /* .line 1393 */
	 return;
	 /* .line 1392 */
} // .end local v0 # "settings":Lcom/openfeint/api/OpenFeintSettings;
} // .end local v5 # "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;"
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
