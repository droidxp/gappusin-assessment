public class com.balloonisland.hfxw.StarGems$FbAPIsAuthListener implements com.balloonisland.hfxw.SessionEvents$AuthListener {
	 /* .source "StarGems.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/balloonisland/hfxw/StarGems; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "FbAPIsAuthListener" */
} // .end annotation
/* # instance fields */
final com.balloonisland.hfxw.StarGems this$0; //synthetic
/* # direct methods */
public com.balloonisland.hfxw.StarGems$FbAPIsAuthListener ( ) {
/* .locals 0 */
/* .prologue */
/* .line 449 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onAuthFail ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "error" # Ljava/lang/String; */
/* .prologue */
/* .line 478 */
return;
} // .end method
public void onAuthSucceed ( ) {
/* .locals 2 */
/* .prologue */
/* .line 453 */
v0 = com.balloonisland.hfxw.Utility.mFacebook;
v1 = this.this$0;
com.balloonisland.hfxw.SessionStore .save ( v0,v1 );
/* .line 454 */
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_SHOW_LEADERBOARD;
/* if-ne v0, v1, :cond_1 */
/* .line 456 */
v0 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v0 ).showLeaderBoard ( ); // invoke-virtual {v0}, Lcom/balloonisland/hfxw/StarGems;->showLeaderBoard()V
/* .line 474 */
} // :cond_0
} // :goto_0
return;
/* .line 458 */
} // :cond_1
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_POST_TO_WALL;
/* if-ne v0, v1, :cond_2 */
/* .line 460 */
v0 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v0 ).postToWall ( ); // invoke-virtual {v0}, Lcom/balloonisland/hfxw/StarGems;->postToWall()V
/* .line 462 */
} // :cond_2
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_SHOW_REQUEST;
/* if-ne v0, v1, :cond_3 */
/* .line 464 */
v0 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v0 ).showRequest ( ); // invoke-virtual {v0}, Lcom/balloonisland/hfxw/StarGems;->showRequest()V
/* .line 466 */
} // :cond_3
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_DELETE_REQUEST;
/* if-ne v0, v1, :cond_4 */
/* .line 468 */
v0 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v0 ).deleteRequest ( ); // invoke-virtual {v0}, Lcom/balloonisland/hfxw/StarGems;->deleteRequest()V
/* .line 470 */
} // :cond_4
v0 = this.this$0;
com.balloonisland.hfxw.StarGems .access$0 ( v0 );
v1 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_SEND_GIFT;
/* if-ne v0, v1, :cond_0 */
/* .line 472 */
v0 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v0 ).sendGift ( ); // invoke-virtual {v0}, Lcom/balloonisland/hfxw/StarGems;->sendGift()V
} // .end method
