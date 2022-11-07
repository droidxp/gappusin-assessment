class com.ansca.corona.CoronaActivity$2$1 implements java.lang.Runnable {
	 /* .source "CoronaActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaActivity$2;->onAnimationEnd(Landroid/view/animation/Animation;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaActivity$2 this$1; //synthetic
/* # direct methods */
 com.ansca.corona.CoronaActivity$2$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 860 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 863 */
v1 = this.this$1;
v1 = this.this$0;
com.ansca.corona.CoronaActivity .access$400 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* .line 864 */
	 v1 = this.this$1;
	 v1 = this.this$0;
	 com.ansca.corona.CoronaActivity .access$400 ( v1 );
	 (( android.widget.ImageView ) v1 ).getParent ( ); // invoke-virtual {v1}, Landroid/widget/ImageView;->getParent()Landroid/view/ViewParent;
	 /* check-cast v0, Landroid/view/ViewGroup; */
	 /* .line 865 */
	 /* .local v0, "group":Landroid/view/ViewGroup; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 866 */
		 v1 = this.this$1;
		 v1 = this.this$0;
		 com.ansca.corona.CoronaActivity .access$400 ( v1 );
		 (( android.view.ViewGroup ) v0 ).removeView ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
		 /* .line 868 */
	 } // :cond_0
	 v1 = this.this$1;
	 v1 = this.this$0;
	 int v2 = 0; // const/4 v2, 0x0
	 com.ansca.corona.CoronaActivity .access$402 ( v1,v2 );
	 /* .line 870 */
} // .end local v0 # "group":Landroid/view/ViewGroup;
} // :cond_1
return;
} // .end method
