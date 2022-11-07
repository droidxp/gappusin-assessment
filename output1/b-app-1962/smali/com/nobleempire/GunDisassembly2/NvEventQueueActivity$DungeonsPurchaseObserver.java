class com.nobleempire.GunDisassembly2.NvEventQueueActivity$DungeonsPurchaseObserver extends com.nobleempire.GunDisassembly2.PurchaseObserver {
	 /* .source "NvEventQueueActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/nobleempire/GunDisassembly2/NvEventQueueActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "DungeonsPurchaseObserver" */
} // .end annotation
/* # instance fields */
final com.nobleempire.GunDisassembly2.NvEventQueueActivity this$0; //synthetic
/* # direct methods */
public com.nobleempire.GunDisassembly2.NvEventQueueActivity$DungeonsPurchaseObserver ( ) {
/* .locals 0 */
/* .param p2, "handler" # Landroid/os/Handler; */
/* .prologue */
/* .line 85 */
this.this$0 = p1;
/* .line 86 */
/* invoke-direct {p0, p1, p2}, Lcom/nobleempire/GunDisassembly2/PurchaseObserver;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V */
/* .line 87 */
return;
} // .end method
/* # virtual methods */
public void onBillingSupported ( Boolean p0 ) {
/* .locals 2 */
/* .param p1, "supported" # Z */
/* .prologue */
/* .line 90 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~DungeonsPurchaseObserver.onBillingSupported"; // const-string v1, "~~DungeonsPurchaseObserver.onBillingSupported"
android.util.Log .v ( v0,v1 );
/* .line 99 */
return;
} // .end method
public void onPurchaseStateChange ( com.nobleempire.GunDisassembly2.Consts$PurchaseState p0, java.lang.String p1, Integer p2, Long p3, java.lang.String p4 ) {
/* .locals 2 */
/* .param p1, "purchaseState" # Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
/* .param p2, "itemId" # Ljava/lang/String; */
/* .param p3, "quantity" # I */
/* .param p4, "purchaseTime" # J */
/* .param p6, "developerPayload" # Ljava/lang/String; */
/* .prologue */
/* .line 102 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~DungeonsPurchaseObserver.onPurchaseStateChange"; // const-string v1, "~~DungeonsPurchaseObserver.onPurchaseStateChange"
android.util.Log .v ( v0,v1 );
/* .line 104 */
v0 = this.this$0;
(( com.nobleempire.GunDisassembly2.Consts$PurchaseState ) p1 ).toString ( ); // invoke-virtual {p1}, Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;->toString()Ljava/lang/String;
com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$0 ( v0,p2,v1 );
/* .line 106 */
v0 = com.nobleempire.GunDisassembly2.Consts$PurchaseState.PURCHASED;
/* .line 111 */
return;
} // .end method
public void onRequestPurchaseResponse ( com.nobleempire.GunDisassembly2.BillingService$RequestPurchase p0, com.nobleempire.GunDisassembly2.Consts$ResponseCode p1 ) {
/* .locals 4 */
/* .param p1, "request" # Lcom/nobleempire/GunDisassembly2/BillingService$RequestPurchase; */
/* .param p2, "responseCode" # Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
/* .prologue */
/* .line 114 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "~~DungeonsPurchaseObserver.onRequestPurchaseResponse.product="; // const-string v2, "~~DungeonsPurchaseObserver.onRequestPurchaseResponse.product="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = this.mProductId;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " code="; // const-string v2, " code="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 116 */
v0 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.RESULT_OK;
/* if-ne p2, v0, :cond_0 */
/* .line 118 */
v0 = this.this$0;
v1 = this.mProductId;
final String v2 = "sending purchase request"; // const-string v2, "sending purchase request"
com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$0 ( v0,v1,v2 );
/* .line 126 */
} // :goto_0
return;
/* .line 119 */
} // :cond_0
v0 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.RESULT_USER_CANCELED;
/* if-ne p2, v0, :cond_1 */
/* .line 121 */
v0 = this.this$0;
v1 = this.mProductId;
final String v2 = "dismissed purchase dialog"; // const-string v2, "dismissed purchase dialog"
com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$0 ( v0,v1,v2 );
/* .line 124 */
} // :cond_1
v0 = this.this$0;
v1 = this.mProductId;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "request purchase returned "; // const-string v3, "request purchase returned "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.nobleempire.GunDisassembly2.NvEventQueueActivity .access$0 ( v0,v1,v2 );
} // .end method
public void onRestoreTransactionsResponse ( com.nobleempire.GunDisassembly2.BillingService$RestoreTransactions p0, com.nobleempire.GunDisassembly2.Consts$ResponseCode p1 ) {
/* .locals 2 */
/* .param p1, "request" # Lcom/nobleempire/GunDisassembly2/BillingService$RestoreTransactions; */
/* .param p2, "responseCode" # Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
/* .prologue */
/* .line 129 */
final String v0 = "NvEventQueueActivity.java"; // const-string v0, "NvEventQueueActivity.java"
final String v1 = "~~DungeonsPurchaseObserver.onRestoreTransactionsResponse"; // const-string v1, "~~DungeonsPurchaseObserver.onRestoreTransactionsResponse"
android.util.Log .v ( v0,v1 );
/* .line 130 */
v0 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.RESULT_OK;
/* if-ne p2, v0, :cond_0 */
/* .line 142 */
} // :cond_0
return;
} // .end method
