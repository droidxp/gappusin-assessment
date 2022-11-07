class com.jumptap.adtag.activity.JTVideoActivity$1 implements android.view.View$OnClickListener {
	 /* .source "JTVideoActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/activity/JTVideoActivity;->configLearnMoreBtnOnClickListener()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.activity.JTVideoActivity this$0; //synthetic
final java.lang.String val$clickThroughUrl; //synthetic
/* # direct methods */
 com.jumptap.adtag.activity.JTVideoActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 70 */
this.this$0 = p1;
this.val$clickThroughUrl = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 2 */
/* .param p1, "v" # Landroid/view/View; */
/* .prologue */
/* .line 74 */
/* new-instance v0, Lcom/jumptap/adtag/activity/JTVideoActivity$1$1; */
/* invoke-direct {v0, p0}, Lcom/jumptap/adtag/activity/JTVideoActivity$1$1;-><init>(Lcom/jumptap/adtag/activity/JTVideoActivity$1;)V */
/* .line 89 */
/* .local v0, "performActionRunnable":Ljava/lang/Runnable; */
/* new-instance v1, Ljava/lang/Thread; */
/* invoke-direct {v1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 90 */
/* .local v1, "th":Ljava/lang/Thread; */
(( java.lang.Thread ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->start()V
/* .line 91 */
return;
} // .end method
