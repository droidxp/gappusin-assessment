public class com.nobleempire.GunDisassembly2.Security$VerifiedPurchase {
	 /* .source "Security.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/nobleempire/GunDisassembly2/Security; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "VerifiedPurchase" */
} // .end annotation
/* # instance fields */
public java.lang.String developerPayload;
public java.lang.String notificationId;
public java.lang.String orderId;
public java.lang.String productId;
public com.nobleempire.GunDisassembly2.Consts$PurchaseState purchaseState;
public Long purchaseTime;
/* # direct methods */
public com.nobleempire.GunDisassembly2.Security$VerifiedPurchase ( ) {
/* .locals 0 */
/* .param p1, "purchaseState" # Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
/* .param p2, "notificationId" # Ljava/lang/String; */
/* .param p3, "productId" # Ljava/lang/String; */
/* .param p4, "orderId" # Ljava/lang/String; */
/* .param p5, "purchaseTime" # J */
/* .param p7, "developerPayload" # Ljava/lang/String; */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 50 */
this.purchaseState = p1;
/* .line 51 */
this.notificationId = p2;
/* .line 52 */
this.productId = p3;
/* .line 53 */
this.orderId = p4;
/* .line 54 */
/* iput-wide p5, p0, Lcom/nobleempire/GunDisassembly2/Security$VerifiedPurchase;->purchaseTime:J */
/* .line 55 */
this.developerPayload = p7;
/* .line 56 */
return;
} // .end method
