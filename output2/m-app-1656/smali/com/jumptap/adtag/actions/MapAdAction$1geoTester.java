class com.jumptap.adtag.actions.MapAdAction$1geoTester implements com.jumptap.adtag.actions.AdAction$UrlPredicate {
	 /* .source "MapAdAction.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/actions/MapAdAction;->perform(Landroid/content/Context;Lcom/jumptap/adtag/JtAdView;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "geoTester" */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.actions.MapAdAction this$0; //synthetic
/* # direct methods */
 com.jumptap.adtag.actions.MapAdAction$1geoTester ( ) {
/* .locals 0 */
/* .prologue */
/* .line 19 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean test ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 21 */
android.net.Uri .parse ( p1 );
/* .line 22 */
/* .local v1, "uri":Landroid/net/Uri; */
(( android.net.Uri ) v1 ).getScheme ( ); // invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
/* .line 23 */
/* .local v0, "scheme":Ljava/lang/String; */
final String v2 = "geo"; // const-string v2, "geo"
v2 = (( java.lang.String ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
