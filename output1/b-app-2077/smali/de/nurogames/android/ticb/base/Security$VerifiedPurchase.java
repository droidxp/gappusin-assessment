public class de.nurogames.android.ticb.base.Security$VerifiedPurchase {
	 /* .source "Security.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/Security; */
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
public de.nurogames.android.ticb.base.Consts$PurchaseState purchaseState;
public Long purchaseTime;
/* # direct methods */
public de.nurogames.android.ticb.base.Security$VerifiedPurchase ( ) {
/* .locals 0 */
/* .param p1, "purchaseState" # Lde/nurogames/android/ticb/base/Consts$PurchaseState; */
/* .param p2, "notificationId" # Ljava/lang/String; */
/* .param p3, "productId" # Ljava/lang/String; */
/* .param p4, "orderId" # Ljava/lang/String; */
/* .param p5, "purchaseTime" # J */
/* .param p7, "developerPayload" # Ljava/lang/String; */
/* .prologue */
/* .line 66 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 68 */
this.purchaseState = p1;
/* .line 69 */
this.notificationId = p2;
/* .line 70 */
this.productId = p3;
/* .line 71 */
this.orderId = p4;
/* .line 72 */
/* iput-wide p5, p0, Lde/nurogames/android/ticb/base/Security$VerifiedPurchase;->purchaseTime:J */
/* .line 73 */
this.developerPayload = p7;
/* .line 74 */
return;
} // .end method
