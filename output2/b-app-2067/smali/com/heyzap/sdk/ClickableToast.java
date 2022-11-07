class com.heyzap.sdk.ClickableToast extends android.widget.FrameLayout {
	 /* # static fields */
	 private static com.heyzap.sdk.ClickableToast$DismissToastBroadcastReceiver dismissReceiver;
	 /* # instance fields */
	 protected android.view.WindowManager windowManager;
	 /* # direct methods */
	 static com.heyzap.sdk.ClickableToast ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/heyzap/sdk/ClickableToast$DismissToastBroadcastReceiver; */
		 /* invoke-direct {v0}, Lcom/heyzap/sdk/ClickableToast$DismissToastBroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 public com.heyzap.sdk.ClickableToast ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
		 (( com.heyzap.sdk.ClickableToast ) p0 ).init ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/ClickableToast;->init()V
		 return;
	 } // .end method
	 public static void show ( android.content.Context p0, android.view.View p1, Integer p2 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/heyzap/sdk/ClickableToast; */
		 /* invoke-direct {v0, p0}, Lcom/heyzap/sdk/ClickableToast;-><init>(Landroid/content/Context;)V */
		 (( com.heyzap.sdk.ClickableToast ) v0 ).addView ( p1 ); // invoke-virtual {v0, p1}, Lcom/heyzap/sdk/ClickableToast;->addView(Landroid/view/View;)V
		 (( com.heyzap.sdk.ClickableToast ) v0 ).show ( p2 ); // invoke-virtual {v0, p2}, Lcom/heyzap/sdk/ClickableToast;->show(I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.WindowManager$LayoutParams getWmParams ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Landroid/view/WindowManager$LayoutParams; */
		 /* invoke-direct {v0}, Landroid/view/WindowManager$LayoutParams;-><init>()V */
		 int v1 = -2; // const/4 v1, -0x2
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I */
		 int v1 = -1; // const/4 v1, -0x1
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->alpha:F */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->format:I */
		 /* const/16 v1, 0x11 */
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I */
		 v1 = 		 (( com.heyzap.sdk.ClickableToast ) p0 ).isVertical ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/ClickableToast;->isVertical()Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* const v1, 0x3d4ccccd # 0.05f */
		 } // :goto_0
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->verticalMargin:F */
		 /* const/16 v1, 0x28 */
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I */
		 /* const/16 v1, 0xbd5 */
		 /* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->type:I */
	 } // :cond_0
	 /* const v1, 0x3d8f5c29 # 0.07f */
} // .end method
public void hide ( ) {
	 /* .locals 2 */
	 try { // :try_start_0
		 v0 = this.windowManager;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_1 */
	 } // :goto_0
	 try { // :try_start_1
		 (( com.heyzap.sdk.ClickableToast ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/ClickableToast;->getContext()Landroid/content/Context;
		 v1 = com.heyzap.sdk.ClickableToast.dismissReceiver;
		 (( android.content.Context ) v0 ).unregisterReceiver ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
		 /* :try_end_1 */
		 /* .catch Ljava/lang/RuntimeException; {:try_start_1 ..:try_end_1} :catch_0 */
	 } // :goto_1
	 return;
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* :catch_1 */
	 /* move-exception v0 */
} // .end method
public void init ( ) {
	 /* .locals 2 */
	 v0 = com.heyzap.sdk.ClickableToast.dismissReceiver;
	 (( com.heyzap.sdk.ClickableToast$DismissToastBroadcastReceiver ) v0 ).setToast ( p0 ); // invoke-virtual {v0, p0}, Lcom/heyzap/sdk/ClickableToast$DismissToastBroadcastReceiver;->setToast(Lcom/heyzap/sdk/ClickableToast;)V
	 int v0 = 0; // const/4 v0, 0x0
	 (( com.heyzap.sdk.ClickableToast ) p0 ).setBackgroundColor ( v0 ); // invoke-virtual {p0, v0}, Lcom/heyzap/sdk/ClickableToast;->setBackgroundColor(I)V
	 (( com.heyzap.sdk.ClickableToast ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/ClickableToast;->getContext()Landroid/content/Context;
	 final String v1 = "window"; // const-string v1, "window"
	 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/view/WindowManager; */
	 this.windowManager = v0;
	 return;
} // .end method
public Boolean isVertical ( ) {
	 /* .locals 2 */
	 v0 = this.windowManager;
	 v0 = 	 (( android.view.Display ) v0 ).getOrientation ( ); // invoke-virtual {v0}, Landroid/view/Display;->getOrientation()I
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v1 = 2; // const/4 v1, 0x2
		 /* if-ne v0, v1, :cond_1 */
	 } // :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onAttachedToWindow ( ) {
/* .locals 2 */
(( com.heyzap.sdk.ClickableToast ) p0 ).getWmParams ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/ClickableToast;->getWmParams()Landroid/view/WindowManager$LayoutParams;
try { // :try_start_0
v1 = this.windowManager;
/* :try_end_0 */
/* .catch Ljava/lang/RuntimeException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 1 */
/* const/high16 v0, 0x43340000 # 180.0f */
(( android.graphics.Canvas ) p1 ).rotate ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->rotate(F)V
/* invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onDraw(Landroid/graphics/Canvas;)V */
(( android.graphics.Canvas ) p1 ).rotate ( v0 ); // invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->rotate(F)V
return;
} // .end method
public void show ( ) {
/* .locals 4 */
(( com.heyzap.sdk.ClickableToast ) p0 ).getWmParams ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/ClickableToast;->getWmParams()Landroid/view/WindowManager$LayoutParams;
v1 = this.windowManager;
(( com.heyzap.sdk.ClickableToast ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/ClickableToast;->getContext()Landroid/content/Context;
v1 = com.heyzap.sdk.ClickableToast.dismissReceiver;
/* new-instance v2, Landroid/content/IntentFilter; */
final String v3 = "android.intent.action.CLOSE_SYSTEM_DIALOGS"; // const-string v3, "android.intent.action.CLOSE_SYSTEM_DIALOGS"
/* invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V */
(( android.content.Context ) v0 ).registerReceiver ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
return;
} // .end method
public void show ( Integer p0 ) {
/* .locals 3 */
(( com.heyzap.sdk.ClickableToast ) p0 ).show ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/ClickableToast;->show()V
/* new-instance v0, Lcom/heyzap/sdk/ClickableToast$1; */
/* invoke-direct {v0, p0}, Lcom/heyzap/sdk/ClickableToast$1;-><init>(Lcom/heyzap/sdk/ClickableToast;)V */
/* int-to-long v1, p1 */
(( com.heyzap.sdk.ClickableToast ) p0 ).postDelayed ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/heyzap/sdk/ClickableToast;->postDelayed(Ljava/lang/Runnable;J)Z
return;
} // .end method
