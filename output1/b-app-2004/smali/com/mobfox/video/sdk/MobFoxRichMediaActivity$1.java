class com.mobfox.video.sdk.MobFoxRichMediaActivity$1 extends android.os.Handler {
	 /* .source "MobFoxRichMediaActivity.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxRichMediaActivity this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxRichMediaActivity$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 349 */
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 3 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
/* .line 352 */
/* iget v0, p1, Landroid/os/Message;->what:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 368 */
} // :cond_0
} // :goto_0
return;
/* .line 354 */
/* :pswitch_0 */
/* iget v0, p1, Landroid/os/Message;->arg1:I */
/* packed-switch v0, :pswitch_data_1 */
/* .line 356 */
/* :pswitch_1 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$0 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 358 */
v0 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$0 ( v0 );
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxRichMediaActivity .access$1 ( v1 );
/* .line 359 */
/* const/16 v2, -0x12 */
(( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
/* .line 358 */
(( android.widget.ImageView ) v0 ).setImageDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 352 */
/* :pswitch_data_0 */
/* .packed-switch 0x64 */
/* :pswitch_0 */
} // .end packed-switch
/* .line 354 */
/* :pswitch_data_1 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
