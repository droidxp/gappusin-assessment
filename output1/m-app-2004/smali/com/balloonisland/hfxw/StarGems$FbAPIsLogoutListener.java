public class com.balloonisland.hfxw.StarGems$FbAPIsLogoutListener implements com.balloonisland.hfxw.SessionEvents$LogoutListener {
	 /* .source "StarGems.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/balloonisland/hfxw/StarGems; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "FbAPIsLogoutListener" */
} // .end annotation
/* # instance fields */
final com.balloonisland.hfxw.StarGems this$0; //synthetic
/* # direct methods */
public com.balloonisland.hfxw.StarGems$FbAPIsLogoutListener ( ) {
/* .locals 0 */
/* .prologue */
/* .line 485 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onLogoutBegin ( ) {
/* .locals 0 */
/* .prologue */
/* .line 488 */
return;
} // .end method
public void onLogoutFinish ( ) {
/* .locals 1 */
/* .prologue */
/* .line 492 */
v0 = this.this$0;
com.balloonisland.hfxw.SessionStore .clear ( v0 );
/* .line 493 */
return;
} // .end method
