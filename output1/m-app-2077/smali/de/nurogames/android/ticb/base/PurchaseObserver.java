public abstract class de.nurogames.android.ticb.base.PurchaseObserver {
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
	 static de.nurogames.android.ticb.base.PurchaseObserver ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 35 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* new-array v0, v0, [Ljava/lang/Class; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 36 */
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
		 /* .line 35 */
		 /* .line 37 */
		 return;
	 } // .end method
	 public de.nurogames.android.ticb.base.PurchaseObserver ( ) {
		 /* .locals 1 */
		 /* .param p1, "activity" # Landroid/app/Activity; */
		 /* .param p2, "handler" # Landroid/os/Handler; */
		 /* .prologue */
		 /* .line 39 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 34 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* new-array v0, v0, [Ljava/lang/Object; */
		 this.mStartIntentSenderArgs = v0;
		 /* .line 40 */
		 this.mActivity = p1;
		 /* .line 41 */
		 this.mHandler = p2;
		 /* .line 42 */
		 /* invoke-direct {p0}, Lde/nurogames/android/ticb/base/PurchaseObserver;->initCompatibilityLayer()V */
		 /* .line 43 */
		 return;
	 } // .end method
	 private void initCompatibilityLayer ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 106 */
		 try { // :try_start_0
			 v1 = this.mActivity;
			 (( java.lang.Object ) v1 ).getClass ( ); // invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
			 final String v2 = "startIntentSender"; // const-string v2, "startIntentSender"
			 /* .line 107 */
			 v3 = de.nurogames.android.ticb.base.PurchaseObserver.START_INTENT_SENDER_SIG;
			 /* .line 106 */
			 (( java.lang.Class ) v1 ).getMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 this.mStartIntentSender = v1;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .line 113 */
		 } // :goto_0
		 return;
		 /* .line 108 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 109 */
		 /* .local v0, "e":Ljava/lang/SecurityException; */
		 this.mStartIntentSender = v4;
		 /* .line 110 */
	 } // .end local v0 # "e":Ljava/lang/SecurityException;
	 /* :catch_1 */
	 /* move-exception v0 */
	 /* .line 111 */
	 /* .local v0, "e":Ljava/lang/NoSuchMethodException; */
	 this.mStartIntentSender = v4;
} // .end method
/* # virtual methods */
public abstract void onBillingSupported ( Boolean p0, java.lang.String p1 ) {
} // .end method
public abstract void onPurchaseStateChange ( de.nurogames.android.ticb.base.Consts$PurchaseState p0, java.lang.String p1, Integer p2, Long p3, java.lang.String p4 ) {
} // .end method
public abstract void onRequestPurchaseResponse ( de.nurogames.android.ticb.base.BillingService$RequestPurchase p0, de.nurogames.android.ticb.base.Consts$ResponseCode p1 ) {
} // .end method
public abstract void onRestoreTransactionsResponse ( de.nurogames.android.ticb.base.BillingService$RestoreTransactions p0, de.nurogames.android.ticb.base.Consts$ResponseCode p1 ) {
} // .end method
void postPurchaseStateChange ( de.nurogames.android.ticb.base.Consts$PurchaseState p0, java.lang.String p1, Integer p2, Long p3, java.lang.String p4 ) {
	 /* .locals 9 */
	 /* .param p1, "purchaseState" # Lde/nurogames/android/ticb/base/Consts$PurchaseState; */
	 /* .param p2, "itemId" # Ljava/lang/String; */
	 /* .param p3, "quantity" # I */
	 /* .param p4, "purchaseTime" # J */
	 /* .param p6, "developerPayload" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 154 */
	 v8 = this.mHandler;
	 /* new-instance v0, Lde/nurogames/android/ticb/base/PurchaseObserver$1; */
	 /* move-object v1, p0 */
	 /* move-object v2, p1 */
	 /* move-object v3, p2 */
	 /* move v4, p3 */
	 /* move-wide v5, p4 */
	 /* move-object v7, p6 */
	 /* invoke-direct/range {v0 ..v7}, Lde/nurogames/android/ticb/base/PurchaseObserver$1;-><init>(Lde/nurogames/android/ticb/base/PurchaseObserver;Lde/nurogames/android/ticb/base/Consts$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V */
	 (( android.os.Handler ) v8 ).post ( v0 ); // invoke-virtual {v8, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
	 /* .line 161 */
	 return;
} // .end method
void startBuyPageActivity ( android.app.PendingIntent p0, android.content.Intent p1 ) {
	 /* .locals 4 */
	 /* .param p1, "pendingIntent" # Landroid/app/PendingIntent; */
	 /* .param p2, "intent" # Landroid/content/Intent; */
	 /* .prologue */
	 /* .line 116 */
	 v1 = this.mStartIntentSender;
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 123 */
		 try { // :try_start_0
			 v1 = this.mStartIntentSenderArgs;
			 int v2 = 0; // const/4 v2, 0x0
			 (( android.app.PendingIntent ) p1 ).getIntentSender ( ); // invoke-virtual {p1}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;
			 /* aput-object v3, v1, v2 */
			 /* .line 124 */
			 v1 = this.mStartIntentSenderArgs;
			 int v2 = 1; // const/4 v2, 0x1
			 /* aput-object p2, v1, v2 */
			 /* .line 125 */
			 v1 = this.mStartIntentSenderArgs;
			 int v2 = 2; // const/4 v2, 0x2
			 int v3 = 0; // const/4 v3, 0x0
			 java.lang.Integer .valueOf ( v3 );
			 /* aput-object v3, v1, v2 */
			 /* .line 126 */
			 v1 = this.mStartIntentSenderArgs;
			 int v2 = 3; // const/4 v2, 0x3
			 int v3 = 0; // const/4 v3, 0x0
			 java.lang.Integer .valueOf ( v3 );
			 /* aput-object v3, v1, v2 */
			 /* .line 127 */
			 v1 = this.mStartIntentSenderArgs;
			 int v2 = 4; // const/4 v2, 0x4
			 int v3 = 0; // const/4 v3, 0x0
			 java.lang.Integer .valueOf ( v3 );
			 /* aput-object v3, v1, v2 */
			 /* .line 128 */
			 v1 = this.mStartIntentSender;
			 v2 = this.mActivity;
			 v3 = this.mStartIntentSenderArgs;
			 (( java.lang.reflect.Method ) v1 ).invoke ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 142 */
		 } // :goto_0
		 return;
		 /* .line 129 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 130 */
		 /* .local v0, "e":Ljava/lang/Exception; */
		 final String v1 = "PurchaseObserver"; // const-string v1, "PurchaseObserver"
		 final String v2 = "error starting activity"; // const-string v2, "error starting activity"
		 android.util.Log .e ( v1,v2,v0 );
		 /* .line 137 */
	 } // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_0
try { // :try_start_1
	 v1 = this.mActivity;
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.app.PendingIntent ) p1 ).send ( v1, v2, p2 ); // invoke-virtual {p1, v1, v2, p2}, Landroid/app/PendingIntent;->send(Landroid/content/Context;ILandroid/content/Intent;)V
	 /* :try_end_1 */
	 /* .catch Landroid/app/PendingIntent$CanceledException; {:try_start_1 ..:try_end_1} :catch_1 */
	 /* .line 138 */
	 /* :catch_1 */
	 /* move-exception v0 */
	 /* .line 139 */
	 /* .local v0, "e":Landroid/app/PendingIntent$CanceledException; */
	 final String v1 = "PurchaseObserver"; // const-string v1, "PurchaseObserver"
	 final String v2 = "error starting activity"; // const-string v2, "error starting activity"
	 android.util.Log .e ( v1,v2,v0 );
} // .end method
