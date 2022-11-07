class de.nurogames.android.ticb.base.PurchaseObserver$1 implements java.lang.Runnable {
	 /* .source "PurchaseObserver.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/PurchaseObserver;->postPurchaseStateChange(Lde/nurogames/android/ticb/base/Consts$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.PurchaseObserver this$0; //synthetic
private final java.lang.String val$developerPayload; //synthetic
private final java.lang.String val$itemId; //synthetic
private final de.nurogames.android.ticb.base.Consts$PurchaseState val$purchaseState; //synthetic
private final Long val$purchaseTime; //synthetic
private final Integer val$quantity; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.PurchaseObserver$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$purchaseState = p2;
this.val$itemId = p3;
/* iput p4, p0, Lde/nurogames/android/ticb/base/PurchaseObserver$1;->val$quantity:I */
/* iput-wide p5, p0, Lde/nurogames/android/ticb/base/PurchaseObserver$1;->val$purchaseTime:J */
this.val$developerPayload = p7;
/* .line 154 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 7 */
/* .prologue */
/* .line 157 */
v0 = this.this$0;
/* .line 158 */
v1 = this.val$purchaseState;
v2 = this.val$itemId;
/* iget v3, p0, Lde/nurogames/android/ticb/base/PurchaseObserver$1;->val$quantity:I */
/* iget-wide v4, p0, Lde/nurogames/android/ticb/base/PurchaseObserver$1;->val$purchaseTime:J */
v6 = this.val$developerPayload;
/* .line 157 */
/* invoke-virtual/range {v0 ..v6}, Lde/nurogames/android/ticb/base/PurchaseObserver;->onPurchaseStateChange(Lde/nurogames/android/ticb/base/Consts$PurchaseState;Ljava/lang/String;IJLjava/lang/String;)V */
/* .line 159 */
return;
} // .end method
