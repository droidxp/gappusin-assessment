class com.google.ads.ag$c implements android.content.DialogInterface$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/ag; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "c" */
} // .end annotation
/* # instance fields */
private com.google.ads.internal.d a;
/* # direct methods */
public com.google.ads.ag$c ( ) {
/* .locals 0 */
/* .prologue */
/* .line 58 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 59 */
this.a = p1;
/* .line 60 */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 67 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 68 */
final String v1 = "u"; // const-string v1, "u"
final String v2 = "market://details?id=com.google.android.apps.plus"; // const-string v2, "market://details?id=com.google.android.apps.plus"
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 69 */
v1 = this.a;
/* new-instance v2, Lcom/google/ads/internal/e; */
final String v3 = "intent"; // const-string v3, "intent"
/* invoke-direct {v2, v3, v0}, Lcom/google/ads/internal/e;-><init>(Ljava/lang/String;Ljava/util/HashMap;)V */
com.google.ads.AdActivity .launchAdActivity ( v1,v2 );
/* .line 70 */
return;
} // .end method
