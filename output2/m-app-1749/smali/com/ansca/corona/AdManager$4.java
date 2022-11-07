class com.ansca.corona.AdManager$4 implements java.lang.Runnable {
	 /* .source "AdManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/AdManager;->hideInneractiveAd()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.AdManager this$0; //synthetic
/* # direct methods */
 com.ansca.corona.AdManager$4 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 663 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 665 */
v1 = this.this$0;
com.ansca.corona.AdManager .access$500 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 666 */
	 v1 = this.this$0;
	 com.ansca.corona.AdManager .access$500 ( v1 );
	 (( android.view.ViewGroup ) v1 ).getParent ( ); // invoke-virtual {v1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
	 /* check-cast v0, Landroid/view/ViewGroup; */
	 /* .line 667 */
	 /* .local v0, "group":Landroid/view/ViewGroup; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 668 */
		 v1 = this.this$0;
		 com.ansca.corona.AdManager .access$500 ( v1 );
		 (( android.view.ViewGroup ) v0 ).removeView ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
		 /* .line 671 */
	 } // .end local v0 # "group":Landroid/view/ViewGroup;
} // :cond_0
v1 = this.this$0;
int v2 = 0; // const/4 v2, 0x0
com.ansca.corona.AdManager .access$502 ( v1,v2 );
/* .line 672 */
return;
} // .end method
