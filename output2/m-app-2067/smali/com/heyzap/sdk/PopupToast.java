class com.heyzap.sdk.PopupToast extends com.heyzap.sdk.ClickableToast {
	 /* # static fields */
	 private static com.heyzap.sdk.PopupToast previousToastRef;
	 /* # instance fields */
	 private Float density;
	 private java.lang.String gameName;
	 private android.widget.RelativeLayout popupView;
	 private android.widget.TextView promptText;
	 private java.lang.Integer windowAnimation;
	 /* # direct methods */
	 public com.heyzap.sdk.PopupToast ( ) {
		 /* .locals 8 */
		 int v3 = -2; // const/4 v3, -0x2
		 /* const/high16 v7, -0x40800000 # -1.0f */
		 /* const/16 v5, 0xa */
		 /* invoke-direct {p0, p1}, Lcom/heyzap/sdk/ClickableToast;-><init>(Landroid/content/Context;)V */
		 /* iput v7, p0, Lcom/heyzap/sdk/PopupToast;->density:F */
		 com.heyzap.sdk.PopupToast .hideOldPopup ( );
		 final String v0 = "popup-shown"; // const-string v0, "popup-shown"
		 com.heyzap.sdk.HeyzapAnalytics .trackEvent ( p1,v0 );
		 this.gameName = p2;
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
		 /* new-instance v0, Landroid/widget/RelativeLayout; */
		 /* invoke-direct {v0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
		 this.popupView = v0;
		 v0 = this.popupView;
		 /* new-instance v1, Landroid/view/ViewGroup$LayoutParams; */
		 /* const/16 v2, 0x46 */
		 v2 = 		 com.heyzap.sdk.Utils .dpToPx ( p1,v2 );
		 /* invoke-direct {v1, v3, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V */
		 (( android.widget.RelativeLayout ) v0 ).setLayoutParams ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* new-instance v0, Landroid/widget/ImageView; */
		 /* invoke-direct {v0, p1}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V */
		 /* const/16 v1, 0x28 */
		 v1 = 		 com.heyzap.sdk.Utils .dpToPx ( p1,v1 );
		 /* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
		 /* invoke-direct {v2, v1, v1}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
		 /* const/16 v1, 0xb */
		 (( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
		 (( android.widget.RelativeLayout$LayoutParams ) v2 ).addRule ( v5 ); // invoke-virtual {v2, v5}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V
		 (( android.widget.ImageView ) v0 ).setLayoutParams ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 /* new-instance v1, Lcom/heyzap/sdk/PopupToast$1; */
		 /* invoke-direct {v1, p0}, Lcom/heyzap/sdk/PopupToast$1;-><init>(Lcom/heyzap/sdk/PopupToast;)V */
		 (( android.widget.ImageView ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* new-instance v1, Landroid/widget/TextView; */
		 /* invoke-direct {v1, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V */
		 this.promptText = v1;
		 /* new-instance v1, Landroid/widget/RelativeLayout$LayoutParams; */
		 /* const/16 v2, 0x32 */
		 v2 = 		 com.heyzap.sdk.Utils .dpToPx ( p1,v2 );
		 /* invoke-direct {v1, v3, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
		 /* const/16 v2, 0x4b */
		 v2 = 		 com.heyzap.sdk.Utils .dpToPx ( p1,v2 );
		 v3 = 		 com.heyzap.sdk.Utils .dpToPx ( p1,v5 );
		 /* const/16 v4, 0x78 */
		 v4 = 		 com.heyzap.sdk.Utils .dpToPx ( p1,v4 );
		 v5 = 		 com.heyzap.sdk.Utils .dpToPx ( p1,v5 );
		 (( android.widget.RelativeLayout$LayoutParams ) v1 ).setMargins ( v2, v3, v4, v5 ); // invoke-virtual {v1, v2, v3, v4, v5}, Landroid/widget/RelativeLayout$LayoutParams;->setMargins(IIII)V
		 v2 = this.promptText;
		 (( android.widget.TextView ) v2 ).setLayoutParams ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
		 v1 = this.promptText;
		 /* const/16 v2, 0x10 */
		 (( android.widget.TextView ) v1 ).setGravity ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setGravity(I)V
		 v1 = this.promptText;
		 /* const/high16 v2, 0x41400000 # 12.0f */
		 (( android.widget.TextView ) v1 ).setTextSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V
		 v1 = this.promptText;
		 int v2 = -1; // const/4 v2, -0x1
		 (( android.widget.TextView ) v1 ).setTextColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V
		 v1 = this.promptText;
		 v2 = android.graphics.Typeface.DEFAULT_BOLD;
		 (( android.widget.TextView ) v1 ).setTypeface ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V
		 v1 = this.promptText;
		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 int v3 = 0; // const/4 v3, 0x0
		 int v4 = 2; // const/4 v4, 0x2
		 /* const/16 v5, 0x38 */
		 /* const/16 v6, 0x82 */
		 v4 = 		 android.graphics.Color .rgb ( v4,v5,v6 );
		 (( android.widget.TextView ) v1 ).setShadowLayer ( v2, v3, v7, v4 ); // invoke-virtual {v1, v2, v3, v7, v4}, Landroid/widget/TextView;->setShadowLayer(FFFI)V
		 v1 = this.popupView;
		 (( android.widget.RelativeLayout ) v1 ).addView ( v0 ); // invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
		 v0 = this.popupView;
		 v1 = this.promptText;
		 (( android.widget.RelativeLayout ) v0 ).addView ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;)V
		 v0 = this.popupView;
		 (( com.heyzap.sdk.PopupToast ) p0 ).addView ( v0 ); // invoke-virtual {p0, v0}, Lcom/heyzap/sdk/PopupToast;->addView(Landroid/view/View;)V
		 v0 = this.popupView;
		 /* new-instance v1, Lcom/heyzap/sdk/PopupToast$2; */
		 /* invoke-direct {v1, p0}, Lcom/heyzap/sdk/PopupToast$2;-><init>(Lcom/heyzap/sdk/PopupToast;)V */
		 (( android.widget.RelativeLayout ) v0 ).setOnClickListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 (( com.heyzap.sdk.PopupToast ) p0 ).updateLayout ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PopupToast;->updateLayout()V
		 return;
	 } // .end method
	 public static void hideOldPopup ( ) {
		 /* .locals 1 */
		 v0 = com.heyzap.sdk.PopupToast.previousToastRef;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = com.heyzap.sdk.PopupToast.previousToastRef;
			 (( com.heyzap.sdk.PopupToast ) v0 ).hide ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/PopupToast;->hide()V
		 } // :cond_0
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getAnimation ( android.content.Context p0 ) {
		 /* .locals 4 */
		 v0 = this.windowAnimation;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.windowAnimation;
			 v0 = 			 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
		 } // :goto_0
	 } // :cond_0
	 /* new-instance v0, Landroid/widget/PopupWindow; */
	 /* invoke-direct {v0, p1}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;)V */
	 try { // :try_start_0
		 /* const-class v1, Landroid/widget/PopupWindow; */
		 final String v2 = "mIsDropdown"; // const-string v2, "mIsDropdown"
		 (( java.lang.Class ) v1 ).getDeclaredField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
		 int v2 = 1; // const/4 v2, 0x1
		 (( java.lang.reflect.Field ) v1 ).setAccessible ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
		 int v2 = 1; // const/4 v2, 0x1
		 (( java.lang.reflect.Field ) v1 ).setBoolean ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
		 /* const-class v1, Landroid/widget/PopupWindow; */
		 final String v2 = "mAnimationStyle"; // const-string v2, "mAnimationStyle"
		 (( java.lang.Class ) v1 ).getDeclaredField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
		 int v2 = 1; // const/4 v2, 0x1
		 (( java.lang.reflect.Field ) v1 ).setAccessible ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
		 int v2 = -1; // const/4 v2, -0x1
		 (( java.lang.reflect.Field ) v1 ).setInt ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V
		 /* const-class v1, Landroid/widget/PopupWindow; */
		 final String v2 = "mAboveAnchor"; // const-string v2, "mAboveAnchor"
		 (( java.lang.Class ) v1 ).getDeclaredField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
		 int v2 = 1; // const/4 v2, 0x1
		 (( java.lang.reflect.Field ) v1 ).setAccessible ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->setAccessible(Z)V
		 int v2 = 0; // const/4 v2, 0x0
		 (( java.lang.reflect.Field ) v1 ).setBoolean ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V
		 /* const-class v1, Landroid/widget/PopupWindow; */
		 final String v2 = "computeAnimationResource"; // const-string v2, "computeAnimationResource"
		 int v3 = 0; // const/4 v3, 0x0
		 /* new-array v3, v3, [Ljava/lang/Class; */
		 (( java.lang.Class ) v1 ).getDeclaredMethod ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 int v2 = 1; // const/4 v2, 0x1
		 (( java.lang.reflect.Method ) v1 ).setAccessible ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Method;->setAccessible(Z)V
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-array v2, v2, [Ljava/lang/Object; */
		 (( java.lang.reflect.Method ) v1 ).invoke ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Ljava/lang/Integer; */
		 this.windowAnimation = v0;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 } // :goto_1
	 v0 = this.windowAnimation;
	 /* if-nez v0, :cond_1 */
	 /* const v0, 0x1030004 */
	 java.lang.Integer .valueOf ( v0 );
	 this.windowAnimation = v0;
} // :cond_1
v0 = this.windowAnimation;
v0 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* :catch_0 */
/* move-exception v0 */
} // .end method
public android.view.WindowManager$LayoutParams getWmParams ( ) {
/* .locals 3 */
/* invoke-super {p0}, Lcom/heyzap/sdk/ClickableToast;->getWmParams()Landroid/view/WindowManager$LayoutParams; */
/* const/16 v1, 0x30 */
/* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I */
(( com.heyzap.sdk.PopupToast ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PopupToast;->getContext()Landroid/content/Context;
v1 = (( com.heyzap.sdk.PopupToast ) p0 ).getAnimation ( v1 ); // invoke-virtual {p0, v1}, Lcom/heyzap/sdk/PopupToast;->getAnimation(Landroid/content/Context;)I
/* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I */
/* iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I */
/* const v2, 0x40100 */
/* or-int/2addr v1, v2 */
/* iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I */
} // .end method
public void hide ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lcom/heyzap/sdk/ClickableToast;->hide()V */
int v0 = 0; // const/4 v0, 0x0
return;
} // .end method
public void onCheckinClick ( android.view.View p0 ) {
/* .locals 2 */
(( com.heyzap.sdk.PopupToast ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PopupToast;->getContext()Landroid/content/Context;
final String v1 = "popup-clicked"; // const-string v1, "popup-clicked"
com.heyzap.sdk.HeyzapAnalytics .trackEvent ( v0,v1 );
(( com.heyzap.sdk.PopupToast ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PopupToast;->getContext()Landroid/content/Context;
int v1 = 0; // const/4 v1, 0x0
com.heyzap.sdk.HeyzapLib .rawCheckin ( v0,v1 );
(( com.heyzap.sdk.PopupToast ) p0 ).hide ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PopupToast;->hide()V
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 2 */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
int v1 = 4; // const/4 v1, 0x4
/* if-ne v0, v1, :cond_0 */
(( com.heyzap.sdk.PopupToast ) p0 ).hide ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PopupToast;->hide()V
} // :cond_0
v0 = /* invoke-super {p0, p1}, Lcom/heyzap/sdk/ClickableToast;->onTouchEvent(Landroid/view/MotionEvent;)Z */
} // .end method
public void updateLayout ( ) {
/* .locals 5 */
/* const/16 v4, 0x19 */
v0 = (( com.heyzap.sdk.PopupToast ) p0 ).isVertical ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PopupToast;->isVertical()Z
if ( v0 != null) { // if-eqz v0, :cond_1
final String v1 = "checkin_vert_popdown.png"; // const-string v1, "checkin_vert_popdown.png"
} // :goto_0
(( com.heyzap.sdk.PopupToast ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/heyzap/sdk/PopupToast;->getContext()Landroid/content/Context;
v3 = this.popupView;
com.heyzap.sdk.Drawables .setBackgroundDrawable ( v2,v3,v1 );
/* if-nez v0, :cond_0 */
v1 = this.gameName;
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-le v1, v4, :cond_2 */
} // :cond_0
/* const/16 v1, 0xc */
} // :goto_1
v2 = this.promptText;
/* int-to-float v1, v1 */
(( android.widget.TextView ) v2 ).setTextSize ( v1 ); // invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextSize(F)V
if ( v0 != null) { // if-eqz v0, :cond_3
/* move v1, v4 */
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.gameName;
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* const/16 v2, 0x12 */
/* if-ge v0, v2, :cond_4 */
final String v0 = "\n"; // const-string v0, "\n"
} // :goto_3
v2 = this.promptText;
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Welcome to"; // const-string v4, "Welcome to"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.gameName;
com.heyzap.sdk.Utils .truncate ( v3,v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "!"; // const-string v1, "!"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.widget.TextView ) v2 ).setText ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
return;
} // :cond_1
final String v1 = "checkin_popdown.png"; // const-string v1, "checkin_popdown.png"
} // :cond_2
/* const/16 v1, 0xe */
} // :cond_3
/* const/16 v1, 0x28 */
} // :cond_4
final String v0 = " "; // const-string v0, " "
} // .end method
