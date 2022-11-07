class de.nurogames.android.ticb.base.tinysanta$5 implements java.lang.Runnable {
	 /* .source "tinysanta.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/tinysanta;->doInitializeOwnedItems()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.tinysanta this$0; //synthetic
private final java.util.Set val$ownedItems; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.tinysanta$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
this.val$ownedItems = p2;
/* .line 1232 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1234 */
v0 = this.this$0;
de.nurogames.android.ticb.base.tinysanta .access$1 ( v0 );
v1 = this.val$ownedItems;
/* .line 1235 */
v0 = this.this$0;
de.nurogames.android.ticb.base.tinysanta .access$2 ( v0 );
v1 = this.this$0;
de.nurogames.android.ticb.base.tinysanta .access$1 ( v1 );
(( de.nurogames.android.ticb.base.tinysanta$CatalogAdapter ) v0 ).setOwnedItems ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/tinysanta$CatalogAdapter;->setOwnedItems(Ljava/util/Set;)V
/* .line 1236 */
return;
} // .end method
