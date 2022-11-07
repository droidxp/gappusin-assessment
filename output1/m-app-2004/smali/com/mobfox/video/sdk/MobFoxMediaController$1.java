class com.mobfox.video.sdk.MobFoxMediaController$1 extends android.os.Handler {
	 /* .source "MobFoxMediaController.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxMediaController; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxMediaController this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxMediaController$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 441 */
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 3 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 444 */
/* iget v1, p1, Landroid/os/Message;->what:I */
/* sparse-switch v1, :sswitch_data_0 */
/* .line 506 */
} // :goto_0
return;
/* .line 446 */
/* :sswitch_0 */
v1 = this.this$0;
(( com.mobfox.video.sdk.MobFoxMediaController ) v1 ).hide ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/MobFoxMediaController;->hide()V
/* .line 449 */
/* :sswitch_1 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxMediaController .access$0 ( v1 );
/* .line 452 */
/* :sswitch_2 */
/* iget v1, p1, Landroid/os/Message;->arg1:I */
/* packed-switch v1, :pswitch_data_0 */
/* .line 503 */
} // :cond_0
} // :goto_1
v1 = this.this$0;
(( com.mobfox.video.sdk.MobFoxMediaController ) v1 ).requestLayout ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/MobFoxMediaController;->requestLayout()V
/* .line 454 */
/* :pswitch_0 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxMediaController .access$1 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 455 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxMediaController .access$2 ( v1 );
/* .line 456 */
int v2 = 4; // const/4 v2, 0x4
(( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 457 */
/* .local v0, "d":Landroid/graphics/drawable/Drawable; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 458 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxMediaController .access$3 ( v1 );
(( android.widget.ImageView ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 463 */
} // .end local v0 # "d":Landroid/graphics/drawable/Drawable;
/* :pswitch_1 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxMediaController .access$4 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 464 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxMediaController .access$2 ( v1 );
/* .line 465 */
int v2 = 5; // const/4 v2, 0x5
(( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 466 */
/* .restart local v0 # "d":Landroid/graphics/drawable/Drawable; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 467 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxMediaController .access$5 ( v1 );
(( android.widget.ImageView ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 472 */
} // .end local v0 # "d":Landroid/graphics/drawable/Drawable;
/* :pswitch_2 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxMediaController .access$6 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 473 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxMediaController .access$7 ( v1 );
/* .line 477 */
/* :pswitch_3 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxMediaController .access$6 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 478 */
	 v1 = this.this$0;
	 com.mobfox.video.sdk.MobFoxMediaController .access$7 ( v1 );
	 /* .line 482 */
	 /* :pswitch_4 */
	 v1 = this.this$0;
	 com.mobfox.video.sdk.MobFoxMediaController .access$8 ( v1 );
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 483 */
		 v1 = this.this$0;
		 com.mobfox.video.sdk.MobFoxMediaController .access$2 ( v1 );
		 /* .line 484 */
		 /* const/16 v2, -0xd */
		 (( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
		 /* .line 485 */
		 /* .restart local v0 # "d":Landroid/graphics/drawable/Drawable; */
		 v1 = this.this$0;
		 com.mobfox.video.sdk.MobFoxMediaController .access$8 ( v1 );
		 (( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
		 /* .line 444 */
		 /* nop */
		 /* :sswitch_data_0 */
		 /* .sparse-switch */
		 /* 0x1 -> :sswitch_0 */
		 /* 0x2 -> :sswitch_1 */
		 /* 0x64 -> :sswitch_2 */
	 } // .end sparse-switch
	 /* .line 452 */
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x1 */
	 /* :pswitch_3 */
	 /* :pswitch_2 */
	 /* :pswitch_4 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
} // .end packed-switch
} // .end method
