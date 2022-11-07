class com.jumptap.adtag.JtAdView$PerformActionHandler implements java.lang.Runnable {
	 /* .source "JtAdView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/jumptap/adtag/JtAdView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "PerformActionHandler" */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.JtAdView this$0; //synthetic
java.lang.String url;
com.jumptap.adtag.JtAdView widget;
/* # direct methods */
 com.jumptap.adtag.JtAdView$PerformActionHandler ( ) {
/* .locals 0 */
/* .param p2, "url" # Ljava/lang/String; */
/* .param p3, "adView" # Lcom/jumptap/adtag/JtAdView; */
/* .prologue */
/* .line 871 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 872 */
this.url = p2;
/* .line 873 */
this.widget = p3;
/* .line 874 */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
/* .line 879 */
v1 = this.url;
v2 = this.this$0;
v2 = this.widgetSettings;
int v3 = 0; // const/4 v3, 0x0
(( com.jumptap.adtag.JtAdWidgetSettings ) v2 ).getUserAgent ( v3 ); // invoke-virtual {v2, v3}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getUserAgent(Landroid/webkit/WebView;)Ljava/lang/String;
com.jumptap.adtag.actions.ActionFactory .createAction ( v1,v2 );
/* .line 883 */
/* .local v0, "action":Lcom/jumptap/adtag/actions/AdAction; */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 888 */
	 v1 = this.this$0;
	 (( com.jumptap.adtag.JtAdView ) v1 ).notifyAdClicked ( ); // invoke-virtual {v1}, Lcom/jumptap/adtag/JtAdView;->notifyAdClicked()V
	 /* .line 889 */
	 v1 = this.this$0;
	 v1 = this.context;
	 v2 = this.widget;
	 (( com.jumptap.adtag.actions.AdAction ) v0 ).perform ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/jumptap/adtag/actions/AdAction;->perform(Landroid/content/Context;Lcom/jumptap/adtag/JtAdView;)V
	 /* .line 898 */
} // :goto_0
v1 = this.this$0;
com.jumptap.adtag.JtAdView .access$600 ( v1 );
/* .line 899 */
return;
/* .line 894 */
} // :cond_0
final String v1 = "JtAd"; // const-string v1, "JtAd"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Cannot perform action or find AdAction for url: "; // const-string v3, "Cannot perform action or find AdAction for url: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.url;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v1,v2 );
} // .end method
