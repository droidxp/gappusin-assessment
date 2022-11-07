class com.nobleempire.GunDisassembly2.PurchaseObserver$1 implements java.lang.Runnable {
	 /* .source "PurchaseObserver.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/nobleempire/GunDisassembly2/PurchaseObserver;->postPurchaseStateChange(Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.nobleempire.GunDisassembly2.PurchaseObserver this$0; //synthetic
private final java.lang.String val$developerPayload; //synthetic
private final java.lang.String val$itemId; //synthetic
private final com.nobleempire.GunDisassembly2.Consts$PurchaseState val$purchaseState; //synthetic
private final Long val$purchaseTime; //synthetic
private final Integer val$quantity; //synthetic
/* # direct methods */
 com.nobleempire.GunDisassembly2.PurchaseObserver$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$purchaseState = p2;
this.val$itemId = p3;
/* iput p4, p0, Lcom/nobleempire/GunDisassembly2/PurchaseObserver$1;->val$quantity:I */
/* iput-wide p5, p0, Lcom/nobleempire/GunDisassembly2/PurchaseObserver$1;->val$purchaseTime:J */
this.val$developerPayload = p7;
/* .line 101 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 7 */
/* .prologue */
/* .line 103 */
v0 = this.this$0;
v1 = this.val$purchaseState;
v2 = this.val$itemId;
/* iget v3, p0, Lcom/nobleempire/GunDisassembly2/PurchaseObserver$1;->val$quantity:I */
/* iget-wide v4, p0, Lcom/nobleempire/GunDisassembly2/PurchaseObserver$1;->val$purchaseTime:J */
v6 = this.val$developerPayload;
/* invoke-virtual/range {v0 ..v6}, Lcom/nobleempire/GunDisassembly2/PurchaseObserver;->onPurchaseStateChange(Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V */
/* .line 104 */
return;
} // .end method
