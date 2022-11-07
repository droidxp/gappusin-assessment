class com.balloonisland.hfxw.StarGems$1 extends android.os.Handler {
	 /* .source "StarGems.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/balloonisland/hfxw/StarGems;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.balloonisland.hfxw.StarGems this$0; //synthetic
/* # direct methods */
 com.balloonisland.hfxw.StarGems$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 263 */
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
static com.balloonisland.hfxw.StarGems access$0 ( com.balloonisland.hfxw.StarGems$1 p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 263 */
v0 = this.this$0;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 9 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
int v8 = 0; // const/4 v8, 0x0
int v7 = 0; // const/4 v7, 0x0
/* .line 265 */
/* iget v2, p1, Landroid/os/Message;->what:I */
/* packed-switch v2, :pswitch_data_0 */
/* .line 393 */
} // :cond_0
} // :goto_0
/* invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V */
/* .line 394 */
return;
/* .line 268 */
/* :pswitch_0 */
v2 = this.this$0;
/* iget v3, p1, Landroid/os/Message;->arg1:I */
/* int-to-long v3, v3 */
com.balloonisland.hfxw.StarGems .access$12 ( v2,v3,v4 );
/* .line 269 */
final String v2 = ""; // const-string v2, ""
com.balloonisland.hfxw.StarGems .access$9 ( v2 );
/* .line 270 */
final String v2 = ""; // const-string v2, ""
com.balloonisland.hfxw.StarGems .access$8 ( v2 );
/* .line 271 */
v2 = this.this$0;
v3 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_SHOW_LEADERBOARD;
com.balloonisland.hfxw.StarGems .access$4 ( v2,v3 );
/* .line 272 */
v2 = this.this$0;
com.balloonisland.hfxw.StarGems .access$13 ( v2,v7 );
/* .line 274 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
v2 = (( com.facebook.android.Facebook ) v2 ).isSessionValid ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->isSessionValid()Z
/* if-nez v2, :cond_1 */
/* .line 275 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
v3 = this.this$0;
v4 = this.this$0;
v4 = this.permissions;
/* new-instance v5, Lcom/balloonisland/hfxw/StarGems$LoginDialogListener; */
v6 = this.this$0;
/* invoke-direct {v5, v6, v8}, Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;-><init>(Lcom/balloonisland/hfxw/StarGems;Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;)V */
(( com.facebook.android.Facebook ) v2 ).authorize ( v3, v4, v7, v5 ); // invoke-virtual {v2, v3, v4, v7, v5}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
/* .line 279 */
} // :cond_1
v2 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v2 ).showLeaderBoard ( ); // invoke-virtual {v2}, Lcom/balloonisland/hfxw/StarGems;->showLeaderBoard()V
/* .line 285 */
/* :pswitch_1 */
/* new-instance v0, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
final String v3 = "http://theballoonisland.com"; // const-string v3, "http://theballoonisland.com"
android.net.Uri .parse ( v3 );
/* invoke-direct {v0, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 286 */
/* .local v0, "BIWebSiteIntent":Landroid/content/Intent; */
v2 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v2 ).startActivity ( v0 ); // invoke-virtual {v2, v0}, Lcom/balloonisland/hfxw/StarGems;->startActivity(Landroid/content/Intent;)V
/* .line 291 */
} // .end local v0 # "BIWebSiteIntent":Landroid/content/Intent;
/* :pswitch_2 */
v2 = this.this$0;
/* iget v3, p1, Landroid/os/Message;->arg1:I */
/* int-to-long v3, v3 */
com.balloonisland.hfxw.StarGems .access$12 ( v2,v3,v4 );
/* .line 292 */
v2 = this.this$0;
/* iget v3, p1, Landroid/os/Message;->arg2:I */
com.balloonisland.hfxw.StarGems .access$14 ( v2,v3 );
/* .line 293 */
v2 = this.this$0;
v3 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_POST_TO_WALL;
com.balloonisland.hfxw.StarGems .access$4 ( v2,v3 );
/* .line 294 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
v2 = (( com.facebook.android.Facebook ) v2 ).isSessionValid ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->isSessionValid()Z
/* if-nez v2, :cond_2 */
/* .line 296 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
v3 = this.this$0;
v4 = this.this$0;
v4 = this.permissions;
/* new-instance v5, Lcom/balloonisland/hfxw/StarGems$LoginDialogListener; */
v6 = this.this$0;
/* invoke-direct {v5, v6, v8}, Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;-><init>(Lcom/balloonisland/hfxw/StarGems;Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;)V */
(( com.facebook.android.Facebook ) v2 ).authorize ( v3, v4, v7, v5 ); // invoke-virtual {v2, v3, v4, v7, v5}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
/* goto/16 :goto_0 */
/* .line 300 */
} // :cond_2
v2 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v2 ).postToWall ( ); // invoke-virtual {v2}, Lcom/balloonisland/hfxw/StarGems;->postToWall()V
/* goto/16 :goto_0 */
/* .line 306 */
/* :pswitch_3 */
/* new-instance v2, Landroid/app/AlertDialog$Builder; */
v3 = this.this$0;
/* invoke-direct {v2, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 307 */
final String v3 = "Rate This Game"; // const-string v3, "Rate This Game"
(( android.app.AlertDialog$Builder ) v2 ).setTitle ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 308 */
final String v3 = "Please rate this game with 5 stars to support this FREE game, thank you!"; // const-string v3, "Please rate this game with 5 stars to support this FREE game, thank you!"
(( android.app.AlertDialog$Builder ) v2 ).setMessage ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 309 */
final String v3 = "Rate"; // const-string v3, "Rate"
/* .line 310 */
/* new-instance v4, Lcom/balloonisland/hfxw/StarGems$1$1; */
/* invoke-direct {v4, p0}, Lcom/balloonisland/hfxw/StarGems$1$1;-><init>(Lcom/balloonisland/hfxw/StarGems$1;)V */
/* .line 309 */
(( android.app.AlertDialog$Builder ) v2 ).setPositiveButton ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 327 */
final String v3 = "Later"; // const-string v3, "Later"
/* .line 328 */
/* new-instance v4, Lcom/balloonisland/hfxw/StarGems$1$2; */
/* invoke-direct {v4, p0}, Lcom/balloonisland/hfxw/StarGems$1$2;-><init>(Lcom/balloonisland/hfxw/StarGems$1;)V */
/* .line 327 */
(( android.app.AlertDialog$Builder ) v2 ).setNegativeButton ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
/* .line 334 */
(( android.app.AlertDialog$Builder ) v2 ).create ( ); // invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
/* .line 336 */
/* .local v1, "dialog":Landroid/app/Dialog; */
(( android.app.Dialog ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/app/Dialog;->show()V
/* goto/16 :goto_0 */
/* .line 341 */
} // .end local v1 # "dialog":Landroid/app/Dialog;
/* :pswitch_4 */
final String v2 = ""; // const-string v2, ""
com.balloonisland.hfxw.StarGems .access$11 ( v2 );
/* .line 342 */
v2 = this.this$0;
v3 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_SHOW_REQUEST;
com.balloonisland.hfxw.StarGems .access$4 ( v2,v3 );
/* .line 344 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
v2 = (( com.facebook.android.Facebook ) v2 ).isSessionValid ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->isSessionValid()Z
/* if-nez v2, :cond_3 */
/* .line 345 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
v3 = this.this$0;
v4 = this.this$0;
v4 = this.permissions;
/* new-instance v5, Lcom/balloonisland/hfxw/StarGems$LoginDialogListener; */
v6 = this.this$0;
/* invoke-direct {v5, v6, v8}, Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;-><init>(Lcom/balloonisland/hfxw/StarGems;Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;)V */
(( com.facebook.android.Facebook ) v2 ).authorize ( v3, v4, v7, v5 ); // invoke-virtual {v2, v3, v4, v7, v5}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
/* goto/16 :goto_0 */
/* .line 349 */
} // :cond_3
v2 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v2 ).showRequest ( ); // invoke-virtual {v2}, Lcom/balloonisland/hfxw/StarGems;->showRequest()V
/* goto/16 :goto_0 */
/* .line 355 */
/* :pswitch_5 */
v2 = this.this$0;
v3 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_DELETE_REQUEST;
com.balloonisland.hfxw.StarGems .access$4 ( v2,v3 );
/* .line 357 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
v2 = (( com.facebook.android.Facebook ) v2 ).isSessionValid ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->isSessionValid()Z
/* if-nez v2, :cond_4 */
/* .line 358 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
v3 = this.this$0;
v4 = this.this$0;
v4 = this.permissions;
/* new-instance v5, Lcom/balloonisland/hfxw/StarGems$LoginDialogListener; */
v6 = this.this$0;
/* invoke-direct {v5, v6, v8}, Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;-><init>(Lcom/balloonisland/hfxw/StarGems;Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;)V */
(( com.facebook.android.Facebook ) v2 ).authorize ( v3, v4, v7, v5 ); // invoke-virtual {v2, v3, v4, v7, v5}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
/* goto/16 :goto_0 */
/* .line 362 */
} // :cond_4
v2 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v2 ).deleteRequest ( ); // invoke-virtual {v2}, Lcom/balloonisland/hfxw/StarGems;->deleteRequest()V
/* goto/16 :goto_0 */
/* .line 368 */
/* :pswitch_6 */
v2 = this.this$0;
v3 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_SEND_GIFT;
com.balloonisland.hfxw.StarGems .access$4 ( v2,v3 );
/* .line 370 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
v2 = (( com.facebook.android.Facebook ) v2 ).isSessionValid ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->isSessionValid()Z
/* if-nez v2, :cond_5 */
/* .line 371 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
v3 = this.this$0;
v4 = this.this$0;
v4 = this.permissions;
/* new-instance v5, Lcom/balloonisland/hfxw/StarGems$LoginDialogListener; */
v6 = this.this$0;
/* invoke-direct {v5, v6, v8}, Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;-><init>(Lcom/balloonisland/hfxw/StarGems;Lcom/balloonisland/hfxw/StarGems$LoginDialogListener;)V */
(( com.facebook.android.Facebook ) v2 ).authorize ( v3, v4, v7, v5 ); // invoke-virtual {v2, v3, v4, v7, v5}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
/* goto/16 :goto_0 */
/* .line 375 */
} // :cond_5
v2 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v2 ).sendGift ( ); // invoke-virtual {v2}, Lcom/balloonisland/hfxw/StarGems;->sendGift()V
/* goto/16 :goto_0 */
/* .line 381 */
/* :pswitch_7 */
v2 = com.balloonisland.hfxw.Utility.mFacebook;
v2 = (( com.facebook.android.Facebook ) v2 ).isSessionValid ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 382 */
v2 = this.this$0;
/* iget v3, p1, Landroid/os/Message;->arg1:I */
/* int-to-long v3, v3 */
com.balloonisland.hfxw.StarGems .access$12 ( v2,v3,v4 );
/* .line 383 */
v2 = this.this$0;
v3 = com.balloonisland.hfxw.StarGems$FACEBOOK_ACTION_TYPE.FACEBOOK_SHOW_LEADERBOARD;
com.balloonisland.hfxw.StarGems .access$4 ( v2,v3 );
/* .line 384 */
v2 = this.this$0;
int v3 = 1; // const/4 v3, 0x1
com.balloonisland.hfxw.StarGems .access$13 ( v2,v3 );
/* .line 388 */
v2 = this.this$0;
(( com.balloonisland.hfxw.StarGems ) v2 ).showLeaderBoard ( ); // invoke-virtual {v2}, Lcom/balloonisland/hfxw/StarGems;->showLeaderBoard()V
/* goto/16 :goto_0 */
/* .line 265 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x101 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_7 */
} // .end packed-switch
} // .end method
