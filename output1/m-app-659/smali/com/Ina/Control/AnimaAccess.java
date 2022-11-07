public class com.Ina.Control.AnimaAccess {
	 /* .source "AnimaAccess.java" */
	 /* # direct methods */
	 public com.Ina.Control.AnimaAccess ( ) {
		 /* .locals 0 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 14 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.view.animation.AnimationSet alphaAnimation ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Integer p6, Boolean p7 ) {
		 /* .locals 12 */
		 /* .param p1, "from" # F */
		 /* .param p2, "to" # F */
		 /* .param p3, "fromX" # F */
		 /* .param p4, "toX" # F */
		 /* .param p5, "fromY" # F */
		 /* .param p6, "toY" # F */
		 /* .param p7, "nTime" # I */
		 /* .param p8, "after" # Z */
		 /* .prologue */
		 /* .line 74 */
		 /* new-instance v11, Landroid/view/animation/AnimationSet; */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {v11, v2}, Landroid/view/animation/AnimationSet;-><init>(Z)V */
		 /* .line 75 */
		 /* .local v11, "animationSet":Landroid/view/animation/AnimationSet; */
		 /* new-instance v10, Landroid/view/animation/AlphaAnimation; */
		 /* invoke-direct {v10, p1, p2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V */
		 /* .line 76 */
		 /* .local v10, "alphaAnimation":Landroid/view/animation/AlphaAnimation; */
		 /* new-instance v1, Landroid/view/animation/TranslateAnimation; */
		 /* .line 77 */
		 int v2 = 1; // const/4 v2, 0x1
		 int v4 = 1; // const/4 v4, 0x1
		 /* .line 78 */
		 int v6 = 1; // const/4 v6, 0x1
		 /* .line 79 */
		 int v8 = 1; // const/4 v8, 0x1
		 /* move v3, p3 */
		 /* move/from16 v5, p4 */
		 /* move/from16 v7, p5 */
		 /* move/from16 v9, p6 */
		 /* .line 76 */
		 /* invoke-direct/range {v1 ..v9}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V */
		 /* .line 81 */
		 /* .local v1, "translateAnimation":Landroid/view/animation/TranslateAnimation; */
		 /* move/from16 v0, p7 */
		 /* int-to-long v2, v0 */
		 (( android.view.animation.AlphaAnimation ) v10 ).setDuration ( v2, v3 ); // invoke-virtual {v10, v2, v3}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V
		 /* .line 82 */
		 /* move/from16 v0, p7 */
		 /* int-to-long v2, v0 */
		 (( android.view.animation.TranslateAnimation ) v1 ).setDuration ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V
		 /* .line 83 */
		 (( android.view.animation.AnimationSet ) v11 ).addAnimation ( v10 ); // invoke-virtual {v11, v10}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
		 /* .line 84 */
		 (( android.view.animation.AnimationSet ) v11 ).addAnimation ( v1 ); // invoke-virtual {v11, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
		 /* .line 85 */
		 /* move/from16 v0, p8 */
		 (( android.view.animation.AnimationSet ) v11 ).setFillAfter ( v0 ); // invoke-virtual {v11, v0}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V
		 /* .line 86 */
	 } // .end method
	 public android.view.animation.AnimationSet moveAnimation ( Float p0, Float p1, Float p2, Float p3, Integer p4, Boolean p5 ) {
		 /* .locals 4 */
		 /* .param p1, "fromX" # F */
		 /* .param p2, "toX" # F */
		 /* .param p3, "fromY" # F */
		 /* .param p4, "toY" # F */
		 /* .param p5, "nTime" # I */
		 /* .param p6, "after" # Z */
		 /* .prologue */
		 /* .line 29 */
		 /* new-instance v0, Landroid/view/animation/AnimationSet; */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {v0, v2}, Landroid/view/animation/AnimationSet;-><init>(Z)V */
		 /* .line 30 */
		 /* .local v0, "animationSet":Landroid/view/animation/AnimationSet; */
		 /* new-instance v1, Landroid/view/animation/TranslateAnimation; */
		 /* invoke-direct {v1, p1, p2, p3, p4}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V */
		 /* .line 32 */
		 /* .local v1, "translateAnimation":Landroid/view/animation/TranslateAnimation; */
		 /* int-to-long v2, p5 */
		 (( android.view.animation.TranslateAnimation ) v1 ).setDuration ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V
		 /* .line 33 */
		 (( android.view.animation.AnimationSet ) v0 ).addAnimation ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
		 /* .line 34 */
		 (( android.view.animation.AnimationSet ) v0 ).setFillAfter ( p6 ); // invoke-virtual {v0, p6}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V
		 /* .line 35 */
	 } // .end method
	 public android.view.animation.AnimationSet moveAnimationSelf ( Float p0, Float p1, Float p2, Float p3, Integer p4, Boolean p5 ) {
		 /* .locals 11 */
		 /* .param p1, "fromX" # F */
		 /* .param p2, "toX" # F */
		 /* .param p3, "fromY" # F */
		 /* .param p4, "toY" # F */
		 /* .param p5, "nTime" # I */
		 /* .param p6, "after" # Z */
		 /* .prologue */
		 /* .line 51 */
		 /* new-instance v10, Landroid/view/animation/AnimationSet; */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {v10, v2}, Landroid/view/animation/AnimationSet;-><init>(Z)V */
		 /* .line 52 */
		 /* .local v10, "animationSet":Landroid/view/animation/AnimationSet; */
		 /* new-instance v1, Landroid/view/animation/TranslateAnimation; */
		 /* .line 53 */
		 int v2 = 1; // const/4 v2, 0x1
		 int v4 = 1; // const/4 v4, 0x1
		 /* .line 54 */
		 int v6 = 1; // const/4 v6, 0x1
		 /* .line 55 */
		 int v8 = 1; // const/4 v8, 0x1
		 /* move v3, p1 */
		 /* move v5, p2 */
		 /* move v7, p3 */
		 /* move v9, p4 */
		 /* .line 52 */
		 /* invoke-direct/range {v1 ..v9}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V */
		 /* .line 57 */
		 /* .local v1, "translateAnimation":Landroid/view/animation/TranslateAnimation; */
		 /* move/from16 v0, p5 */
		 /* int-to-long v2, v0 */
		 (( android.view.animation.TranslateAnimation ) v1 ).setDuration ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V
		 /* .line 58 */
		 (( android.view.animation.AnimationSet ) v10 ).addAnimation ( v1 ); // invoke-virtual {v10, v1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V
		 /* .line 59 */
		 /* move/from16 v0, p6 */
		 (( android.view.animation.AnimationSet ) v10 ).setFillAfter ( v0 ); // invoke-virtual {v10, v0}, Landroid/view/animation/AnimationSet;->setFillAfter(Z)V
		 /* .line 60 */
	 } // .end method
