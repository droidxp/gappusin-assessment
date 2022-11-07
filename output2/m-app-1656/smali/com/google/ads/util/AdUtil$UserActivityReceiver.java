public class com.google.ads.util.AdUtil$UserActivityReceiver extends android.content.BroadcastReceiver {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/util/AdUtil; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "UserActivityReceiver" */
} // .end annotation
/* # direct methods */
public com.google.ads.util.AdUtil$UserActivityReceiver ( ) {
/* .locals 0 */
/* .prologue */
/* .line 748 */
/* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 2 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "intent" # Landroid/content/Intent; */
/* .prologue */
/* .line 751 */
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v1 = "android.intent.action.USER_PRESENT"; // const-string v1, "android.intent.action.USER_PRESENT"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 752 */
	 int v0 = 1; // const/4 v0, 0x1
	 com.google.ads.util.AdUtil .a ( v0 );
	 /* .line 756 */
} // :cond_0
} // :goto_0
return;
/* .line 753 */
} // :cond_1
(( android.content.Intent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;
final String v1 = "android.intent.action.SCREEN_OFF"; // const-string v1, "android.intent.action.SCREEN_OFF"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 754 */
int v0 = 0; // const/4 v0, 0x0
com.google.ads.util.AdUtil .a ( v0 );
} // .end method
