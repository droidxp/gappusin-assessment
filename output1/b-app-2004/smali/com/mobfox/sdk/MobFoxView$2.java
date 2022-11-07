class com.mobfox.sdk.MobFoxView$2 implements android.view.View$OnTouchListener {
	 /* .source "MobFoxView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/mobfox/sdk/MobFoxView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private Float distanceX;
private Float distanceY;
final com.mobfox.sdk.MobFoxView this$0; //synthetic
/* # direct methods */
 com.mobfox.sdk.MobFoxView$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 103 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 5 */
/* .param p1, "v" # Landroid/view/View; */
/* .param p2, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* const/high16 v4, 0x41f00000 # 30.0f */
int v1 = 1; // const/4 v1, 0x1
/* .line 111 */
try { // :try_start_0
	 v2 = 	 (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
	 /* if-nez v2, :cond_0 */
	 /* .line 112 */
	 v2 = this.this$0;
	 int v3 = 0; // const/4 v3, 0x0
	 com.mobfox.sdk.MobFoxView .access$102 ( v2,v3 );
	 /* .line 113 */
	 v2 = 	 (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
	 /* iput v2, p0, Lcom/mobfox/sdk/MobFoxView$2;->distanceX:F */
	 /* .line 114 */
	 v2 = 	 (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
	 /* iput v2, p0, Lcom/mobfox/sdk/MobFoxView$2;->distanceY:F */
	 /* .line 116 */
} // :cond_0
v2 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
int v3 = 2; // const/4 v3, 0x2
/* if-ne v2, v3, :cond_4 */
/* .line 117 */
/* iget v2, p0, Lcom/mobfox/sdk/MobFoxView$2;->distanceX:F */
v3 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
/* sub-float/2addr v2, v3 */
v2 = java.lang.Math .abs ( v2 );
/* cmpl-float v2, v2, v4 */
/* if-lez v2, :cond_1 */
/* .line 118 */
v2 = this.this$0;
int v3 = 1; // const/4 v3, 0x1
com.mobfox.sdk.MobFoxView .access$102 ( v2,v3 );
/* .line 120 */
} // :cond_1
/* iget v2, p0, Lcom/mobfox/sdk/MobFoxView$2;->distanceY:F */
v3 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
/* sub-float/2addr v2, v3 */
v2 = java.lang.Math .abs ( v2 );
/* cmpl-float v2, v2, v4 */
/* if-lez v2, :cond_2 */
/* .line 121 */
v2 = this.this$0;
int v3 = 1; // const/4 v3, 0x1
com.mobfox.sdk.MobFoxView .access$102 ( v2,v3 );
/* .line 123 */
} // :cond_2
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
int v3 = 3; // const/4 v3, 0x3
v2 = android.util.Log .isLoggable ( v2,v3 );
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 124 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "touchMove: "; // const-string v4, "touchMove: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.this$0;
v4 = com.mobfox.sdk.MobFoxView .access$100 ( v4 );
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 141 */
} // :cond_3
} // :goto_0
/* .line 128 */
} // :cond_4
v2 = (( android.view.MotionEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I
/* if-ne v2, v1, :cond_6 */
/* .line 129 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
int v2 = 3; // const/4 v2, 0x3
v1 = android.util.Log .isLoggable ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 130 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "size x: "; // const-string v3, "size x: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 131 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "getHistorySize: "; // const-string v3, "getHistorySize: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = (( android.view.MotionEvent ) p2 ).getHistorySize ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getHistorySize()I
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 133 */
} // :cond_5
v1 = this.this$0;
com.mobfox.sdk.MobFoxView .access$200 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_6
v1 = this.this$0;
v1 = com.mobfox.sdk.MobFoxView .access$100 ( v1 );
/* if-nez v1, :cond_6 */
/* .line 134 */
v1 = this.this$0;
(( com.mobfox.sdk.MobFoxView ) v1 ).openLink ( ); // invoke-virtual {v1}, Lcom/mobfox/sdk/MobFoxView;->openLink()V
/* .line 135 */
v1 = this.this$0;
(( com.mobfox.sdk.MobFoxView ) v1 ).notifyAdClicked ( ); // invoke-virtual {v1}, Lcom/mobfox/sdk/MobFoxView;->notifyAdClicked()V
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 141 */
} // :cond_6
} // :goto_1
v1 = this.this$0;
v1 = (( com.mobfox.sdk.MobFoxView ) v1 ).onTouchEvent ( p2 ); // invoke-virtual {v1, p2}, Lcom/mobfox/sdk/MobFoxView;->onTouchEvent(Landroid/view/MotionEvent;)Z
/* .line 138 */
/* :catch_0 */
/* move-exception v0 */
/* .line 139 */
/* .local v0, "e":Ljava/lang/Throwable; */
(( java.lang.Throwable ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V
} // .end method
