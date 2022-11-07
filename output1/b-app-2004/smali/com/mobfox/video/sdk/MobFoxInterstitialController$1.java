class com.mobfox.video.sdk.MobFoxInterstitialController$1 extends android.os.Handler {
	 /* .source "MobFoxInterstitialController.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxInterstitialController; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxInterstitialController this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxInterstitialController$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 506 */
/* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void handleMessage ( android.os.Message p0 ) {
/* .locals 3 */
/* .param p1, "msg" # Landroid/os/Message; */
/* .prologue */
int v2 = 2; // const/4 v2, 0x2
/* .line 509 */
/* iget v1, p1, Landroid/os/Message;->what:I */
/* sparse-switch v1, :sswitch_data_0 */
/* .line 586 */
} // :cond_0
} // :goto_0
return;
/* .line 511 */
/* :sswitch_0 */
v1 = this.this$0;
(( com.mobfox.video.sdk.MobFoxInterstitialController ) v1 ).hide ( ); // invoke-virtual {v1}, Lcom/mobfox/video/sdk/MobFoxInterstitialController;->hide()V
/* .line 514 */
/* :sswitch_1 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxInterstitialController .access$0 ( v1 );
/* .line 515 */
v1 = this.this$0;
v1 = com.mobfox.video.sdk.MobFoxInterstitialController .access$1 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxInterstitialController .access$2 ( v1 );
/* iget-boolean v1, v1, Lcom/mobfox/video/sdk/InterstitialData;->showTimer:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 516 */
(( com.mobfox.video.sdk.MobFoxInterstitialController$1 ) p0 ).obtainMessage ( v2 ); // invoke-virtual {p0, v2}, Lcom/mobfox/video/sdk/MobFoxInterstitialController$1;->obtainMessage(I)Landroid/os/Message;
/* .line 517 */
/* const-wide/16 v1, 0x3e8 */
(( com.mobfox.video.sdk.MobFoxInterstitialController$1 ) p0 ).sendMessageDelayed ( p1, v1, v2 ); // invoke-virtual {p0, p1, v1, v2}, Lcom/mobfox/video/sdk/MobFoxInterstitialController$1;->sendMessageDelayed(Landroid/os/Message;J)Z
/* .line 521 */
/* :sswitch_2 */
/* iget v1, p1, Landroid/os/Message;->arg1:I */
/* packed-switch v1, :pswitch_data_0 */
/* .line 523 */
/* :pswitch_0 */
v1 = this.this$0;
com.mobfox.video.sdk.MobFoxInterstitialController .access$3 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 524 */
	 v1 = this.this$0;
	 com.mobfox.video.sdk.MobFoxInterstitialController .access$4 ( v1 );
	 /* .line 525 */
	 int v2 = 1; // const/4 v2, 0x1
	 (( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
	 /* .line 526 */
	 /* .local v0, "d":Landroid/graphics/drawable/Drawable; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 527 */
		 v1 = this.this$0;
		 com.mobfox.video.sdk.MobFoxInterstitialController .access$5 ( v1 );
		 (( com.mobfox.video.sdk.AspectRatioImageView ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
		 /* .line 532 */
	 } // .end local v0 # "d":Landroid/graphics/drawable/Drawable;
	 /* :pswitch_1 */
	 v1 = this.this$0;
	 com.mobfox.video.sdk.MobFoxInterstitialController .access$6 ( v1 );
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 533 */
		 v1 = this.this$0;
		 com.mobfox.video.sdk.MobFoxInterstitialController .access$4 ( v1 );
		 /* .line 534 */
		 (( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
		 /* .line 535 */
		 /* .restart local v0 # "d":Landroid/graphics/drawable/Drawable; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 536 */
			 v1 = this.this$0;
			 com.mobfox.video.sdk.MobFoxInterstitialController .access$6 ( v1 );
			 (( android.widget.LinearLayout ) v1 ).setBackgroundDrawable ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
			 /* .line 541 */
		 } // .end local v0 # "d":Landroid/graphics/drawable/Drawable;
		 /* :pswitch_2 */
		 v1 = this.this$0;
		 com.mobfox.video.sdk.MobFoxInterstitialController .access$7 ( v1 );
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 542 */
			 v1 = this.this$0;
			 com.mobfox.video.sdk.MobFoxInterstitialController .access$4 ( v1 );
			 /* .line 543 */
			 int v2 = 3; // const/4 v2, 0x3
			 (( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
			 /* .line 544 */
			 /* .restart local v0 # "d":Landroid/graphics/drawable/Drawable; */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 545 */
				 v1 = this.this$0;
				 com.mobfox.video.sdk.MobFoxInterstitialController .access$7 ( v1 );
				 (( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
				 /* goto/16 :goto_0 */
				 /* .line 552 */
			 } // .end local v0 # "d":Landroid/graphics/drawable/Drawable;
			 /* :pswitch_3 */
			 v1 = this.this$0;
			 com.mobfox.video.sdk.MobFoxInterstitialController .access$8 ( v1 );
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 /* .line 553 */
				 v1 = this.this$0;
				 com.mobfox.video.sdk.MobFoxInterstitialController .access$4 ( v1 );
				 /* .line 554 */
				 int v2 = 4; // const/4 v2, 0x4
				 (( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
				 /* .line 555 */
				 /* .restart local v0 # "d":Landroid/graphics/drawable/Drawable; */
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 /* .line 556 */
					 v1 = this.this$0;
					 com.mobfox.video.sdk.MobFoxInterstitialController .access$8 ( v1 );
					 (( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
					 /* goto/16 :goto_0 */
					 /* .line 562 */
				 } // .end local v0 # "d":Landroid/graphics/drawable/Drawable;
				 /* :pswitch_4 */
				 v1 = this.this$0;
				 com.mobfox.video.sdk.MobFoxInterstitialController .access$9 ( v1 );
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 /* .line 563 */
					 v1 = this.this$0;
					 com.mobfox.video.sdk.MobFoxInterstitialController .access$4 ( v1 );
					 /* .line 564 */
					 int v2 = 5; // const/4 v2, 0x5
					 (( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
					 /* .line 565 */
					 /* .restart local v0 # "d":Landroid/graphics/drawable/Drawable; */
					 if ( v0 != null) { // if-eqz v0, :cond_0
						 /* .line 566 */
						 v1 = this.this$0;
						 com.mobfox.video.sdk.MobFoxInterstitialController .access$9 ( v1 );
						 (( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
						 /* goto/16 :goto_0 */
						 /* .line 572 */
					 } // .end local v0 # "d":Landroid/graphics/drawable/Drawable;
					 /* :pswitch_5 */
					 v1 = this.this$0;
					 com.mobfox.video.sdk.MobFoxInterstitialController .access$10 ( v1 );
					 if ( v1 != null) { // if-eqz v1, :cond_0
						 /* .line 573 */
						 v1 = this.this$0;
						 com.mobfox.video.sdk.MobFoxInterstitialController .access$4 ( v1 );
						 /* .line 574 */
						 int v2 = 6; // const/4 v2, 0x6
						 (( com.mobfox.video.sdk.ResourceManager ) v1 ).getResource ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/video/sdk/ResourceManager;->getResource(I)Landroid/graphics/drawable/Drawable;
						 /* .line 575 */
						 /* .restart local v0 # "d":Landroid/graphics/drawable/Drawable; */
						 if ( v0 != null) { // if-eqz v0, :cond_0
							 /* .line 576 */
							 v1 = this.this$0;
							 com.mobfox.video.sdk.MobFoxInterstitialController .access$10 ( v1 );
							 (( com.mobfox.video.sdk.AspectRatioImageViewWidth ) v1 ).setImageDrawable ( v0 ); // invoke-virtual {v1, v0}, Lcom/mobfox/video/sdk/AspectRatioImageViewWidth;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
							 /* goto/16 :goto_0 */
							 /* .line 509 */
							 /* nop */
							 /* :sswitch_data_0 */
							 /* .sparse-switch */
							 /* 0x1 -> :sswitch_0 */
							 /* 0x2 -> :sswitch_1 */
							 /* 0x64 -> :sswitch_2 */
						 } // .end sparse-switch
						 /* .line 521 */
						 /* :pswitch_data_0 */
						 /* .packed-switch 0x1 */
						 /* :pswitch_0 */
						 /* :pswitch_1 */
						 /* :pswitch_2 */
						 /* :pswitch_3 */
						 /* :pswitch_4 */
						 /* :pswitch_5 */
					 } // .end packed-switch
				 } // .end method
