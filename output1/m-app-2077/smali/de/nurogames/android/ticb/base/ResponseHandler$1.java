class de.nurogames.android.ticb.base.ResponseHandler$1 implements java.lang.Runnable {
	 /* .source "ResponseHandler.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/ResponseHandler;->purchaseResponse(Landroid/content/Context;Lde/nurogames/android/ticb/base/Consts$PurchaseState;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private final android.content.Context val$context; //synthetic
private final java.lang.String val$developerPayload; //synthetic
private final java.lang.String val$orderId; //synthetic
private final java.lang.String val$productId; //synthetic
private final de.nurogames.android.ticb.base.Consts$PurchaseState val$purchaseState; //synthetic
private final Long val$purchaseTime; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.ResponseHandler$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.val$context = p1;
this.val$orderId = p2;
this.val$productId = p3;
this.val$purchaseState = p4;
/* iput-wide p5, p0, Lde/nurogames/android/ticb/base/ResponseHandler$1;->val$purchaseTime:J */
this.val$developerPayload = p7;
/* .line 112 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 9 */
/* .prologue */
/* .line 115 */
/* new-instance v0, Lde/nurogames/android/ticb/base/PurchaseDatabase; */
v1 = this.val$context;
/* invoke-direct {v0, v1}, Lde/nurogames/android/ticb/base/PurchaseDatabase;-><init>(Landroid/content/Context;)V */
/* .line 117 */
/* .local v0, "db":Lde/nurogames/android/ticb/base/PurchaseDatabase; */
v1 = this.val$orderId;
v2 = this.val$productId;
v3 = this.val$purchaseState;
/* iget-wide v4, p0, Lde/nurogames/android/ticb/base/ResponseHandler$1;->val$purchaseTime:J */
v6 = this.val$developerPayload;
/* .line 116 */
v4 = /* invoke-virtual/range {v0 ..v6}, Lde/nurogames/android/ticb/base/PurchaseDatabase;->updatePurchase(Ljava/lang/String;Ljava/lang/String;Lde/nurogames/android/ticb/base/Consts$PurchaseState;JLjava/lang/String;)I */
/* .line 118 */
/* .local v4, "quantity":I */
(( de.nurogames.android.ticb.base.PurchaseDatabase ) v0 ).close ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/PurchaseDatabase;->close()V
/* .line 122 */
/* const-class v8, Lde/nurogames/android/ticb/base/ResponseHandler; */
/* monitor-enter v8 */
/* .line 123 */
try { // :try_start_0
	 de.nurogames.android.ticb.base.ResponseHandler .access$0 ( );
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 124 */
		 de.nurogames.android.ticb.base.ResponseHandler .access$0 ( );
		 /* .line 125 */
		 v2 = this.val$purchaseState;
		 v3 = this.val$productId;
		 /* iget-wide v5, p0, Lde/nurogames/android/ticb/base/ResponseHandler$1;->val$purchaseTime:J */
		 v7 = this.val$developerPayload;
		 /* .line 124 */
		 /* invoke-virtual/range {v1 ..v7}, Lde/nurogames/android/ticb/base/PurchaseObserver;->postPurchaseStateChange(Lde/nurogames/android/ticb/base/Consts$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V */
		 /* .line 122 */
	 } // :cond_0
	 /* monitor-exit v8 */
	 /* .line 128 */
	 return;
	 /* .line 122 */
	 /* :catchall_0 */
	 /* move-exception v1 */
	 /* monitor-exit v8 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v1 */
} // .end method
