class com.chartboost.sdk.CBWebView$1 implements android.view.View$OnTouchListener {
	 /* .source "CBWebView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/chartboost/sdk/CBWebView;-><init>(Landroid/content/Context;Lcom/chartboost/sdk/CBWebView$CBViewType;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.chartboost.sdk.CBWebView this$0; //synthetic
/* # direct methods */
 com.chartboost.sdk.CBWebView$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 46 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 2 */
/* .param p1, "v" # Landroid/view/View; */
/* .param p2, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 49 */
v0 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
