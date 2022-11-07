class com.jumptap.adtag.activity.JTVideoActivity$1$1 implements java.lang.Runnable {
	 /* .source "JTVideoActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/activity/JTVideoActivity$1;->onClick(Landroid/view/View;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.activity.JTVideoActivity$1 this$1; //synthetic
/* # direct methods */
 com.jumptap.adtag.activity.JTVideoActivity$1$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 74 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 82 */
v2 = this.this$1;
v2 = this.this$0;
(( com.jumptap.adtag.activity.JTVideoActivity ) v2 ).getWidgetSettings ( ); // invoke-virtual {v2}, Lcom/jumptap/adtag/activity/JTVideoActivity;->getWidgetSettings()Lcom/jumptap/adtag/JtAdWidgetSettings;
/* .line 83 */
/* .local v1, "widgetSettings":Lcom/jumptap/adtag/JtAdWidgetSettings; */
v2 = this.this$1;
v2 = this.val$clickThroughUrl;
(( com.jumptap.adtag.JtAdWidgetSettings ) v1 ).getUserAgent ( v4 ); // invoke-virtual {v1, v4}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getUserAgent(Landroid/webkit/WebView;)Ljava/lang/String;
com.jumptap.adtag.actions.ActionFactory .createAction ( v2,v3 );
/* .line 84 */
/* .local v0, "createAction":Lcom/jumptap/adtag/actions/AdAction; */
v2 = this.this$1;
v2 = this.val$clickThroughUrl;
(( com.jumptap.adtag.actions.AdAction ) v0 ).setRedirectedUrl ( v2 ); // invoke-virtual {v0, v2}, Lcom/jumptap/adtag/actions/AdAction;->setRedirectedUrl(Ljava/lang/String;)V
/* .line 85 */
v2 = this.this$1;
v2 = this.this$0;
(( com.jumptap.adtag.actions.AdAction ) v0 ).perform ( v2, v4 ); // invoke-virtual {v0, v2, v4}, Lcom/jumptap/adtag/actions/AdAction;->perform(Landroid/content/Context;Lcom/jumptap/adtag/JtAdView;)V
/* .line 86 */
v2 = this.this$1;
v2 = this.this$0;
com.jumptap.adtag.activity.JTVideoActivity .access$000 ( v2 );
/* .line 87 */
return;
} // .end method
