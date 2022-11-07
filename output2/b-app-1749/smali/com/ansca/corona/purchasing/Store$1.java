class com.ansca.corona.purchasing.Store$1 implements java.lang.Runnable {
	 /* .source "Store.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/purchasing/Store;->raiseTransactionEventFor(Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.purchasing.Store this$0; //synthetic
final com.ansca.corona.purchasing.StoreTransactionResultSettings val$result; //synthetic
/* # direct methods */
 com.ansca.corona.purchasing.Store$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 138 */
this.this$0 = p1;
this.val$result = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 141 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 142 */
	 v0 = this.val$result;
	 com.ansca.corona.JavaToNativeShim .storeTransactionEvent ( v0 );
	 /* .line 144 */
} // :cond_0
return;
} // .end method
