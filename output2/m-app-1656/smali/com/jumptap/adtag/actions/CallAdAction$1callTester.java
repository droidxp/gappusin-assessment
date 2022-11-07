class com.jumptap.adtag.actions.CallAdAction$1callTester implements com.jumptap.adtag.actions.AdAction$UrlPredicate {
	 /* .source "CallAdAction.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/actions/CallAdAction;->perform(Landroid/content/Context;Lcom/jumptap/adtag/JtAdView;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "callTester" */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.actions.CallAdAction this$0; //synthetic
/* # direct methods */
 com.jumptap.adtag.actions.CallAdAction$1callTester ( ) {
/* .locals 0 */
/* .prologue */
/* .line 18 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean test ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 20 */
android.net.Uri .parse ( p1 );
/* .line 21 */
/* .local v1, "uri":Landroid/net/Uri; */
(( android.net.Uri ) v1 ).getScheme ( ); // invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
/* .line 22 */
/* .local v0, "scheme":Ljava/lang/String; */
final String v2 = "tel"; // const-string v2, "tel"
v2 = (( java.lang.String ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
