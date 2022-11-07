class com.google.ads.internal.j$a$2 implements android.content.DialogInterface$OnClickListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/ads/internal/j$a;->onGesturePerformed(Landroid/gesture/GestureOverlayView;Landroid/gesture/Gesture;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final java.lang.String a; //synthetic
final com.google.ads.internal.j$a b; //synthetic
/* # direct methods */
 com.google.ads.internal.j$a$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 90 */
this.b = p1;
this.a = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.content.DialogInterface p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "dialog" # Landroid/content/DialogInterface; */
/* .param p2, "which" # I */
/* .prologue */
/* .line 93 */
v0 = this.b;
com.google.ads.internal.j$a .a ( v0 );
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "android.intent.action.SEND"; // const-string v2, "android.intent.action.SEND"
/* invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
final String v2 = "text/plain"; // const-string v2, "text/plain"
(( android.content.Intent ) v1 ).setType ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;
final String v2 = "android.intent.extra.TEXT"; // const-string v2, "android.intent.extra.TEXT"
v3 = this.a;
(( android.content.Intent ) v1 ).putExtra ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
final String v2 = "Share via"; // const-string v2, "Share via"
android.content.Intent .createChooser ( v1,v2 );
(( android.app.Activity ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 99 */
return;
} // .end method
