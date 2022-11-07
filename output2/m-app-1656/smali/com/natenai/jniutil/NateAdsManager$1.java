class com.natenai.jniutil.NateAdsManager$1 implements java.lang.Runnable {
	 /* .source "NateAdsManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/natenai/jniutil/NateAdsManager;->setBannerAdVisibled(Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.natenai.jniutil.NateAdsManager this$0; //synthetic
/* # direct methods */
 com.natenai.jniutil.NateAdsManager$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 193 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 206 */
com.natenai.jniutil.NateBaseActivity .getInstance ( );
(( com.natenai.jniutil.NateBaseActivity ) v1 ).findViewById ( v2 ); // invoke-virtual {v1, v2}, Lcom/natenai/jniutil/NateBaseActivity;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/view/ViewGroup; */
/* .line 207 */
/* .local v0, "layout":Landroid/view/ViewGroup; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 209 */
	 v1 = this.this$0;
	 v1 = 	 com.natenai.jniutil.NateAdsManager .access$0 ( v1 );
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 210 */
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.view.ViewGroup ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V
		 /* .line 216 */
	 } // :cond_0
} // :goto_0
com.natenai.jniutil.NateBaseActivity .getInstance ( );
(( com.natenai.jniutil.NateBaseActivity ) v1 ).setFocusOnGLView ( ); // invoke-virtual {v1}, Lcom/natenai/jniutil/NateBaseActivity;->setFocusOnGLView()V
/* .line 217 */
return;
/* .line 212 */
} // :cond_1
int v1 = 4; // const/4 v1, 0x4
(( android.view.ViewGroup ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V
} // .end method
