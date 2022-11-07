class com.jumptap.adtag.activity.JTVideoActivity$2 implements android.view.View$OnClickListener {
	 /* .source "JTVideoActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/activity/JTVideoActivity;->setSkipButton()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.activity.JTVideoActivity this$0; //synthetic
/* # direct methods */
 com.jumptap.adtag.activity.JTVideoActivity$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 180 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 184 */
/* new-instance v0, Lcom/jumptap/adtag/activity/JTVideoActivity$2$1; */
/* invoke-direct {v0, p0}, Lcom/jumptap/adtag/activity/JTVideoActivity$2$1;-><init>(Lcom/jumptap/adtag/activity/JTVideoActivity$2;)V */
/* .line 192 */
/* .local v0, "runnable":Ljava/lang/Runnable; */
/* new-instance v1, Ljava/lang/Thread; */
/* invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 193 */
/* .local v1, "th":Ljava/lang/Thread; */
(( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
/* .line 194 */
return;
} // .end method
