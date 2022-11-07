class com.heyzap.sdk.HeyzapDialog extends com.heyzap.sdk.ClickableToast {
	 /* # static fields */
	 private static final Integer BUTTON_HEIGHT;
	 private static final Integer BUTTON_TEXT_SIZE;
	 private static final Integer BUTTON_WIDTH;
	 /* # instance fields */
	 private android.widget.RelativeLayout buttonRow;
	 private android.view.View contentView;
	 private android.widget.LinearLayout dialogView;
	 /* # direct methods */
	 public com.heyzap.sdk.HeyzapDialog ( ) {
		 /* .locals 4 */
		 /* invoke-direct {p0, p1}, Lcom/heyzap/sdk/ClickableToast;-><init>(Landroid/content/Context;)V */
		 /* new-instance v0, Landroid/widget/LinearLayout; */
		 (( com.heyzap.sdk.HeyzapDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/HeyzapDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V */
		 this.dialogView = v0;
		 v0 = this.dialogView;
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.widget.LinearLayout ) v0 ).setOrientation ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V
		 v0 = this.dialogView;
		 int v1 = 0; // const/4 v1, 0x0
		 com.heyzap.sdk.Drawables .getDrawable ( p1,v1 );
		 (( android.widget.LinearLayout ) v0 ).setBackgroundDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
		 int v0 = 2; // const/4 v0, 0x2
		 v0 = 		 com.heyzap.sdk.Utils .dpToPx ( p1,v0 );
		 v1 = this.dialogView;
		 (( android.widget.LinearLayout ) v1 ).setPadding ( v0, v0, v0, v0 ); // invoke-virtual {v1, v0, v0, v0, v0}, Landroid/widget/LinearLayout;->setPadding(IIII)V
		 /* const/16 v0, 0xa */
		 v0 = 		 com.heyzap.sdk.Utils .dpToPx ( p1,v0 );
		 (( com.heyzap.sdk.HeyzapDialog ) p0 ).setPadding ( v0, v0, v0, v0 ); // invoke-virtual {p0, v0, v0, v0, v0}, Lcom/heyzap/sdk/HeyzapDialog;->setPadding(IIII)V
		 /* new-instance v0, Lcom/heyzap/sdk/HeyzapDialog$1; */
		 /* invoke-direct {v0, p0}, Lcom/heyzap/sdk/HeyzapDialog$1;-><init>(Lcom/heyzap/sdk/HeyzapDialog;)V */
		 (( com.heyzap.sdk.HeyzapDialog ) p0 ).setOnKeyListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/heyzap/sdk/HeyzapDialog;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V
		 v0 = this.dialogView;
		 /* new-instance v1, Landroid/view/ViewGroup$LayoutParams; */
		 int v2 = -1; // const/4 v2, -0x1
		 int v3 = -2; // const/4 v3, -0x2
		 /* invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
		 (( com.heyzap.sdk.HeyzapDialog ) p0 ).addView ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/heyzap/sdk/HeyzapDialog;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
		 return;
	 } // .end method
	 private void addButton ( java.lang.String p0, Integer p1, Integer p2, Integer p3, android.view.View$OnClickListener p4 ) {
		 /* .locals 6 */
		 /* const/high16 v4, 0x40000000 # 2.0f */
		 (( com.heyzap.sdk.HeyzapDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/HeyzapDialog;->getContext()Landroid/content/Context;
		 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
		 v1 = this.buttonRow;
		 /* if-nez v1, :cond_0 */
		 /* new-instance v1, Landroid/widget/RelativeLayout; */
		 (( com.heyzap.sdk.HeyzapDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/HeyzapDialog;->getContext()Landroid/content/Context;
		 /* invoke-direct {v1, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
		 this.buttonRow = v1;
		 (( com.heyzap.sdk.HeyzapDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/HeyzapDialog;->getContext()Landroid/content/Context;
		 v2 = this.buttonRow;
		 int v3 = 1; // const/4 v3, 0x1
		 com.heyzap.sdk.Drawables .setBackgroundDrawable ( v1,v2,v3 );
		 v1 = this.buttonRow;
		 /* mul-float v2, v0, v4 */
		 /* float-to-int v2, v2 */
		 /* const/high16 v3, 0x40a00000 # 5.0f */
		 /* mul-float/2addr v3, v0 */
		 /* float-to-int v3, v3 */
		 /* mul-float/2addr v4, v0 */
		 /* float-to-int v4, v4 */
		 /* const/high16 v5, 0x40800000 # 4.0f */
		 /* mul-float/2addr v5, v0 */
		 /* float-to-int v5, v5 */
		 (( android.widget.RelativeLayout ) v1 ).setPadding ( v2, v3, v4, v5 ); // invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/RelativeLayout;->setPadding(IIII)V
		 v1 = this.dialogView;
		 v2 = this.buttonRow;
		 v3 = this.dialogView;
		 v3 = 		 (( android.widget.LinearLayout ) v3 ).getChildCount ( ); // invoke-virtual {v3}, Landroid/widget/LinearLayout;->getChildCount()I
		 (( android.widget.LinearLayout ) v1 ).addView ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V
	 } // :cond_0
	 /* new-instance v1, Landroid/widget/Button; */
	 (( com.heyzap.sdk.HeyzapDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/HeyzapDialog;->getContext()Landroid/content/Context;
	 /* invoke-direct {v1, v2}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V */
	 (( com.heyzap.sdk.HeyzapDialog ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/HeyzapDialog;->getContext()Landroid/content/Context;
	 com.heyzap.sdk.Drawables .setBackgroundDrawable ( v2,v1,p3 );
	 (( android.widget.Button ) v1 ).setTextColor ( p2 ); // invoke-virtual {v1, p2}, Landroid/widget/Button;->setTextColor(I)V
	 /* const/high16 v2, 0x41500000 # 13.0f */
	 (( android.widget.Button ) v1 ).setTextSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Button;->setTextSize(F)V
	 (( android.widget.Button ) v1 ).setText ( p1 ); // invoke-virtual {v1, p1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
	 (( android.widget.Button ) v1 ).setOnClickListener ( p5 ); // invoke-virtual {v1, p5}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 /* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
	 /* const/high16 v3, 0x42f00000 # 120.0f */
	 /* mul-float/2addr v3, v0 */
	 /* float-to-int v3, v3 */
	 /* const/high16 v4, 0x42200000 # 40.0f */
	 /* mul-float/2addr v0, v4 */
	 /* float-to-int v0, v0 */
	 /* invoke-direct {v2, v3, v0}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
	 (( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( p4 ); // invoke-virtual {v2, p4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
	 v0 = this.buttonRow;
	 (( android.widget.RelativeLayout ) v0 ).addView ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
	 return;
} // .end method
/* # virtual methods */
public void addPrimaryButton ( java.lang.String p0, android.view.View$OnClickListener p1 ) {
	 /* .locals 6 */
	 int v2 = -1; // const/4 v2, -0x1
	 int v3 = 2; // const/4 v3, 0x2
	 /* const/16 v4, 0xb */
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v5, p2 */
	 /* invoke-direct/range {v0 ..v5}, Lcom/heyzap/sdk/HeyzapDialog;->addButton(Ljava/lang/String;IIILandroid/view/View$OnClickListener;)V */
	 return;
} // .end method
public void addSecondaryButton ( java.lang.String p0, android.view.View$OnClickListener p1 ) {
	 /* .locals 6 */
	 /* const/high16 v2, -0x1000000 */
	 int v3 = 3; // const/4 v3, 0x3
	 /* const/16 v4, 0x9 */
	 /* move-object v0, p0 */
	 /* move-object v1, p1 */
	 /* move-object v5, p2 */
	 /* invoke-direct/range {v0 ..v5}, Lcom/heyzap/sdk/HeyzapDialog;->addButton(Ljava/lang/String;IIILandroid/view/View$OnClickListener;)V */
	 return;
} // .end method
public Boolean dispatchKeyEvent ( android.view.KeyEvent p0 ) {
	 /* .locals 2 */
	 v0 = 	 (( android.view.KeyEvent ) p1 ).getKeyCode ( ); // invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
	 int v1 = 4; // const/4 v1, 0x4
	 /* if-ne v0, v1, :cond_0 */
	 (( com.heyzap.sdk.HeyzapDialog ) p0 ).hide ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/HeyzapDialog;->hide()V
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1}, Lcom/heyzap/sdk/ClickableToast;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z */
} // .end method
public android.view.WindowManager$LayoutParams getWmParams ( ) {
/* .locals 2 */
/* invoke-super {p0}, Lcom/heyzap/sdk/ClickableToast;->getWmParams()Landroid/view/WindowManager$LayoutParams; */
/* const v1, 0x40022 */
/* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I */
/* const v1, 0x1030002 */
/* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->dimAmount:F */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 2 */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
int v1 = 4; // const/4 v1, 0x4
/* if-ne v0, v1, :cond_0 */
(( com.heyzap.sdk.HeyzapDialog ) p0 ).hide ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/HeyzapDialog;->hide()V
} // :cond_0
v0 = /* invoke-super {p0, p1}, Lcom/heyzap/sdk/ClickableToast;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public void setView ( android.view.View p0 ) {
/* .locals 2 */
v0 = this.contentView;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.dialogView;
(( android.widget.LinearLayout ) v0 ).removeView ( p1 ); // invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->removeView(Landroid/view/View;)V
} // :cond_0
v0 = this.dialogView;
int v1 = 0; // const/4 v1, 0x0
(( android.widget.LinearLayout ) v0 ).addView ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;I)V
this.contentView = p1;
return;
} // .end method
