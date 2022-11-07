public abstract class com.nobleempire.GunDisassembly2.PurchaseObserver {
	 /* .source "PurchaseObserver.java" */
	 /* # static fields */
	 private static final java.lang.Class START_INTENT_SENDER_SIG;
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private final android.app.Activity mActivity;
	 private final android.os.Handler mHandler;
	 private java.lang.reflect.Method mStartIntentSender;
	 private java.lang.Object mStartIntentSenderArgs;
	 /* # direct methods */
	 static com.nobleempire.GunDisassembly2.PurchaseObserver ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 27 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* new-array v0, v0, [Ljava/lang/Class; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* const-class v2, Landroid/content/IntentSender; */
		 /* aput-object v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* const-class v2, Landroid/content/Intent; */
		 /* aput-object v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 v2 = java.lang.Integer.TYPE;
		 /* aput-object v2, v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 v2 = java.lang.Integer.TYPE;
		 /* aput-object v2, v0, v1 */
		 int v1 = 4; // const/4 v1, 0x4
		 v2 = java.lang.Integer.TYPE;
		 /* aput-object v2, v0, v1 */
		 /* .line 21 */
		 return;
	 } // .end method
	 public com.nobleempire.GunDisassembly2.PurchaseObserver ( ) {
		 /* .locals 1 */
		 /* .param p1, "activity" # Landroid/app/Activity; */
		 /* .param p2, "handler" # Landroid/os/Handler; */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 26 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 this.mStartIntentSenderArgs = v0;
		 /* .line 30 */
		 this.mActivity = p1;
		 /* .line 31 */
		 this.mHandler = p2;
		 /* .line 32 */
		 /* invoke-direct {p0}, Lcom/nobleempire/GunDisassembly2/PurchaseObserver;->initCompatibilityLayer()V */
		 /* .line 33 */
		 return;
	 } // .end method
	 private void initCompatibilityLayer ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 64 */
		 try { // :try_start_0
			 v1 = this.mActivity;
			 (( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
			 final String v2 = "startIntentSender"; // const-string v2, "startIntentSender"
			 v3 = com.nobleempire.GunDisassembly2.PurchaseObserver.START_INTENT_SENDER_SIG;
			 (( java.lang.Class ) v1 ).getMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 this.mStartIntentSender = v1;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .line 70 */
		 } // :goto_0
		 return;
		 /* .line 65 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 66 */
		 /* .local v0, "e":Ljava/lang/SecurityException; */
		 this.mStartIntentSender = v4;
		 /* .line 67 */
	 } // .end local v0 # "e":Ljava/lang/SecurityException;
	 /* :catch_1 */
	 /* move-exception v0 */
	 /* .line 68 */
	 /* .local v0, "e":Ljava/lang/NoSuchMethodException; */
	 this.mStartIntentSender = v4;
} // .end method
/* # virtual methods */
public abstract void onBillingSupported ( Boolean p0 ) {
} // .end method
public abstract void onPurchaseStateChange ( com.nobleempire.GunDisassembly2.Consts$PurchaseState p0, java.lang.String p1, Integer p2, Long p3, java.lang.String p4 ) {
} // .end method
public abstract void onRequestPurchaseResponse ( com.nobleempire.GunDisassembly2.BillingService$RequestPurchase p0, com.nobleempire.GunDisassembly2.Consts$ResponseCode p1 ) {
} // .end method
public abstract void onRestoreTransactionsResponse ( com.nobleempire.GunDisassembly2.BillingService$RestoreTransactions p0, com.nobleempire.GunDisassembly2.Consts$ResponseCode p1 ) {
} // .end method
void postPurchaseStateChange ( com.nobleempire.GunDisassembly2.Consts$PurchaseState p0, java.lang.String p1, Integer p2, Long p3, java.lang.String p4 ) {
	 /* .locals 9 */
	 /* .param p1, "purchaseState" # Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
	 /* .param p2, "itemId" # Ljava/lang/String; */
	 /* .param p3, "quantity" # I */
	 /* .param p4, "purchaseTime" # J */
	 /* .param p6, "developerPayload" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 101 */
	 v8 = this.mHandler;
	 /* new-instance v0, Lcom/nobleempire/GunDisassembly2/PurchaseObserver$1; */
	 /* move-object v1, p0 */
	 /* move-object v2, p1 */
	 /* move-object v3, p2 */
	 /* move v4, p3 */
	 /* move-wide v5, p4 */
	 /* move-object v7, p6 */
	 /* invoke-direct/range {v0 ..v7}, Lcom/nobleempire/GunDisassembly2/PurchaseObserver$1;-><init>(Lcom/nobleempire/GunDisassembly2/PurchaseObserver;Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V */
	 (( android.os.Handler ) v8 ).post ( v0 ); // invoke-virtual {v8, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
	 /* .line 106 */
	 return;
} // .end method
void startBuyPageActivity ( android.app.PendingIntent p0, android.content.Intent p1 ) {
	 /* .locals 3 */
	 /* .param p1, "pendingIntent" # Landroid/app/PendingIntent; */
	 /* .param p2, "intent" # Landroid/content/Intent; */
	 /* .prologue */
	 /* .line 73 */
	 v0 = this.mStartIntentSender;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 77 */
		 try { // :try_start_0
			 v0 = this.mStartIntentSenderArgs;
			 int v1 = 0; // const/4 v1, 0x0
			 (( android.app.PendingIntent ) p1 ).getIntentSender ( ); // invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;
			 /* aput-object v2, v0, v1 */
			 /* .line 78 */
			 v0 = this.mStartIntentSenderArgs;
			 int v1 = 1; // const/4 v1, 0x1
			 /* aput-object p2, v0, v1 */
			 /* .line 79 */
			 v0 = this.mStartIntentSenderArgs;
			 int v1 = 2; // const/4 v1, 0x2
			 int v2 = 0; // const/4 v2, 0x0
			 java.lang.Integer .valueOf ( v2 );
			 /* aput-object v2, v0, v1 */
			 /* .line 80 */
			 v0 = this.mStartIntentSenderArgs;
			 int v1 = 3; // const/4 v1, 0x3
			 int v2 = 0; // const/4 v2, 0x0
			 java.lang.Integer .valueOf ( v2 );
			 /* aput-object v2, v0, v1 */
			 /* .line 81 */
			 v0 = this.mStartIntentSenderArgs;
			 int v1 = 4; // const/4 v1, 0x4
			 int v2 = 0; // const/4 v2, 0x0
			 java.lang.Integer .valueOf ( v2 );
			 /* aput-object v2, v0, v1 */
			 /* .line 82 */
			 v0 = this.mStartIntentSender;
			 v1 = this.mActivity;
			 v2 = this.mStartIntentSenderArgs;
			 (( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .line 94 */
		 } // :goto_0
		 return;
		 /* .line 89 */
	 } // :cond_0
	 try { // :try_start_1
		 v0 = this.mActivity;
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.app.PendingIntent ) p1 ).send ( v0, v1, p2 ); // invoke-virtual {p1, v0, v1, p2}, Landroid/app/PendingIntent;->send(Landroid/content/Context;ILandroid/content/Intent;)V
		 /* :try_end_1 */
		 /* .catch Landroid/app/PendingIntent$CanceledException; {:try_start_1 ..:try_end_1} :catch_0 */
		 /* .line 90 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 83 */
		 /* :catch_1 */
		 /* move-exception v0 */
	 } // .end method
